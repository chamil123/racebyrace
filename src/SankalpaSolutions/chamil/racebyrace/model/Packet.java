/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

import java.util.Date;

/**
 *
 * @author Win 8
 */
public class Packet {

    private Integer packet_ID;
    private int center_ID;
    private Date packet_Date;
    private double packet_FC;


    public Packet() {
    }

    public Packet(int center_ID, Date packet_Date) {
        this.center_ID = center_ID;
        this.packet_Date = packet_Date;
    }

  
    public Packet(Integer packet_ID, int center_ID, Date packet_Date, double packet_FC) {
        this.packet_ID = packet_ID;
        this.center_ID = center_ID;
        this.packet_Date = packet_Date;
        this.packet_FC = packet_FC;
    }

    

    /**
     * @return the packet_ID
     */
    public Integer getPacket_ID() {
        return packet_ID;
    }

    /**
     * @param packet_ID the packet_ID to set
     */
    public void setPacket_ID(Integer packet_ID) {
        this.packet_ID = packet_ID;
    }

    /**
     * @return the center_ID
     */
    public int getCenter_ID() {
        return center_ID;
    }

    /**
     * @param center_ID the center_ID to set
     */
    public void setCenter_ID(int center_ID) {
        this.center_ID = center_ID;
    }

    /**
     * @return the packet_Date
     */
    public Date getPacket_Date() {
        return packet_Date;
    }

    /**
     * @param packet_Date the packet_Date to set
     */
    public void setPacket_Date(Date packet_Date) {
        this.packet_Date = packet_Date;
    }

    /**
     * @return the packet_FC
     */
    public double getPacket_FC() {
        return packet_FC;
    }

    /**
     * @param packet_FC the packet_FC to set
     */
    public void setPacket_FC(double packet_FC) {
        this.packet_FC = packet_FC;
    }

   

    
}
