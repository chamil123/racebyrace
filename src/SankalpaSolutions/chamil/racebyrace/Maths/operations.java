/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.Maths;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Win 8
 */
public class operations {

    Hashtable balance = new Hashtable();
    static String passVal;
    static String date;
    static String number;

    public void passVal(String code) {
        passVal = code;

    }

    public void passDateAndPacketNumber(String date, String number) {
        this.date = date;
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }

    public String getVal() {

        return passVal;

    }

    public void passPixels(int dd, int ARowSize, int AEndLenght, int BRowSize, int BEndLenght, int nocolorline, int CY, String textFieldName) {
        balance.put(dd, new String(ARowSize + "/" + AEndLenght + "/" + BRowSize + "/" + BEndLenght + "/" + nocolorline + "/" + CY + "/" + textFieldName));

        System.out.println("balance get vaue  : " + CY);
    }

    public void passPixelsWinAndPlace(int dd, int ARowSizePlace, int AEndLenghtPlace, int BRowSizePlace, int BEndLenghtPlace, int nocolorline, int CYPlace, String textFieldName, int ARowSizeWin, int AEndLenghtWin, int BRowSizeWin, int BEndLenghtWin, int CYWin) {
        balance.put(dd, new String(ARowSizePlace + "/" + AEndLenghtPlace + "/" + BRowSizePlace + "/" + BEndLenghtPlace + "/" + nocolorline + "/" + CYPlace + "/" + textFieldName + "/" + ARowSizeWin + "/" + AEndLenghtWin + "/" + BRowSizeWin + "/" + BEndLenghtWin + "/" + CYWin));

        System.out.println("balance get vaueW/P  : " + CYPlace);
    }

    public Object getval(int id) {
//        System.out.println("to string " + vector.toString());
        return balance.get(id);
    }
}
