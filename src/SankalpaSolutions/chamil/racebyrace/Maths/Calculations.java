/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.Maths;

import SankalpaSolutions.chamil.racebyrace.controller.BracketController;
import SankalpaSolutions.chamil.racebyrace.controller.ChitController;
import SankalpaSolutions.chamil.racebyrace.controller.ChitRegistrationController;
import SankalpaSolutions.chamil.racebyrace.controller.DoublesController;
import SankalpaSolutions.chamil.racebyrace.controller.HorcesOfChitController;
import SankalpaSolutions.chamil.racebyrace.controller.PacketController;
import SankalpaSolutions.chamil.racebyrace.controller.QuadrupleController;
import SankalpaSolutions.chamil.racebyrace.controller.QuintupleController;
import SankalpaSolutions.chamil.racebyrace.controller.ResultDetailsController;
import SankalpaSolutions.chamil.racebyrace.controller.ResultsController;
import SankalpaSolutions.chamil.racebyrace.controller.SinglesController;
import SankalpaSolutions.chamil.racebyrace.controller.TriblesController;
import SankalpaSolutions.chamil.racebyrace.model.Bracket;
import SankalpaSolutions.chamil.racebyrace.model.Chit;
import SankalpaSolutions.chamil.racebyrace.model.ChitRegistration;
import SankalpaSolutions.chamil.racebyrace.model.DoublesM;
import SankalpaSolutions.chamil.racebyrace.model.HorcesOfChit;
import SankalpaSolutions.chamil.racebyrace.model.Packet;
import SankalpaSolutions.chamil.racebyrace.model.QuadrupleM;
import SankalpaSolutions.chamil.racebyrace.model.QuintupleM;
import SankalpaSolutions.chamil.racebyrace.model.ResultDetails;
import SankalpaSolutions.chamil.racebyrace.model.Results;
import SankalpaSolutions.chamil.racebyrace.model.SingleM;
import SankalpaSolutions.chamil.racebyrace.model.TriblesM;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Win 8
 */
public class Calculations {

    private double doubletot;
    private double totDouble;
    private double totPlaceDouble;
    private double totSecondPlaceDouble;
    private double totWinDouble;
    private double totWinTrible;
    private double totWinQuadruplese;
    private double totWinQuintuples;
    private double tribletot;
    private double totPlaceTrible;
    private double totSecondPlaceTrible;
    private double totPlacequadruple;
    private double totSecondPlacequadruple;
    private double totPlacequintuple;
    private double totSecondPlacequintuple;
    private double totTrible;
    private double totQuadruple;
    private double totQuintuple;
    private double totBrackets;
    private double total;
    private double bracketWinTotal;
    private double bracketPlaceTotal;
    private double bracketPlacePlaceTotal;
    private double bracketot;
    private double quadrupletot;
    private double quintupletot;
    private double totSingles;
    private double winSingles;
    private double placeSingles;
    private double secondplaceSingles;
    private double lessCommison;
    private double afterDeductComissionTotal;
    double doublenotRuns = 0;
    private double doubleNonRunners = 0;
    private double totalNotRuns;
    private double triblenotRuns;
    private double quadnotRuns;
    private double quinnotRuns;
    private int bracketnotRuns;
    private double tribleNonRunners = 0;
    private double quadNonRunners = 0;
    private double quinNonRunners = 0;
    private double bracketNonRunners = 0;
    private int bracketnotRuns2;
    private int bracketnotRuns3;
    private int bracketnotRuns4;
    private int bracketnotRuns5;
    private int bracketnotRuns6;
    private double singleNonRunners;
    private double finalTotalNonRunners;

    public double passToDouble(ArrayList<Double> winSide) {
        int j = 0;
        double tot = 0;

        double maxDouble = 200000;
        for (int i = 0; i < winSide.size(); i++) {
            for (j = i + 1; j < winSide.size(); j++) {
                if (maxDouble < (winSide.get(i) / 10 * winSide.get(j) / 10)) {
                    tot += maxDouble;
                    if (winSide.get(i) / 10 == 1.0 && winSide.get(j) / 10 == 1.0) {
                        doublenotRuns += (winSide.get(i) / 10) * (winSide.get(j) / 10);
                        System.out.println("double non runers inthe double formula if part: " + doublenotRuns);
                    }
                } else {
                    tot += (winSide.get(i) / 10) * (winSide.get(j) / 10);
                    if (winSide.get(i) / 10 == 1.0 && winSide.get(j) / 10 == 1.0) {
                        doublenotRuns += (winSide.get(i) / 10) * (winSide.get(j) / 10);
                        System.out.println("double non runers inthe double formula else part: " + doublenotRuns);
                    }
                    System.out.println(winSide.get(i) + " : " + winSide.get(j));
                }
            }
            System.out.println(" doubles tot : " + tot);
        }

        doubletot = tot;
        System.out.println("tot doubles : " + doubletot);
        return doubletot;
    }

    public double passToTribles(ArrayList<Double> winSide) {
        int j = 0;
        int k = 0;

        double tot = 0;
        double maxTrible = 600;

        for (int i = 0; i < winSide.size(); i++) {
            for (j = i + 1; j < winSide.size(); j++) {

                for (k = j + 1; k < winSide.size(); k++) {

                    System.out.println("  jj : " + winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10);
                    if (maxTrible < winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10) {
                        tot += maxTrible;
                        System.out.println("max trble : " + tot);
                        if (winSide.get(i) / 10 == 1.0 && winSide.get(j) / 10 == 1.0 && winSide.get(k) / 10 == 1.0) {
                            triblenotRuns += (winSide.get(i) / 10) * (winSide.get(j) / 10) * (winSide.get(k) / 10);
                        }
                    } else {
                        tot += winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10;
                        if (winSide.get(i) / 10 == 1.0 && winSide.get(j) / 10 == 1.0 && winSide.get(k) / 10 == 1.0) {
                            triblenotRuns += (winSide.get(i) / 10) * (winSide.get(j) / 10) * (winSide.get(k) / 10);
                        }
                    }

                }

            }
        }
        tribletot = tot;
        System.out.println("trtrible total ss  : " + tot);
        return tribletot;
    }

    public double nonRunners() {
        return doublenotRuns;
    }

