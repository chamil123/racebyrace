/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.SheetDetails;
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
public class SheetDetailsController {

    public static int addSheetDetails(SheetDetails add) throws ClassNotFoundException, SQLException {
        String quary = "insert into sheetdetails values(?,?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getSheetDetails_ID());
        stm.setObject(2, add.getSheetDetails_Date());
        stm.setObject(3, add.getCenter_ID());
        stm.setObject(4, add.getSheetDetails_FC());
        stm.setObject(5, add.getSheetDetails_Cash());
        stm.setObject(6, add.getSheetDetails_Excess());
        stm.setObject(7, add.getSheetDetails_PD());
        return stm.executeUpdate();

    }

    public static List<SheetDetails> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from sheetdetails";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<SheetDetails> sheetdetailsList = new ArrayList<SheetDetails>();
        while (res.next()) {
            SheetDetails sheetdetails = new SheetDetails(res.getInt("sheetDetails_ID"), res.getString("sheetDetails_Date"), res.getString("center_ID"), res.getDouble("sheetDetails_FC"), res.getDouble("sheetDetails_Cash"), res.getDouble("sheetDetails_Excess"), res.getDouble("sheetDetails_PD"));
            sheetdetailsList.add(sheetdetails);
        }
        return sheetdetailsList;
    }

    public static int updateSheetDetails(SheetDetails update) throws ClassNotFoundException, SQLException {
        String quary = "update sheetdetails set sheetDetails_Date=?,center_ID=?,sheetDetails_FC=?,sheetDetails_Cash=?,sheetDetails_Excess=?,sheetDetails_PD=? where sheetDetails_ID='" + update.getSheetDetails_ID() + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stms = conn.prepareStatement(quary);
        stms.setObject(1, update.getSheetDetails_Date());
        stms.setObject(2, update.getCenter_ID());
        stms.setObject(3, update.getSheetDetails_FC());
        stms.setObject(4, update.getSheetDetails_Cash());
        stms.setObject(5, update.getSheetDetails_Excess());
        stms.setObject(6, update.getSheetDetails_PD());

        return stms.executeUpdate();
    }

    public static boolean deleteSheetDetails(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from sheetdetails WHERE sheetDetails_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int serchMaxItem() throws ClassNotFoundException, SQLException {
        String quary = "SELECT MAX(sheetDetails_ID)FROM sheetdetails";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<SheetDetails> sheetDetailsList = new ArrayList<SheetDetails>();
        int max = 1;
        while (res.next()) {
            max = res.getInt("MAX(sheetDetails_ID)");
            max++;
        }
        return max;
    }

    public static SheetDetails searchsheetdetailsByDateAndCenterName(String date, String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from sheetdetails WHERE sheetDetails_Date='" + date + "' AND center_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();

        if (res.next()) {
            return new SheetDetails(res.getInt("sheetDetails_ID"), res.getString("sheetDetails_Date"), res.getString("center_ID"), res.getDouble("sheetDetails_FC"), res.getDouble("sheetDetails_Cash"), res.getDouble("sheetDetails_Excess"), res.getDouble("sheetDetails_PD"));
        }
        return null;

    }

    public static List<SheetDetails> searchsheetdetailsByDate(String date) throws ClassNotFoundException, SQLException {
        String quary = "select * from sheetdetails WHERE sheetDetails_Date='" + date + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();

        List<SheetDetails> sheetDetailsList = new ArrayList<SheetDetails>();
        while (res.next()) {
            SheetDetails sheetDetails = new SheetDetails(res.getInt("sheetDetails_ID"), res.getString("sheetDetails_Date"), res.getString("center_ID"), res.getDouble("sheetDetails_FC"), res.getDouble("sheetDetails_Cash"), res.getDouble("sheetDetails_Excess"), res.getDouble("sheetDetails_PD"));
            sheetDetailsList.add(sheetDetails);
            System.out.println("print una");
        }
        return sheetDetailsList;

    }
    public static boolean deleteCenterByDate(String date) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from sheetdetails WHERE sheetDetails_Date='" + date + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }
//         public static List<SheetDetails> sercLikeSheetdetails(String name) throws ClassNotFoundException, SQLException {
//        String quary = "SELECT*FROM sheetdetails WHERE center_Name LIKE '" + name + "%'  ";
//        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
//        PreparedStatement stm = conn.prepareStatement(quary);
//        ResultSet res = stm.executeQuery();
//        List<SheetDetails> centerList = new ArrayList<SheetDetails>();
//        while (res.next()) {
//            SheetDetails center = new SheetDetails(res.getString("center_Name"));
//            centerList.add(center);
//            System.out.println("print una");
//        }
//        return centerList;
//    }
}
