/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Chit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win 8
 */
public class ChitController {
 static List<Chit> chitList;
    public static List<Chit> addChit(Chit add) throws ClassNotFoundException, SQLException {
       chitList = new ArrayList<Chit>();

        Chit center = new Chit(add.getChit_ID(), add.getChitRegistration_ID(), add.getChitRegistration_chitNumber(), add.getChit_Amount(), add.getChit_Paymrnt(),add.getChit_TotalNotRuns());
        chitList.add(center);
        
        return chitList;
//        String quary = "insert into chit values(?,?,?,?,?)";
//        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
//        PreparedStatement stm = conn.prepareStatement(quary);
//        stm.setObject(1, add.getChit_ID());
//        stm.setObject(2, add.getChitRegistration_ID());
//        stm.setObject(3, add.getChitRegistration_chitNumber());
//        stm.setObject(4, add.getChit_Amount());
//        stm.setObject(5, add.getChit_Paymrnt());
    }
    public static List<Chit> getList(){
    return chitList;
    }
}