    public double nonRunnersTribles() {
        return triblenotRuns;
    }

    public double passToQuadruple(ArrayList<Double> winSide) {
        int j = 0;
        int k = 0;
        int l = 0;
        double tot = 0;
        double maxQuad = 700;
        for (int i = 0; i < winSide.size(); i++) {
            for (j = i + 1; j < winSide.size(); j++) {

                for (k = j + 1; k < winSide.size(); k++) {
                    for (l = k + 1; l < winSide.size(); l++) {
                        System.out.println("  xx : " + winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10 * winSide.get(l) / 10);
                        if (maxQuad < winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10 * winSide.get(l) / 10) {
                            tot += maxQuad;
                            if (winSide.get(i) / 10 == 1.0 && winSide.get(j) / 10 == 1.0 && winSide.get(k) / 10 == 1.0) {
                                quadnotRuns += (winSide.get(i) / 10) * (winSide.get(j) / 10) * (winSide.get(k) / 10) * (winSide.get(l) / 10);
                            }
                            System.out.println("max quad : " + tot);
                        } else {
                            tot += winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10 * winSide.get(l) / 10;
                            if (winSide.get(i) / 10 == 1.0 && winSide.get(j) / 10 == 1.0 && winSide.get(k) / 10 == 1.0) {
                                quadnotRuns += (winSide.get(i) / 10) * (winSide.get(j) / 10) * (winSide.get(k) / 10) * (winSide.get(l) / 10);
                            }
                        }
                    }
                }
            }
        }
        quadrupletot = tot;

        System.out.println("quadible total ss  : " + tot);
        return quadrupletot;
    }

    public double nonRunnersQuad() {
        return quadnotRuns;
    }

    public double passToQuintuple(ArrayList<Double> winSide) {
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        double tot = 0;
        double maxQuin = 800;
        for (int i = 0; i < winSide.size(); i++) {
            for (j = i + 1; j < winSide.size(); j++) {

                for (k = j + 1; k < winSide.size(); k++) {
                    for (l = k + 1; l < winSide.size(); l++) {
                        for (m = l + 1; m < winSide.size(); m++) {
                            System.out.println("  xx : " + winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10 * winSide.get(l) / 10 * winSide.get(m) / 10);
                            if (maxQuin < winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10 * winSide.get(l) / 10 * winSide.get(m) / 10) {
                                tot += maxQuin;
                                if (winSide.get(i) / 10 == 1.0 && winSide.get(j) / 10 == 1.0 && winSide.get(k) / 10 == 1.0) {
                                    quinnotRuns += (winSide.get(i) / 10) * (winSide.get(j) / 10) * (winSide.get(k) / 10) * (winSide.get(l) / 10) * (winSide.get(m) / 10);
                                }
                                System.out.println("max quad : " + tot);
                            } else {
                                tot += winSide.get(i) / 10 * winSide.get(j) / 10 * winSide.get(k) / 10 * winSide.get(l) / 10 * winSide.get(m) / 10;
                                if (winSide.get(i) / 10 == 1.0 && winSide.get(j) / 10 == 1.0 && winSide.get(k) / 10 == 1.0) {
                                    quinnotRuns += (winSide.get(i) / 10) * (winSide.get(j) / 10) * (winSide.get(k) / 10) * (winSide.get(l) / 10) * (winSide.get(m) / 10);
                                }
                            }
                        }
                    }
                }
            }
        }
        quintupletot = tot;

        System.out.println("quadible total ss  : " + tot);
        return quintupletot;
    }

    public double nonRunnersQuin() {
        return quinnotRuns;
    }

    public double passToBrackets(ArrayList<Double> braclkt) {
        double maxDouble = 0;
        double tot = 1.0;
        for (int i = 0; i < braclkt.size(); i++) {

            if (braclkt.size() == 2) {
                tot = tot * braclkt.get(i) / 10;
               
                if (braclkt.get(0) / 10 == 1.0 && braclkt.get(1) / 10 == 1.0) {
                    System.out.println("braclkt.get(i)  ......................................  2  :  " + braclkt.get(i) / 10);
                    bracketnotRuns2 = 1;
                }
            } else if (braclkt.size() == 3) {
                System.out.println("baracket breeeeeeeee : " + braclkt.get(0));
                System.out.println("baracket breeeeeeeee : " + braclkt.get(1));
                System.out.println("baracket breeeeeeeee : " + braclkt.get(2));
                tot = tot * braclkt.get(i) / 10;
                if (braclkt.get(0) / 10 == 1.0 && braclkt.get(1) / 10 == 1.0 && braclkt.get(2) / 10 == 1.0) {
                    bracketnotRuns3 = 1;
//                     System.out.println("braclkt.get(i)  ......................................  3  :  "+braclkt.get(i) / 10);

                }
                if (600 < tot) {
                    tot = 600.0;

                }
            }
            if (braclkt.size() == 4) {
                System.out.println("baracket : " + braclkt.get(1));
                System.out.println("baracket : " + braclkt.get(2));
                tot = tot * (braclkt.get(i) / 10);
                if (braclkt.get(0) / 10 == 1.0 && braclkt.get(1) / 10 == 1.0 && braclkt.get(2) / 10 == 1.0 && braclkt.get(3) / 10 == 1.0) {
                    System.out.println("braclkt.get(i)  ......................................  4  :  " + braclkt.get(i) / 10);
                    bracketnotRuns4 = 1;
                }
                System.out.println("braclkt.get(i) : " + braclkt.get(i) / 10);

                if (700 < tot) {
                    tot = 700.0;
                }
                System.out.println("tot double : " + tot);
            } else if (braclkt.size() == 5) {
                System.out.println("baracket : " + braclkt.get(1));
                System.out.println("baracket : " + braclkt.get(2));
                if (braclkt.get(0) / 10 == 1.0 && braclkt.get(1) / 10 == 1.0 && braclkt.get(2) / 10 == 1.0 && braclkt.get(3) / 10 == 1.0 && braclkt.get(4) / 10 == 1.0) {
                    System.out.println("braclkt.get(i)  ......................................  5  :  " + braclkt.get(i) / 10);
                    bracketnotRuns5 = 1;
                }
                tot = tot * (braclkt.get(i) / 10);
                if (800 < tot) {
                    tot = 800.0;
                }
            } else if (braclkt.size() > 5) {
                System.out.println("baracket : " + braclkt.get(1));
                System.out.println("baracket : " + braclkt.get(2));
                if (braclkt.get(i) / 10 == 1.0) {
                    System.out.println("braclkt.get(i)  ......................................  6  :  " + braclkt.get(i) / 10);
                    bracketnotRuns6 = 1;
                }
                tot = tot * (braclkt.get(i) / 10);
                if (800 < tot) {
                    tot = 800.0;
                }
            }

        }
        bracketnotRuns = bracketnotRuns2 + bracketnotRuns3 + bracketnotRuns4 + bracketnotRuns5 + bracketnotRuns6;
        bracketot = tot;
        return bracketot;
    }

