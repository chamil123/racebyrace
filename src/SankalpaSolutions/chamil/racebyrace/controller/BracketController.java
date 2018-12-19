/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Bracket;

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
public class BracketController {

    public static int addBrackets(Bracket add) throws ClassNotFoundException, SQLException {
        String quary = "insert into brackets values(?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getChitRegistration_ID());
        stm.setObject(2, add.getBracket_ItemID());
        stm.setObject(3, add.getBracket_To());
        stm.setObject(4, add.getBracket_For());
        stm.setObject(5, add.getBracket_Amount());
        stm.setObject(6, add.getBracket_Type());
        return stm.executeUpdate();

    }

    public static List<Bracket> searchAllBracketsByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from brackets WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Bracket> bracketList = new ArrayList<Bracket>();
        while (res.next()) {
            Bracket bracket = new Bracket(res.getInt("chitRegistration_ID"), res.getString("bracket_ItemID"), res.getString("bracket_To"), res.getString("bracket_For"), res.getString("bracket_Amount"), res.getString("bracket_Type"));
            bracketList.add(bracket);
        }
        return bracketList;

    }
}
