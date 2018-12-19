/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Center;
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
public class CenterController {

    public static int addCenter(Center add) throws ClassNotFoundException, SQLException {
        String quary = "insert into center values(?,?,?,?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getAccount_ID());
        stm.setObject(2, add.getCenter_ID());
        stm.setObject(3, add.getCenter_Name());
        stm.setObject(4, add.getCenter_com());
        stm.setObject(5, add.getCenter_exp());
        stm.setObject(6, add.getCenter_lessCom());
        stm.setObject(7, add.getCenter_loan());
        stm.setObject(8, add.getCenter_noCom());
        stm.setObject(9, add.getCenter_paperCash());
        return stm.executeUpdate();

    }

    public static List<Center> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from center";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Center> centerList = new ArrayList<Center>();
        while (res.next()) {
            Center center = new Center(res.getInt("account_ID"), res.getString("center_ID"), res.getString("center_Name"), res.getString("center_com"), res.getString("center_paperCash"), res.getString("center_loan"), res.getString("center_noCom"), res.getString("center_lessCom"), res.getString("center_exp"));
            centerList.add(center);
        }
        return centerList;
    }

    public static List<Center> searchCenterByName(String name) throws ClassNotFoundException, SQLException {
        String quary = "select * from center WHERE center_Name='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Center> centerList = new ArrayList<Center>();
        while (res.next()) {
            Center center = new Center(res.getInt("account_ID"), res.getString("center_ID"), res.getString("center_Name"), res.getString("center_com"), res.getString("center_paperCash"), res.getString("center_loan"), res.getString("center_noCom"), res.getString("center_lessCom"), res.getString("center_exp"));
            centerList.add(center);
        }
        return centerList;
    }

    public static Center searchCenterByIDNumber(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from center WHERE center_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();

        if (res.next()) {
            System.out.println("id number : " + res.getString("center_Name"));
            return new Center(res.getInt("account_ID"), res.getString("center_ID"), res.getString("center_Name"), res.getString("center_com"), res.getString("center_paperCash"), res.getString("center_loan"), res.getString("center_noCom"), res.getString("center_lessCom"), res.getString("center_exp"));
        }
        return null;

    }

    public static Center searchCenterNameAndAccountByIDNumber(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from center WHERE center_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            System.out.println("id number : " + res.getString("center_Name"));
            return new Center(res.getInt("account_ID"), res.getString("center_Name"));
        }
        return null;

    }

    public static int updateCenter(Center update) throws ClassNotFoundException, SQLException {
        String quary = "update Center set account_ID=?,center_Name=?,center_com=?,center_paperCash=?,center_loan=?,center_noCom=?,center_lessCom=?,center_exp=? where center_ID='" + update.getCenter_ID() + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stms = conn.prepareStatement(quary);
        stms.setObject(1, update.getAccount_ID());
        stms.setObject(2, update.getCenter_Name());
        stms.setObject(3, update.getCenter_com());
        stms.setObject(4, update.getCenter_exp());
        stms.setObject(5, update.getCenter_lessCom());
        stms.setObject(6, update.getCenter_loan());
        stms.setObject(7, update.getCenter_noCom());
        stms.setObject(8, update.getCenter_paperCash());
        return stms.executeUpdate();
    }

    public static boolean deleteCenter(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from center WHERE center_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Center> sercLikeCenterName(String name) throws ClassNotFoundException, SQLException {
        String quary = "SELECT*FROM center WHERE center_Name LIKE '" + name + "%'  ";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Center> centerList = new ArrayList<Center>();
        while (res.next()) {
            Center center = new Center(res.getString("center_Name"));
            centerList.add(center);

        }
        return centerList;
    }

    public static List<Center> sercLikeCenterNameAndCenterID(String name) throws ClassNotFoundException, SQLException {
        String quary = "SELECT*FROM center WHERE center_Name LIKE '" + name + "%'  ";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Center> centerList = new ArrayList<Center>();
        while (res.next()) {
            Center center = new Center(res.getInt("account_ID"), res.getString("center_Name"), res.getString("center_ID"));
            centerList.add(center);
            System.out.println("print una");
        }
        return centerList;
    }

    public static String getCenterNameByID(int IDNumber) throws ClassNotFoundException, SQLException {

        String quary = "SELECT center_Name,center_ID FROM center WHERE center_ID=?";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setInt(1, IDNumber);
        ResultSet res = stm.executeQuery();
        String center_name = null;
        if (res.next()) {

            center_name = res.getString("center_Name");
        }
        return center_name;
    }

    public static String getAccountNameByCenterID(int IDNumber) throws ClassNotFoundException, SQLException {

        String quary = "SELECT account_ID,center_ID FROM center WHERE center_ID=?";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setInt(1, IDNumber);
        ResultSet res = stm.executeQuery();
        String Account_name = null;
        if (res.next()) {

            //center_name = res.getInt("account_ID");
            Account_name = AccountController.getAccountNameByID(res.getInt("account_ID"));
        }
        return Account_name;
    }

    public static Center searchCenterByID(int id) throws ClassNotFoundException, SQLException {
        String quary = "select center_Name,account_ID,center_ID from center WHERE center_ID='" + id + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {

            return new Center(res.getInt("account_ID"), res.getString("center_Name"), res.getString("center_ID"));
        }
        return null;

    }
      public static Center searchCenterByName2(String name) throws ClassNotFoundException, SQLException {
        String quary = "select center_Name,account_ID,center_ID from center WHERE center_Name='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {

            return new Center(res.getInt("account_ID"), res.getString("center_Name"), res.getString("center_ID"));
        }
        return null;

    }
}