    public double nonRunnersbrackets() {
        return bracketnotRuns;
    }

    public double passToLessCommision(double getlessCom) {
        double maxLess = 1000;
        if (maxLess < getlessCom) {
            lessCommison = maxLess;
        }
        return lessCommison;
    }

    public double getDouble() {
        return doubletot;
    }

    public List<Packet> completedPacket() throws ClassNotFoundException, SQLException {
        operations op = new operations();
        String date = op.getVal();
        List<Packet> centerList = new ArrayList<Packet>();
        List<Packet> listPacket = PacketController.serchAllItem(date);
        List<ChitRegistration> listChitRegistration;
        List<HorcesOfChit> listHorcesOfChit = null;
        List<Results> ListResults;
        int Center_ID;
        int chitRegistration_ID = 0;
        String horseOfChit_Pora;
        int counter = 0;
        int finishedPacket = 0;
        for (int i = 0; i < listPacket.size(); i++) {
            Center_ID = listPacket.get(i).getCenter_ID();
            listChitRegistration = ChitRegistrationController.searchAllChitRegistrationByIDNumber(Center_ID);
            for (int j = 0; j < listChitRegistration.size(); j++) {
                chitRegistration_ID = listChitRegistration.get(j).getChitRegistration_ID();
                listHorcesOfChit = HorcesOfChitController.searchAllHorcesOfChitByIDNumber(chitRegistration_ID);
                for (int k = 0; k < listHorcesOfChit.size(); k++) {
                    horseOfChit_Pora = listHorcesOfChit.get(k).getHorcesOfChit_Pora();
                    ListResults = ResultsController.serchAllItem();

                    for (int l = 0; l < ListResults.size(); l++) {
                        if (horseOfChit_Pora.equals(ListResults.get(l).getPora())) {
                            finishedPacket++;
                        } else {
                        }
                    }
                }
            }
            if (finishedPacket == listHorcesOfChit.size()) {
                Packet packet = new Packet(listPacket.get(i).getCenter_ID(), listPacket.get(i).getPacket_Date());
                centerList.add(packet);
                finishedPacket = 0;
            }
            finishedPacket = 0;
        }
        return centerList;
    }

    public List<Packet> getCompletedPacket() throws ClassNotFoundException, SQLException {
        operations op = new operations();
        String date = op.getVal();
        List<Packet> centerList = new ArrayList<Packet>();
        List<Packet> listPacket = PacketController.serchAllItem(date);
        List<ChitRegistration> listChitRegistration;
        List<HorcesOfChit> listHorcesOfChit = null;
        List<Results> ListResults;
        int Center_ID;
        int chitRegistration_ID = 0;
        String horseOfChit_Pora;
        int counter = 0;
        int finishedPacket = 0;
        for (int i = 0; i < listPacket.size(); i++) {
            Center_ID = listPacket.get(i).getCenter_ID();
            listChitRegistration = ChitRegistrationController.searchAllChitRegistrationByIDNumber(Center_ID);
            for (int j = 0; j < listChitRegistration.size(); j++) {
                chitRegistration_ID = listChitRegistration.get(j).getChitRegistration_ID();
                int nulValue = HorcesOfChitController.searchnullValue(chitRegistration_ID);

                if (nulValue == 1) {
                    System.out.println("nul values");
                    finishedPacket = 1;
                }
//                listHorcesOfChit = HorcesOfChitController.searchAllHorcesOfChitByIDNumber(chitRegistration_ID);
//                for (int k = 0; k < listHorcesOfChit.size(); k++) {
////                    horseOfChit_Pora = listHorcesOfChit.get(k).getHorcesOfChit_Pora();
//                    horseOfChit_ChitRegistrionId = listHorcesOfChit.get(k).getHorcesOfChit_Pora();
//                    ListResults = ResultsController.serchAllItem();
//
//                    for (int l = 0; l < ListResults.size(); l++) {
//                        if (horseOfChit_Pora.equals(ListResults.get(l).getPora())) {
//                            finishedPacket++;
//                        } else {
//                        }
//                    }
//                }
            }
            if (finishedPacket == 0) {
                Packet packet = new Packet(listPacket.get(i).getCenter_ID(), listPacket.get(i).getPacket_Date());
                centerList.add(packet);
                finishedPacket = 0;
            }
            System.out.println("ffffffffffffffff ; " + finishedPacket);
            finishedPacket = 0;
        }
        return centerList;

    }

