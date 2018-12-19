/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Horse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chamil Pathirana
 */
public class HorseController {

    public static int addHorse(Horse add) throws ClassNotFoundException, SQLException {
        String quary = "insert into horse (horse_name,pora_ID,country_ID,horse_counter) values(?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getHorse_name());
        stm.setObject(2, add.getPora_ID());
        stm.setObject(3, add.getCountry_ID());
        stm.setObject(4, add.getHorse_counter());

        return stm.executeUpdate();

    }

    public static List<Horse> sercLikeHorseNames(String name) throws ClassNotFoundException, SQLException {
        String quary;
        String s1 = new String(name);
        System.out.println("index of A : " + s1.indexOf('/'));

        if (s1.indexOf('/') == -1) {
            quary = "SELECT horse_name,pora_ID FROM horse WHERE horse_name  LIKE '" + name + "%'";
            String firstNumber = name.replaceFirst(".*?(\\d+).*", "$1");
            //  System.out.println("bbbb : "+firstNumber);
        } else {
            quary = "SELECT *FROM pora INNER JOIN horse ON pora.pora_ID=horse.pora_ID  WHERE pora='" + name + "'";

            String firstNumber = name.replaceFirst(".*?(\\d+).*", "$1");

          //  System.out.println("ssssssssddddddddd : "+firstNumber);
        }

        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Horse> racecardList = new ArrayList<Horse>();
        while (res.next()) {
            Horse horse = new Horse(res.getString("horse_name"), res.getInt("pora_ID"));
            racecardList.add(horse);

        }
        return racecardList;
    }

    public static String sercLikeHorseNameInID(String name) throws ClassNotFoundException, SQLException {
      
        String horse_name = null;
        String quary = "SELECT horse_name,pora_ID FROM horse WHERE horse_name  LIKE '" + name + "%'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();

        if (res.next()) {
            horse_name = res.getString("horse_name");

        }
        return horse_name;
    }public static boolean DeleteQuery() throws ClassNotFoundException, SQLException {
        String quary1 = "DELETE from country";
        String quary2 = "DELETE from horse";
        String quary3 = "DELETE from pora";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm1 = conn.prepareStatement(quary1);
        PreparedStatement stm2 = conn.prepareStatement(quary2);
        PreparedStatement stm3 = conn.prepareStatement(quary3);
        int res = stm1.executeUpdate();
        stm2.executeUpdate();
        stm3.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

}
