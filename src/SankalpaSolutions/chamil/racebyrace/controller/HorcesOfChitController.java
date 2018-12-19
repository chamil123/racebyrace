/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.HorcesOfChit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win 8
 */
public class HorcesOfChitController {

    public static int addHorcesOfChit(HorcesOfChit add) throws ClassNotFoundException, SQLException {
        String quary = "insert into horces_of_chit values(?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);

        stm.setObject(1, add.getHorcesOfChit_ID());
        stm.setObject(2, add.getHorcesOfChit_ItemID());
        stm.setObject(3, add.getChitRegistration_ID());
        stm.setObject(4, add.getHorcesOfChit_HorseName());
        stm.setObject(5, add.getHorcesOfChit_Pora());

        return stm.executeUpdate();

    }

    public static List<HorcesOfChit> searchAllHorcesOfChitByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from horces_of_chit WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<HorcesOfChit> horseofchitList = new ArrayList<HorcesOfChit>();
        while (res.next()) {
            HorcesOfChit horseofchit = new HorcesOfChit(res.getInt("horcesOfChit_ID"), res.getInt("horcesOfChit_ItemID"), res.getInt("chitRegistration_ID"), res.getString("horcesOfChit_HorseName"), res.getString("horcesOfChit_Pora"));
            horseofchitList.add(horseofchit);
        }
        return horseofchitList;

    }

    public static int searchnullValue(int IDNumber) throws ClassNotFoundException, SQLException {
        //SELECT o.status, o.date, c.name
        //FROM cliente c
        //LEFT JOIN orders o
        //ON c.id=o.id 
        //WHERE o.date = '2/1/2015'
        int nulValue = 0;
        String quary = "SELECT horces_of_chit.chitRegistration_ID,horces_of_chit.horcesOfChit_Pora,results.pora,results.result_ID FROM horces_of_chit LEFT JOIN results ON horces_of_chit.horcesOfChit_Pora=results.pora WHERE horces_of_chit.chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        while (res.next()) {
            if (null == res.getString("result_ID")) {
                nulValue = 1;
            }
        }
        return nulValue;
    }
}