    public List<Packet> getPendongPacket() throws ClassNotFoundException, SQLException {
        operations op = new operations();
        String date = op.getVal();
        List<Packet> centerList = new ArrayList<Packet>();
        List<Packet> listPacket = PacketController.serchAllItem(date);
        List<ChitRegistration> listChitRegistration;
        List<HorcesOfChit> listHorcesOfChit = null;
        List<Results> ListResults;
        int Center_ID;
        int chitRegistration_ID = 0;
        String horseOfChit_Pora;
        int counter = 0;
        int finishedPacket = 0;
        for (int i = 0; i < listPacket.size(); i++) {
            Center_ID = listPacket.get(i).getCenter_ID();
            listChitRegistration = ChitRegistrationController.searchAllChitRegistrationByIDNumber(Center_ID);
            for (int j = 0; j < listChitRegistration.size(); j++) {
                chitRegistration_ID = listChitRegistration.get(j).getChitRegistration_ID();
                int nulValue = HorcesOfChitController.searchnullValue(chitRegistration_ID);

                if (nulValue == 1) {
                    System.out.println("no nul values");
                    finishedPacket = 1;
                }
//                listHorcesOfChit = HorcesOfChitController.searchAllHorcesOfChitByIDNumber(chitRegistration_ID);
//                for (int k = 0; k < listHorcesOfChit.size(); k++) {
////                    horseOfChit_Pora = listHorcesOfChit.get(k).getHorcesOfChit_Pora();
//                    horseOfChit_ChitRegistrionId = listHorcesOfChit.get(k).getHorcesOfChit_Pora();
//                    ListResults = ResultsController.serchAllItem();
//
//                    for (int l = 0; l < ListResults.size(); l++) {
//                        if (horseOfChit_Pora.equals(ListResults.get(l).getPora())) {
//                            finishedPacket++;
//                        } else {
//                        }
//                    }
//                }
            }
            if (finishedPacket == 1) {
                Packet packet = new Packet(listPacket.get(i).getCenter_ID(), listPacket.get(i).getPacket_Date());
                centerList.add(packet);
                finishedPacket = 0;
            }
//            System.out.println("ffggggggggggggggggggg ; " + finishedPacket);
            finishedPacket = 0;
        }
        return centerList;

    }

    public List<Packet> PendingPacket() throws ClassNotFoundException, SQLException {
        operations op = new operations();
        String date = op.getVal();
        List<Packet> centerList = new ArrayList<Packet>();
        List<Packet> listPacket = PacketController.serchAllItem(date);
        List<ChitRegistration> listChitRegistration;
        List<HorcesOfChit> listHorcesOfChit = null;
        List<Results> ListResults;
        int Center_ID;
        int chitRegistration_ID = 0;
        String horseOfChit_Pora;
        int counter = 0;
        int finishedPacket = 0;
        for (int i = 0; i < listPacket.size(); i++) {
            Center_ID = listPacket.get(i).getCenter_ID();
            listChitRegistration = ChitRegistrationController.searchAllChitRegistrationByIDNumber(Center_ID);
            for (int j = 0; j < listChitRegistration.size(); j++) {
                chitRegistration_ID = listChitRegistration.get(j).getChitRegistration_ID();
                listHorcesOfChit = HorcesOfChitController.searchAllHorcesOfChitByIDNumber(chitRegistration_ID);
                for (int k = 0; k < listHorcesOfChit.size(); k++) {
                    horseOfChit_Pora = listHorcesOfChit.get(k).getHorcesOfChit_Pora();
                    ListResults = ResultsController.serchAllItem();

                    for (int l = 0; l < ListResults.size(); l++) {
                        if (horseOfChit_Pora.equals(ListResults.get(l).getPora())) {
                            System.out.println("dddddddddd : " + horseOfChit_Pora);
                            System.out.println("vvvvvvvvvvv : " + ListResults.get(l).getPora());
                            finishedPacket++;
                            System.out.println("eeeeeeeeeeeeee : " + finishedPacket);
                        } else {
                        }
                    }
                }
            }
            if (finishedPacket != listHorcesOfChit.size()) {
                Packet packet = new Packet(listPacket.get(i).getCenter_ID(), listPacket.get(i).getPacket_Date());
                centerList.add(packet);
                finishedPacket = 0;
            }
            finishedPacket = 0;
        }
        return centerList;
    }

