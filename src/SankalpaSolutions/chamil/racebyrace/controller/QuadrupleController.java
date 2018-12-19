/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.QuadrupleM;

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
public class QuadrupleController {

    public static int addDoubles(QuadrupleM add) throws ClassNotFoundException, SQLException {
        String quary = "insert into quadruples values(?,?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getChitRegistration_ID());
        stm.setObject(2, add.getQuadruple_ItemID());
        stm.setObject(3, add.getQuadruple_To());
        stm.setObject(4, add.getQuadruple_For());
        stm.setObject(5, add.getQuadruple_Amount());
        stm.setObject(6, add.getQuadruple_Value());
        stm.setObject(7, add.getQuadruple_Type());
        return stm.executeUpdate();

    }

    public static List<QuadrupleM> searchAllQuadruplesByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from quadruples WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<QuadrupleM> quadrupleMList = new ArrayList<QuadrupleM>();
        while (res.next()) {
            QuadrupleM quad = new QuadrupleM(res.getInt("chitRegistration_ID"), res.getString("quadruple_ItemID"), res.getString("quadruple_To"), res.getString("quadruple_For"), res.getString("quadruple_Amount"), res.getString("quadruple_Value"), res.getString("quadruple_Type"));
            quadrupleMList.add(quad);
        }
        return quadrupleMList;

    }
}
