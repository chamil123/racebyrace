/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Center;
import SankalpaSolutions.chamil.racebyrace.model.Packet;
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
public class PacketController {

    public static int addPacket(Packet add) throws ClassNotFoundException, SQLException {
        String quary = "insert into packet (center_ID,packet_Date,packet_FC) values(?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);

        stm.setObject(1, add.getCenter_ID());

        java.sql.Date sqlDate = new java.sql.Date(add.getPacket_Date().getTime());
        System.out.println("ddddddddd : " + sqlDate);
        stm.setDate(2, sqlDate);
        // stm.setObject(3, add.getPacket_Date());
        stm.setObject(3, add.getPacket_FC());
        return stm.executeUpdate();

    }

    public static List<Packet> serchAllItem(String date) throws ClassNotFoundException, SQLException {
        // java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String quary = "select * from packet WHERE packet_Date='" + date + "'";

        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Packet> packetList = new ArrayList<Packet>();
        while (res.next()) {
            Packet packet = new Packet(res.getInt("packet_ID"), res.getInt("center_ID"), res.getDate("packet_Date"), res.getDouble("packet_FC"));
            packetList.add(packet);
        }
        return packetList;
    }

    public static List<Packet> searchPacketByName(String name) throws ClassNotFoundException, SQLException {
        String quary = "select * from packet WHERE center_Name='" + name + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Packet> packetList = new ArrayList<Packet>();
        while (res.next()) {
            Packet packet = new Packet(res.getInt("packet_ID"), res.getInt("center_ID"), res.getDate("packet_Date"), res.getDouble("packet_FC"));
            packetList.add(packet);
        }
        return packetList;
    }

    public static Packet searchPacketByIDNumber(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from packet WHERE center_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            return new Packet(res.getInt("packet_ID"), res.getInt("center_ID"), res.getDate("packet_Date"), res.getDouble("packet_FC"));
        }
        return null;

    }

    public static Packet searchPacketIDandDateByIDNumber(String date, String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from packet WHERE center_ID='" + IDNumber + "' AND packet_Date='" + date + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            return new Packet(res.getInt("packet_ID"), res.getInt("center_ID"), res.getDate("packet_Date"), res.getDouble("packet_FC"));
        }
        return null;

    }

    public static int updatePacket(Packet update) throws ClassNotFoundException, SQLException {
        String quary = "UPDATE packet set center_ID=?,packet_Date=?,packet_FC=? WHERE packet_ID=?";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stms = conn.prepareStatement(quary);
        stms.setInt(1, update.getCenter_ID());
        java.sql.Date sqlDate = new java.sql.Date(update.getPacket_Date().getTime());
        stms.setDate(2, sqlDate);
        stms.setDouble(3, update.getPacket_FC());
        stms.setInt(4, update.getPacket_ID());
        return stms.executeUpdate();

    }

    public static boolean deletePacket(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "DELETE from packet WHERE packet_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        int res = stm.executeUpdate();
        if (res > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean searchChitRegistrationByDateAndCenterId(String date, String centerID) throws ClassNotFoundException, SQLException {
        String quary = "select* from packet WHERE packet_Date='" + date + "' AND center_ID='" + centerID + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Packet> packetList = new ArrayList<Packet>();
        while (res.next()) {
            return true;
        }
        return false;

    }

    ///// update 2018-03-14
    public static int searchpacketByDateAndId(Date date, int id) throws SQLException, ClassNotFoundException {
        int valueInner = 0;

        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String sql = "SELECT packet_Date,center_ID FROM packet WHERE packet_Date='" + sqlDate + "' AND center_ID='" + id + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            valueInner = 1;
        }

        rst = null;
        return valueInner;
    }

    public static Packet searchSinglePacketByPacketId(String IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from packet WHERE packet_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        if (res.next()) {
            return new Packet(res.getInt("packet_ID"), res.getInt("center_ID"), res.getDate("packet_Date"), res.getDouble("packet_FC"));
        }
        return null;

    }

}
