/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Center;
import SankalpaSolutions.chamil.racebyrace.model.RaceCard;
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
public class RaceCardController {

    public static int addRaceCard(RaceCard add) throws ClassNotFoundException, SQLException {
        String quary = "insert into race_card values(?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getRaceCard_ID());
        stm.setObject(2, add.getCountry_ID());
        stm.setObject(3, add.getPora());
        stm.setObject(4, add.getRaceCard_PoraNumber());
        stm.setObject(5, add.getRaceCard_HorseName());

        return stm.executeUpdate();

    }

    public static List<RaceCard> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from race_card";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<RaceCard> racecardList = new ArrayList<RaceCard>();
        while (res.next()) {
            RaceCard raceCard = new RaceCard(res.getInt("raceCard_ID"), res.getInt("country_ID"), res.getString("pora"), res.getString("raceCard_PoraNumber"), res.getString("raceCard_HorseName"));
            racecardList.add(raceCard);
        }
        return racecardList;
    }

    public static List<RaceCard> searchRaceCardByName(String name) throws ClassNotFoundException, SQLException {
        String quary = "select * from race_card WHERE pora='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<RaceCard> racecardList = new ArrayList<RaceCard>();
        while (res.next()) {
            RaceCard raceCard = new RaceCard(res.getInt("raceCard_ID"), res.getInt("country_ID"), res.getString("pora"), res.getString("raceCard_PoraNumber"), res.getString("raceCard_HorseName"));
            racecardList.add(raceCard);
        }
        return racecardList;
    }

    public static RaceCard searchRaceCardByIDNumber(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from race_card WHERE center_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            return new RaceCard(res.getInt("raceCard_ID"), res.getInt("country_ID"), res.getString("pora"), res.getString("raceCard_PoraNumber"), res.getString("raceCard_HorseName"));
        }
        return null;

    }

    public static List<RaceCard> searchRaceCardPoraByName(String name) throws ClassNotFoundException, SQLException {
        String quary = "select pora,raceCard_HorseName from race_card WHERE raceCard_HorseName='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<RaceCard> racecardList = new ArrayList<RaceCard>();
        while (res.next()) {
            RaceCard racecard = new RaceCard(res.getString("pora"),res.getString("pora"));
            racecardList.add(racecard);
              System.out.println("pora print venne ne : "+ res.getString("pora"));
        }
        return racecardList;
    }

//     public static RaceCard searchRaceCardPoraByName(String name) throws ClassNotFoundException, SQLException {
//        String quary = "select pora from race_card WHERE raceCard_HorseName='" + name + "'";
//        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
//        PreparedStatement stm = conn.prepareStatement(quary);
//        ResultSet res = stm.executeQuery();
//        if (res.next()) {
//            System.out.println("pora print venne ne : "+ res.getString("pora"));
////            return new RaceCard(res.getString("pora"));
//             return new RaceCard(res.getString("pora"));
//        }
//         return null;
//
//    }
    public static int updateRaceCard(RaceCard update) throws ClassNotFoundException, SQLException {
        String quary = "update race_card set country_ID=?,pora=?,raceCard_PoraNumber=?,raceCard_HorseName=? where raceCard_ID='" + update.getRaceCard_ID() + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stms = conn.prepareStatement(quary);
        stms.setObject(1, update.getCountry_ID());
        stms.setObject(2, update.getPora());
        stms.setObject(3, update.getRaceCard_PoraNumber());
        stms.setObject(4, update.getRaceCard_HorseName());

        return stms.executeUpdate();
    }

    public static boolean deleteRaceCard(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from race_card WHERE raceCard_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static List<RaceCard> sercLikeRaceCardName(String name) throws ClassNotFoundException, SQLException {
        String quary = "SELECT*FROM race_card WHERE raceCard_HorseName LIKE '" + name + "%'  ";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<RaceCard> racecardList = new ArrayList<RaceCard>();
        while (res.next()) {
            RaceCard raceCard = new RaceCard(res.getString("raceCard_HorseName"),res.getString("pora"));
            racecardList.add(raceCard);

        }
        return racecardList;
    }
}
