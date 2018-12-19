/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.SingleM;
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
public class SinglesController {
        public static int addSingles(SingleM add) throws ClassNotFoundException, SQLException {
        String quary = "insert into singles values(?,?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getChitRegistration_ID());
        stm.setObject(2, add.getSingles_ItemID());
        stm.setObject(3, add.getSingles_To());
        stm.setObject(4, add.getSingles_For());
        stm.setObject(5, add.getSingles_Amount());
        stm.setObject(6, add.getSingles_Value());
        stm.setObject(7, add.getSingles_Type());
          return stm.executeUpdate();

    }
     public static List<SingleM> searchAllSinglesByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from singles WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<SingleM> singleMList = new ArrayList<SingleM>();
        while (res.next()) {
            SingleM singles = new SingleM(res.getInt("chitRegistration_ID"), res.getString("singles_ItemID"), res.getString("singles_To"), res.getString("singles_For"), res.getString("singles_Amount"), res.getString("singles_Value"), res.getString("singles_Type"));
            singleMList.add(singles);
        }
        return singleMList;

    }
}
