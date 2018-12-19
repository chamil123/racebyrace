/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.Maths;

/**
 *
 * @author Win 8
 */
public class Quintuple {
  double value;
    public double  passvalue(double distance) {
        value=(distance*(distance-1)*(distance-2)*(distance-3)*(distance-4)/5)/4/3/2;
        return value;
      
    }   
}
