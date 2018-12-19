/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Country;
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
public class CountryController {

    public static int addCountry(Country add) throws ClassNotFoundException, SQLException {
        String quary = "insert into country values(?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getCountry_ID());
        stm.setObject(2, add.getCountry_Name());

        return stm.executeUpdate();

    }

    public static List<Country> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from country";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Country> countryList = new ArrayList<Country>();
        while (res.next()) {
            Country country = new Country(res.getInt("country_ID"), res.getString("country_Name"));
            countryList.add(country);
        }
        return countryList;
    }

    public static List<Country> searchCountryByName(String name) throws ClassNotFoundException, SQLException {
        String quary = "select * from country WHERE country_Name='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Country> countryList = new ArrayList<Country>();
        while (res.next()) {
            Country country = new Country(res.getInt("country_ID"), res.getString("country_Name"));
            countryList.add(country);
        }
        return countryList;
    }

    public static Country searchCountryByIDNumber(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from country WHERE country_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            return new Country(res.getInt("country_ID"), res.getString("country_Name"));
        }
        return null;

    }

    public static int updateCenter(Country update) throws ClassNotFoundException, SQLException {
        String quary = "update country set country_ID=?,country_Name=? where country_ID='" + update.getCountry_ID() + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stms = conn.prepareStatement(quary);

        stms.setObject(1, update.getCountry_Name());
        return stms.executeUpdate();
    }

    public static boolean deleteCountry(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from country WHERE country_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Country> serchLikeCountryName(String name) throws ClassNotFoundException, SQLException {
        String quary = "SELECT*FROM country WHERE country_Name LIKE '" + name + "%'  ";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Country> centerList = new ArrayList<Country>();
        while (res.next()) {
            Country country = new Country(res.getInt("country_ID"), res.getString("country_Name"));
            centerList.add(country);
            System.out.println("print una country id eka : " + res.getInt("country_ID"));
        }
        return centerList;
    }

    public static int serchMaxCountryId() throws ClassNotFoundException, SQLException {
        String quary = "SELECT MAX(country_ID)FROM country";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        int max = 1;
        while (res.next()) {
            max = res.getInt("MAX(country_ID)");
            max++;
        }
        return max;
    }

    public static boolean TruncateCountry() throws ClassNotFoundException, SQLException {

        String quary = "TRUNCATE TABLE  country";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }
      public static boolean TruncatePora() throws ClassNotFoundException, SQLException {
         String quary = "TRUNCATE TABLE  pora";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    } public static boolean TruncateHorse() throws ClassNotFoundException, SQLException {
         String quary = "TRUNCATE TABLE  horse";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }
    

}
