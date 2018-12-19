/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Center;
import SankalpaSolutions.chamil.racebyrace.model.ChitRegistration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Win 8
 */
public class ChitRegistrationController {

    public static int addChitRegistration(ChitRegistration add) throws ClassNotFoundException, SQLException {
        String quary = "insert into chitregistration values(?,?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getChitRegistration_ID());
        stm.setObject(2, add.getCenter_ID());
        stm.setObject(3, add.getChitRegistration_chitNumber());
        stm.setObject(4, add.getChitRegistration_CurrentInvestment());
        stm.setObject(5, add.getChitRegistration_ActualInvestment());
        stm.setObject(6, add.getChitRegistration_TotLessCommision());
        stm.setObject(7, add.getChitRegistration_Date());

        return stm.executeUpdate();

    }

    public static List<ChitRegistration> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from chitregistration";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<ChitRegistration> chitregistrationList = new ArrayList<ChitRegistration>();
        while (res.next()) {
            ChitRegistration chitregistration = new ChitRegistration(res.getInt("chitRegistration_ID"), res.getInt("center_ID"), res.getString("chitRegistration_chitNumber"), res.getDouble("chitRegistration_CurrentInvestment"), res.getDouble("chitRegistration_ActualInvestment"), res.getDouble("chitRegistration_TotLessCommision"), res.getString("chitRegistration_Date"));
            chitregistrationList.add(chitregistration);
        }
        return chitregistrationList;
    }

    public static List<ChitRegistration> searchCenterByName(String name) throws ClassNotFoundException, SQLException {
        String quary = "select * from chitregistration WHERE center_Name='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<ChitRegistration> centerList = new ArrayList<ChitRegistration>();
        while (res.next()) {
            ChitRegistration center = new ChitRegistration(res.getInt("chitRegistration_ID"), res.getInt("center_ID"), res.getString("chitRegistration_chitNumber"), res.getDouble("chitRegistration_CurrentInvestment"), res.getDouble("chitRegistration_ActualInvestment"), res.getDouble("chitRegistration_TotLessCommision"), res.getString("chitRegistration_Date"));
            centerList.add(center);
        }
        return centerList;
    }

    public static ChitRegistration searchChitRegistrationByIDNumber(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from chitregistration WHERE center_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            return new ChitRegistration(res.getInt("chitRegistration_ID"), res.getInt("center_ID"), res.getString("chitRegistration_chitNumber"), res.getDouble("chitRegistration_CurrentInvestment"), res.getDouble("chitRegistration_ActualInvestment"), res.getDouble("chitRegistration_TotLessCommision"), res.getString("chitRegistration_Date"));
        }
        return null;

    }

    public static ChitRegistration searchCenterIdByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select center_ID from chitregistration WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            return new ChitRegistration(res.getInt("center_ID"));
        }
        return null;

    }

    public static List<ChitRegistration> searchAllChitRegistrationByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from chitregistration WHERE center_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<ChitRegistration> chitregList = new ArrayList<ChitRegistration>();
        while (res.next()) {
            ChitRegistration chitreg = new ChitRegistration(res.getInt("chitRegistration_ID"), res.getInt("center_ID"), res.getString("chitRegistration_chitNumber"), res.getDouble("chitRegistration_CurrentInvestment"), res.getDouble("chitRegistration_ActualInvestment"), res.getDouble("chitRegistration_TotLessCommision"), res.getString("chitRegistration_Date"));
            chitregList.add(chitreg);
        }
        return chitregList;

    }

    public static List<ChitRegistration> searchAllChitRegistrationByIDNumberAndDate(int IDNumber, Date date) throws ClassNotFoundException, SQLException {
        System.out.println("ggggggggggggggggggggggggggggggggggggggggggggg");
        String quary = "select * from chitregistration WHERE center_ID='" + IDNumber + "' AND chitRegistration_Date='" + date + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<ChitRegistration> chitregList = new ArrayList<ChitRegistration>();
        while (res.next()) {
            ChitRegistration chitreg = new ChitRegistration(res.getInt("chitRegistration_ID"), res.getInt("center_ID"), res.getString("chitRegistration_chitNumber"), res.getDouble("chitRegistration_CurrentInvestment"), res.getDouble("chitRegistration_ActualInvestment"), res.getDouble("chitRegistration_TotLessCommision"), res.getString("chitRegistration_Date"));
            chitregList.add(chitreg);
        }
        return chitregList;

    }

    public static int updateChitRegistration(ChitRegistration update) throws ClassNotFoundException, SQLException {
        String quary = "update chitregistration set center_ID=?,chitRegistration_chitNumber=?,chitRegistration_CurrentInvestment=?,chitRegistration_ActualInvestment=?,chitRegistration_Date=? where chitRegistration_ID='" + update.getChitRegistration_ID() + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stms = conn.prepareStatement(quary);
        stms.setObject(1, update.getCenter_ID());
        stms.setObject(2, update.getChitRegistration_chitNumber());
        stms.setObject(3, update.getChitRegistration_CurrentInvestment());
        stms.setObject(4, update.getChitRegistration_ActualInvestment());
        stms.setObject(5, update.getChitRegistration_TotLessCommision());
        stms.setObject(6, update.getChitRegistration_Date());

        return stms.executeUpdate();
    }

    public static boolean deleteChitRegistration(ChitRegistration IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from chitregistration WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static List<ChitRegistration> searchChitRegistrationByDateAndCenterId(String date, String centerID) throws ClassNotFoundException, SQLException {
        String quary = "select chitRegistration_ActualInvestment from chitregistration WHERE chitRegistration_Date='" + date + "' AND center_ID='" + centerID + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<ChitRegistration> centerList = new ArrayList<ChitRegistration>();
        while (res.next()) {
            ChitRegistration center = new ChitRegistration(res.getDouble("chitRegistration_ActualInvestment"));
            centerList.add(center);
        }
        return centerList;

    }

    public static int serchMaxItem() throws ClassNotFoundException, SQLException {
        String quary = "SELECT MAX(chitRegistration_ID)FROM chitregistration";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<ChitRegistration> chtregistraionList = new ArrayList<ChitRegistration>();
        int max = 1;
        while (res.next()) {
            max = res.getInt("MAX(chitRegistration_ID)");
            max++;
        }
        return max;
    }
//      public static List<ChitRegistration> sercLikeChitRegistrationName(String name) throws ClassNotFoundException, SQLException {
//        String quary = "SELECT*FROM chitregistration WHERE center_Name LIKE '" + name + "%'  ";
//        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
//        PreparedStatement stm = conn.prepareStatement(quary);
//        ResultSet res = stm.executeQuery();
//        List<ChitRegistration> chitregistrationList = new ArrayList<ChitRegistration>();
//        while (res.next()) {
//            ChitRegistration chitregistration = new ChitRegistration( res.getString("center_Name"));
//            chitregistrationList.add(chitregistration);
//            System.out.println("print una");
//        }
//        return chitregistrationList;
//    } 
}