    public List<Chit> getAllChit() throws ClassNotFoundException, SQLException {
        List<Chit> centerList = new ArrayList<Chit>();
        operations op = new operations();
        String date = op.getDate();
        String packet_ID = op.getNumber();
        ArrayList<Double> winSide = new ArrayList<Double>();
        ArrayList<Double> winplaceSide = new ArrayList<Double>();
        ArrayList<Double> secondplaceSide = new ArrayList<Double>();
        ArrayList<Double> singles = new ArrayList<Double>();
        ArrayList<Double> doubles = new ArrayList<Double>();
        ArrayList<Double> tribles = new ArrayList<Double>();
        ArrayList<Double> quadruples = new ArrayList<Double>();
        ArrayList<Double> quintuples = new ArrayList<Double>();
        ArrayList<Double> bracket = new ArrayList<Double>();
        ArrayList<Double> placebracket = new ArrayList<Double>();
        ArrayList<Double> doubleswinplace = new ArrayList<Double>();
        ArrayList<Double> doublesSecondplace = new ArrayList<Double>();
        ArrayList<Double> tribleswinplace = new ArrayList<Double>();
        ArrayList<Double> triblesSecondplace = new ArrayList<Double>();
        ArrayList<Double> quadrupleswinplace = new ArrayList<Double>();
        ArrayList<Double> quadruplesSecondplace = new ArrayList<Double>();
        ArrayList<Double> quintupleswinplace = new ArrayList<Double>();
        ArrayList<Double> quintuplesSecondplace = new ArrayList<Double>();
        Packet packet = PacketController.searchPacketIDandDateByIDNumber(date, packet_ID);
        List<ChitRegistration> listChitRegistration;
        List<HorcesOfChit> listHorcesOfChit;
        List<Results> ListResults;
        List<ResultDetails> ListResultDetails;
        List<SingleM> ListSingles;
        List<DoublesM> ListDoubles;
        List<TriblesM> ListTribles;
        List<QuadrupleM> ListQuadruples;
        List<QuintupleM> ListQuintuples;
        List<Bracket> ListBrackets;
        int Center_ID;
        Date dates;
        int chitRegistration_ID = 0;
        int result_ID;
        String nonRunners;
        String horseOfChit_Pora;
        String HorcesOfChit_Horsename;
        double winValue = 0;
        double winplaceValue = 0;
        double secondValue = 0;

        int counter = 0;
        int counterPlaceSide = 0;
        int finishedPacket = 0;

        Center_ID = packet.getCenter_ID();
        dates = packet.getPacket_Date();
        listChitRegistration = ChitRegistrationController.searchAllChitRegistrationByIDNumberAndDate(Center_ID, dates);
        for (int j = 0; j < listChitRegistration.size(); j++) {
            System.out.println("packet ekaka chits>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> : " + listChitRegistration.get(j).getChitRegistration_chitNumber());
            chitRegistration_ID = listChitRegistration.get(j).getChitRegistration_ID();
            listHorcesOfChit = HorcesOfChitController.searchAllHorcesOfChitByIDNumber(chitRegistration_ID);

            for (int k = 0; k < listHorcesOfChit.size(); k++) {
                HorcesOfChit_Horsename = listHorcesOfChit.get(k).getHorcesOfChit_HorseName();
//                System.out.println("chit ekaka inna horses : " + listHorcesOfChit.get(k).getHorcesOfChit_HorseName());
                horseOfChit_Pora = listHorcesOfChit.get(k).getHorcesOfChit_Pora();
                ListResults = ResultsController.serchAllItem();

                for (int l = 0; l < ListResults.size(); l++) {
                    if (horseOfChit_Pora.equals(ListResults.get(l).getPora())) {
                        result_ID = ListResults.get(l).getResult_ID();

//                        for(int z=0;z<nonRunners.length();z++){
//                        
//                        }
//                        for (String retval : nonRunners.split(",")) {
//                            System.out.println(retval);
//                        }
//                        System.out.println("equal pora : " + ListResults.get(l).getPora());
//                        System.out.println("equal pora : " + listHorcesOfChit.get(k).getHorcesOfChit_HorseName());
                        ListResultDetails = ResultDetailsController.serchAllItem();

                        for (int m = 0; m < ListResultDetails.size(); m++) {
                            if (result_ID == ListResultDetails.get(m).getResult_ID()) {
                                if (HorcesOfChit_Horsename.equals(ListResultDetails.get(m).getResultDetails_HorseName())) {
//                                    System.out.println("HorcesOfChit_Horsename : " + HorcesOfChit_Horsename);
//                                    System.out.println("ListResultDetails : " + ListResultDetails.get(m).getResultDetails_HorseName());
                                    if ("Win (1)".equals(ListResultDetails.get(m).getResultDetails_result()) | "Non Runner".equals(ListResultDetails.get(m).getResultDetails_result())) {
                                        winValue = Double.parseDouble(ListResultDetails.get(m).getResultDetails_Win());
                                        winplaceValue = Double.parseDouble(ListResultDetails.get(m).getResultDetails_Place());
                                        winSide.add(winValue);

                                        System.out.println("enne nathi value eka thamai meka : " + winplaceValue);
                                        // winplaceSide.add(winplaceValue);
                                        counter = 1;
                                    }
                                    if ("Win (1)".equals(ListResultDetails.get(m).getResultDetails_result()) | "Second (2)".equals(ListResultDetails.get(m).getResultDetails_result()) | "Third (3)".equals(ListResultDetails.get(m).getResultDetails_result()) | "Non Runner".equals(ListResultDetails.get(m).getResultDetails_result())) {

                                        secondValue = Double.parseDouble(ListResultDetails.get(m).getResultDetails_Place());
                                        secondplaceSide.add(secondValue);
                                        System.out.println("second place value : " + secondplaceSide.toString());
                                        counterPlaceSide = 1;
                                    }

                                }
                            }
                        }
                    } else {
                        finishedPacket = 1;
                    }
                }
                if (counter == 0) {
                    winSide.add(0.0);
                    // winplaceSide.add(0.0);

                } else {
                    counter = 0;
                }
                if (counterPlaceSide == 0) {
                    secondplaceSide.add(0.0);
                } else {
                    counterPlaceSide = 0;
                }

            }
            //  System.out.println("winplaceSide chamil pathirana : " + winplaceSide.toString());
            /*for doubles , get values from doubles table and then its pass to Math.Doubles for double formula.
             And then retun valus from it to pass for new summery
             */
            int startVal = 0;
            int endVal = 0;
            double amount;
            ListDoubles = DoublesController.searchAllDoublesByIDNumber(chitRegistration_ID);
            for (int n = 0; n < ListDoubles.size(); n++) {

                if ("W".equals(ListDoubles.get(n).getDoubles_Type())) {

                    startVal = Integer.parseInt(ListDoubles.get(n).getDoubles_To());
                    endVal = Integer.parseInt(ListDoubles.get(n).getDoubles_For());
                    amount = Double.parseDouble(ListDoubles.get(n).getDoubles_Amount());
                    for (int t = (startVal - 1); t < endVal; t++) {
                        doubles.add(winSide.get(t));
                        //  doubleswinplace.add(winplaceSide.get(t));
//                    System.out.println("list double athule : " + n);
                    }
                    System.out.println("list double athule  sssssssssssssssssssfffffffffffffffffffffffff: " + startVal + " " + endVal);
                    System.out.println(" doublewin   : " + doubles.toString());
                    //  System.out.println(" doublewin place  : " + doubleswinplace.toString());
                    double doub = this.passToDouble(doubles);

                    totWinDouble += doub * amount;
                    double getNunRunners = this.nonRunners() * amount;
                    // if (getNunRunners > 100) {
                    doubleNonRunners = getNunRunners;
                    //}
//                   

                    System.out.println("nun Runnerssssssssssssssssssssssss double get non runners : " + this.nonRunners());
                    System.out.println("nun Runnerssssssssssssssssssssssss double get non runners amount : " + amount);
//                     System.out.println(" doublewin   : " + totWinDouble);
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
                    doubles.clear();
                    //  doubleswinplace.clear();
//                System.out.println("gobles :" + totDouble);

                }
                if ("P".equals(ListDoubles.get(n).getDoubles_Type())) {
                    startVal = Integer.parseInt(ListDoubles.get(n).getDoubles_To());
                    endVal = Integer.parseInt(ListDoubles.get(n).getDoubles_For());
                    amount = Double.parseDouble(ListDoubles.get(n).getDoubles_Amount());
                    for (int t = (startVal - 1); t < endVal; t++) {

                        //  doubleswinplace.add(winplaceSide.get(t));
                        doublesSecondplace.add(secondplaceSide.get(t));
//                    System.out.println("list double athule : " + n);
                    }
                    System.out.println("list double athule : " + startVal + " " + endVal);
                    System.out.println(" doublepla   : " + doubles.toString());
                    System.out.println(" double place  : " + doubleswinplace.toString());
                    double doub = this.passToDouble(doubleswinplace);
                    double doubplace = this.passToDouble(doublesSecondplace);
                    totPlaceDouble += (doub * amount);
                    totSecondPlaceDouble += (doubplace * amount);
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
                    // doubles.clear();
                    doubleswinplace.clear();
                    doublesSecondplace.clear();
                }
                totDouble = (totWinDouble + totPlaceDouble + totSecondPlaceDouble);
//                Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                ChitController.addChit(cht);

            }
            int horseId;
            ListSingles = SinglesController.searchAllSinglesByIDNumber(chitRegistration_ID);
            listHorcesOfChit = HorcesOfChitController.searchAllHorcesOfChitByIDNumber(chitRegistration_ID);
            System.out.println("winside eke ashwayo odd tika : " + winSide.toString());
            for (int n = 0; n < ListSingles.size(); n++) {

                if ("W".equals(ListSingles.get(n).getSingles_Type())) {

                    startVal = Integer.parseInt(ListSingles.get(n).getSingles_To());
                    amount = Double.parseDouble(ListSingles.get(n).getSingles_Amount());

                    for (int h = 0; h < listHorcesOfChit.size(); h++) {
                        horseId = Integer.parseInt(ListSingles.get(n).getSingles_To());
                        if (listHorcesOfChit.get(h).getHorcesOfChit_ItemID() == horseId) {
                            winSingles += amount * winSide.get(h) / 10;

                            if (winSide.get(h) / 10 == 1.0) {
                                double getNunRunners = amount * winSide.get(h) / 10;
                                // if (getNunRunners > 100) {
                                singleNonRunners += getNunRunners;
                                // }
                                System.out.println("nun Runnerssssssssssssssssssssssss single bn : " + winSide.get(h) / 10);
                            }

                        }
                    }

//                    for (int t = (startVal - 1); t < endVal; t++) {
//                    }
                    System.out.println("list single athule one ciunetr vale : " + n);
                    System.out.println("list single athule : " + winSingles);
//                    System.out.println(" singlewin   : " + doubles.toString());

                }
                if ("P".equals(ListSingles.get(n).getSingles_Type())) {
                    startVal = Integer.parseInt(ListSingles.get(n).getSingles_To());
                    amount = Double.parseDouble(ListSingles.get(n).getSingles_Amount());
                    //  placeSingles += amount * winplaceSide.get(n) / 10;

                    for (int h = 0; h < listHorcesOfChit.size(); h++) {
                        horseId = Integer.parseInt(ListSingles.get(n).getSingles_To());
                        if (listHorcesOfChit.get(h).getHorcesOfChit_ItemID() == horseId) {
                            secondplaceSingles += amount * secondplaceSide.get(h) / 10;
                        }
                    }
//                    System.out.println("list single athule : " + placeSingles);
//                    secondplaceSingles += amount * secondplaceSide.get(n) / 10;
//                   
////                    System.out.println(" singlewin place  : " + doubleswinplace.toString());
                }
                System.out.println(" second plac side :  " + secondplaceSide.toString());
            }
            System.out.println("eliye win singles : " + winSingles);
            System.out.println("eliye place singles : " + placeSingles);
            totSingles = winSingles + placeSingles + secondplaceSingles;
            System.out.println("tot singles : " + totSingles);
            int startribleVal = 0;
//            int endVal = 0;
//            double amount;
            ListTribles = TriblesController.searchAllTriblesByIDNumber(chitRegistration_ID);
            for (int n = 0; n < ListTribles.size(); n++) {
                System.out.println("trrrrrrrrrrrrrrrr : " + ListTribles.get(n).getTribles_Type());
                if ("W".equals(ListTribles.get(n).getTribles_Type())) {

                    startribleVal = Integer.parseInt(ListTribles.get(n).getTribles_To().toString());
                    endVal = Integer.parseInt(ListTribles.get(n).getTribles_For());
                    amount = Double.parseDouble(ListTribles.get(n).getTribles_Amount());
                    for (int t = (startribleVal - 1); t < endVal; t++) {
                        tribles.add(winSide.get(t));
                        //  doubleswinplace.add(winplaceSide.get(t));
//                    System.out.println("list double athule : " + n);
                    }
                    System.out.println("list trible athule : " + startribleVal + " " + endVal);
                    System.out.println(" tribleewin   : " + tribles.toString());
                    //  System.out.println(" doublewin place  : " + doubleswinplace.toString());
                    double trib = this.passToTribles(tribles);
                    totWinTrible += trib * amount;
                    double getNunRunners = this.nonRunnersTribles() * amount;
                    // if (getNunRunners > 100) {
                    tribleNonRunners = getNunRunners;
                    //  }
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
                    tribles.clear();
                    //  doubleswinplace.clear();
//                System.out.println("gobles :" + totDouble);

                }
                if ("P".equals(ListTribles.get(n).getTribles_Type())) {
                    startribleVal = Integer.parseInt(ListTribles.get(n).getTribles_To());
                    endVal = Integer.parseInt(ListTribles.get(n).getTribles_For());
                    amount = Double.parseDouble(ListTribles.get(n).getTribles_Amount());
                    for (int t = (startribleVal - 1); t < endVal; t++) {

                        //  tribleswinplace.add(winplaceSide.get(t));
                        triblesSecondplace.add(secondplaceSide.get(t));
//                    System.out.println("list double athule : " + n);
                    }
                    System.out.println("list double athule : " + startribleVal + " " + endVal);
                    //System.out.println(" doublewin   : " + doubles.toString());
                    System.out.println(" doublewin place  : " + tribleswinplace.toString());
                    double trib = this.passToTribles(tribleswinplace);
                    double tribSecondplace = this.passToTribles(triblesSecondplace);
                    totPlaceTrible += trib * amount;
                    totSecondPlaceTrible += tribSecondplace * amount;
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
                    // doubles.clear();
                    tribleswinplace.clear();
                    triblesSecondplace.clear();
                }
                totTrible = (totWinTrible + totPlaceTrible + totSecondPlaceTrible);
//                Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totTrible);
//                ChitController.addChit(cht);

            }

            ListQuadruples = QuadrupleController.searchAllQuadruplesByIDNumber(chitRegistration_ID);
            for (int n = 0; n < ListQuadruples.size(); n++) {
                System.out.println("trrrrrrrrrrrrrrrr : " + ListQuadruples.get(n).getQuadruple_Type());
                if ("W".equals(ListQuadruples.get(n).getQuadruple_Type())) {

                    startVal = Integer.parseInt(ListQuadruples.get(n).getQuadruple_To().toString());
                    endVal = Integer.parseInt(ListQuadruples.get(n).getQuadruple_For());
                    amount = Double.parseDouble(ListQuadruples.get(n).getQuadruple_Amount());
                    for (int t = (startVal - 1); t < endVal; t++) {
                        quadruples.add(winSide.get(t));
                        //  doubleswinplace.add(winplaceSide.get(t));
//                    System.out.println("list double athule : " + n);
                    }
                    System.out.println("list trible athule : " + startVal + " " + endVal);
                    System.out.println(" tribleewin   : " + quadruples.toString());
                    //  System.out.println(" doublewin place  : " + doubleswinplace.toString());
                    double quad = this.passToQuadruple(quadruples);
                    totWinQuadruplese += quad * amount;
                    double getNunRunners = this.nonRunnersQuad() * amount;
                    // if (getNunRunners > 100) {
                    quadNonRunners = getNunRunners;
                    // }
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
                    quadruples.clear();
                    //  doubleswinplace.clear();
//                System.out.println("gobles :" + totDouble);

                }
                if ("P".equals(ListQuadruples.get(n).getQuadruple_Type())) {
                    startVal = Integer.parseInt(ListQuadruples.get(n).getQuadruple_To());
                    endVal = Integer.parseInt(ListQuadruples.get(n).getQuadruple_For());
                    amount = Double.parseDouble(ListQuadruples.get(n).getQuadruple_Amount());
                    for (int t = (startVal - 1); t < endVal; t++) {

                        //  quadrupleswinplace.add(winplaceSide.get(t));
                        quadruplesSecondplace.add(secondplaceSide.get(t));
//                    System.out.println("list double athule : " + n);
                    }
                    System.out.println("list double athule : " + startVal + " " + endVal);
                    //System.out.println(" doublewin   : " + doubles.toString());
                    System.out.println(" doublewin place  : " + quadrupleswinplace.toString());
                    double quad = this.passToQuadruple(quadrupleswinplace);
                    totPlacequadruple += quad * amount;
                    double quadsecondPlace = this.passToQuadruple(quadruplesSecondplace);
                    totSecondPlacequadruple += quadsecondPlace * amount;
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
                    // doubles.clear();
                    quadrupleswinplace.clear();
                    quadruplesSecondplace.clear();
                }
                totQuadruple = (totWinQuadruplese + totPlacequadruple + totSecondPlacequadruple);
//                Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totQuadruple);
//                ChitController.addChit(cht);

            }

            ListQuintuples = QuintupleController.searchAllQuintuplesByIDNumber(chitRegistration_ID);
            for (int n = 0; n < ListQuintuples.size(); n++) {
                System.out.println("trrrrrrrrrrrrrrrr : " + ListQuintuples.get(n).getQuintuple_Type());
                if ("W".equals(ListQuintuples.get(n).getQuintuple_Type())) {

                    startVal = Integer.parseInt(ListQuintuples.get(n).getQuintuple_To().toString());
                    endVal = Integer.parseInt(ListQuintuples.get(n).getQuintuple_For());
                    amount = Double.parseDouble(ListQuintuples.get(n).getQuintuple_Amount());
                    for (int t = (startVal - 1); t < endVal; t++) {
                        quintuples.add(winSide.get(t));
                        //  doubleswinplace.add(winplaceSide.get(t));
//                    System.out.println("list double athule : " + n);
                    }
                    System.out.println("list quin athule : " + startVal + " " + endVal);
                    System.out.println(" quinleewin   : " + quintuples.toString());
                    //  System.out.println(" doublewin place  : " + doubleswinplace.toString());
                    double quin = this.passToQuintuple(quintuples);
                    totWinQuintuples += quin * amount;
                    double getNunRunners = this.nonRunnersQuin() * amount;
                    // if (getNunRunners > 100) {
                    quinNonRunners = getNunRunners;
                    //}
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
                    quintuples.clear();
                    //  doubleswinplace.clear();
//                System.out.println("gobles :" + totDouble);

                }
                if ("P".equals(ListQuintuples.get(n).getQuintuple_Type())) {
                    startVal = Integer.parseInt(ListQuintuples.get(n).getQuintuple_To());
                    endVal = Integer.parseInt(ListQuintuples.get(n).getQuintuple_For());
                    amount = Double.parseDouble(ListQuintuples.get(n).getQuintuple_Amount());
                    for (int t = (startVal - 1); t < endVal; t++) {

                        //  quintupleswinplace.add(winplaceSide.get(t));
                        quintuplesSecondplace.add(secondplaceSide.get(t));
//                    System.out.println("list double athule : " + n);
                    }
                    System.out.println("list double athule : " + startVal + " " + endVal);
                    //System.out.println(" doublewin   : " + doubles.toString());
                    System.out.println(" doublewin place  : " + quintupleswinplace.toString());
                    double quin = this.passToQuintuple(quintupleswinplace);
                    totPlacequintuple += quin * amount;
                    double quinSeconPlace = this.passToQuintuple(quintupleswinplace);
                    totSecondPlacequintuple += quinSeconPlace * amount;
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
                    // doubles.clear();
                    quintupleswinplace.clear();
                    quintuplesSecondplace.clear();
                }
                totQuintuple = (totWinQuintuples + totPlacequintuple + totSecondPlacequintuple);
//                Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totQuintuple);
//                ChitController.addChit(cht);

            }

            int zeroValue = 0;
            int zeroPlaceValue = 0;
            ListBrackets = BracketController.searchAllBracketsByIDNumber(chitRegistration_ID);
            for (int p = 0; p < ListBrackets.size(); p++) {
                if ("Win".equals(ListBrackets.get(p).getBracket_Type())) {

                    startVal = Integer.parseInt(ListBrackets.get(p).getBracket_To().toString());
                    endVal = Integer.parseInt(ListBrackets.get(p).getBracket_For());
                    amount = Double.parseDouble(ListBrackets.get(p).getBracket_Amount());

                    for (int t = (startVal - 1); t < endVal; t++) {
                        System.out.println("111111111111111 : " + (startVal - 1));
                        System.out.println("222222222222222 : " + endVal);
                        System.out.println("00000000000000 : " + winSide);
                        System.out.println("omegaaaaaaaaaaaa : " + winSide.get(t));
                        if (winSide.get(t) == 0.0) {
                            zeroValue = 1;
                            System.out.println("omega omeaga");
                        } else {
                            bracket.add(winSide.get(t));
                        }
                    }
                    if (zeroValue == 0) {
                        System.out.println("bracket .to string  : " + bracket.toString());
                        double brckt = this.passToBrackets(bracket);
                        bracketWinTotal += brckt * amount;
                        double getNunRunners = this.nonRunnersbrackets() * amount;
                        //    if (getNunRunners > 100) {
                        bracketNonRunners = getNunRunners;
                        //     }
//                        System.out.println("bracket total " + bracketWinTotal);
                    }
                    zeroValue = 0;
                    zeroPlaceValue = 0;
                    bracket.clear();
//                    System.out.println(" bracketewin   : " + bracket.toString());
//                    Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totDouble);
//                    ChitController.addChit(cht);
//                    bracket.clear();
                }
                if ("Place".equals(ListBrackets.get(p).getBracket_Type())) {
                    startVal = Integer.parseInt(ListBrackets.get(p).getBracket_To());
                    endVal = Integer.parseInt(ListBrackets.get(p).getBracket_For());
                    amount = Double.parseDouble(ListBrackets.get(p).getBracket_Amount());
                    for (int t = (startVal - 1); t < endVal; t++) {
//                        if (winplaceSide.get(t) == 0.0) {
//                            zeroValue = 1;
//                            System.out.println("bracket place eka meka eka : " + winplaceSide.get(t));
//
//                        } else {
//                            bracket.add(winplaceSide.get(t));
//                        }
                        if (secondplaceSide.get(t) == 0.0) {
                            zeroPlaceValue = 1;

                        } else {

                            placebracket.add(secondplaceSide.get(t));
                            System.out.println("dan print venava athi eka  : " + placebracket.toString());
                            System.out.println("methnatath giya bn : " + zeroPlaceValue);
                        }
                    }
//                    if (zeroValue == 0) {
//
//                        double brckt = this.passToBrackets(bracket);
//                        bracketPlaceTotal += brckt * amount;
//
//                    }
                    if (zeroPlaceValue == 0) {
                        System.out.println("bracket place eka meka deka : " + bracket.toString());
                        double brcktplace = this.passToBrackets(placebracket);
                        bracketPlacePlaceTotal += brcktplace * amount;
                        System.out.println("bracket place eka meka thuna " + bracketPlaceTotal);
                    }
                    zeroValue = 0;
                    zeroPlaceValue = 0;
                    bracket.clear();
                    placebracket.clear();
                }
                totBrackets = (bracketWinTotal + bracketPlaceTotal + bracketPlacePlaceTotal);
                System.out.println("bracketWinTotal : " + bracketWinTotal);
                System.out.println("bracketPlaceTotal : " + bracketPlaceTotal);
                System.out.println("bracketPlacePlaceTotal : " + bracketPlacePlaceTotal);
//                Bracket br = new Bracket(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), totBrackets);
//                ChitController.addChit(br);

            }
            System.out.println("single non runnera : " + singleNonRunners);
            total = (totSingles + totDouble + totTrible + totQuadruple + totBrackets);

            totalNotRuns = singleNonRunners + doubleNonRunners + tribleNonRunners + quadNonRunners + quinNonRunners + bracketNonRunners;
            System.out.println("singleNonRunners non runners chamil pathirana : " + singleNonRunners);
            System.out.println("doubleNonRunners non runners chamil pathirana : " + doubleNonRunners);
            System.out.println("tribleNonRunners non runners chamil pathirana : " + tribleNonRunners);
            System.out.println("quadNonRunners non runners chamil pathirana : " + quadNonRunners);
            System.out.println("quinNonRunners non runners chamil pathirana : " + quinNonRunners);
            System.out.println("bracketNonRunners non runners chamil pathirana : " + bracketNonRunners);
            if (totalNotRuns > 100) {
                finalTotalNonRunners = totalNotRuns;

            }
            if (total != 0) {

                System.out.println("doubles : " + totDouble);
                System.out.println("totBrackets : " + totBrackets);
                if (total < 100) {
                    afterDeductComissionTotal = total;
                } else {
                    afterDeductComissionTotal = (total * 95) / 100;
                }

                Chit cht = new Chit(null, listChitRegistration.get(j).getChitRegistration_ID(), listChitRegistration.get(j).getChitRegistration_chitNumber(), listChitRegistration.get(j).getChitRegistration_CurrentInvestment(), afterDeductComissionTotal, finalTotalNonRunners);
                centerList.add(cht);
            }

            total = 0.0;
            totDouble = 0.0;
            totWinDouble = 0.0;
            totPlaceDouble = 0.0;
            totSecondPlaceDouble = 0.0;
            totTrible = 0.0;
            totWinTrible = 0.0;
            totPlaceTrible = 0.0;
            totSecondPlaceTrible = 0.0;
            totQuadruple = 0.0;
            totWinQuadruplese = 0.0;
            totPlacequadruple = 0.0;
            totSecondPlacequadruple = 0.0;
            totQuintuple = 0.0;
            totWinQuintuples = 0.0;
            totPlacequintuple = 0.0;
            totSecondPlacequintuple = 0.0;
            totBrackets = 0.0;
            bracketWinTotal = 0.0;
            bracketPlaceTotal = 0.0;
            bracketPlacePlaceTotal = 0.0;
            totSingles = 0.0;
            winSingles = 0.0;
            placeSingles = 0.0;
            secondplaceSingles = 0.0;
            afterDeductComissionTotal = 0.0;
            totalNotRuns = 0.0;
            doubleNonRunners = 0.0;
            bracketNonRunners = 0.0;
            quinNonRunners = 0.0;
            quadNonRunners = 0.0;
            tribleNonRunners = 0.0;
            finalTotalNonRunners = 0;
            doublenotRuns = 0;
            triblenotRuns = 0;
            singleNonRunners = 0;
            winSide.clear();
            secondplaceSide.clear();
//            winplaceSide.clear();

        }
        return centerList;
    }
}
