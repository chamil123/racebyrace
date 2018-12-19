/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Account;
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
public class AccountController {
      public static int addAccount(Account add) throws ClassNotFoundException, SQLException {
        String quary = "insert into account values(?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getAccount_ID());
        stm.setObject(2, add.getAccount_Name());
       
        return stm.executeUpdate();

    }

    public static List<Account> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from account";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Account> accountList = new ArrayList<Account>();
        while (res.next()) {
            Account account = new Account(res.getInt("account_ID"), res.getString("account_Name"));
            accountList.add(account);
        }
        return accountList;
    }

    public static List<Account> searchAccountByName(String name) throws ClassNotFoundException, SQLException {
        String quary = "select * from account WHERE center_Name='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Account> accountList = new ArrayList<Account>();
        while (res.next()) {
            Account account = new Account(res.getInt("account_ID"), res.getString("account_Name"));
            accountList.add(account);
        }
        return accountList;
    }

    public static Account searchAccountByIDNumber(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from account WHERE Account_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            return new Account(res.getInt("account_ID"), res.getString("account_Name"));
        }
        return null;

    }
     public static String searchAccountById(String id) throws SQLException, ClassNotFoundException {

        String quary = "Select*From account WHERE Account_id='" + id + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet rst = stm.executeQuery();
        String account = null;
        if (rst.next()) {

            account = rst.getString("account_name");
            //  account = new Account(rst.getInt("account_id"), rst.getString("account_name"), rst.getInt("account_com"), rst.getDouble("account_paperCash"), rst.getDouble("account_loan"), rst.getInt("account_noCom"), rst.getInt("account_lessCom"), rst.getDouble("account_exp"));
        }

        rst = null;
        return account;

    }
     
     

    public static int updateAccount(Account update) throws ClassNotFoundException, SQLException {
        String quary = "update account set account_Name=? where account_ID='" + update.getAccount_ID()+ "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stms = conn.prepareStatement(quary);
        stms.setObject(1, update.getAccount_Name());
        
        return stms.executeUpdate();
    }

    public static boolean deleteAccount(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from account WHERE account_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }
      public static List<Account> sercLikeAccountName(String name) throws ClassNotFoundException, SQLException {
        String quary = "SELECT*FROM account WHERE account_Name LIKE '" + name + "%'  ";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Account> accountList = new ArrayList<Account>();
        while (res.next()) {
            Account account = new Account( res.getString("account_Name"));
            accountList.add(account);
           
        }
        return accountList;
    } public static String getAccountNameByID(int IDNumber) throws ClassNotFoundException, SQLException {

        String quary = "SELECT Account_ID,Account_Name FROM account WHERE Account_ID=?";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setInt(1, IDNumber);
        ResultSet res = stm.executeQuery();
        String Account_name = null;
        if (res.next()) {

            Account_name = res.getString("Account_Name");
        }
        return Account_name;
    }
}
