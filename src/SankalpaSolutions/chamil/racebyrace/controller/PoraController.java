/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Center;
import SankalpaSolutions.chamil.racebyrace.model.Pora;
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
public class PoraController {

    public static int addPora(Pora add) throws ClassNotFoundException, SQLException {
        String quary = "insert into pora (country_ID,pora) values(?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getCountry_ID());
        stm.setObject(2, add.getPora());

        return stm.executeUpdate();

    }

    public static List<Pora> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from pora";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Pora> poraList = new ArrayList<Pora>();
        while (res.next()) {
            Pora pora = new Pora(res.getInt("pora_ID"), res.getInt("country_ID"), res.getString("pora"));
            poraList.add(pora);
        }
        return poraList;
    }

    public static List<Pora> searchPoraByName(String name) throws ClassNotFoundException, SQLException {
        String quary = "select * from pora WHERE pora='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Pora> poraList = new ArrayList<Pora>();
        while (res.next()) {
            Pora pora = new Pora(res.getInt("pora_ID"), res.getInt("country_ID"), res.getString("pora"));
            poraList.add(pora);
        }
        return poraList;
    }

    public static List<Pora> searchAllPoraByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from pora WHERE country_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Pora> poraList = new ArrayList<Pora>();
        while (res.next()) {
            Pora pora = new Pora(res.getInt("pora_ID"), res.getInt("country_ID"), res.getString("pora"));
            poraList.add(pora);
        }
        return poraList;

    }

    public static Pora searchPoraByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from pora WHERE pora_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        System.out.println("pra athule");
        if (res.next()) {

            return new Pora(res.getInt("pora_ID"), res.getInt("country_ID"), res.getString("pora"));
        }
        return null;

    }

    public static int updatePora(Pora update) throws ClassNotFoundException, SQLException {
        String quary = "update pora set country_ID=?,pora=? where pora_ID='" + update.getPora_ID() + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stms = conn.prepareStatement(quary);
        stms.setObject(1, update.getCountry_ID());
        stms.setObject(2, update.getPora());

        return stms.executeUpdate();
    }

    public static boolean deletePora(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from pora WHERE pora_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Pora> sercLikePoraName(String name) throws ClassNotFoundException, SQLException {
        String quary = "SELECT*FROM pora WHERE pora LIKE '" + name + "%'  ";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Pora> centerList = new ArrayList<Pora>();
        while (res.next()) {
            Pora pora = new Pora(res.getString("pora"));
            centerList.add(pora);
        }
        return centerList;
    }
    public static int serchMaxPoraId() throws ClassNotFoundException, SQLException {
        String quary = "SELECT MAX(pora_ID)FROM pora";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        int max = 1;
        while (res.next()) {
            max = res.getInt("MAX(pora_ID)");
            max++;
        }
        return max;
    } 
    public static String searchPoraByID(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select pora_ID,pora from pora WHERE pora_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
       String pora = null;
        if (res.next()) {
            pora= res.getString("pora");
//            Pora pora = new Pora(res.getInt("pora_ID"), res.getInt("country_ID"), res.getString("pora"));
//            poraList.add(pora);
        }
        return pora;

    }
}
