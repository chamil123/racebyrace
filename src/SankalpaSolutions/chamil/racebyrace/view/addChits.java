/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.view;

import SankalpaSolutions.chamil.racebyrace.Maths.Calculations;
import SankalpaSolutions.chamil.racebyrace.Maths.Doubles;
import SankalpaSolutions.chamil.racebyrace.Maths.Quadruple;
import SankalpaSolutions.chamil.racebyrace.Maths.Quintuple;
import SankalpaSolutions.chamil.racebyrace.Maths.Tribles;
import SankalpaSolutions.chamil.racebyrace.Maths.operations;
import SankalpaSolutions.chamil.racebyrace.controller.AccountController;
import SankalpaSolutions.chamil.racebyrace.controller.BracketController;
import SankalpaSolutions.chamil.racebyrace.controller.CenterController;
import SankalpaSolutions.chamil.racebyrace.controller.ChitRegistrationController;
import SankalpaSolutions.chamil.racebyrace.controller.DoublesController;
import SankalpaSolutions.chamil.racebyrace.controller.HorcesOfChitController;
import SankalpaSolutions.chamil.racebyrace.controller.HorseController;
import SankalpaSolutions.chamil.racebyrace.controller.PacketController;
import SankalpaSolutions.chamil.racebyrace.controller.PoraController;
import SankalpaSolutions.chamil.racebyrace.controller.QuadrupleController;
import SankalpaSolutions.chamil.racebyrace.controller.QuintupleController;
import SankalpaSolutions.chamil.racebyrace.controller.RaceCardController;
import SankalpaSolutions.chamil.racebyrace.controller.ResultDetailsController;
import SankalpaSolutions.chamil.racebyrace.controller.ResultsController;
import SankalpaSolutions.chamil.racebyrace.controller.SinglesController;
import SankalpaSolutions.chamil.racebyrace.controller.TriblesController;
import SankalpaSolutions.chamil.racebyrace.model.Account;
import SankalpaSolutions.chamil.racebyrace.model.Bracket;
import SankalpaSolutions.chamil.racebyrace.model.Center;
import SankalpaSolutions.chamil.racebyrace.model.ChitRegistration;
import SankalpaSolutions.chamil.racebyrace.model.DoublesM;
import SankalpaSolutions.chamil.racebyrace.model.HorcesOfChit;
import SankalpaSolutions.chamil.racebyrace.model.Horse;
import SankalpaSolutions.chamil.racebyrace.model.Packet;
import SankalpaSolutions.chamil.racebyrace.model.QuadrupleM;
import SankalpaSolutions.chamil.racebyrace.model.QuintupleM;
import SankalpaSolutions.chamil.racebyrace.model.RaceCard;
import SankalpaSolutions.chamil.racebyrace.model.ResultDetails;
import SankalpaSolutions.chamil.racebyrace.model.Results;
import SankalpaSolutions.chamil.racebyrace.model.SingleM;
import SankalpaSolutions.chamil.racebyrace.model.TriblesM;

//import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author Win 8
 */
public class addChits extends javax.swing.JDialog {

    operations op = new operations();
    Vector OverLap = new Vector();
    String COLORS[] = {"BLUE", "BLACK", "GREEN", "ORANGE", "RED", "GRAY", "YELLOW"};
    int SetColour;
    int item = 1;
    private int i;
    private double totsingles = 0;
    double one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0, twelve = 0, thirteen = 0, fourteen = 0, fifteen = 0, sixteen = 0, seventeen = 0, eighteen = 0, nineteen = 0, twenty = 0;
    private int tribleitem = 1;
    private double totdouble;
    private double tottrible;
    private double totq;
    private double totqq;
    private double Investment;
    private double brackets;
    private double doubles;
    private int ArrorDevedeIncrement = 1;
    private int Quadrupleitem = 1;
    private int Quintupleitem = 1;
    private int itembracket = 1;
    private int doubleitem = 1;
    private int singleitem = 1;
    private double tribleMin = 0;
    private double getTotDouble;
    private int end;
    private String strinDouble = "";
    private String strinTrible = "";
    private String stringQuadruple = "";
    private String stringQuintuple = "";
    private double maxLesCommision = 0.0;
    private String center_id;
    private String poraVal;

    /**
     * Creates new form addChits
     */
    public addChits(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
//        AWTUtilities.setWindowOpaque(this, false);
//        AWTUtilities.setWindowOpacity(this, 0.97f);

        initComponents();
//        jLabel17.setText("<html>Enter search Criteria &Press enter to search.<br>Select the apropriate search" + "options and type the search text bellow.<br>And the press enter key." + " System will automaticly list the maching items for you.</html>");
        setLocationRelativeTo(null);
        onstart();

        jTextFieldcenterNum.grabFocus();
        jScrollPane6.setVisible(false);
        jScrollPane8.setBorder(null);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);

        jTable10.setVisible(false);
        jScrollPane9.setVisible(false);
    }

    public void onstart() {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            //get current date time with Date()
            Date date = new Date();
            jTextField11.setText(dateFormat.format(date));

//            DefaultComboBoxModel cmbAccount = (DefaultComboBoxModel) Accountcmb1.getModel();
//            List<Account> list = AccountController.serchAllItem();
//
//            for (int i = 0; i < list.size(); i++) {
//                cmbAccount.addElement(list.get(i).getAccount_Name());
//
//            }
//            ResultSet rsAccount = Db.search("SELECT a_name from account");
//            while (rsAccount.next()) {
//                cmbAccount.addElement(rsAccount.getString("a_name"));
//            }
        } catch (Exception ex) {

            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setworn1() {

        bracketPanel.setVisible(true);
        bracketPanel.setLocation(411, 780);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 30; i++) {
                        bracketPanel.setLocation((int) bracketPanel.getLocation().getX(), (int) bracketPanel.getLocation().getY() - i);
                        Thread.sleep(12);
                    }
                    for (int i = 0; i < 6; i++) {
                        bracketPanel.setLocation((int) bracketPanel.getLocation().getX(), (int) bracketPanel.getLocation().getY() + i);
                        Thread.sleep(15);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }

    private void setworn2() {
        bracketPanel.setVisible(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = -6; i < 30; i++) {
                        bracketPanel.setLocation((int) bracketPanel.getLocation().getX(), (int) bracketPanel.getLocation().getY() + i);
                        Thread.sleep(12);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        bracketPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldcenterNum = new javax.swing.JTextField();
        jTextFieldchitNum = new javax.swing.JTextField();
        jTextFieldHorseName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addHorse = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        canvas = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField93 = new javax.swing.JTextField();
        jTextField94 = new javax.swing.JTextField();
        jTextField95 = new javax.swing.JTextField();
        jTextField96 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jTextField85 = new javax.swing.JTextField();
        jTextField86 = new javax.swing.JTextField();
        jTextField97 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jTextField99 = new javax.swing.JTextField();
        jTextField100 = new javax.swing.JTextField();
        jTextField101 = new javax.swing.JTextField();
        jTextField102 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField104 = new javax.swing.JTextField();
        jTextField105 = new javax.swing.JTextField();
        jTextField106 = new javax.swing.JTextField();
        jTextField107 = new javax.swing.JTextField();
        jTextField108 = new javax.swing.JTextField();
        jTextField109 = new javax.swing.JTextField();
        jTextField110 = new javax.swing.JTextField();
        jTextField111 = new javax.swing.JTextField();
        jTextField112 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField113 = new javax.swing.JTextField();
        jTextField117 = new javax.swing.JTextField();
        jTextField118 = new javax.swing.JTextField();
        jTextField119 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField114 = new javax.swing.JTextField();
        jTextField115 = new javax.swing.JTextField();
        jTextField116 = new javax.swing.JTextField();
        jTextField120 = new javax.swing.JTextField();
        jTextField121 = new javax.swing.JTextField();
        jTextField122 = new javax.swing.JTextField();
        jTextField123 = new javax.swing.JTextField();
        jTextField124 = new javax.swing.JTextField();
        jTextField125 = new javax.swing.JTextField();
        jTextField126 = new javax.swing.JTextField();
        jTextField127 = new javax.swing.JTextField();
        jTextField128 = new javax.swing.JTextField();
        jTextField129 = new javax.swing.JTextField();
        jTextField130 = new javax.swing.JTextField();
        jTextField131 = new javax.swing.JTextField();
        jTextField132 = new javax.swing.JTextField();
        jTextField133 = new javax.swing.JTextField();
        jTextField134 = new javax.swing.JTextField();
        jTextField135 = new javax.swing.JTextField();
        jTextField136 = new javax.swing.JTextField();
        jTextField137 = new javax.swing.JTextField();
        jTextField138 = new javax.swing.JTextField();
        jTextField139 = new javax.swing.JTextField();
        jTextField140 = new javax.swing.JTextField();
        jTextField141 = new javax.swing.JTextField();
        jTextField142 = new javax.swing.JTextField();
        jTextField143 = new javax.swing.JTextField();
        jTextField144 = new javax.swing.JTextField();
        jTextField145 = new javax.swing.JTextField();
        jTextField146 = new javax.swing.JTextField();
        jTextField147 = new javax.swing.JTextField();
        jTextField148 = new javax.swing.JTextField();
        jTextField149 = new javax.swing.JTextField();
        jTextField150 = new javax.swing.JTextField();
        jTextField151 = new javax.swing.JTextField();
        jTextField152 = new javax.swing.JTextField();
        jTextField153 = new javax.swing.JTextField();
        jTextField154 = new javax.swing.JTextField();
        jTextField155 = new javax.swing.JTextField();
        jTextField156 = new javax.swing.JTextField();
        jTextField157 = new javax.swing.JTextField();
        jTextField158 = new javax.swing.JTextField();
        jTextField159 = new javax.swing.JTextField();
        jTextField160 = new javax.swing.JTextField();
        jTextField161 = new javax.swing.JTextField();
        jTextField162 = new javax.swing.JTextField();
        jTextField163 = new javax.swing.JTextField();
        jTextField164 = new javax.swing.JTextField();
        jTextField165 = new javax.swing.JTextField();
        jTextField166 = new javax.swing.JTextField();
        jTextField167 = new javax.swing.JTextField();
        jTextField168 = new javax.swing.JTextField();
        jTextField169 = new javax.swing.JTextField();
        jTextField170 = new javax.swing.JTextField();
        jTextField171 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextFieldchitNum1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField88 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField89 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField172 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1375, 730));

        jPanel2.setLayout(null);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel39);
        jLabel39.setBounds(860, 0, 180, 58);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 204, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel44);
        jLabel44.setBounds(1160, 10, 180, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Investment");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1070, 10, 100, 40);

        jTable10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setRowHeight(18);
        jTable10.getTableHeader().setReorderingAllowed(false);
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable10MousePressed(evt);
            }
        });
        jTable10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable10KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable10KeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(jTable10);

        jPanel2.add(jScrollPane9);
        jScrollPane9.setBounds(130, 140, 230, 110);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setGridColor(new java.awt.Color(204, 204, 204));
        jTable9.setRowHeight(19);
        jTable9.getTableHeader().setReorderingAllowed(false);
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable9MousePressed(evt);
            }
        });
        jTable9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable9KeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setMinWidth(130);
            jTable9.getColumnModel().getColumn(0).setMaxWidth(130);
        }

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(130, 270, 230, 290);

        jTextField14.setBackground(new java.awt.Color(255, 204, 102));
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField14);
        jTextField14.setBounds(130, 320, 90, 20);

        jTextField15.setBackground(new java.awt.Color(255, 204, 102));
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField15);
        jTextField15.setBounds(130, 290, 90, 20);

        bracketPanel.setMinimumSize(new java.awt.Dimension(380, 200));
        bracketPanel.setPreferredSize(new java.awt.Dimension(369, 200));

        jPanel3.setLayout(null);

        jTable6.setBackground(new java.awt.Color(255, 255, 204));
        jTable6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Start", "End", "Amount", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setGridColor(new java.awt.Color(204, 204, 204));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(40);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable6.getColumnModel().getColumn(1).setMinWidth(50);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable6.getColumnModel().getColumn(1).setMaxWidth(50);
            jTable6.getColumnModel().getColumn(2).setMinWidth(50);
            jTable6.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable6.getColumnModel().getColumn(2).setMaxWidth(50);
            jTable6.getColumnModel().getColumn(4).setMinWidth(80);
            jTable6.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable6.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jPanel3.add(jScrollPane7);
        jScrollPane7.setBounds(10, 100, 350, 160);

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("End  :");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 25, -1, 20));

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel10.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 25, 40, -1));

        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel10.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 24, 40, -1));

        jLabel26.setText("start  :");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 24, 34, 20));

        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel10.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 25, 51, -1));

        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });
        jPanel10.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 55, 51, -1));

        jLabel27.setText("Amount  :");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 50, 20));

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });
        jPanel10.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 53, -1, -1));

        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Win    :");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 61, -1));

        jCheckBox7.setText("Place  :");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 53, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SankalpaSolutions/chamil/racebyrace/images/graphics-flashing-light-309183.gif"))); // NOI18N
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 20, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SankalpaSolutions/chamil/racebyrace/images/graphics-flashing-light-227773.gif"))); // NOI18N
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 40));

        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Win ( F1 ),   Place ( F2 ),   Both (F3)");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 190, -1));

        jPanel3.add(jPanel10);
        jPanel10.setBounds(10, 10, 350, 80);
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 0, 370, 270);

        javax.swing.GroupLayout bracketPanelLayout = new javax.swing.GroupLayout(bracketPanel);
        bracketPanel.setLayout(bracketPanelLayout);
        bracketPanelLayout.setHorizontalGroup(
            bracketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bracketPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        bracketPanelLayout.setVerticalGroup(
            bracketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        jPanel2.add(bracketPanel);
        bracketPanel.setBounds(420, 730, 371, 268);

        jTextFieldcenterNum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldcenterNum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldcenterNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldcenterNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldcenterNumFocusLost(evt);
            }
        });
        jTextFieldcenterNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcenterNumActionPerformed(evt);
            }
        });
        jTextFieldcenterNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldcenterNumKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldcenterNumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldcenterNumKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldcenterNum);
        jTextFieldcenterNum.setBounds(130, 120, 230, 21);

        jTextFieldchitNum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldchitNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldchitNumActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldchitNum);
        jTextFieldchitNum.setBounds(130, 190, 90, 20);

        jTextFieldHorseName.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldHorseName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldHorseName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldHorseName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldHorseNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldHorseNameKeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldHorseName);
        jTextFieldHorseName.setBounds(130, 250, 230, 26);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(291, 310, 70, 26);

        addHorse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addHorse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Horse name", "pora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        addHorse.setGridColor(new java.awt.Color(204, 204, 204));
        addHorse.setOpaque(false);
        addHorse.getTableHeader().setReorderingAllowed(false);
        addHorse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addHorseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(addHorse);
        if (addHorse.getColumnModel().getColumnCount() > 0) {
            addHorse.getColumnModel().getColumn(0).setMinWidth(50);
            addHorse.getColumnModel().getColumn(0).setMaxWidth(50);
            addHorse.getColumnModel().getColumn(0).setHeaderValue("Item");
            addHorse.getColumnModel().getColumn(1).setHeaderValue("Horse name");
            addHorse.getColumnModel().getColumn(2).setMinWidth(70);
            addHorse.getColumnModel().getColumn(2).setMaxWidth(50);
            addHorse.getColumnModel().getColumn(2).setHeaderValue("pora");
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 350, 330, 280);

        jLabel3.setText("   Date  :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 80, 60, 20);

        jLabel6.setText("Horse name      :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 250, 90, 14);

        jLabel8.setText("Chit number      :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 190, 90, 14);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Start :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, 20));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 40, -1));

        jLabel12.setText(" End  :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 40, 20));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 40, -1));

        jTextField6.setBackground(new java.awt.Color(255, 204, 102));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 48, -1));

        jLabel14.setText("P:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 20, 20));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 228, 55, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(255, 255, 204));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Method", "Item", "Start", "End", "Amount", "Value", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(100);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(0).setHeaderValue("Method");
            jTable2.getColumnModel().getColumn(1).setMinWidth(35);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(35);
            jTable2.getColumnModel().getColumn(1).setHeaderValue("Item");
            jTable2.getColumnModel().getColumn(2).setMinWidth(34);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(34);
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Start");
            jTable2.getColumnModel().getColumn(3).setMinWidth(34);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(34);
            jTable2.getColumnModel().getColumn(3).setHeaderValue("End");
            jTable2.getColumnModel().getColumn(4).setMinWidth(50);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Amount");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Value");
            jTable2.getColumnModel().getColumn(6).setMinWidth(35);
            jTable2.getColumnModel().getColumn(6).setMaxWidth(35);
            jTable2.getColumnModel().getColumn(6).setHeaderValue("Type");
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, 390, 300));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox2.setText("Doubles");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox2KeyPressed(evt);
            }
        });

        jCheckBox3.setText("Tribles");
        jCheckBox3.setOpaque(false);

        jCheckBox4.setText("Quadruple (Q)");
        jCheckBox4.setOpaque(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox1.setText("Singales");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyPressed(evt);
            }
        });

        jRadioButton3.setText("All ");
        jRadioButton3.setOpaque(false);
        jRadioButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton3KeyPressed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 0, 0));
        jLabel49.setText("(Z)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel49)))
        );

        jCheckBox5.setText("Quintuple  (QQ)");
        jCheckBox5.setOpaque(false);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 0, 0));
        jLabel45.setText("(X)");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 0));
        jLabel46.setText("(C)");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 0));
        jLabel47.setText("(V)");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 0, 0));
        jLabel48.setText("(B)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48)))
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 390, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SankalpaSolutions/chamil/racebyrace/images/horses2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 300, 90));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 80));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Win ");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jRadioButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 190, 50, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Place ");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 190, 60, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Win/Place ");
        jRadioButton4.setOpaque(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 190, 80, -1));

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SankalpaSolutions/chamil/racebyrace/images/animated-gifs-flashing-blue-lights-005.gif"))); // NOI18N
        jLabel20.setText("PLACE");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 165, 80, 70));

        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SankalpaSolutions/chamil/racebyrace/images/animated-gifs-flashing-blue-lights-009.gif"))); // NOI18N
        jLabel21.setText("Win/Place");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 175, 100, 50));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 0, 0));
        jLabel50.setText("(E)");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 195, -1, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 0, 0));
        jLabel51.setText("(Q)");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 195, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 0, 0));
        jLabel52.setText("(W)");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, -1));

        jTextField12.setBackground(new java.awt.Color(255, 204, 102));
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 230, 48, 22));

        jLabel53.setText("W:");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 20, 20));

        jPanel2.add(jPanel1);
        jPanel1.setBounds(380, 80, 410, 620);

        canvas.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(240, 240, 240));
        jTable1.setOpaque(false);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane8.setViewportView(jTable1);

        canvas.add(jScrollPane8);
        jScrollPane8.setBounds(200, 35, 172, 480);

        jTextField93.setBackground(new java.awt.Color(240, 240, 240));
        jTextField93.setBorder(null);
        canvas.add(jTextField93);
        jTextField93.setBounds(0, 243, 60, 17);

        jTextField94.setBackground(new java.awt.Color(240, 240, 240));
        jTextField94.setBorder(null);
        canvas.add(jTextField94);
        jTextField94.setBounds(0, 220, 60, 17);

        jTextField95.setBackground(new java.awt.Color(240, 240, 240));
        jTextField95.setBorder(null);
        canvas.add(jTextField95);
        jTextField95.setBounds(0, 197, 60, 17);

        jTextField96.setBackground(new java.awt.Color(240, 240, 240));
        jTextField96.setBorder(null);
        canvas.add(jTextField96);
        jTextField96.setBounds(0, 174, 60, 17);

        jTextField69.setBackground(new java.awt.Color(240, 240, 240));
        jTextField69.setBorder(null);
        canvas.add(jTextField69);
        jTextField69.setBounds(0, 79, 60, 20);

        jTextField64.setBackground(new java.awt.Color(240, 240, 240));
        jTextField64.setBorder(null);
        canvas.add(jTextField64);
        jTextField64.setBounds(0, 102, 60, 20);

        jTextField74.setBackground(new java.awt.Color(240, 240, 240));
        jTextField74.setBorder(null);
        canvas.add(jTextField74);
        jTextField74.setBounds(0, 151, 60, 20);

        jTextField75.setBackground(new java.awt.Color(240, 240, 240));
        jTextField75.setBorder(null);
        canvas.add(jTextField75);
        jTextField75.setBounds(0, 128, 60, 17);

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setBorder(null);
        canvas.add(jTextField4);
        jTextField4.setBounds(80, 117, 37, 14);

        jTextField5.setBackground(new java.awt.Color(240, 240, 240));
        jTextField5.setBorder(null);
        canvas.add(jTextField5);
        jTextField5.setBounds(157, 70, 37, 17);

        jTextField20.setBackground(new java.awt.Color(240, 240, 240));
        jTextField20.setBorder(null);
        canvas.add(jTextField20);
        jTextField20.setBounds(157, 93, 37, 17);

        jTextField21.setBackground(new java.awt.Color(240, 240, 240));
        jTextField21.setBorder(null);
        canvas.add(jTextField21);
        jTextField21.setBounds(157, 116, 37, 17);

        jTextField22.setBackground(new java.awt.Color(240, 240, 240));
        jTextField22.setBorder(null);
        canvas.add(jTextField22);
        jTextField22.setBounds(157, 185, 37, 17);

        jTextField23.setBackground(new java.awt.Color(240, 240, 240));
        jTextField23.setBorder(null);
        canvas.add(jTextField23);
        jTextField23.setBounds(157, 162, 37, 17);

        jTextField24.setBackground(new java.awt.Color(240, 240, 240));
        jTextField24.setBorder(null);
        canvas.add(jTextField24);
        jTextField24.setBounds(157, 139, 37, 17);

        jTextField25.setBackground(new java.awt.Color(240, 240, 240));
        jTextField25.setBorder(null);
        canvas.add(jTextField25);
        jTextField25.setBounds(157, 208, 37, 17);

        jTextField26.setBackground(new java.awt.Color(240, 240, 240));
        jTextField26.setBorder(null);
        canvas.add(jTextField26);
        jTextField26.setBounds(157, 231, 37, 17);

        jTextField27.setBackground(new java.awt.Color(240, 240, 240));
        jTextField27.setBorder(null);
        canvas.add(jTextField27);
        jTextField27.setBounds(157, 254, 37, 17);

        jTextField28.setBackground(new java.awt.Color(240, 240, 240));
        jTextField28.setBorder(null);
        canvas.add(jTextField28);
        jTextField28.setBounds(157, 277, 37, 17);

        jTextField29.setBackground(new java.awt.Color(240, 240, 240));
        jTextField29.setBorder(null);
        canvas.add(jTextField29);
        jTextField29.setBounds(157, 300, 37, 17);

        jTextField30.setBackground(new java.awt.Color(240, 240, 240));
        jTextField30.setBorder(null);
        canvas.add(jTextField30);
        jTextField30.setBounds(157, 323, 37, 17);

        jTextField31.setBackground(new java.awt.Color(240, 240, 240));
        jTextField31.setBorder(null);
        canvas.add(jTextField31);
        jTextField31.setBounds(157, 346, 37, 17);

        jTextField32.setBackground(new java.awt.Color(240, 240, 240));
        jTextField32.setBorder(null);
        canvas.add(jTextField32);
        jTextField32.setBounds(157, 369, 37, 17);

        jTextField33.setBackground(new java.awt.Color(240, 240, 240));
        jTextField33.setBorder(null);
        canvas.add(jTextField33);
        jTextField33.setBounds(157, 392, 37, 17);

        jTextField34.setBackground(new java.awt.Color(240, 240, 240));
        jTextField34.setBorder(null);
        canvas.add(jTextField34);
        jTextField34.setBounds(157, 415, 37, 17);

        jTextField35.setBackground(new java.awt.Color(240, 240, 240));
        jTextField35.setBorder(null);
        canvas.add(jTextField35);
        jTextField35.setBounds(157, 438, 37, 17);

        jTextField36.setBackground(new java.awt.Color(240, 240, 240));
        jTextField36.setBorder(null);
        canvas.add(jTextField36);
        jTextField36.setBounds(157, 461, 37, 17);

        jTextField37.setBackground(new java.awt.Color(240, 240, 240));
        jTextField37.setBorder(null);
        canvas.add(jTextField37);
        jTextField37.setBounds(157, 485, 37, 17);

        jTextField38.setBackground(new java.awt.Color(240, 240, 240));
        jTextField38.setBorder(null);
        canvas.add(jTextField38);
        jTextField38.setBounds(157, 48, 37, 17);

        jTextField39.setBackground(new java.awt.Color(240, 240, 240));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField39.setBorder(null);
        canvas.add(jTextField39);
        jTextField39.setBounds(80, 237, 37, 14);

        jTextField42.setBackground(new java.awt.Color(240, 240, 240));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField42.setBorder(null);
        canvas.add(jTextField42);
        jTextField42.setBounds(80, 77, 37, 14);

        jTextField44.setBackground(new java.awt.Color(240, 240, 240));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField44.setBorder(null);
        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });
        canvas.add(jTextField44);
        jTextField44.setBounds(80, 57, 37, 14);

        jTextField45.setBackground(new java.awt.Color(240, 240, 240));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField45.setBorder(null);
        canvas.add(jTextField45);
        jTextField45.setBounds(80, 97, 37, 14);

        jTextField49.setBackground(new java.awt.Color(240, 240, 240));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField49.setAutoscrolls(false);
        jTextField49.setBorder(null);
        jTextField49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField49ActionPerformed(evt);
            }
        });
        canvas.add(jTextField49);
        jTextField49.setBounds(80, 137, 37, 14);

        jTextField50.setBackground(new java.awt.Color(240, 240, 240));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField50.setBorder(null);
        canvas.add(jTextField50);
        jTextField50.setBounds(80, 157, 37, 14);

        jTextField52.setBackground(new java.awt.Color(240, 240, 240));
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField52.setBorder(null);
        canvas.add(jTextField52);
        jTextField52.setBounds(80, 177, 37, 14);

        jTextField53.setBackground(new java.awt.Color(240, 240, 240));
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField53.setBorder(null);
        canvas.add(jTextField53);
        jTextField53.setBounds(80, 197, 37, 14);

        jTextField56.setBackground(new java.awt.Color(240, 240, 240));
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField56.setBorder(null);
        canvas.add(jTextField56);
        jTextField56.setBounds(40, 68, 37, 14);

        jTextField57.setBackground(new java.awt.Color(240, 240, 240));
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField57.setBorder(null);
        canvas.add(jTextField57);
        jTextField57.setBounds(40, 88, 37, 14);

        jTextField58.setBackground(new java.awt.Color(240, 240, 240));
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField58.setBorder(null);
        canvas.add(jTextField58);
        jTextField58.setBounds(40, 108, 37, 14);

        jTextField59.setBackground(new java.awt.Color(240, 240, 240));
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField59.setAutoscrolls(false);
        jTextField59.setBorder(null);
        canvas.add(jTextField59);
        jTextField59.setBounds(40, 128, 37, 14);

        jTextField60.setBackground(new java.awt.Color(240, 240, 240));
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField60.setBorder(null);
        canvas.add(jTextField60);
        jTextField60.setBounds(40, 148, 37, 14);

        jTextField61.setBackground(new java.awt.Color(240, 240, 240));
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField61.setBorder(null);
        canvas.add(jTextField61);
        jTextField61.setBounds(40, 168, 37, 14);

        jTextField62.setBackground(new java.awt.Color(240, 240, 240));
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField62.setBorder(null);
        canvas.add(jTextField62);
        jTextField62.setBounds(40, 188, 37, 14);

        jTextField63.setBackground(new java.awt.Color(240, 240, 240));
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField63.setBorder(null);
        canvas.add(jTextField63);
        jTextField63.setBounds(40, 208, 37, 14);

        jTextField54.setBackground(new java.awt.Color(240, 240, 240));
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField54.setBorder(null);
        canvas.add(jTextField54);
        jTextField54.setBounds(80, 217, 37, 14);

        jTextField66.setBackground(new java.awt.Color(240, 240, 240));
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField66.setBorder(null);
        canvas.add(jTextField66);
        jTextField66.setBounds(80, 357, 37, 14);

        jTextField67.setBackground(new java.awt.Color(240, 240, 240));
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField67.setBorder(null);
        canvas.add(jTextField67);
        jTextField67.setBounds(80, 337, 37, 14);

        jTextField68.setBackground(new java.awt.Color(240, 240, 240));
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField68.setBorder(null);
        canvas.add(jTextField68);
        jTextField68.setBounds(80, 317, 37, 14);

        jTextField70.setBackground(new java.awt.Color(240, 240, 240));
        jTextField70.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField70.setBorder(null);
        canvas.add(jTextField70);
        jTextField70.setBounds(80, 297, 37, 14);

        jTextField71.setBackground(new java.awt.Color(240, 240, 240));
        jTextField71.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField71.setBorder(null);
        canvas.add(jTextField71);
        jTextField71.setBounds(80, 277, 37, 14);

        jTextField73.setBackground(new java.awt.Color(240, 240, 240));
        jTextField73.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField73.setBorder(null);
        canvas.add(jTextField73);
        jTextField73.setBounds(80, 257, 37, 14);

        jTextField79.setBackground(new java.awt.Color(240, 240, 240));
        jTextField79.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField79.setBorder(null);
        canvas.add(jTextField79);
        jTextField79.setBounds(40, 368, 37, 14);

        jTextField80.setBackground(new java.awt.Color(240, 240, 240));
        jTextField80.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField80.setBorder(null);
        canvas.add(jTextField80);
        jTextField80.setBounds(40, 328, 37, 14);

        jTextField81.setBackground(new java.awt.Color(240, 240, 240));
        jTextField81.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField81.setBorder(null);
        canvas.add(jTextField81);
        jTextField81.setBounds(40, 308, 37, 14);

        jTextField82.setBackground(new java.awt.Color(240, 240, 240));
        jTextField82.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField82.setBorder(null);
        canvas.add(jTextField82);
        jTextField82.setBounds(40, 288, 37, 14);

        jTextField83.setBackground(new java.awt.Color(240, 240, 240));
        jTextField83.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField83.setAutoscrolls(false);
        jTextField83.setBorder(null);
        canvas.add(jTextField83);
        jTextField83.setBounds(40, 388, 37, 14);

        jTextField84.setBackground(new java.awt.Color(240, 240, 240));
        jTextField84.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField84.setBorder(null);
        canvas.add(jTextField84);
        jTextField84.setBounds(40, 268, 37, 14);

        jTextField85.setBackground(new java.awt.Color(240, 240, 240));
        jTextField85.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField85.setBorder(null);
        canvas.add(jTextField85);
        jTextField85.setBounds(40, 248, 37, 14);

        jTextField86.setBackground(new java.awt.Color(240, 240, 240));
        jTextField86.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField86.setBorder(null);
        canvas.add(jTextField86);
        jTextField86.setBounds(40, 228, 37, 14);

        jTextField97.setBackground(new java.awt.Color(240, 240, 240));
        jTextField97.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField97.setBorder(null);
        canvas.add(jTextField97);
        jTextField97.setBounds(40, 348, 37, 14);

        jTextField72.setBackground(new java.awt.Color(240, 240, 240));
        jTextField72.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField72.setBorder(null);
        canvas.add(jTextField72);
        jTextField72.setBounds(80, 477, 37, 14);

        jTextField98.setBackground(new java.awt.Color(240, 240, 240));
        jTextField98.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField98.setBorder(null);
        canvas.add(jTextField98);
        jTextField98.setBounds(80, 457, 37, 14);

        jTextField99.setBackground(new java.awt.Color(240, 240, 240));
        jTextField99.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField99.setBorder(null);
        canvas.add(jTextField99);
        jTextField99.setBounds(80, 437, 37, 14);

        jTextField100.setBackground(new java.awt.Color(240, 240, 240));
        jTextField100.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField100.setBorder(null);
        canvas.add(jTextField100);
        jTextField100.setBounds(80, 417, 37, 14);

        jTextField101.setBackground(new java.awt.Color(240, 240, 240));
        jTextField101.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField101.setBorder(null);
        canvas.add(jTextField101);
        jTextField101.setBounds(80, 397, 37, 14);

        jTextField102.setBackground(new java.awt.Color(240, 240, 240));
        jTextField102.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField102.setBorder(null);
        canvas.add(jTextField102);
        jTextField102.setBounds(80, 377, 37, 14);

        jTextField103.setBackground(new java.awt.Color(240, 240, 240));
        jTextField103.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField103.setBorder(null);
        canvas.add(jTextField103);
        jTextField103.setBounds(40, 408, 37, 14);

        jTextField104.setBackground(new java.awt.Color(240, 240, 240));
        jTextField104.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField104.setBorder(null);
        canvas.add(jTextField104);
        jTextField104.setBounds(40, 428, 37, 14);

        jTextField105.setBackground(new java.awt.Color(240, 240, 240));
        jTextField105.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField105.setBorder(null);
        canvas.add(jTextField105);
        jTextField105.setBounds(40, 448, 37, 14);

        jTextField106.setBackground(new java.awt.Color(240, 240, 240));
        jTextField106.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField106.setBorder(null);
        canvas.add(jTextField106);
        jTextField106.setBounds(40, 468, 37, 14);

        jTextField107.setBackground(new java.awt.Color(240, 240, 240));
        jTextField107.setBorder(null);
        canvas.add(jTextField107);
        jTextField107.setBounds(0, 427, 60, 17);

        jTextField108.setBackground(new java.awt.Color(240, 240, 240));
        jTextField108.setBorder(null);
        jTextField108.setOpaque(false);
        canvas.add(jTextField108);
        jTextField108.setBounds(0, 404, 60, 17);

        jTextField109.setBackground(new java.awt.Color(240, 240, 240));
        jTextField109.setBorder(null);
        canvas.add(jTextField109);
        jTextField109.setBounds(0, 381, 60, 17);

        jTextField110.setBackground(new java.awt.Color(240, 240, 240));
        jTextField110.setBorder(null);
        canvas.add(jTextField110);
        jTextField110.setBounds(0, 358, 60, 17);

        jTextField111.setBackground(new java.awt.Color(240, 240, 240));
        jTextField111.setBorder(null);
        canvas.add(jTextField111);
        jTextField111.setBounds(0, 335, 60, 17);

        jTextField112.setBackground(new java.awt.Color(240, 240, 240));
        jTextField112.setBorder(null);
        canvas.add(jTextField112);
        jTextField112.setBounds(0, 312, 60, 17);

        jTextField65.setBackground(new java.awt.Color(240, 240, 240));
        jTextField65.setBorder(null);
        canvas.add(jTextField65);
        jTextField65.setBounds(0, 289, 60, 17);

        jTextField113.setBackground(new java.awt.Color(240, 240, 240));
        jTextField113.setBorder(null);
        canvas.add(jTextField113);
        jTextField113.setBounds(0, 266, 60, 17);

        jTextField117.setBackground(new java.awt.Color(240, 240, 240));
        jTextField117.setBorder(null);
        canvas.add(jTextField117);
        jTextField117.setBounds(0, 496, 60, 17);

        jTextField118.setBackground(new java.awt.Color(240, 240, 240));
        jTextField118.setBorder(null);
        canvas.add(jTextField118);
        jTextField118.setBounds(0, 450, 60, 17);

        jTextField119.setBackground(new java.awt.Color(240, 240, 240));
        jTextField119.setBorder(null);
        canvas.add(jTextField119);
        jTextField119.setBounds(0, 473, 60, 17);

        jTextField40.setBackground(new java.awt.Color(240, 240, 240));
        jTextField40.setBorder(null);
        canvas.add(jTextField40);
        jTextField40.setBounds(380, 48, 37, 17);

        jTextField41.setBackground(new java.awt.Color(240, 240, 240));
        jTextField41.setBorder(null);
        canvas.add(jTextField41);
        jTextField41.setBounds(380, 70, 37, 17);

        jTextField43.setBackground(new java.awt.Color(240, 240, 240));
        jTextField43.setBorder(null);
        canvas.add(jTextField43);
        jTextField43.setBounds(380, 93, 37, 17);

        jTextField46.setBackground(new java.awt.Color(240, 240, 240));
        jTextField46.setBorder(null);
        canvas.add(jTextField46);
        jTextField46.setBounds(380, 116, 37, 17);

        jTextField47.setBackground(new java.awt.Color(240, 240, 240));
        jTextField47.setBorder(null);
        canvas.add(jTextField47);
        jTextField47.setBounds(380, 139, 37, 17);

        jTextField48.setBackground(new java.awt.Color(240, 240, 240));
        jTextField48.setBorder(null);
        canvas.add(jTextField48);
        jTextField48.setBounds(380, 162, 37, 17);

        jTextField51.setBackground(new java.awt.Color(240, 240, 240));
        jTextField51.setBorder(null);
        canvas.add(jTextField51);
        jTextField51.setBounds(380, 185, 37, 17);

        jTextField55.setBackground(new java.awt.Color(240, 240, 240));
        jTextField55.setBorder(null);
        canvas.add(jTextField55);
        jTextField55.setBounds(380, 208, 37, 17);

        jTextField114.setBackground(new java.awt.Color(240, 240, 240));
        jTextField114.setBorder(null);
        canvas.add(jTextField114);
        jTextField114.setBounds(380, 231, 37, 17);

        jTextField115.setBackground(new java.awt.Color(240, 240, 240));
        jTextField115.setBorder(null);
        canvas.add(jTextField115);
        jTextField115.setBounds(380, 254, 37, 17);

        jTextField116.setBackground(new java.awt.Color(240, 240, 240));
        jTextField116.setBorder(null);
        canvas.add(jTextField116);
        jTextField116.setBounds(380, 277, 37, 17);

        jTextField120.setBackground(new java.awt.Color(240, 240, 240));
        jTextField120.setBorder(null);
        canvas.add(jTextField120);
        jTextField120.setBounds(380, 300, 37, 17);

        jTextField121.setBackground(new java.awt.Color(240, 240, 240));
        jTextField121.setBorder(null);
        canvas.add(jTextField121);
        jTextField121.setBounds(380, 323, 37, 17);

        jTextField122.setBackground(new java.awt.Color(240, 240, 240));
        jTextField122.setBorder(null);
        canvas.add(jTextField122);
        jTextField122.setBounds(380, 346, 37, 17);

        jTextField123.setBackground(new java.awt.Color(240, 240, 240));
        jTextField123.setBorder(null);
        canvas.add(jTextField123);
        jTextField123.setBounds(380, 369, 37, 17);

        jTextField124.setBackground(new java.awt.Color(240, 240, 240));
        jTextField124.setBorder(null);
        canvas.add(jTextField124);
        jTextField124.setBounds(380, 392, 37, 17);

        jTextField125.setBackground(new java.awt.Color(240, 240, 240));
        jTextField125.setBorder(null);
        canvas.add(jTextField125);
        jTextField125.setBounds(380, 415, 37, 17);

        jTextField126.setBackground(new java.awt.Color(240, 240, 240));
        jTextField126.setBorder(null);
        canvas.add(jTextField126);
        jTextField126.setBounds(380, 438, 37, 17);

        jTextField127.setBackground(new java.awt.Color(240, 240, 240));
        jTextField127.setBorder(null);
        canvas.add(jTextField127);
        jTextField127.setBounds(380, 461, 37, 17);

        jTextField128.setBackground(new java.awt.Color(240, 240, 240));
        jTextField128.setBorder(null);
        canvas.add(jTextField128);
        jTextField128.setBounds(380, 485, 37, 17);

        jTextField129.setBackground(new java.awt.Color(240, 240, 240));
        jTextField129.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField129.setBorder(null);
        jTextField129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField129ActionPerformed(evt);
            }
        });
        canvas.add(jTextField129);
        jTextField129.setBounds(460, 57, 37, 14);

        jTextField130.setBackground(new java.awt.Color(240, 240, 240));
        jTextField130.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField130.setBorder(null);
        canvas.add(jTextField130);
        jTextField130.setBounds(460, 77, 37, 14);

        jTextField131.setBackground(new java.awt.Color(240, 240, 240));
        jTextField131.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField131.setBorder(null);
        canvas.add(jTextField131);
        jTextField131.setBounds(460, 97, 37, 14);

        jTextField132.setBackground(new java.awt.Color(240, 240, 240));
        jTextField132.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField132.setBorder(null);
        canvas.add(jTextField132);
        jTextField132.setBounds(460, 117, 37, 14);

        jTextField133.setBackground(new java.awt.Color(240, 240, 240));
        jTextField133.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField133.setAutoscrolls(false);
        jTextField133.setBorder(null);
        jTextField133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField133ActionPerformed(evt);
            }
        });
        canvas.add(jTextField133);
        jTextField133.setBounds(460, 137, 37, 14);

        jTextField134.setBackground(new java.awt.Color(240, 240, 240));
        jTextField134.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField134.setBorder(null);
        canvas.add(jTextField134);
        jTextField134.setBounds(460, 157, 37, 14);

        jTextField135.setBackground(new java.awt.Color(240, 240, 240));
        jTextField135.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField135.setBorder(null);
        canvas.add(jTextField135);
        jTextField135.setBounds(460, 177, 37, 14);

        jTextField136.setBackground(new java.awt.Color(240, 240, 240));
        jTextField136.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField136.setBorder(null);
        canvas.add(jTextField136);
        jTextField136.setBounds(460, 197, 37, 14);

        jTextField137.setBackground(new java.awt.Color(240, 240, 240));
        jTextField137.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField137.setBorder(null);
        canvas.add(jTextField137);
        jTextField137.setBounds(460, 217, 37, 14);

        jTextField138.setBackground(new java.awt.Color(240, 240, 240));
        jTextField138.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField138.setBorder(null);
        canvas.add(jTextField138);
        jTextField138.setBounds(460, 237, 37, 14);

        jTextField139.setBackground(new java.awt.Color(240, 240, 240));
        jTextField139.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField139.setBorder(null);
        canvas.add(jTextField139);
        jTextField139.setBounds(460, 257, 37, 14);

        jTextField140.setBackground(new java.awt.Color(240, 240, 240));
        jTextField140.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField140.setBorder(null);
        canvas.add(jTextField140);
        jTextField140.setBounds(460, 277, 37, 14);

        jTextField141.setBackground(new java.awt.Color(240, 240, 240));
        jTextField141.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField141.setBorder(null);
        canvas.add(jTextField141);
        jTextField141.setBounds(460, 297, 37, 14);

        jTextField142.setBackground(new java.awt.Color(240, 240, 240));
        jTextField142.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField142.setBorder(null);
        canvas.add(jTextField142);
        jTextField142.setBounds(460, 317, 37, 14);

        jTextField143.setBackground(new java.awt.Color(240, 240, 240));
        jTextField143.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField143.setBorder(null);
        canvas.add(jTextField143);
        jTextField143.setBounds(460, 337, 37, 14);

        jTextField144.setBackground(new java.awt.Color(240, 240, 240));
        jTextField144.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField144.setBorder(null);
        canvas.add(jTextField144);
        jTextField144.setBounds(460, 357, 37, 14);

        jTextField145.setBackground(new java.awt.Color(240, 240, 240));
        jTextField145.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField145.setBorder(null);
        canvas.add(jTextField145);
        jTextField145.setBounds(460, 377, 37, 14);

        jTextField146.setBackground(new java.awt.Color(240, 240, 240));
        jTextField146.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField146.setBorder(null);
        canvas.add(jTextField146);
        jTextField146.setBounds(460, 397, 37, 14);

        jTextField147.setBackground(new java.awt.Color(240, 240, 240));
        jTextField147.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField147.setBorder(null);
        canvas.add(jTextField147);
        jTextField147.setBounds(460, 417, 37, 14);

        jTextField148.setBackground(new java.awt.Color(240, 240, 240));
        jTextField148.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField148.setBorder(null);
        canvas.add(jTextField148);
        jTextField148.setBounds(460, 437, 37, 14);

        jTextField149.setBackground(new java.awt.Color(240, 240, 240));
        jTextField149.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField149.setBorder(null);
        canvas.add(jTextField149);
        jTextField149.setBounds(460, 457, 37, 14);

        jTextField150.setBackground(new java.awt.Color(240, 240, 240));
        jTextField150.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField150.setBorder(null);
        canvas.add(jTextField150);
        jTextField150.setBounds(460, 477, 37, 14);

        jTextField151.setBackground(new java.awt.Color(240, 240, 240));
        jTextField151.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField151.setBorder(null);
        canvas.add(jTextField151);
        jTextField151.setBounds(502, 68, 37, 14);

        jTextField152.setBackground(new java.awt.Color(240, 240, 240));
        jTextField152.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField152.setBorder(null);
        canvas.add(jTextField152);
        jTextField152.setBounds(502, 88, 37, 14);

        jTextField153.setBackground(new java.awt.Color(240, 240, 240));
        jTextField153.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField153.setBorder(null);
        canvas.add(jTextField153);
        jTextField153.setBounds(502, 108, 37, 14);

        jTextField154.setBackground(new java.awt.Color(240, 240, 240));
        jTextField154.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField154.setAutoscrolls(false);
        jTextField154.setBorder(null);
        canvas.add(jTextField154);
        jTextField154.setBounds(502, 128, 37, 14);

        jTextField155.setBackground(new java.awt.Color(240, 240, 240));
        jTextField155.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField155.setBorder(null);
        canvas.add(jTextField155);
        jTextField155.setBounds(502, 148, 37, 14);

        jTextField156.setBackground(new java.awt.Color(240, 240, 240));
        jTextField156.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField156.setBorder(null);
        canvas.add(jTextField156);
        jTextField156.setBounds(502, 168, 37, 14);

        jTextField157.setBackground(new java.awt.Color(240, 240, 240));
        jTextField157.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField157.setBorder(null);
        canvas.add(jTextField157);
        jTextField157.setBounds(502, 188, 37, 14);

        jTextField158.setBackground(new java.awt.Color(240, 240, 240));
        jTextField158.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField158.setBorder(null);
        canvas.add(jTextField158);
        jTextField158.setBounds(502, 208, 37, 14);

        jTextField159.setBackground(new java.awt.Color(240, 240, 240));
        jTextField159.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField159.setBorder(null);
        canvas.add(jTextField159);
        jTextField159.setBounds(502, 228, 37, 14);

        jTextField160.setBackground(new java.awt.Color(240, 240, 240));
        jTextField160.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField160.setBorder(null);
        canvas.add(jTextField160);
        jTextField160.setBounds(502, 248, 37, 14);

        jTextField161.setBackground(new java.awt.Color(240, 240, 240));
        jTextField161.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField161.setBorder(null);
        canvas.add(jTextField161);
        jTextField161.setBounds(502, 268, 37, 14);

        jTextField162.setBackground(new java.awt.Color(240, 240, 240));
        jTextField162.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField162.setBorder(null);
        canvas.add(jTextField162);
        jTextField162.setBounds(502, 288, 37, 14);

        jTextField163.setBackground(new java.awt.Color(240, 240, 240));
        jTextField163.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField163.setBorder(null);
        canvas.add(jTextField163);
        jTextField163.setBounds(502, 308, 37, 14);

        jTextField164.setBackground(new java.awt.Color(240, 240, 240));
        jTextField164.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField164.setBorder(null);
        canvas.add(jTextField164);
        jTextField164.setBounds(502, 328, 37, 14);

        jTextField165.setBackground(new java.awt.Color(240, 240, 240));
        jTextField165.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField165.setBorder(null);
        canvas.add(jTextField165);
        jTextField165.setBounds(502, 348, 37, 14);

        jTextField166.setBackground(new java.awt.Color(240, 240, 240));
        jTextField166.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField166.setBorder(null);
        canvas.add(jTextField166);
        jTextField166.setBounds(502, 368, 37, 14);

        jTextField167.setBackground(new java.awt.Color(240, 240, 240));
        jTextField167.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField167.setAutoscrolls(false);
        jTextField167.setBorder(null);
        canvas.add(jTextField167);
        jTextField167.setBounds(502, 388, 37, 14);

        jTextField168.setBackground(new java.awt.Color(240, 240, 240));
        jTextField168.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField168.setBorder(null);
        canvas.add(jTextField168);
        jTextField168.setBounds(502, 408, 37, 14);

        jTextField169.setBackground(new java.awt.Color(240, 240, 240));
        jTextField169.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField169.setBorder(null);
        canvas.add(jTextField169);
        jTextField169.setBounds(502, 428, 37, 14);

        jTextField170.setBackground(new java.awt.Color(240, 240, 240));
        jTextField170.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField170.setBorder(null);
        canvas.add(jTextField170);
        jTextField170.setBounds(502, 448, 37, 14);

        jTextField171.setBackground(new java.awt.Color(240, 240, 240));
        jTextField171.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField171.setBorder(null);
        canvas.add(jTextField171);
        jTextField171.setBounds(502, 468, 37, 14);

        jPanel2.add(canvas);
        canvas.setBounds(800, 80, 550, 510);

        jTextField76.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField76.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField76);
        jTextField76.setBounds(900, 610, 80, 25);

        jTextFieldchitNum1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldchitNum1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFieldchitNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldchitNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldchitNum1);
        jTextFieldchitNum1.setBounds(130, 220, 90, 21);

        jLabel40.setText("Current In        :");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(30, 220, 90, 14);

        jTextField77.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField77.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField77);
        jTextField77.setBounds(1090, 610, 80, 25);

        jTextField78.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField78.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField78);
        jTextField78.setBounds(900, 640, 80, 25);

        jTextField87.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField87.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField87);
        jTextField87.setBounds(900, 680, 80, 25);

        jLabel28.setText("Total Q             :");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(1000, 610, 100, 14);

        jLabel29.setText("Total singles    :");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(810, 610, 90, 14);

        jLabel30.setText("Total Doubles  :");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(810, 650, 90, 20);

        jTextField88.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField88.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField88);
        jTextField88.setBounds(1090, 640, 80, 25);

        jLabel32.setText("Total QQ       :");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(1010, 640, 90, 20);

        jLabel31.setText("Total Tribles    :");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(810, 680, 90, 14);

        jLabel33.setText("  Total Brackets     :");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(980, 680, 110, 14);

        jTextField89.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField89.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField89);
        jTextField89.setBounds(1090, 680, 80, 25);

        jLabel36.setText("Less comm    :");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(1250, 600, 80, 20);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 0));
        jLabel41.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel2.add(jLabel41);
        jLabel41.setBounds(1250, 670, 90, 30);

        jLabel42.setText("Investment   :");
        jPanel2.add(jLabel42);
        jLabel42.setBounds(1250, 650, 80, 20);

        jLabel16.setText("  CenterNamer  :");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(30, 120, 100, 20);

        jTextField172.setEditable(false);
        jTextField172.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField172.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField172);
        jTextField172.setBounds(1250, 620, 90, 21);

        jTextField11.setEditable(false);
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField11);
        jTextField11.setBounds(130, 80, 230, 22);

        jPanel8.setOpaque(false);

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setText("Add chit (F5)");
        jButton7.setFocusCycleRoot(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });

        jButton9.setText("Testing");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton4))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(390, 650, 380, 40);

        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(380, 80, 410, 620);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SankalpaSolutions/chamil/racebyrace/images/dashboard5.png"))); // NOI18N
        jPanel2.add(jLabel19);
        jLabel19.setBounds(0, -20, 220, 100);

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton7.setText("Q");
        jRadioButton7.setContentAreaFilled(false);
        jPanel2.add(jRadioButton7);
        jRadioButton7.setBounds(240, 650, 40, 23);

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("T");
        jRadioButton6.setContentAreaFilled(false);
        jPanel2.add(jRadioButton6);
        jRadioButton6.setBounds(200, 650, 70, 23);

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("D");
        jRadioButton5.setContentAreaFilled(false);
        jPanel2.add(jRadioButton5);
        jRadioButton5.setBounds(150, 650, 80, 23);

        jTextField7.setBackground(new java.awt.Color(255, 204, 102));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 204));
        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(290, 650, 60, 23);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("Default Values  :");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 650, 110, 20);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(30, 640, 330, 40);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 165, 350, 530);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SankalpaSolutions/chamil/racebyrace/images/DashBoard.jpg"))); // NOI18N
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel2KeyReleased(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1410, 730);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(410, 80, 380, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcenterNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldcenterNumKeyTyped

//        if (jTextFieldcenterNum.getText().length() == 0) {
////            jLabel11.setText("");
//        }
    }//GEN-LAST:event_jTextFieldcenterNumKeyTyped

    private void jTextFieldcenterNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcenterNumActionPerformed
        // TODO add your handling code here:
//        jTextFieldcash.grabFocus();
    }//GEN-LAST:event_jTextFieldcenterNumActionPerformed

    private void jTextFieldchitNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldchitNumActionPerformed
        jTextFieldchitNum1.grabFocus();
        jTextFieldchitNum1.selectAll();
    }//GEN-LAST:event_jTextFieldchitNumActionPerformed

    private void jTable9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MousePressed
        //int Row = jTable5.getSelectedRow();
        //    jTextField3.setText(jTable5.getValueAt(Row, 0).toString());
        //    jScrollPane5.setVisible(false);
        //    jTable5.setVisible(false);
    }//GEN-LAST:event_jTable9MousePressed

    private void jTable9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable9KeyPressed
        if (evt.getKeyCode() == 10) {
            try {
                int Row = jTable9.getSelectedRow();
                jTextFieldHorseName.setText(jTable9.getValueAt(Row, 0).toString());
                jScrollPane6.setVisible(false);
                jTable9.setVisible(false);
                jTextField15.grabFocus();

                poraVal = jTable9.getValueAt(Row, 1).toString();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jTable9KeyPressed

    private void jTextFieldHorseNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHorseNameKeyReleased

        System.gc();
        DefaultTableModel dtm3 = (DefaultTableModel) jTable9.getModel();
        if (jTextFieldHorseName.getText().length() == 0) {
        } else {
            try {

                // String firstNumber = jTextFieldHorseName.getText().trim().replaceFirst(".*?(\\d+).*", "$1");
                String abcstr = jTextFieldHorseName.getText().trim().replaceAll("[^0-9.,]+", "");

                if (!abcstr.equals("")) {
                    int val = Integer.parseInt(abcstr);
                    if (val > 0) {

                        int rowCount = dtm3.getRowCount();
                        String numbering_horse;

                        for (int i = 0; i <= rowCount; i++) {
                            System.out.println("V : " + i);
                            if (i == val) {
                                numbering_horse = dtm3.getValueAt(val - 1, 0).toString();
                              //  System.out.println("X : " + i);

                                //  investment = Double.parseDouble(dtm.getValueAt(i, 1).toString());
                                // dtm3.getValueAt(i, 0).toString();
                                System.out.println("sfggggggg : " + numbering_horse);
                                jTextFieldHorseName.setText(numbering_horse);
                                jScrollPane6.setVisible(false);
                                jTable9.setVisible(false);
                            }

                        }

                    }
                } else {

                    List<Horse> list = HorseController.sercLikeHorseNames(jTextFieldHorseName.getText().trim());

                    dtm3.setRowCount(0);
                    String pora;
                    for (int i = 0; i < list.size(); i++) {
                        Vector v = new Vector();
                        v.add(list.get(i).getHorse_name());
                        pora = PoraController.searchPoraByID(list.get(i).getPora_ID());
                        v.add(pora);

                        dtm3.addRow(v);
                        jScrollPane6.setVisible(true);
                        jTable9.setVisible(true);
                    }

                    if (dtm3.getRowCount() == 0) {
                        jScrollPane6.setVisible(false);
                        jTable9.setVisible(false);
                    } else {
                        jScrollPane6.setVisible(true);
                        jTable9.setVisible(true);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTextFieldHorseNameKeyReleased

    private void jTextFieldHorseNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHorseNameKeyPressed

        if (evt.getKeyCode() == 40) {
            jTable9.grabFocus();
            ListSelectionModel selectionModel = jTable9.getSelectionModel();
            selectionModel.setSelectionInterval(0, 0);
        }
        if (evt.getKeyCode() == 32) {
            jTextField7.grabFocus();

        }
    }//GEN-LAST:event_jTextFieldHorseNameKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

        try {
            DefaultTableModel horsetable = (DefaultTableModel) addHorse.getModel();
            jTable1.setRowHeight(24);

//            List<RaceCard> list = RaceCardController.searchRaceCardPoraByName(jTextFieldHorseName.getText());
//            String pora = "0";
//            for (int i = 0; i < list.size(); i++) {
//                pora = list.get(i).getPora();
//
//            }
////            RaceCard racecrd = RaceCardController.searchRaceCardPoraByName(jTextFieldHorseName.getText());
//            System.out.println("pora methanata enne ne : " + pora);
            /////////////////////////////modified 2015-08-11/////////////////////////////////////           
//            ResultSet rs = Db.search("SELECT Pora FROM race_card WHERE Horse_Name='" + jTextFieldHorseName.getText() + "'");
//            while (rs.next()) {
//                pora = rs.getString("Pora");
//            }
            /////////////////////////////modified 2015-08-11/////////////////////////////////////                      
            Vector v = new Vector();
            v.add(item);
            v.add(jTextFieldHorseName.getText());

            v.add(poraVal);
            horsetable.addRow(v);
            item++;
            DefaultTableModel tb2 = (DefaultTableModel) jTable1.getModel();
            jTable1.setRowHeight(23);
            Vector v1 = new Vector();
            v1.add(jTextFieldHorseName.getText());
            tb2.addRow(v1);

            jTextFieldHorseName.setText("");
            jTextField15.setText("");
            jTextField14.setText("");
            jTextFieldHorseName.grabFocus();
            poraVal = "";
        } catch (Exception ex) {
            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel20.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        int rowCount = addHorse.getRowCount();
        if (evt.getKeyCode() == 27) {
            if (jCheckBox1.isSelected()) {
                jRadioButton3.setSelected(true);
                jTextField8.setText("" + rowCount);
            }
        }

        if (evt.getKeyCode() == 81) {
            jRadioButton2.setSelected(true);
            jRadioButton3.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);

            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
//            Color color=new Color(253, 234, 184);    
//           
//            jPanel5.setBackground(color);   
//           
//             jPanel5.updateUI();

//             Panel1 p1=new Panel1();
        }
        if (evt.getKeyCode() == 87) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jRadioButton1.setSelected(true);

            jLabel20.setVisible(true);
            jLabel21.setVisible(false);
//            Color color=new Color(184, 239, 254);    
//         
//            jPanel5.setBackground(color);  
//               jPanel5.updateUI();
            //jPanel5.add(jPanel1);
        }
        if (evt.getKeyCode() == 69) {
            jRadioButton3.setSelected(false);

            jRadioButton4.setSelected(true);

            jLabel20.setVisible(false);
            jLabel21.setVisible(true);
//            Color color=new Color(220, 254, 184);    
//        
//            jPanel5.setBackground(color);    
//                jPanel5.updateUI();
            //  jPanel5.add(jPanel1);
        }
        if (evt.getKeyCode() == 90) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            jTextField8.setText("0");

        }
        if (evt.getKeyCode() == 88) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox2.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();

        }
        if (evt.getKeyCode() == 67) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox3.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
        }
        if (evt.getKeyCode() == 86) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox4.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();

        }
        if (evt.getKeyCode() == 66) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox5.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jTextField9.grabFocus();
        }
        if (evt.getKeyCode() == 65) {
            jRadioButton3.setSelected(false);
            if (i == 0) {
                setworn1();
                i++;
            } else if (i == 1) {
                setworn2();
                i = 0;
            }
            jTextField2.setText("1");
            jTextField2.selectAll();
            jTextField1.setText("" + rowCount);
            jTextField1.selectAll();
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
//            int rowCount = addHorse.getRowCount();
            jTextField2.setText("1");
            jTextField2.selectAll();
            jTextField1.setText("" + rowCount);

            jCheckBox5.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jTextField2.grabFocus();

        }
        if (evt.getKeyCode() == 68) {
            jRadioButton3.setSelected(false);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 70) {
            jRadioButton3.setSelected(false);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            System.out.println("thnama print una");
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 71) {
            jRadioButton3.setSelected(false);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(true);
            System.out.println("4 print una");
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 72) {
            jRadioButton3.setSelected(true);

        }
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jRadioButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton2KeyPressed
        if (evt.getKeyCode() == 32) {
            jLabel2.grabFocus();

        }
        if (jCheckBox1.isSelected()) {
            System.out.println("dsdsdsds");
        }
    }//GEN-LAST:event_jRadioButton2KeyPressed

    private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyPressed
        if (evt.getKeyCode() == 32) {
            jLabel2.grabFocus();

        }
    }//GEN-LAST:event_jRadioButton1KeyPressed

    private void jCheckBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyPressed
        if (evt.getKeyCode() == 32) {
            jLabel2.grabFocus();
            System.out.println("ddddddddddddd");
        }
    }//GEN-LAST:event_jCheckBox1KeyPressed

    private void jRadioButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton3KeyPressed
        if (evt.getKeyCode() == 32) {
            jLabel2.grabFocus();

        }
    }//GEN-LAST:event_jRadioButton3KeyPressed

    private void jCheckBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox2KeyPressed
        if (evt.getKeyCode() == 32) {
            jLabel2.grabFocus();
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2KeyPressed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        int rowCount = addHorse.getRowCount();
        if (evt.getKeyCode() == 27) {
            if (jCheckBox1.isSelected()) {
                jRadioButton3.setSelected(true);
                jTextField8.setText("" + rowCount);
            }
        }
        if (evt.getKeyCode() == 116) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox5.setSelected(false);
            jRadioButton3.setSelected(false);
            jTextField8.setText("");
            jTextField6.setText("");
            jTextField9.setText("");
            if (i == 1) {
                setworn2();
                i = 0;

            }
            jButton7.grabFocus();

        }

        if (evt.getKeyCode() == 81) {
            jRadioButton3.setSelected(false);

            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
        }
        if (evt.getKeyCode() == 87) {
            jRadioButton3.setSelected(false);

            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(true);
            jLabel21.setVisible(false);

        }
        if (evt.getKeyCode() == 69) {
            jRadioButton3.setSelected(false);

            jRadioButton4.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(true);
        }
        System.out.println("get key code spaxe : " + evt.getKeyCode());
        if (evt.getKeyCode() == 32) {
            jRadioButton3.setSelected(false);
            jTextField8.setText("");
            jTextField9.setText("");

            jLabel2.grabFocus();
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);

        }
        if (evt.getKeyCode() == 90) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
//            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            System.out.println("ohhh shit");
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            jTextField8.setText("0");

        }
        if (evt.getKeyCode() == 88) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jTextField6.setText("dd");
            jCheckBox2.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
//////////////////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }
        if (evt.getKeyCode() == 67) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox3.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
//            jTextField11.grabFocus();
            /////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }
        if (evt.getKeyCode() == 86) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox4.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox5.setSelected(false);
//            jTextField14.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }
        if (evt.getKeyCode() == 66) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox5.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
//            jTextField17.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }
        if (evt.getKeyCode() == 65) {
            jRadioButton3.setSelected(false);
            if (i == 0) {
                setworn1();
                i++;
            } else if (i == 1) {
                setworn2();
                i = 0;
            }
            jTextField2.setText("1");
            jTextField2.selectAll();
            jTextField1.setText("" + rowCount);
            jTextField1.selectAll();
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox5.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jTextField2.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }
        if (evt.getKeyCode() == 68) {
            jRadioButton3.setSelected(false);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();

        }
        if (evt.getKeyCode() == 70) {
            jRadioButton3.setSelected(false);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();

        }
        if (evt.getKeyCode() == 71) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(true);
            jTextField9.grabFocus();

        }
        if (evt.getKeyCode() == 72) {
            jRadioButton3.setSelected(true);

        }


    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        int rowCount = addHorse.getRowCount();
        if (evt.getKeyCode() == 27) {
            if (jCheckBox1.isSelected()) {
                jRadioButton3.setSelected(true);
                jTextField8.setText("" + rowCount);
            }
        }
        if (evt.getKeyCode() == 81) {

            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
        }
        if (evt.getKeyCode() == 87) {
            jRadioButton3.setSelected(false);

            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(true);
            jLabel21.setVisible(false);

        }
        if (evt.getKeyCode() == 69) {
            jRadioButton3.setSelected(false);

            jRadioButton4.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(true);
        }
        if (evt.getKeyCode() == 32) {
            jRadioButton3.setSelected(false);
            jTextField8.setText("");
            jTextField9.setText("");

            jLabel2.grabFocus();
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);

        }
        if (evt.getKeyCode() == 90) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 88) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox2.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
//////////////////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 67) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox3.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
//            jTextField11.grabFocus();
            /////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 86) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox4.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox5.setSelected(false);
//            jTextField14.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 66) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox5.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
//            jTextField17.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 65) {
            jRadioButton3.setSelected(false);
            if (i == 0) {
                setworn1();
                i++;
            } else if (i == 1) {
                setworn2();
                i = 0;
            }
            jTextField2.setText("1");
            jTextField2.selectAll();
            jTextField1.setText("" + rowCount);
            jTextField1.selectAll();
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox5.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jTextField2.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 68) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 70) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 71) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(true);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 72) {
            jRadioButton3.setSelected(true);

        }
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        int rowCount = addHorse.getRowCount();
        if (evt.getKeyCode() == 27) {
            if (jCheckBox1.isSelected()) {
                jRadioButton3.setSelected(true);
                jTextField8.setText("" + rowCount);
            }
        }
        if (evt.getKeyCode() == 81) {

            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
        }
        if (evt.getKeyCode() == 87) {
            jRadioButton3.setSelected(false);

            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(true);
            jLabel21.setVisible(false);

        }
        if (evt.getKeyCode() == 69) {
            jRadioButton3.setSelected(false);

            jRadioButton4.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(true);
        }
        if (evt.getKeyCode() == 32) {
            jRadioButton3.setSelected(false);
            jTextField8.setText("");
            jTextField9.setText("");

            jLabel2.grabFocus();
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);

        }
        if (evt.getKeyCode() == 90) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 88) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox2.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
//////////////////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 67) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox3.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
//            jTextField11.grabFocus();
            /////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 86) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox4.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox5.setSelected(false);
//            jTextField14.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 66) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox5.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
//            jTextField17.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 65) {
            jRadioButton3.setSelected(false);
            if (i == 0) {
                setworn1();
                i++;
            } else if (i == 1) {
                setworn2();
                i = 0;
            }
            jTextField2.setText("1");
            jTextField2.selectAll();
            jTextField1.setText("" + rowCount);
            jTextField1.selectAll();
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox5.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jTextField2.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 68) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
        if (evt.getKeyCode() == 70) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 71) {
            jRadioButton3.setSelected(false);
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(true);
            jTextField9.grabFocus();
            //////////////////////////////////////////////
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");

        }
        if (evt.getKeyCode() == 72) {
            jRadioButton3.setSelected(true);

        }

    }//GEN-LAST:event_jTextField6KeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (!jTextField8.getText().equals("")) {
            tribleMin = Double.parseDouble(jTextField8.getText());
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed

        if (jCheckBox2.isSelected() || jCheckBox3.isSelected() || jCheckBox4.isSelected() || jCheckBox5.isSelected() || jCheckBox1.isSelected()) {

            if (jCheckBox1.isSelected()) {
                int maxLength = Integer.parseInt(jTextField9.getText());
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                if (dtm.getRowCount() < maxLength) {

                    JOptionPane.showMessageDialog(null, "table eke ochchara raws ne");
                    jTextField9.setText("");
                    jTextField9.grabFocus();
                } else {

                    jTextField6.grabFocus();
                }
            } else {
                jTextField8.grabFocus();
                jTextField8.selectAll();
            }
        }
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        try {

            if (jTextField9.getText().length() != 0 && jTextField8.getText().length() != 0) {
                int maxLength = Integer.parseInt(jTextField8.getText());
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

//        if (jCheckBox3.isSelected()) {
//            double minimummVal = Double.parseDouble(jTextField12.getText());
//            if (minimummVal < 3) {
//                JOptionPane.showMessageDialog(null, "requre minimum distance is 3");
//                jTextField8.setText("");
//                jTextField8.grabFocus();
//            }
//        }  else {
//            System.out.println("wer wer wer wer wer wer wer wer");
//            jTextField8.grabFocus();
//        }
                if (dtm.getRowCount() < maxLength) {
                    JOptionPane.showMessageDialog(null, "table eke ochchara raws ne");
                    jTextField8.setText("");
                    jTextField6.setText("");
                    jTextField8.grabFocus();
                } else {

                    jTextField6.grabFocus();
                }
            } else {
                jTextField9.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        jTextField12.grabFocus();
//        if(jTextField6.getText().length()!=0){

//        }else{
//        JOptionPane.showMessageDialog(rootPane, "Please insert Amount");
//        }

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        int maxLength = Integer.parseInt(jTextField1.getText());
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        if (dtm.getRowCount() < maxLength) {
            JOptionPane.showMessageDialog(null, "table eke ochchara raws ne");
            jTextField1.setText("");
            jTextField3.setText("");
            jTextField1.grabFocus();
        } else {

            if (jCheckBox6.isSelected()) {
                jTextField3.grabFocus();
            } else if (jCheckBox7.isSelected()) {
                jTextField10.grabFocus();
            }

        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        int rowCount = addHorse.getRowCount();
        /////////////////////////////////2015-09-03/////////////////////////////////////////////
        if (evt.getKeyCode() == 81) {
            if (i == 1) {
                setworn2();
                i = 0;

            }

            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
        }
        if (evt.getKeyCode() == 87) {
            if (i == 1) {
                setworn2();
                i = 0;

            }

            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
            jRadioButton4.setSelected(false);
            jLabel20.setVisible(true);
            jLabel21.setVisible(false);

        }
        if (evt.getKeyCode() == 69) {
            if (i == 1) {
                setworn2();
                i = 0;

            }

            jRadioButton4.setSelected(true);
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(true);
        }
        System.out.println("get key code spaxe : " + evt.getKeyCode());
        if (evt.getKeyCode() == 32) {
            if (i == 1) {
                setworn2();
                i = 0;

            }
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jLabel2.grabFocus();
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);

        }
        if (evt.getKeyCode() == 90) {
            if (i == 1) {
                setworn2();
                i = 0;

            }
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();

            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
            jTextField8.setText("0");

        }
        if (evt.getKeyCode() == 88) {
            if (i == 1) {
                setworn2();
                i = 0;

            }
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox2.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();
//////////////////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }
        if (evt.getKeyCode() == 67) {
            if (i == 1) {
                setworn2();
                i = 0;

            }
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox3.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
//            jTextField11.grabFocus();
            /////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }
        if (evt.getKeyCode() == 86) {
            if (i == 1) {
                setworn2();
                i = 0;

            }
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox4.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox5.setSelected(false);
//            jTextField14.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }
        if (evt.getKeyCode() == 66) {
            if (i == 1) {
                setworn2();
                i = 0;

            }
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox5.setSelected(true);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
//            jTextField17.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");

        }

        if (evt.getKeyCode() == 68) {
            if (i == 1) {
                setworn2();
                i = 0;

            }

            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();

        }
        if (evt.getKeyCode() == 70) {
            if (i == 1) {
                setworn2();
                i = 0;

            }

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(false);
            jTextField9.grabFocus();

        }
        if (evt.getKeyCode() == 71) {
            if (i == 1) {
                setworn2();
                i = 0;

            }

            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(true);
            jTextField9.grabFocus();

        }

        /////////////////////////////////2015-09-03/////////////////////////////////////////////
        if (evt.getKeyCode() == 112) {
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(false);
            jLabel22.setVisible(false);
            jLabel23.setVisible(false);
            jTextField10.setText("");
        }
        if (evt.getKeyCode() == 113) {
            jCheckBox7.setSelected(true);
            jCheckBox6.setSelected(false);
            jLabel22.setVisible(true);
            jLabel23.setVisible(false);
        }
        if (evt.getKeyCode() == 114) {
            jCheckBox7.setSelected(true);
            jCheckBox6.setSelected(true);
            jLabel22.setVisible(false);
            jLabel23.setVisible(true);

        }
//        if (evt.getKeyCode() == 32) {
//            jLabel2.grabFocus();
//
//        }
//        if (evt.getKeyCode() == 90) {
//            jCheckBox1.setSelected(true);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
//            jTextField9.grabFocus();
//            //////////////////////////////////////////////
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
//        if (evt.getKeyCode() == 88) {
//            jCheckBox2.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
//            jTextField9.grabFocus();
////////////////////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
//        if (evt.getKeyCode() == 67) {
//            jCheckBox3.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
////            jTextField11.grabFocus();
//            /////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
//        if (evt.getKeyCode() == 86) {
//            jCheckBox4.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox5.setSelected(false);
//////            jTextField14.grabFocus();
//            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
//        if (evt.getKeyCode() == 66) {
//            jCheckBox5.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
////            jTextField17.grabFocus();
//            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
        if (evt.getKeyCode() == 65) {
            if (i == 0) {
                setworn1();
                i++;
            } else if (i == 1) {
                setworn2();
                i = 0;
                jLabel2.grabFocus();
            }
            jTextField2.setText("1");
            jTextField2.selectAll();
            jTextField1.setText("" + rowCount);
            jTextField1.selectAll();

            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox5.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
//            jTextField2.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
//        if (evt.getKeyCode() == 70) {
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(true);
//            jCheckBox3.setSelected(true);
//            jCheckBox4.setSelected(true);
//            jCheckBox5.setSelected(false);
//            jTextField9.grabFocus();
//            //////////////////////////////////////////////
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
//        if (evt.getKeyCode() == 71) {
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(true);
//            jCheckBox3.setSelected(true);
//            jCheckBox4.setSelected(true);
//            jCheckBox5.setSelected(true);
//            jTextField9.grabFocus();
//            //////////////////////////////////////////////
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
        if (evt.getKeyCode() == 72) {
            jRadioButton3.setSelected(true);

        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        int rowCount = addHorse.getRowCount();
        if (evt.getKeyCode() == 112) {
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(false);
            jLabel22.setVisible(false);
            jLabel23.setVisible(false);
            jTextField10.setText("");
        }
        if (evt.getKeyCode() == 113) {
            jCheckBox7.setSelected(true);
            jCheckBox6.setSelected(false);
            jLabel22.setVisible(true);
            jLabel23.setVisible(false);
        }
        if (evt.getKeyCode() == 114) {
            jCheckBox7.setSelected(true);
            jCheckBox6.setSelected(true);
            jLabel23.setVisible(true);
            jLabel22.setVisible(false);

        }
//        if (evt.getKeyCode() == 81) {
//            jRadioButton2.setSelected(true);
//
//            jLabel20.setVisible(false);
//
//        }
//        if (evt.getKeyCode() == 87) {
//            jRadioButton1.setSelected(true);
//            jLabel20.setVisible(true);
//
//        }
//        if (evt.getKeyCode() == 69) {
//            jRadioButton4.setSelected(true);
//            jLabel20.setVisible(false);
//
//        }
//        if (evt.getKeyCode() == 32) {
//            jLabel2.grabFocus();
//
//        }
//        if (evt.getKeyCode() == 90) {
//            jCheckBox1.setSelected(true);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
//            jTextField9.grabFocus();
//            //////////////////////////////////////////////
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
//        if (evt.getKeyCode() == 88) {
//            jCheckBox2.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
//            jTextField9.grabFocus();
////////////////////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
//        if (evt.getKeyCode() == 67) {
//            jCheckBox3.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
////            jTextField11.grabFocus();
////            /////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
//        if (evt.getKeyCode() == 86) {
//            jCheckBox4.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox5.setSelected(false);
////            jTextField14.grabFocus();
//            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
//        if (evt.getKeyCode() == 66) {
//            jCheckBox5.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
////            jTextField17.grabFocus();
//            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
        if (evt.getKeyCode() == 65) {
            if (i == 0) {
                setworn1();
                i++;
            } else if (i == 1) {
                setworn2();
                i = 0;
            }
            jTextField2.setText("1");
            jTextField2.selectAll();
            jTextField1.setText("" + rowCount);
            jTextField1.selectAll();
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox5.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jTextField2.grabFocus();
            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }
//        if (evt.getKeyCode() == 70) {
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(true);
//            jCheckBox3.setSelected(true);
//            jCheckBox4.setSelected(true);
//            jCheckBox5.setSelected(false);
//            jTextField9.grabFocus();
//            //////////////////////////////////////////////
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
//        if (evt.getKeyCode() == 71) {
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(true);
//            jCheckBox3.setSelected(true);
//            jCheckBox4.setSelected(true);
//            jCheckBox5.setSelected(true);
//            jTextField9.grabFocus();
//            //////////////////////////////////////////////
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
        if (evt.getKeyCode() == 72) {
            jRadioButton3.setSelected(true);

        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        int rowCount = addHorse.getRowCount();
        if (evt.getKeyCode() == 112) {
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(false);
            jTextField3.grabFocus();
            jTextField10.setText("");
            jLabel22.setVisible(false);
            jLabel23.setVisible(false);

        }
        if (evt.getKeyCode() == 113) {
            jCheckBox7.setSelected(true);
            jCheckBox6.setSelected(false);
            jTextField3.setText("");
            jTextField10.grabFocus();
            jLabel22.setVisible(true);
            jLabel23.setVisible(false);
        }
        if (evt.getKeyCode() == 114) {
            jCheckBox7.setSelected(true);
            jCheckBox6.setSelected(true);
            jTextField3.grabFocus();
            jLabel23.setVisible(true);
            jLabel22.setVisible(false);

        }

//        if (evt.getKeyCode() == 81) {
//            jRadioButton2.setSelected(true);
//            jLabel20.setVisible(false);
//
//        }
//        if (evt.getKeyCode() == 87) {
//            jRadioButton1.setSelected(true);
//            jLabel20.setVisible(true);
//
//        }
//        if (evt.getKeyCode() == 69) {
//            jRadioButton4.setSelected(true);
//
//            jLabel20.setVisible(false);
//
////            jCheckBox6.setSelected(false);
//        }
//        if (evt.getKeyCode() == 32) {
//            jLabel2.grabFocus();
//
//        }
//        if (evt.getKeyCode() == 72) {
//            jRadioButton3.setSelected(true);
//
//        }
//        if (evt.getKeyCode() == 90) {
//            jCheckBox1.setSelected(true);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
//            jTextField9.grabFocus();
//            //////////////////////////////////////////////
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
//        if (evt.getKeyCode() == 88) {
//            jCheckBox2.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
//            jTextField9.grabFocus();
////////////////////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
//        if (evt.getKeyCode() == 67) {
//            jCheckBox3.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox4.setSelected(false);
//            jCheckBox5.setSelected(false);
////            jTextField11.grabFocus();
//            /////////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
//        if (evt.getKeyCode() == 86) {
//            jCheckBox4.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox5.setSelected(false);
////            jTextField14.grabFocus();
//            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//
//        }
//        if (evt.getKeyCode() == 66) {
//            jCheckBox5.setSelected(true);
//            jCheckBox1.setSelected(false);
//            jCheckBox2.setSelected(false);
//            jCheckBox3.setSelected(false);
//            jCheckBox4.setSelected(false);
////            jTextField17.grabFocus();
//            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
//            jTextField6.setText("");
////            jTextField7.setText("");
////            jTextField10.setText("");
////            jTextField11.setText("");
////            jTextField12.setText("");
////            jTextField13.setText("");
////            jTextField14.setText("");
////            jTextField15.setText("");
////            jTextField16.setText("");
////            jTextField17.setText("");
////            jTextField18.setText("");
////            jTextField19.setText("");
//        }
        if (evt.getKeyCode() == 65) {
            if (i == 0) {
                setworn1();
                i++;
            } else if (i == 1) {
                setworn2();
                i = 0;
            }
            jTextField2.setText("1");
            jTextField2.selectAll();
            jTextField1.setText("" + rowCount);
            jTextField1.selectAll();
            jTextField9.setText("1");
            jTextField9.selectAll();
            jTextField8.setText("" + rowCount);
            jTextField8.selectAll();
            jCheckBox5.setSelected(false);
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jTextField2.grabFocus();

            ///////////////////////////////
//            jTextField9.setText("");
//            jTextField8.setText("");
            jTextField6.setText("");
//            jTextField7.setText("");
//            jTextField10.setText("");
//            jTextField11.setText("");
//            jTextField12.setText("");
//            jTextField13.setText("");
//            jTextField14.setText("");
//            jTextField15.setText("");
//            jTextField16.setText("");
//            jTextField17.setText("");
//            jTextField18.setText("");
//            jTextField19.setText("");
        }

    }//GEN-LAST:event_jTextField3KeyPressed

    private void jLabel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jTextField1.grabFocus();
        jTextField1.selectAll();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        if (jCheckBox7.isSelected()) {
            jTextField10.grabFocus();
        } else {
            if (jTextField3.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "This field can't Empty");
                jTextField3.grabFocus();
            } else {
                jButton8.grabFocus();
            }

        }

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton8KeyPressed
        double tot = 0;
        double temper;

        DefaultTableModel table1 = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel table6 = (DefaultTableModel) jTable6.getModel();

        if (jCheckBox6.isSelected() && !jCheckBox7.isSelected()) {
            int dd = table6.getRowCount() + 1;

            String num = "";
            String textFieldName = "";
            if (jCheckBox6.isSelected()) {
                num = "Win";
            }
            Vector v = new Vector();
            v.add(dd);

            v.add(jTextField2.getText());
            v.add(jTextField1.getText());
            v.add(jTextField3.getText());
            v.add(num);
            table6.addRow(v);
            Calculations cl = new Calculations();
            maxLesCommision += cl.passToLessCommision(Double.parseDouble(jTextField3.getText()));
            jTextField172.setText("" + maxLesCommision);
            String type = null;
            int y = table6.getRowCount();
            for (int i = 0; i < y; i++) {
                String value = table6.getValueAt(i, 3).toString();
                type = table6.getValueAt(i, 2).toString();
                temper = Double.parseDouble(value);

                tot = tot + temper;
            }
            jTextField89.setText("" + tot);

            int ddd = table6.getRowCount();

            int Start = Integer.parseInt(jTextField2.getText());
            Start--;
            int End = Integer.parseInt(jTextField1.getText());
            int ARowSize = (Start * 23) + 45;
            int AEndLenght = 200 - (48 + (table6.getRowCount() * 4));
            int BRowSize = (End * 23) + 41;
            int BEndLenght = 200 - (48 + (table6.getRowCount() * 4));
            for (int j = 0; j < (OverLap.size() / 2); j++) {
                if (OverLap.get(j).equals(ARowSize)) {
                    ARowSize += 2;
                }
                if (OverLap.get(j).equals(BRowSize)) {
                    BRowSize -= 2;
                }
            }

            String ColorName = COLORS[SetColour];
            StyleSheet s = new StyleSheet();
            Color LineColor = s.stringToColor(ColorName);
            int Cy = ((BRowSize - ARowSize) / 2);
            int CY = ARowSize + Cy + ArrorDevedeIncrement;
            passNew(200, ARowSize, AEndLenght, ARowSize, LineColor);
            passNew(200, BRowSize, BEndLenght, BRowSize, LineColor);
            passNew(AEndLenght, ARowSize, BEndLenght, BRowSize, LineColor);

            StringBuffer sb1 = new StringBuffer();
            sb1.append(200);
            int val[];

            int nocolorline = 0;
            if (CY >= 57 && CY <= 71) {
                jTextField44.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                textFieldName = "44";
                nocolorline = BEndLenght - 30;
            } else if (CY >= 72 && CY <= 76) {
                jTextField56.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "56";
            } else if (CY >= 77 && CY <= 91) {
                jTextField42.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "42";
            } else if (CY >= 92 && CY <= 96) {
                jTextField57.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "57";
            } else if (CY >= 97 && CY <= 111) {
                jTextField45.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "45";
            } else if (CY >= 112 && CY <= 116) {
                jTextField58.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "58";
            } else if (CY >= 117 && CY <= 131) {
                jTextField4.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "4";
            } else if (CY >= 132 && CY <= 136) {
                jTextField59.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "59";
            } else if (CY >= 137 && CY <= 151) {
                jTextField49.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "49";
            } else if (CY >= 152 && CY <= 156) {
                jTextField60.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "60";
            } else if (CY >= 157 && CY <= 171) {
                jTextField50.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "50";
            } else if (CY >= 172 && CY <= 176) {
                jTextField61.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "61";
            } else if (CY >= 177 && CY <= 191) {
                jTextField52.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "52";
            } else if (CY >= 192 && CY <= 196) {
                jTextField62.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "62";
            } else if (CY >= 197 && CY <= 211) {
                jTextField53.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "53";
            } else if (CY >= 212 && CY <= 216) {
                jTextField63.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "63";
            } else if (CY >= 217 && CY <= 231) {
                jTextField54.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "54";
            } else if (CY >= 232 && CY <= 236) {
                jTextField86.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "86";
            } else if (CY >= 237 && CY <= 251) {
                jTextField39.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "39";
            } else if (CY >= 252 && CY <= 256) {
                jTextField85.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "73";
            } else if (CY >= 257 && CY <= 271) {
                jTextField73.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "44";
            } else if (CY >= 272 && CY <= 276) {
                jTextField84.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "84";
            } else if (CY >= 277 && CY <= 291) {
                jTextField71.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "71";
            } else if (CY >= 292 && CY <= 296) {
                jTextField82.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "82";
            } else if (CY >= 297 && CY <= 311) {
                jTextField70.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "70";
            } else if (CY >= 312 && CY <= 316) {
                jTextField81.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "81";
            } else if (CY >= 317 && CY <= 331) {
                jTextField68.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "68";
            } else if (CY >= 332 && CY <= 336) {
                jTextField80.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "80";
            } else if (CY >= 337 && CY <= 351) {
                jTextField67.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "67";
            } else if (CY >= 352 && CY <= 356) {
                jTextField97.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "97";
            } else if (CY >= 357 && CY <= 371) {
                jTextField66.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "66";
            } else if (CY >= 372 && CY <= 376) {
                jTextField79.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "79";
            } else if (CY >= 377 && CY <= 391) {
                jTextField102.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "102";
            } else if (CY >= 392 && CY <= 396) {
                jTextField83.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "83";
            } else if (CY >= 397 && CY <= 411) {
                jTextField101.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "101";
            } else if (CY >= 412 && CY <= 416) {
                jTextField103.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "103";
            } else if (CY >= 417 && CY <= 431) {
                jTextField100.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "100";
            } else if (CY >= 432 && CY <= 436) {
                jTextField104.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "104";
            } else if (CY >= 437 && CY <= 451) {
                jTextField99.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "99";
            } else if (CY >= 452 && CY <= 456) {
                jTextField105.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "105";
            } else if (CY >= 457 && CY <= 471) {
                jTextField98.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "98";
            } else if (CY >= 472 && CY <= 476) {
                jTextField106.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 70, CY, LineColor);
                nocolorline = BEndLenght - 70;
                textFieldName = "106";
            } else if (CY >= 477 && CY <= 491) {
                jTextField72.setText(jTextField3.getText());
                passNew(BEndLenght, CY, BEndLenght - 30, CY, LineColor);
                nocolorline = BEndLenght - 30;
                textFieldName = "72";
            }

            op.passPixels(dd, ARowSize, AEndLenght, BRowSize, BEndLenght, nocolorline, CY, textFieldName);

            OverLap.add(ARowSize);
            OverLap.add(BRowSize);
            if (SetColour == 5) {
                SetColour = 0;
            } else {
                SetColour += 1;
            }
            ////
            if (jTextField78.getText().equals("")) {
                totdouble = 0;
            } else {
                totdouble = Double.parseDouble(jTextField78.getText());
            }
            if (jTextField87.getText().equals("")) {
                tottrible = 0;
            } else {
                tottrible = Double.parseDouble(jTextField87.getText());
            }
            if (jTextField77.getText().equals("")) {
                totq = 0;
            } else {
                totq = Double.parseDouble(jTextField77.getText());
            }
            if (jTextField88.getText().equals("")) {
                totqq = 0;
            } else {
                totqq = Double.parseDouble(jTextField88.getText());
            }
            if (jTextField89.getText().equals("")) {
                brackets = 0;
            } else {
                brackets = Double.parseDouble(jTextField89.getText());
            }

            Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
            jLabel39.setText("" + Investment);
            jTextField2.grabFocus();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            ArrorDevedeIncrement++;
        } else if (!jCheckBox6.isSelected() && jCheckBox7.isSelected()) {
            int dd = table6.getRowCount() + 1;

            String num = "";
            String textFieldName = "";
            if (jCheckBox7.isSelected()) {
                num = "Place";
            }
            Vector v = new Vector();
            v.add(dd);

            v.add(jTextField2.getText());
            v.add(jTextField1.getText());
            v.add(jTextField10.getText());
            v.add(num);
            table6.addRow(v);

            int y = table6.getRowCount();
            for (int i = 0; i < y; i++) {
                String value = table6.getValueAt(i, 3).toString();
                temper = Double.parseDouble(value);

                tot = tot + temper;
            }
            jTextField89.setText("" + tot);

            int Start = Integer.parseInt(jTextField2.getText());
            Start--;
            int End = Integer.parseInt(jTextField1.getText());

            int ARowSize = (Start * 23) + 45;
            int AEndLenght = 415 + (table6.getRowCount() * 5);

            int BRowSize = (End * 23) + 45;
            int BEndLenght = 415 + (table6.getRowCount() * 5);

            for (int j = 0; j < (OverLap.size() / 2); j++) {

                if (OverLap.get(j).equals(ARowSize)) {
                    ARowSize += 2;
                }
                if (OverLap.get(j).equals(BRowSize)) {
                    BRowSize -= 2;
                }

            }

            String ColorName = COLORS[SetColour];

            StyleSheet s = new StyleSheet();
            Color LineColor = s.stringToColor(ColorName);

            int Cy = ((BRowSize - ARowSize) / 2);
            int CY = ARowSize + Cy;

            passNew(370, ARowSize, AEndLenght, ARowSize, LineColor);
            passNew(370, BRowSize, BEndLenght, BRowSize, LineColor);
            passNew(AEndLenght, ARowSize, BEndLenght, BRowSize, LineColor);

            OverLap.add(ARowSize);
            OverLap.add(BRowSize);

            if (SetColour == 5) {
                SetColour = 0;
            } else {
                SetColour += 1;
            }
            int nocolorline = 0;
            if (CY >= 57 && CY <= 71) {
                jTextField129.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "129";
            } else if (CY >= 72 && CY <= 76) {
                jTextField151.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "151";
            } else if (CY >= 77 && CY <= 91) {
                jTextField130.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "130";
            } else if (CY >= 92 && CY <= 96) {
                jTextField152.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "152";
            } else if (CY >= 97 && CY <= 111) {
                jTextField131.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "131";
            } else if (CY >= 112 && CY <= 116) {
                jTextField153.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "153";
            } else if (CY >= 117 && CY <= 131) {
                jTextField132.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "132";
            } else if (CY >= 132 && CY <= 136) {
                jTextField154.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "154";
            } else if (CY >= 137 && CY <= 151) {
                jTextField133.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "133";
            } else if (CY >= 152 && CY <= 156) {
                jTextField155.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "155";
            } else if (CY >= 157 && CY <= 171) {
                jTextField134.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "134";
            } else if (CY >= 172 && CY <= 176) {
                jTextField156.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "156";
            } else if (CY >= 177 && CY <= 191) {
                jTextField135.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "135";
            } else if (CY >= 192 && CY <= 196) {
                jTextField157.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "157";
            } else if (CY >= 197 && CY <= 211) {
                jTextField136.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "136";
            } else if (CY >= 212 && CY <= 216) {
                jTextField158.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "158";
            } else if (CY >= 217 && CY <= 231) {
                jTextField137.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "137";
            } else if (CY >= 232 && CY <= 236) {
                jTextField159.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "159";
            } else if (CY >= 237 && CY <= 251) {
                jTextField138.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "138";
            } else if (CY >= 252 && CY <= 256) {
                jTextField160.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "160";
            } else if (CY >= 257 && CY <= 271) {
                jTextField139.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "139";
            } else if (CY >= 272 && CY <= 276) {
                jTextField161.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "161";
            } else if (CY >= 277 && CY <= 291) {
                jTextField140.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "140";
            } else if (CY >= 292 && CY <= 296) {
                jTextField162.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "162";
            } else if (CY >= 297 && CY <= 311) {
                jTextField141.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "141";
            } else if (CY >= 312 && CY <= 316) {
                jTextField163.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "163";
            } else if (CY >= 317 && CY <= 331) {
                jTextField142.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "142";
            } else if (CY >= 332 && CY <= 336) {
                jTextField164.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "164";
            } else if (CY >= 337 && CY <= 351) {
                jTextField143.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "143";
            } else if (CY >= 352 && CY <= 356) {
                jTextField165.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "165";
            } else if (CY >= 357 && CY <= 371) {
                jTextField144.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "144";
            } else if (CY >= 372 && CY <= 376) {
                jTextField166.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "166";
            } else if (CY >= 377 && CY <= 391) {
                jTextField145.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "145";
            } else if (CY >= 392 && CY <= 396) {
                jTextField167.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "167";
            } else if (CY >= 397 && CY <= 411) {
                jTextField146.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "146";
            } else if (CY >= 412 && CY <= 416) {
                jTextField168.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "168";
            } else if (CY >= 417 && CY <= 431) {
                jTextField147.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "147";
            } else if (CY >= 432 && CY <= 436) {
                jTextField169.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "169";
            } else if (CY >= 437 && CY <= 451) {
                jTextField148.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "148";
            } else if (CY >= 452 && CY <= 456) {
                jTextField170.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "170";
            } else if (CY >= 457 && CY <= 471) {
                jTextField149.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "149";
            } else if (CY >= 472 && CY <= 476) {
                jTextField171.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "171";
            } else if (CY >= 477 && CY <= 491) {
                jTextField150.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "150";
            }

            op.passPixels(dd, ARowSize, AEndLenght, BRowSize, BEndLenght, nocolorline, CY, textFieldName);
            //

            if (jTextField78.getText().equals("")) {
                totdouble = 0;
            } else {
                totdouble = Double.parseDouble(jTextField78.getText());
            }
            if (jTextField87.getText().equals("")) {
                tottrible = 0;
            } else {
                tottrible = Double.parseDouble(jTextField87.getText());
            }
            if (jTextField77.getText().equals("")) {
                totq = 0;
            } else {
                totq = Double.parseDouble(jTextField77.getText());
            }
            if (jTextField88.getText().equals("")) {
                totqq = 0;
            } else {
                totqq = Double.parseDouble(jTextField88.getText());
            }
            if (jTextField89.getText().equals("")) {
                brackets = 0;
            } else {
                brackets = Double.parseDouble(jTextField89.getText());
            }

            Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
            jLabel39.setText("" + Investment);
            jTextField2.grabFocus();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");

        } else if (jCheckBox6.isSelected() && jCheckBox7.isSelected()) {
            int dd = table6.getRowCount() + 1;
            String num = "";
            String num2 = "";
            String textFieldName = "";
            if (jCheckBox6.isSelected()) {
                num = "Win";
                Vector v = new Vector();
                v.add(dd);

                v.add(jTextField2.getText());
                v.add(jTextField1.getText());
                v.add(jTextField3.getText());
                v.add(num);
                table6.addRow(v);
            }
            Calculations cl = new Calculations();
            maxLesCommision += cl.passToLessCommision(Double.parseDouble(jTextField3.getText()));
            jTextField172.setText("" + maxLesCommision);
            dd++;
            if (jCheckBox7.isSelected()) {
                num2 = "Place";
                Vector v = new Vector();
                v.add(dd);

                v.add(jTextField2.getText());
                v.add(jTextField1.getText());
                v.add(jTextField10.getText());
                v.add(num2);
                table6.addRow(v);

            }

            int y = table6.getRowCount();
            for (int i = 0; i < y; i++) {
                String value = table6.getValueAt(i, 3).toString();
                temper = Double.parseDouble(value);

                tot = tot + temper;
            }
            double bracketinwp = Double.parseDouble(jTextField3.getText());
            double win_place = tot + bracketinwp;
            System.out.println(" win and place :" + tot);
            System.out.println(" win and place !:" + bracketinwp);
            jTextField89.setText("" + tot);

            int StartWin = Integer.parseInt(jTextField2.getText());
            StartWin--;
            int EndWin = Integer.parseInt(jTextField1.getText());

            int ARowSizeWin = (StartWin * 23) + 45;
            int AEndLenghtWin = 200 - (48 + (table6.getRowCount() * 5));

            int BRowSizeWin = (EndWin * 23) + 41;
            int BEndLenghtWin = 200 - (48 + (table6.getRowCount() * 5));

            for (int j = 0; j < (OverLap.size() / 2); j++) {
                if (OverLap.get(j).equals(ARowSizeWin)) {
                    ARowSizeWin += 2;
                }
                if (OverLap.get(j).equals(BRowSizeWin)) {
                    BRowSizeWin -= 2;
                }

            }

            /////////////////////////////////////////////////////////////////////
            String ColorName = COLORS[SetColour];

            StyleSheet s = new StyleSheet();
            Color LineColor = s.stringToColor(ColorName);

            int CyWin = ((BRowSizeWin - ARowSizeWin) / 2);
            int CYWin = ARowSizeWin + CyWin;

            passNew(200, ARowSizeWin, AEndLenghtWin, ARowSizeWin, LineColor);
            passNew(200, BRowSizeWin, BEndLenghtWin, BRowSizeWin, LineColor);
            passNew(AEndLenghtWin, ARowSizeWin, BEndLenghtWin, BRowSizeWin, LineColor);
            passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 15, CYWin, LineColor);

            OverLap.add(ARowSizeWin);
            OverLap.add(BRowSizeWin);

            ////////////////////////////////////////////////////////////////////
            int nocolorline = 0;
            if (CYWin >= 57 && CYWin <= 71) {
                jTextField44.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "44";
            } else if (CYWin >= 72 && CYWin <= 76) {
                jTextField56.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "56";
            } else if (CYWin >= 77 && CYWin <= 91) {
                jTextField42.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "42";
            } else if (CYWin >= 92 && CYWin <= 96) {
                jTextField57.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "57";
            } else if (CYWin >= 97 && CYWin <= 111) {
                jTextField45.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "45";
            } else if (CYWin >= 112 && CYWin <= 116) {
                jTextField58.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "58";
            } else if (CYWin >= 117 && CYWin <= 131) {
                jTextField4.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "4";
            } else if (CYWin >= 132 && CYWin <= 136) {
                jTextField59.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "59";
            } else if (CYWin >= 137 && CYWin <= 151) {
                jTextField49.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "49";
            } else if (CYWin >= 152 && CYWin <= 156) {
                jTextField60.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "60";
            } else if (CYWin >= 157 && CYWin <= 171) {
                jTextField50.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "50";
            } else if (CYWin >= 172 && CYWin <= 176) {
                jTextField61.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "61";
            } else if (CYWin >= 177 && CYWin <= 191) {
                jTextField52.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "52";
            } else if (CYWin >= 192 && CYWin <= 196) {
                jTextField62.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "62";
            } else if (CYWin >= 197 && CYWin <= 211) {
                jTextField53.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "53";
            } else if (CYWin >= 212 && CYWin <= 216) {
                jTextField63.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "63";
            } else if (CYWin >= 217 && CYWin <= 231) {
                jTextField54.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "54";
            } else if (CYWin >= 232 && CYWin <= 236) {
                jTextField86.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "86";
            } else if (CYWin >= 237 && CYWin <= 251) {
                jTextField39.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "39";
            } else if (CYWin >= 252 && CYWin <= 256) {
                jTextField85.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "85";
            } else if (CYWin >= 257 && CYWin <= 271) {
                jTextField73.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "73";
            } else if (CYWin >= 272 && CYWin <= 276) {
                jTextField84.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "84";
            } else if (CYWin >= 277 && CYWin <= 291) {
                jTextField71.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "71";
            } else if (CYWin >= 292 && CYWin <= 296) {
                jTextField82.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "82";
            } else if (CYWin >= 297 && CYWin <= 311) {
                jTextField70.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "70";
            } else if (CYWin >= 312 && CYWin <= 316) {
                jTextField81.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "81";
            } else if (CYWin >= 317 && CYWin <= 331) {
                jTextField68.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "68";
            } else if (CYWin >= 332 && CYWin <= 336) {
                jTextField80.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "80";
            } else if (CYWin >= 337 && CYWin <= 351) {
                jTextField67.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "67";
            } else if (CYWin >= 352 && CYWin <= 356) {
                jTextField97.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "97";
            } else if (CYWin >= 357 && CYWin <= 371) {
                jTextField66.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "66";
            } else if (CYWin >= 372 && CYWin <= 376) {
                jTextField79.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "79";
            } else if (CYWin >= 377 && CYWin <= 391) {
                jTextField102.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "102";
            } else if (CYWin >= 392 && CYWin <= 396) {
                jTextField83.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "83";
            } else if (CYWin >= 397 && CYWin <= 411) {
                jTextField101.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "101";
            } else if (CYWin >= 412 && CYWin <= 416) {
                jTextField103.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "103";
            } else if (CYWin >= 417 && CYWin <= 431) {
                jTextField100.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "100";
            } else if (CYWin >= 432 && CYWin <= 436) {
                jTextField104.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "104";
            } else if (CYWin >= 437 && CYWin <= 451) {
                jTextField99.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "99";
            } else if (CYWin >= 452 && CYWin <= 456) {
                jTextField105.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "105";
            } else if (CYWin >= 457 && CYWin <= 471) {
                jTextField98.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "98";
            } else if (CYWin >= 472 && CYWin <= 476) {
                jTextField106.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 70, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 70;
                textFieldName = "106";
            } else if (CYWin >= 477 && CYWin <= 491) {
                jTextField72.setText(jTextField3.getText());
                passNew(BEndLenghtWin, CYWin, BEndLenghtWin - 30, CYWin, LineColor);
                nocolorline = BEndLenghtWin - 30;
                textFieldName = "72";
            }
//            op.passPixels(dd, ARowSizeWin, AEndLenghtWin, BRowSizeWin, BEndLenghtWin, nocolorline, CYWin, textFieldName);
            /////////////////////////////////////////////////////////////////////
            if (SetColour == 5) {
                SetColour = 0;
            } else {
                SetColour += 1;
            }
            if (jTextField78.getText().equals("")) {
                totdouble = 0;
            } else {
                totdouble = Double.parseDouble(jTextField78.getText());
            }
            if (jTextField87.getText().equals("")) {
                tottrible = 0;
            } else {
                tottrible = Double.parseDouble(jTextField87.getText());
            }
            if (jTextField77.getText().equals("")) {
                totq = 0;
            } else {
                totq = Double.parseDouble(jTextField77.getText());
            }
            if (jTextField88.getText().equals("")) {
                totqq = 0;
            } else {
                totqq = Double.parseDouble(jTextField88.getText());
            }
            if (jTextField89.getText().equals("")) {
                brackets = 0;
            } else {
                brackets = Double.parseDouble(jTextField89.getText());
            }

            ////////////////////////////////////////////////////
            int Start = Integer.parseInt(jTextField2.getText());
            Start--;
            int End = Integer.parseInt(jTextField1.getText());

            int ARowSize = (Start * 23) + 45;
            int AEndLenght = 415 + (table6.getRowCount() * 5);

            int BRowSize = (End * 23) + 45;
            int BEndLenght = 415 + (table6.getRowCount() * 5);

            for (int j = 0; j < (OverLap.size() / 2); j++) {

                if (OverLap.get(j).equals(ARowSize)) {
                    ARowSize += 2;
                }
                if (OverLap.get(j).equals(BRowSize)) {
                    BRowSize -= 2;
                }

            }
            int Cy = ((BRowSize - ARowSize) / 2);
            int CY = ARowSize + Cy;

            passNew(370, ARowSize, AEndLenght, ARowSize, LineColor);
            passNew(370, BRowSize, BEndLenght, BRowSize, LineColor);
            passNew(AEndLenght, ARowSize, BEndLenght, BRowSize, LineColor);
//            passNew(BEndLenght, CY, BEndLenght + 15, CY, LineColor);

            OverLap.add(ARowSize);
            OverLap.add(BRowSize);
            if (CY >= 57 && CY <= 71) {
                jTextField129.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "129";
            } else if (CY >= 72 && CY <= 76) {
                jTextField151.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "151";
            } else if (CY >= 77 && CY <= 91) {
                jTextField130.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "130";
            } else if (CY >= 92 && CY <= 96) {
                jTextField152.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "152";
            } else if (CY >= 97 && CY <= 111) {
                jTextField131.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "131";
            } else if (CY >= 112 && CY <= 116) {
                jTextField153.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "153";
            } else if (CY >= 117 && CY <= 131) {
                jTextField132.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "132";
            } else if (CY >= 132 && CY <= 136) {
                jTextField154.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "154";
            } else if (CY >= 137 && CY <= 151) {
                jTextField133.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "133";
            } else if (CY >= 152 && CY <= 156) {
                jTextField155.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "155";
            } else if (CY >= 157 && CY <= 171) {
                jTextField134.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "134";
            } else if (CY >= 172 && CY <= 176) {
                jTextField156.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "156";
            } else if (CY >= 177 && CY <= 191) {
                jTextField135.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "135";
            } else if (CY >= 192 && CY <= 196) {
                jTextField157.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "157";
            } else if (CY >= 197 && CY <= 211) {
                jTextField136.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 50, CY, LineColor);
                nocolorline = BEndLenght + 50;
                textFieldName = "136";
            } else if (CY >= 212 && CY <= 216) {
                jTextField158.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "158";
            } else if (CY >= 217 && CY <= 231) {
                jTextField137.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "137";
            } else if (CY >= 232 && CY <= 236) {
                jTextField159.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "159";
            } else if (CY >= 237 && CY <= 251) {
                jTextField138.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "138";
            } else if (CY >= 252 && CY <= 256) {
                jTextField160.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "160";
            } else if (CY >= 257 && CY <= 271) {
                jTextField139.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "139";
            } else if (CY >= 272 && CY <= 276) {
                jTextField161.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "161";
            } else if (CY >= 277 && CY <= 291) {
                jTextField140.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "140";
            } else if (CY >= 292 && CY <= 296) {
                jTextField162.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "162";
            } else if (CY >= 297 && CY <= 311) {
                jTextField141.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "141";
            } else if (CY >= 312 && CY <= 316) {
                jTextField163.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "163";
            } else if (CY >= 317 && CY <= 331) {
                jTextField142.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "142";
            } else if (CY >= 332 && CY <= 336) {
                jTextField164.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "164";
            } else if (CY >= 337 && CY <= 351) {
                jTextField143.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "143";
            } else if (CY >= 352 && CY <= 356) {
                jTextField165.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "165";
            } else if (CY >= 357 && CY <= 371) {
                jTextField144.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "144";
            } else if (CY >= 372 && CY <= 376) {
                jTextField166.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "166";
            } else if (CY >= 377 && CY <= 391) {
                jTextField145.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "145";
            } else if (CY >= 392 && CY <= 396) {
                jTextField167.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "167";
            } else if (CY >= 397 && CY <= 411) {
                jTextField146.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "146";
            } else if (CY >= 412 && CY <= 416) {
                jTextField168.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "168";
            } else if (CY >= 417 && CY <= 431) {
                jTextField147.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "147";
            } else if (CY >= 432 && CY <= 436) {
                jTextField169.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "169";
            } else if (CY >= 437 && CY <= 451) {
                jTextField148.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "148";
            } else if (CY >= 452 && CY <= 456) {
                jTextField170.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "170";
            } else if (CY >= 457 && CY <= 471) {
                jTextField149.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "149";
            } else if (CY >= 472 && CY <= 476) {
                jTextField171.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 70, CY, LineColor);
                nocolorline = BEndLenght + 70;
                textFieldName = "171";
            } else if (CY >= 477 && CY <= 491) {
                jTextField150.setText(jTextField10.getText());
                passNew(BEndLenght, CY, BEndLenght + 30, CY, LineColor);
                nocolorline = BEndLenght + 30;
                textFieldName = "150";
            }
            op.passPixelsWinAndPlace(dd, ARowSize, AEndLenght, BRowSize, BEndLenght, nocolorline, CY, textFieldName, ARowSizeWin, AEndLenghtWin, BRowSizeWin, BEndLenghtWin, CYWin);
            if (SetColour == 5) {
                SetColour = 0;
            } else {
                SetColour += 1;
            }

            ////
            if (jTextField78.getText().equals("")) {
                totdouble = 0;
            } else {
                totdouble = Double.parseDouble(jTextField78.getText());
            }
            if (jTextField87.getText().equals("")) {
                tottrible = 0;
            } else {
                tottrible = Double.parseDouble(jTextField87.getText());
            }
            if (jTextField77.getText().equals("")) {
                totq = 0;
            } else {
                totq = Double.parseDouble(jTextField77.getText());
            }
            if (jTextField88.getText().equals("")) {
                totqq = 0;
            } else {
                totqq = Double.parseDouble(jTextField88.getText());
            }
            if (jTextField89.getText().equals("")) {
                brackets = 0;
            } else {
                brackets = Double.parseDouble(jTextField89.getText());
            }

            Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
            jLabel39.setText("" + Investment);
            jTextField2.grabFocus();
            jTextField2.selectAll();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField10.setText("");
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(false);
            jLabel22.setVisible(false);
            jLabel23.setVisible(false);

        }
    }//GEN-LAST:event_jButton8KeyPressed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed

        if (jCheckBox1.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected() && !jCheckBox4.isSelected() && !jCheckBox5.isSelected()) {
            double tot = 0;
            double temper;
            DefaultTableModel tb2 = (DefaultTableModel) jTable2.getModel();
            int start = Integer.parseInt(jTextField9.getText());
            end = Integer.parseInt(jTextField8.getText());
            String s = "";
            if (jRadioButton2.isSelected()) {
                jLabel20.setVisible(false);
                s = "W";
            } else if (jRadioButton1.isSelected()) {
                jLabel20.setVisible(true);
                s = "P";
            } else if (jRadioButton4.isSelected()) {
                jLabel20.setVisible(false);
                s = "W/P";
            }
            if (jRadioButton3.isSelected()) {
                for (int i = 0; i < end - (start - 1); i++) {
                    Vector v = new Vector();
                    v.add(jCheckBox1.getText());
                    v.add(singleitem);
                    v.add(i + 1);
                    v.add(0);
                    v.add(jTextField6.getText());
                    v.add(jTextField6.getText());
                    v.add(s);
                    tb2.addRow(v);
                    singleitem++;
                    if (jRadioButton2.isSelected()) {
                        if (i == 0) {

                            jTextField38.setText(jTextField6.getText());
                            if (jTextField38.getText().equals("")) {
                                one = 0;
                            } else {
                                one = Double.parseDouble(jTextField38.getText());
                            }
                        } else if (i == 1) {
                            jTextField5.setText(jTextField6.getText());
                            if (jTextField5.getText().equals("")) {
                                two = 0;
                            } else {
                                two = Double.parseDouble(jTextField5.getText());
                            }

                        } else if (i == 2) {
                            jTextField20.setText(jTextField6.getText());
                            if (jTextField20.getText().equals("")) {
                                three = 0;
                            } else {
                                three = Double.parseDouble(jTextField20.getText());
                            }

                        } else if (i == 3) {
                            jTextField21.setText(jTextField6.getText());
                            if (jTextField21.getText().equals("")) {
                                four = 0;
                            } else {
                                four = Double.parseDouble(jTextField21.getText());
                            }

                        } else if (i == 4) {
                            jTextField24.setText(jTextField6.getText());
                            if (jTextField24.getText().equals("")) {
                                five = 0;
                            } else {
                                five = Double.parseDouble(jTextField24.getText());
                            }

                        } else if (i == 5) {
                            jTextField23.setText(jTextField6.getText());
                            if (jTextField23.getText().equals("")) {
                                six = 0;
                            } else {
                                six = Double.parseDouble(jTextField23.getText());
                            }

                        } else if (i == 6) {
                            jTextField22.setText(jTextField6.getText());
                            if (jTextField22.getText().equals("")) {
                                seven = 0;
                            } else {
                                seven = Double.parseDouble(jTextField22.getText());
                            }

                        } else if (i == 7) {
                            jTextField25.setText(jTextField6.getText());
                            if (jTextField25.getText().equals("")) {
                                eight = 0;
                            } else {
                                eight = Double.parseDouble(jTextField25.getText());
                            }

                        } else if (i == 8) {
                            jTextField26.setText(jTextField6.getText());
                            if (jTextField26.getText().equals("")) {
                                nine = 0;
                            } else {
                                nine = Double.parseDouble(jTextField26.getText());
                            }

                        } else if (i == 9) {
                            jTextField27.setText(jTextField6.getText());
                            if (jTextField27.getText().equals("")) {
                                ten = 0;
                            } else {
                                ten = Double.parseDouble(jTextField27.getText());
                            }

                        } else if (i == 10) {
                            jTextField28.setText(jTextField6.getText());
                            if (jTextField28.getText().equals("")) {
                                eleven = 0;
                            } else {
                                eleven = Double.parseDouble(jTextField28.getText());
                            }

                        } else if (i == 11) {
                            jTextField29.setText(jTextField6.getText());
                            if (jTextField29.getText().equals("")) {
                                twelve = 0;
                            } else {
                                twelve = Double.parseDouble(jTextField29.getText());
                            }

                        } else if (i == 12) {
                            jTextField30.setText(jTextField6.getText());
                            if (jTextField30.getText().equals("")) {
                                thirteen = 0;
                            } else {
                                thirteen = Double.parseDouble(jTextField30.getText());
                            }

                        } else if (i == 13) {
                            jTextField31.setText(jTextField6.getText());
                            if (jTextField31.getText().equals("")) {
                                fourteen = 0;
                            } else {
                                fourteen = Double.parseDouble(jTextField31.getText());
                            }

                        } else if (i == 14) {
                            jTextField32.setText(jTextField6.getText());
                            if (jTextField32.getText().equals("")) {
                                fifteen = 0;
                            } else {
                                fifteen = Double.parseDouble(jTextField32.getText());
                            }

                        } else if (i == 15) {
                            jTextField33.setText(jTextField6.getText());
                            if (jTextField33.getText().equals("")) {
                                sixteen = 0;
                            } else {
                                sixteen = Double.parseDouble(jTextField33.getText());
                            }

                        } else if (i == 16) {
                            jTextField34.setText(jTextField6.getText());
                            if (jTextField34.getText().equals("")) {
                                seventeen = 0;
                            } else {
                                seventeen = Double.parseDouble(jTextField34.getText());
                            }

                        } else if (i == 17) {
                            jTextField35.setText(jTextField6.getText());
                            if (jTextField35.getText().equals("")) {
                                eighteen = 0;
                            } else {
                                eighteen = Double.parseDouble(jTextField35.getText());
                            }

                        } else if (i == 18) {
                            jTextField36.setText(jTextField6.getText());
                            if (jTextField36.getText().equals("")) {
                                nineteen = 0;
                            } else {
                                nineteen = Double.parseDouble(jTextField36.getText());
                            }

                        } else if (i == 19) {
                            jTextField37.setText(jTextField6.getText());
                            if (jTextField34.getText().equals("")) {
                                twenty = 0;
                            } else {
                                twenty = Double.parseDouble(jTextField34.getText());
                            }
                        }
                    } else if (jRadioButton1.isSelected()) {
                        if (i == 0) {
                            jTextField40.setText(jTextField6.getText());

                            if (jTextField40.getText().equals("")) {
                                one = 0;
                            } else {
                                one = Double.parseDouble(jTextField40.getText());
                            }
                        } else if (i == 1) {
                            jTextField41.setText(jTextField6.getText());
                            if (jTextField41.getText().equals("")) {
                                two = 0;
                            } else {
                                two = Double.parseDouble(jTextField41.getText());
                            }

                        } else if (i == 2) {
                            jTextField43.setText(jTextField6.getText());
                            if (jTextField43.getText().equals("")) {
                                three = 0;
                            } else {
                                three = Double.parseDouble(jTextField43.getText());
                            }

                        } else if (i == 3) {
                            jTextField46.setText(jTextField6.getText());
                            if (jTextField46.getText().equals("")) {
                                four = 0;
                            } else {
                                four = Double.parseDouble(jTextField46.getText());
                            }

                        } else if (i == 4) {
                            jTextField47.setText(jTextField6.getText());
                            if (jTextField47.getText().equals("")) {
                                five = 0;
                            } else {
                                five = Double.parseDouble(jTextField47.getText());
                            }

                        } else if (i == 5) {
                            jTextField48.setText(jTextField6.getText());
                            if (jTextField48.getText().equals("")) {
                                six = 0;
                            } else {
                                six = Double.parseDouble(jTextField48.getText());
                            }

                        } else if (i == 6) {
                            jTextField51.setText(jTextField6.getText());
                            if (jTextField51.getText().equals("")) {
                                seven = 0;
                            } else {
                                seven = Double.parseDouble(jTextField51.getText());
                            }

                        } else if (i == 7) {
                            jTextField55.setText(jTextField6.getText());
                            if (jTextField55.getText().equals("")) {
                                eight = 0;
                            } else {
                                eight = Double.parseDouble(jTextField55.getText());
                            }

                        } else if (i == 8) {
                            jTextField114.setText(jTextField6.getText());
                            if (jTextField114.getText().equals("")) {
                                nine = 0;
                            } else {
                                nine = Double.parseDouble(jTextField114.getText());
                            }

                        } else if (i == 9) {
                            jTextField115.setText(jTextField6.getText());
                            if (jTextField115.getText().equals("")) {
                                ten = 0;
                            } else {
                                ten = Double.parseDouble(jTextField115.getText());
                            }

                        } else if (i == 10) {
                            jTextField116.setText(jTextField6.getText());
                            if (jTextField116.getText().equals("")) {
                                eleven = 0;
                            } else {
                                eleven = Double.parseDouble(jTextField116.getText());
                            }

                        } else if (i == 11) {
                            jTextField120.setText(jTextField6.getText());
                            if (jTextField120.getText().equals("")) {
                                twelve = 0;
                            } else {
                                twelve = Double.parseDouble(jTextField120.getText());
                            }

                        } else if (i == 12) {
                            jTextField121.setText(jTextField6.getText());
                            if (jTextField121.getText().equals("")) {
                                thirteen = 0;
                            } else {
                                thirteen = Double.parseDouble(jTextField121.getText());
                            }

                        } else if (i == 13) {
                            jTextField122.setText(jTextField6.getText());
                            if (jTextField122.getText().equals("")) {
                                fourteen = 0;
                            } else {
                                fourteen = Double.parseDouble(jTextField122.getText());
                            }

                        } else if (i == 14) {
                            jTextField123.setText(jTextField6.getText());
                            if (jTextField123.getText().equals("")) {
                                fifteen = 0;
                            } else {
                                fifteen = Double.parseDouble(jTextField123.getText());
                            }

                        } else if (i == 15) {
                            jTextField124.setText(jTextField6.getText());
                            if (jTextField124.getText().equals("")) {
                                sixteen = 0;
                            } else {
                                sixteen = Double.parseDouble(jTextField124.getText());
                            }

                        } else if (i == 16) {
                            jTextField125.setText(jTextField6.getText());
                            if (jTextField125.getText().equals("")) {
                                seventeen = 0;
                            } else {
                                seventeen = Double.parseDouble(jTextField125.getText());
                            }

                        } else if (i == 17) {
                            jTextField126.setText(jTextField6.getText());
                            if (jTextField126.getText().equals("")) {
                                eighteen = 0;
                            } else {
                                eighteen = Double.parseDouble(jTextField126.getText());
                            }

                        } else if (i == 18) {
                            jTextField127.setText(jTextField6.getText());
                            if (jTextField127.getText().equals("")) {
                                nineteen = 0;
                            } else {
                                nineteen = Double.parseDouble(jTextField127.getText());
                            }

                        } else if (i == 19) {
                            jTextField128.setText(jTextField6.getText());
                            if (jTextField128.getText().equals("")) {
                                twenty = 0;
                            } else {
                                twenty = Double.parseDouble(jTextField128.getText());
                            }
                        }
                    }

                    totsingles = one + two + three + four + five + six + seven + eight + nine + ten + eleven + twelve + thirteen + fourteen + fifteen + sixteen + seventeen + eighteen + nineteen + twenty;
                    jTextField76.setText("" + totsingles);

                }

            } else {
                Vector v = new Vector();
                v.add(jCheckBox1.getText());
                v.add(singleitem);
                v.add(start);
                v.add(end);
                v.add(jTextField6.getText());
                v.add(jTextField6.getText());
                v.add(s);
                tb2.addRow(v);
                singleitem++;
            }
//            int y = tb2.getRowCount();
//            for (int i = 0; i < y; i++) {
//
//                if (tb2.getValueAt(i, 0).toString().equals("Singales")) {
//                    String value = tb2.getValueAt(i, 5).toString();
//                    temper = Double.parseDouble(value);
//
//                    totsingles = totsingles + temper;
//                    System.out.println("ddddddd??????????????>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<< : "+tot);
//                }
//
//            }
//            jTextField76.setText("" + totsingles);
        } else if (jCheckBox2.isSelected() && !jCheckBox3.isSelected() && !jCheckBox4.isSelected() && !jCheckBox5.isSelected()) {
            double tot = 0;
            double temper;
            int start = Integer.parseInt(jTextField9.getText());
            end = Integer.parseInt(jTextField8.getText());
            double val = Double.parseDouble(jTextField6.getText());
            double distance = end - start + 1;

            Doubles d1 = new Doubles();
            double getvale = d1.passvalue(distance);
            DefaultTableModel tb2 = (DefaultTableModel) jTable2.getModel();
            String s = "";
            if (jRadioButton2.isSelected()) {
                s = "W";
            } else if (jRadioButton1.isSelected()) {
                s = "P";
            } else if (jRadioButton4.isSelected()) {
                s = "W/P";
            }

            Vector v = new Vector();
            v.add(jCheckBox2.getText());
            v.add(doubleitem);
            v.add(start);
            v.add(end);
            v.add(jTextField6.getText());
            v.add(getvale * val);
            v.add(s);
            tb2.addRow(v);
//            System.out.println("ssssssss");
            doubleitem++;

            int y = tb2.getRowCount();
            for (int i = 0; i < y; i++) {
                System.out.println("double tikaaaaaaaaaaaaaaaa : " + tb2.getValueAt(i, 0).toString());
                if (tb2.getValueAt(i, 0).toString().equals("Doubles")) {
                    String value = tb2.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot = tot + temper;
                }

            }
            System.out.println("double tikaaaaaaaaaaaaaaaa >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>: " + tot);
            jTextField78.setText("" + tot);
            int pixel = (int) (end * 23) + 44;
            passdoubles(40, pixel, 200, pixel);
            passdoubles(40, pixel + 1, 230, pixel + 1);

            strinDouble = "D";

        } else if (jCheckBox3.isSelected() && !jCheckBox2.isSelected() && !jCheckBox4.isSelected() && !jCheckBox5.isSelected()) {

            double tot = 0;
            double temper;
            int start = Integer.parseInt(jTextField9.getText());
            end = Integer.parseInt(jTextField8.getText());
            double val = Double.parseDouble(jTextField6.getText());
            double distance = end - start + 1;

            Tribles t1 = new Tribles();
            System.out.println("start : " + start);
            System.out.println("end : " + end);
            double getvale = t1.passvalue(distance);
            System.out.println("getvale : " + getvale);
            DefaultTableModel tb3 = (DefaultTableModel) jTable2.getModel();

            String s = "";
            if (jRadioButton2.isSelected()) {
                s = "W";
            } else if (jRadioButton1.isSelected()) {
                s = "P";
            } else if (jRadioButton4.isSelected()) {
                s = "W/P";
            }

            Vector v = new Vector();

            v.add(jCheckBox3.getText());
            v.add(tribleitem);
            v.add(start);
            v.add(end);
            v.add(jTextField6.getText());
            v.add(getvale * val);
            v.add(s);
            tb3.addRow(v);
            tribleitem++;
            int y = tb3.getRowCount();
            System.out.println("tribles>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            for (int i = 0; i < y; i++) {

                if (tb3.getValueAt(i, 0).toString().equals("Tribles")) {

                    String value = tb3.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot = tot + temper;
                }
            }
            jTextField87.setText("" + tot);

            int pixel = (int) (end * 23) + 44;
            passdoubles(40, pixel, 200, pixel);
            passdoubles(40, pixel + 1, 230, pixel + 1);

            strinTrible = "T";

        } else if (jCheckBox4.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected() && !jCheckBox5.isSelected()) {
            double tot = 0;
            double temper;
            int start = Integer.parseInt(jTextField9.getText());
            end = Integer.parseInt(jTextField8.getText());
            double val = Double.parseDouble(jTextField6.getText());
            int distance = end - start + 1;

            Quadruple t1 = new Quadruple();
            double getvale = t1.passvalue(distance);
            DefaultTableModel tb4 = (DefaultTableModel) jTable2.getModel();
            String s = "";
            if (jRadioButton2.isSelected()) {
                s = "W";
            } else if (jRadioButton1.isSelected()) {
                s = "P";
            } else if (jRadioButton4.isSelected()) {
                s = "W/P";
            }
            Vector v = new Vector();

            v.add(jCheckBox4.getText());
            v.add(Quadrupleitem);
            v.add(start);
            v.add(end);
            v.add(jTextField6.getText());
            v.add(getvale * val);
            v.add(s);
            tb4.addRow(v);
            Quadrupleitem++;
            int y = tb4.getRowCount();
            for (int i = 0; i < y; i++) {
                if (tb4.getValueAt(i, 0).toString().equals("Quadruple (Q)")) {
                    String value = tb4.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot = tot + temper;
                }
            }
            jTextField77.setText("" + tot);

            int pixel = (int) (end * 23) + 44;
            passdoubles(40, pixel, 200, pixel);
            passdoubles(40, pixel + 1, 230, pixel + 1);

            stringQuadruple = "Q";
        } else if (jCheckBox5.isSelected() && !jCheckBox4.isSelected() && !jCheckBox2.isSelected() && !jCheckBox3.isSelected()) {
            double tot = 0;
            double temper;
            int start = Integer.parseInt(jTextField9.getText());
            end = Integer.parseInt(jTextField8.getText());
            double val = Double.parseDouble(jTextField6.getText());
            double distance = end - start + 1;

            Quintuple t1 = new Quintuple();
            double getvale = t1.passvalue(distance);
            DefaultTableModel tb4 = (DefaultTableModel) jTable2.getModel();
            String s = "";
            if (jRadioButton2.isSelected()) {
                s = "W";
            } else if (jRadioButton1.isSelected()) {
                s = "P";
            } else if (jRadioButton4.isSelected()) {
                s = "W/P";
            }
            Vector v = new Vector();

            v.add(jCheckBox5.getText());
            v.add(Quintupleitem);
            v.add(start);
            v.add(end);
            v.add(jTextField6.getText());
            v.add(getvale * val);
            v.add(s);
            tb4.addRow(v);
            Quintupleitem++;
            int y = tb4.getRowCount();
            for (int i = 0; i < y; i++) {
                if (tb4.getValueAt(i, 0).toString().equals("Quintuple  (QQ)")) {
                    String value = tb4.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot = tot + temper;
                }
            }
            jTextField88.setText("" + tot);

            int pixel = (int) (end * 23) + 44;
            passdoubles(40, pixel, 200, pixel);
            passdoubles(40, pixel + 1, 230, pixel + 1);

            stringQuintuple = "QQ";
        } else if (jCheckBox3.isSelected() && jCheckBox2.isSelected() && !jCheckBox4.isSelected() && !jCheckBox5.isSelected()) {

            ////////////////////////for double///////////////////////////////////////////////////////////////////////////
            double tot = 0;
            double temper;
            int start = Integer.parseInt(jTextField9.getText());
            end = Integer.parseInt(jTextField8.getText());
            double val = Double.parseDouble(jTextField6.getText());
            double distance = end - start + 1;

            Doubles d1 = new Doubles();
            double getvale = d1.passvalue(distance);

            DefaultTableModel tb2 = (DefaultTableModel) jTable2.getModel();
            String s = "";
            if (jRadioButton2.isSelected()) {
                s = "W";
            } else if (jRadioButton1.isSelected()) {
                s = "P";
            } else if (jRadioButton4.isSelected()) {
                s = "W/P";
            }
            Vector v = new Vector();
            v.add(jCheckBox2.getText());
            v.add(doubleitem);
            v.add(start);
            v.add(end);
            v.add(jTextField6.getText());
            v.add(getvale * val);
            v.add(s);
            tb2.addRow(v);
            doubleitem++;

            int y = tb2.getRowCount();
            for (int i = 0; i < y; i++) {
                if (tb2.getValueAt(i, 0).toString().equals("Doubles")) {
                    String value = tb2.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot = tot + temper;
                }

            }
            jTextField78.setText("" + tot);
            int pixel = (int) (end * 23) + 44;
            passdoubles(40, pixel, 200, pixel);
            passdoubles(40, pixel + 1, 230, pixel + 1);
            strinDouble = "D";

            ////////////////////////for trible///////////////////////////////////////////////////////////////////////////
            double tot_t = 0;
            Tribles t2 = new Tribles();
            double getvale_t = t2.passvalue(distance);
            System.out.println("getvale : " + getvale);
            DefaultTableModel tb3 = (DefaultTableModel) jTable2.getModel();
            Vector v1 = new Vector();

            v1.add(jCheckBox3.getText());
            v1.add(tribleitem);
            v1.add(start);
            v1.add(end);
            v1.add(jTextField6.getText());
            v1.add(getvale_t * val);
            v1.add(s);
            tb3.addRow(v1);
            tribleitem++;
            y = tb3.getRowCount();
            for (int i = 0; i < y; i++) {
                if (tb3.getValueAt(i, 0).toString().equals("Tribles")) {
                    String value = tb3.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot_t = tot_t + temper;
                }
            }
            jTextField87.setText("" + tot_t);

//            pixel = (int) (end * 23) + 44;
//            passdoubles(40, pixel, 200, pixel);
//            passdoubles(40, pixel + 1, 230, pixel + 1);
            strinTrible = "T";
            //////////////////////////////////////////////////////////////////////////////////////////////////////////           
            System.out.println("meka print vela ommma");

        } else if (jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && !jCheckBox5.isSelected()) {
            System.out.println(" dan print venne 4");

            ////////////////////////for double///////////////////////////////////////////////////////////////////////////
            double tot = 0;
            double temper;
            int start = Integer.parseInt(jTextField9.getText());
            end = Integer.parseInt(jTextField8.getText());
            double val = Double.parseDouble(jTextField6.getText());
            double distance = end - start + 1;

            Doubles d1 = new Doubles();
            double getvale = d1.passvalue(distance);
            String s = "";
            if (jRadioButton2.isSelected()) {
                s = "W";
            } else if (jRadioButton1.isSelected()) {
                s = "P";
            } else if (jRadioButton4.isSelected()) {
                s = "W/P";
            }
            DefaultTableModel tb2 = (DefaultTableModel) jTable2.getModel();

            Vector v = new Vector();
            v.add(jCheckBox2.getText());
            v.add(doubleitem);
            v.add(start);
            v.add(end);
            v.add(jTextField6.getText());
            v.add(getvale * val);
            v.add(s);
            tb2.addRow(v);
            doubleitem++;

            int y = tb2.getRowCount();
            for (int i = 0; i < y; i++) {
                if (tb2.getValueAt(i, 0).toString().equals("Doubles")) {
                    String value = tb2.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot = tot + temper;
                }

            }
            jTextField78.setText("" + tot);
            int pixel = (int) (end * 23) + 44;
            passdoubles(40, pixel, 200, pixel);
            passdoubles(40, pixel + 1, 230, pixel + 1);
            strinDouble = "D";
            ////////////////////////for trible///////////////////////////////////////////////////////////////////////////
            double tot_t = 0;
            Tribles t2 = new Tribles();
            double getvale_t = t2.passvalue(distance);
            System.out.println("getvale : " + getvale);
            DefaultTableModel tb3 = (DefaultTableModel) jTable2.getModel();
            Vector v1 = new Vector();

            v1.add(jCheckBox3.getText());
            v1.add(tribleitem);
            v1.add(start);
            v1.add(end);
            v1.add(jTextField6.getText());
            v1.add(getvale_t * val);
            v1.add(s);
            tb3.addRow(v1);
            tribleitem++;
            y = tb3.getRowCount();
            for (int i = 0; i < y; i++) {
                if (tb3.getValueAt(i, 0).toString().equals("Tribles")) {
                    String value = tb3.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot_t = tot_t + temper;
                }
            }
            jTextField87.setText("" + tot_t);

//            pixel = (int) (end * 23) + 44;
//            passdoubles(40, pixel, 200, pixel);
//            passdoubles(40, pixel + 1, 230, pixel + 1);
            strinTrible = "T";
            ////////////////////////for quadtruble///////////////////////////////////////////////////////////////////////////           
            double totQ = 0;

            Quadruple Aq1 = new Quadruple();
            double getvaleQ = Aq1.passvalue(distance);
            DefaultTableModel tb4 = (DefaultTableModel) jTable2.getModel();
            Vector vQ = new Vector();

            vQ.add(jCheckBox4.getText());
            vQ.add(Quadrupleitem);
            vQ.add(start);
            vQ.add(end);
            vQ.add(jTextField6.getText());
            vQ.add(getvale * val);
            vQ.add(s);
            System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb ");
            System.out.println("s value eka :  " + s);
            tb4.addRow(vQ);
            Quadrupleitem++;
            int yq = tb4.getRowCount();
            for (int i = 0; i < yq; i++) {
                if (tb4.getValueAt(i, 0).toString().equals("Quadruple (Q)")) {
                    String value = tb4.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    totQ = totQ + temper;
                }
            }
            jTextField77.setText("" + totQ);
            stringQuadruple = "Q";
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        } else if (jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()) {
            System.out.println(" dan print venne allll");

            ////////////////////////for double///////////////////////////////////////////////////////////////////////////
            double tot = 0;
            double temper;
            int start = Integer.parseInt(jTextField9.getText());
            end = Integer.parseInt(jTextField8.getText());
            double val = Double.parseDouble(jTextField6.getText());
            double distance = end - start + 1;

            Doubles d1 = new Doubles();

            double getvale = d1.passvalue(distance);
            String s = "";
            if (jRadioButton2.isSelected()) {
                s = "W";
            } else if (jRadioButton1.isSelected()) {
                s = "P";
            } else if (jRadioButton4.isSelected()) {
                s = "W/P";
            }
            DefaultTableModel tb2 = (DefaultTableModel) jTable2.getModel();

            Vector v = new Vector();
            v.add(jCheckBox2.getText());
            v.add(doubleitem);
            v.add(start);
            v.add(end);
            v.add(jTextField6.getText());
            v.add(getvale * val);
            v.add(s);
            tb2.addRow(v);
            doubleitem++;

            int y = tb2.getRowCount();
            for (int i = 0; i < y; i++) {
                if (tb2.getValueAt(i, 0).toString().equals("Doubles")) {
                    String value = tb2.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot = tot + temper;
                }

            }
            jTextField78.setText("" + tot);
            int pixel = (int) (end * 23) + 44;
            passdoubles(40, pixel, 200, pixel);
            passdoubles(40, pixel + 1, 230, pixel + 1);
            strinDouble = "D";
            ////////////////////////for trible///////////////////////////////////////////////////////////////////////////
            double tot_t = 0;
            Tribles t2 = new Tribles();
            double getvale_t = t2.passvalue(distance);
            System.out.println("getvale : " + getvale);
            DefaultTableModel tb3 = (DefaultTableModel) jTable2.getModel();

            Vector v1 = new Vector();

            v1.add(jCheckBox3.getText());
            v1.add(tribleitem);
            v1.add(start);
            v1.add(end);
            v1.add(jTextField6.getText());
            v1.add(getvale_t * val);
            v1.add(s);
            tb3.addRow(v1);
            tribleitem++;
            y = tb3.getRowCount();
            for (int i = 0; i < y; i++) {
                if (tb3.getValueAt(i, 0).toString().equals("Tribles")) {
                    String value = tb3.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    tot_t = tot_t + temper;
                }
            }
            jTextField87.setText("" + tot_t);

//            pixel = (int) (end * 23) + 44;
//            passdoubles(40, pixel, 200, pixel);
//            passdoubles(40, pixel + 1, 230, pixel + 1);
            strinTrible = "T";
            ////////////////////////for quadtruble///////////////////////////////////////////////////////////////////////////           
            double totQ = 0;

            Quadruple Aq1 = new Quadruple();
            double getvaleQ = Aq1.passvalue(distance);
            System.out.println("DISTANE : " + getvale);
            DefaultTableModel tb4 = (DefaultTableModel) jTable2.getModel();
            Vector vQ = new Vector();

            vQ.add(jCheckBox4.getText());
            vQ.add(Quadrupleitem);
            vQ.add(start);
            vQ.add(end);
            vQ.add(jTextField6.getText());
            vQ.add(getvale * val);
            vQ.add(s);
            tb4.addRow(vQ);
            Quadrupleitem++;
            int yq = tb4.getRowCount();
            for (int i = 0; i < yq; i++) {
                if (tb4.getValueAt(i, 0).toString().equals("Quadruple (Q)")) {
                    String value = tb4.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    totQ = totQ + temper;
                }
            }
            jTextField77.setText("" + totQ);
            stringQuadruple = "Q";
            ////////////////////////////////for quintuple/////////////////////////////////////////////////////////////////////
            double totqq = 0;

            Quintuple qq1 = new Quintuple();
            double getvaleqq = qq1.passvalue(distance);
            DefaultTableModel tb5 = (DefaultTableModel) jTable2.getModel();

            Vector vqq = new Vector();

            vqq.add(jCheckBox5.getText());
            vqq.add(Quintupleitem);
            vqq.add(start);
            vqq.add(end);
            vqq.add(jTextField6.getText());
            vqq.add(getvaleqq * val);
            vqq.add(s);
            tb4.addRow(vqq);
            Quintupleitem++;
            int yqq = tb4.getRowCount();
            for (int i = 0; i < yqq; i++) {
                if (tb5.getValueAt(i, 0).toString().equals("Quintuple  (QQ)")) {
                    String value = tb5.getValueAt(i, 5).toString();
                    temper = Double.parseDouble(value);

                    totqq = totqq + temper;
                }
            }
            stringQuintuple = "QQ";

        } else if (jTextField7.getText().length() != 0) {
            if (jRadioButton5.isSelected() && jRadioButton6.isSelected()) {
                ////////////////////////for double///////////////////////////////////////////////////////////////////////////
                double tot = 0;
                double temper;
                int j = addHorse.getRowCount();

                double val = Double.parseDouble(jTextField7.getText());

                double distance = j - 1 + 1;

                Doubles d1 = new Doubles();
                double getvale = d1.passvalue(distance);

                DefaultTableModel tb2 = (DefaultTableModel) jTable2.getModel();
                String s = "";
                if (jRadioButton2.isSelected()) {
                    s = "W";
                } else if (jRadioButton1.isSelected()) {
                    s = "P";
                } else if (jRadioButton4.isSelected()) {
                    s = "W/P";
                }
                Vector v = new Vector();
                v.add("Doubles");
                v.add(doubleitem);
                v.add(1);
                v.add(j);
                v.add(jTextField7.getText());
                v.add(getvale * val);
                v.add(s);
                tb2.addRow(v);
                doubleitem++;

                int y = tb2.getRowCount();
                for (int i = 0; i < y; i++) {
                    if (tb2.getValueAt(i, 0).toString().equals("Doubles")) {
                        String value = tb2.getValueAt(i, 5).toString();
                        temper = Double.parseDouble(value);

                        tot = tot + temper;
                    }

                }
                jTextField78.setText("" + tot);
                int pixel = (int) (j * 23) + 44;
                passdoubles(40, pixel, 200, pixel);
                passdoubles(40, pixel + 1, 230, pixel + 1);
                strinDouble = "D";

                ////////////////////////for trible///////////////////////////////////////////////////////////////////////////
                double tot_t = 0;
                Tribles t2 = new Tribles();
                double getvale_t = t2.passvalue(distance);
                System.out.println("getvale : " + getvale);
                DefaultTableModel tb3 = (DefaultTableModel) jTable2.getModel();
                Vector v1 = new Vector();

                v1.add("Tribles");
                v1.add(tribleitem);
                v1.add(1);
                v1.add(j);
                v1.add(jTextField7.getText());
                v1.add(getvale_t * val);
                v1.add(s);
                tb3.addRow(v1);
                tribleitem++;
                y = tb3.getRowCount();
                for (int i = 0; i < y; i++) {
                    if (tb3.getValueAt(i, 0).toString().equals("Tribles")) {
                        String value = tb3.getValueAt(i, 5).toString();
                        temper = Double.parseDouble(value);

                        tot_t = tot_t + temper;
                    }
                }
                jTextField87.setText("" + tot_t);

//            pixel = (int) (end * 23) + 44;
//            passdoubles(40, pixel, 200, pixel);
//            passdoubles(40, pixel + 1, 230, pixel + 1);
//                strinTrible = "T";
                //////////////////////////////////////////////////////////////////////////////////////////////////////////           
                System.out.println("meka print vela ommma");
            }
        }
        if (jCheckBox1.isSelected()) {
            int maxLength = Integer.parseInt(jTextField9.getText());
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            if (dtm.getRowCount() < maxLength) {
                JOptionPane.showMessageDialog(null, "table eke ochchara raws ne");
                jTextField9.setText("");
//                jTextField7.grabFocus();
            } else {
                if (jRadioButton2.isSelected()) {
                    if (jTextField9.getText().equals("1")) {

                        jTextField38.setText(jTextField6.getText());
                        if (jTextField38.getText().equals("")) {
                            one = 0;
                        } else {
                            one = Double.parseDouble(jTextField38.getText());
                        }
                    } else if (jTextField9.getText().equals("2")) {
                        jTextField5.setText(jTextField6.getText());
                        if (jTextField5.getText().equals("")) {
                            two = 0;
                        } else {
                            two = Double.parseDouble(jTextField5.getText());
                        }

                    } else if (jTextField9.getText().equals("3")) {
                        jTextField20.setText(jTextField6.getText());
                        if (jTextField20.getText().equals("")) {
                            three = 0;
                        } else {
                            three = Double.parseDouble(jTextField20.getText());
                        }

                    } else if (jTextField9.getText().equals("4")) {
                        jTextField21.setText(jTextField6.getText());
                        if (jTextField21.getText().equals("")) {
                            four = 0;
                        } else {
                            four = Double.parseDouble(jTextField21.getText());
                        }

                    } else if (jTextField9.getText().equals("5")) {
                        jTextField24.setText(jTextField6.getText());
                        if (jTextField24.getText().equals("")) {
                            five = 0;
                        } else {
                            five = Double.parseDouble(jTextField24.getText());
                        }

                    } else if (jTextField9.getText().equals("6")) {
                        jTextField23.setText(jTextField6.getText());
                        if (jTextField23.getText().equals("")) {
                            six = 0;
                        } else {
                            six = Double.parseDouble(jTextField23.getText());
                        }

                    } else if (jTextField9.getText().equals("7")) {
                        jTextField22.setText(jTextField6.getText());
                        if (jTextField22.getText().equals("")) {
                            seven = 0;
                        } else {
                            seven = Double.parseDouble(jTextField22.getText());
                        }

                    } else if (jTextField9.getText().equals("8")) {
                        jTextField25.setText(jTextField6.getText());
                        if (jTextField25.getText().equals("")) {
                            eight = 0;
                        } else {
                            eight = Double.parseDouble(jTextField25.getText());
                        }

                    } else if (jTextField9.getText().equals("9")) {
                        jTextField26.setText(jTextField6.getText());
                        if (jTextField26.getText().equals("")) {
                            nine = 0;
                        } else {
                            nine = Double.parseDouble(jTextField26.getText());
                        }

                    } else if (jTextField9.getText().equals("10")) {
                        jTextField27.setText(jTextField6.getText());
                        if (jTextField27.getText().equals("")) {
                            ten = 0;
                        } else {
                            ten = Double.parseDouble(jTextField27.getText());
                        }

                    } else if (jTextField9.getText().equals("11")) {
                        jTextField28.setText(jTextField6.getText());
                        if (jTextField28.getText().equals("")) {
                            eleven = 0;
                        } else {
                            eleven = Double.parseDouble(jTextField28.getText());
                        }

                    } else if (jTextField9.getText().equals("12")) {
                        jTextField29.setText(jTextField6.getText());
                        if (jTextField29.getText().equals("")) {
                            twelve = 0;
                        } else {
                            twelve = Double.parseDouble(jTextField29.getText());
                        }

                    } else if (jTextField9.getText().equals("13")) {
                        jTextField30.setText(jTextField6.getText());
                        if (jTextField30.getText().equals("")) {
                            thirteen = 0;
                        } else {
                            thirteen = Double.parseDouble(jTextField30.getText());
                        }

                    } else if (jTextField9.getText().equals("14")) {
                        jTextField31.setText(jTextField6.getText());
                        if (jTextField31.getText().equals("")) {
                            fourteen = 0;
                        } else {
                            fourteen = Double.parseDouble(jTextField31.getText());
                        }

                    } else if (jTextField9.getText().equals("15")) {
                        jTextField32.setText(jTextField6.getText());
                        if (jTextField32.getText().equals("")) {
                            fifteen = 0;
                        } else {
                            fifteen = Double.parseDouble(jTextField32.getText());
                        }

                    } else if (jTextField9.getText().equals("16")) {
                        jTextField33.setText(jTextField6.getText());
                        if (jTextField33.getText().equals("")) {
                            sixteen = 0;
                        } else {
                            sixteen = Double.parseDouble(jTextField33.getText());
                        }

                    } else if (jTextField9.getText().equals("17")) {
                        jTextField34.setText(jTextField6.getText());
                        if (jTextField34.getText().equals("")) {
                            seventeen = 0;
                        } else {
                            seventeen = Double.parseDouble(jTextField34.getText());
                        }

                    } else if (jTextField9.getText().equals("18")) {
                        jTextField35.setText(jTextField6.getText());
                        if (jTextField35.getText().equals("")) {
                            eighteen = 0;
                        } else {
                            eighteen = Double.parseDouble(jTextField35.getText());
                        }

                    } else if (jTextField9.getText().equals("19")) {
                        jTextField36.setText(jTextField6.getText());
                        if (jTextField36.getText().equals("")) {
                            nineteen = 0;
                        } else {
                            nineteen = Double.parseDouble(jTextField36.getText());
                        }

                    } else if (jTextField9.getText().equals("20")) {
                        jTextField37.setText(jTextField6.getText());
                        if (jTextField34.getText().equals("")) {
                            twenty = 0;
                        } else {
                            twenty = Double.parseDouble(jTextField34.getText());
                        }
                    }
                } else if (jRadioButton1.isSelected()) {
                    if (jTextField9.getText().equals("1")) {
                        jTextField40.setText(jTextField6.getText());
                        if (jTextField40.getText().equals("")) {
                            one = 0;
                        } else {
                            one = Double.parseDouble(jTextField40.getText());
                        }
                    } else if (jTextField9.getText().equals("2")) {
                        jTextField41.setText(jTextField6.getText());
                        if (jTextField41.getText().equals("")) {
                            two = 0;
                        } else {
                            two = Double.parseDouble(jTextField41.getText());
                        }

                    } else if (jTextField9.getText().equals("3")) {
                        jTextField43.setText(jTextField6.getText());
                        if (jTextField43.getText().equals("")) {
                            three = 0;
                        } else {
                            three = Double.parseDouble(jTextField43.getText());
                        }

                    } else if (jTextField9.getText().equals("4")) {
                        jTextField46.setText(jTextField6.getText());
                        if (jTextField46.getText().equals("")) {
                            four = 0;
                        } else {
                            four = Double.parseDouble(jTextField46.getText());
                        }

                    } else if (jTextField9.getText().equals("5")) {
                        jTextField47.setText(jTextField6.getText());
                        if (jTextField47.getText().equals("")) {
                            five = 0;
                        } else {
                            five = Double.parseDouble(jTextField47.getText());
                        }

                    } else if (jTextField9.getText().equals("6")) {
                        jTextField48.setText(jTextField6.getText());
                        if (jTextField48.getText().equals("")) {
                            six = 0;
                        } else {
                            six = Double.parseDouble(jTextField48.getText());
                        }

                    } else if (jTextField9.getText().equals("7")) {
                        jTextField51.setText(jTextField6.getText());
                        if (jTextField51.getText().equals("")) {
                            seven = 0;
                        } else {
                            seven = Double.parseDouble(jTextField51.getText());
                        }

                    } else if (jTextField9.getText().equals("8")) {
                        jTextField55.setText(jTextField6.getText());
                        if (jTextField55.getText().equals("")) {
                            eight = 0;
                        } else {
                            eight = Double.parseDouble(jTextField55.getText());
                        }

                    } else if (jTextField9.getText().equals("9")) {
                        jTextField114.setText(jTextField6.getText());
                        if (jTextField114.getText().equals("")) {
                            nine = 0;
                        } else {
                            nine = Double.parseDouble(jTextField114.getText());
                        }

                    } else if (jTextField9.getText().equals("10")) {
                        jTextField115.setText(jTextField6.getText());
                        if (jTextField115.getText().equals("")) {
                            ten = 0;
                        } else {
                            ten = Double.parseDouble(jTextField115.getText());
                        }

                    } else if (jTextField9.getText().equals("11")) {
                        jTextField116.setText(jTextField6.getText());
                        if (jTextField116.getText().equals("")) {
                            eleven = 0;
                        } else {
                            eleven = Double.parseDouble(jTextField116.getText());
                        }

                    } else if (jTextField9.getText().equals("12")) {
                        jTextField120.setText(jTextField6.getText());
                        if (jTextField120.getText().equals("")) {
                            twelve = 0;
                        } else {
                            twelve = Double.parseDouble(jTextField120.getText());
                        }

                    } else if (jTextField9.getText().equals("13")) {
                        jTextField121.setText(jTextField6.getText());
                        if (jTextField121.getText().equals("")) {
                            thirteen = 0;
                        } else {
                            thirteen = Double.parseDouble(jTextField121.getText());
                        }

                    } else if (jTextField9.getText().equals("14")) {
                        jTextField122.setText(jTextField6.getText());
                        if (jTextField122.getText().equals("")) {
                            fourteen = 0;
                        } else {
                            fourteen = Double.parseDouble(jTextField122.getText());
                        }

                    } else if (jTextField9.getText().equals("15")) {
                        jTextField123.setText(jTextField6.getText());
                        if (jTextField123.getText().equals("")) {
                            fifteen = 0;
                        } else {
                            fifteen = Double.parseDouble(jTextField123.getText());
                        }

                    } else if (jTextField9.getText().equals("16")) {
                        jTextField124.setText(jTextField6.getText());
                        if (jTextField124.getText().equals("")) {
                            sixteen = 0;
                        } else {
                            sixteen = Double.parseDouble(jTextField124.getText());
                        }

                    } else if (jTextField9.getText().equals("17")) {
                        jTextField125.setText(jTextField6.getText());
                        if (jTextField125.getText().equals("")) {
                            seventeen = 0;
                        } else {
                            seventeen = Double.parseDouble(jTextField125.getText());
                        }

                    } else if (jTextField9.getText().equals("18")) {
                        jTextField126.setText(jTextField6.getText());
                        if (jTextField126.getText().equals("")) {
                            eighteen = 0;
                        } else {
                            eighteen = Double.parseDouble(jTextField126.getText());
                        }

                    } else if (jTextField9.getText().equals("19")) {
                        jTextField127.setText(jTextField6.getText());
                        if (jTextField127.getText().equals("")) {
                            nineteen = 0;
                        } else {
                            nineteen = Double.parseDouble(jTextField127.getText());
                        }

                    } else if (jTextField9.getText().equals("20")) {
                        jTextField128.setText(jTextField6.getText());
                        if (jTextField128.getText().equals("")) {
                            twenty = 0;
                        } else {
                            twenty = Double.parseDouble(jTextField128.getText());
                        }
                    }

                }
                totsingles = one + two + three + four + five + six + seven + eight + nine + ten + eleven + twelve + thirteen + fourteen + fifteen + sixteen + seventeen + eighteen + nineteen + twenty;
                jTextField76.setText("" + totsingles);

            }
            jTextField8.setText("0");
        } else {
            int endt = addHorse.getRowCount();
//            int pixel = (int) (end * 23) + 44;
//            passdoubles(40, pixel, 200, pixel);
//            passdoubles(40, pixel + 1, 230, pixel + 1);
            if (jTextField7.getText().length() != 0) {
                System.out.println("7 eke innavanam  meka");
                if (endt == 2) {
                    System.out.println("7 eke innavanam  mekassssssssssssss");
                    jTextField69.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 3) {
                    System.out.println("7 eke innavanam  mekassssssssssssss");
                    jTextField64.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 4) {
                    jTextField75.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 5) {
                    jTextField74.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 6) {
                    jTextField96.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 7) {
                    jTextField95.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 8) {
                    jTextField94.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 9) {
                    jTextField93.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 10) {
                    jTextField113.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 11) {
                    jTextField65.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 12) {
                    jTextField112.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 13) {
                    jTextField111.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 14) {
                    jTextField110.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 15) {
                    jTextField109.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 16) {
                    jTextField108.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 17) {
                    jTextField107.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 18) {
                    jTextField118.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 19) {
                    jTextField119.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (endt == 20) {
                    jTextField117.setText(jTextField7.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                }
                jTextField7.setText("");

            } else {
                System.out.println("6 eke innavanam  meka");
                if (end == 2) {
                    jTextField69.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 3) {
                    jTextField64.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 4) {
                    jTextField75.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 5) {
                    jTextField74.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 6) {
                    jTextField96.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 7) {
                    jTextField95.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 8) {
                    jTextField94.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 9) {
                    jTextField93.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 10) {
                    jTextField113.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 11) {
                    jTextField65.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 12) {
                    jTextField112.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 13) {
                    jTextField111.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 14) {
                    jTextField110.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 15) {
                    jTextField109.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 16) {
                    jTextField108.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 17) {
                    jTextField107.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 18) {
                    jTextField118.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 19) {
                    jTextField119.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                } else if (end == 20) {
                    jTextField117.setText(jTextField6.getText() + "/=  " + strinDouble + "" + strinTrible + "" + stringQuadruple + "" + stringQuintuple);
                }
                jTextField8.setText("");
            }
        }
        if (jTextField78.getText().equals("")) {
            totdouble = 0;
        } else {
            totdouble = Double.parseDouble(jTextField78.getText());
        }
        if (jTextField87.getText().equals("")) {
            tottrible = 0;
        } else {
            tottrible = Double.parseDouble(jTextField87.getText());
        }
        if (jTextField77.getText().equals("")) {
            totq = 0;
        } else {
            totq = Double.parseDouble(jTextField77.getText());
        }
        if (jTextField88.getText().equals("")) {
            totqq = 0;
        } else {
            totqq = Double.parseDouble(jTextField88.getText());
        }
        if (jTextField89.getText().equals("")) {
            brackets = 0;
        } else {
            brackets = Double.parseDouble(jTextField89.getText());
        }
        Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
        jLabel39.setText("" + Investment);

        jTextField9.setText("");

        jTextField6.setText("");
        jTextField9.grabFocus();
        strinDouble = "";
        strinTrible = "";
        stringQuadruple = "";
        stringQuintuple = "";
    }//GEN-LAST:event_jButton3KeyPressed

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49ActionPerformed

    private void jTextFieldcenterNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldcenterNumKeyPressed
        if (evt.getKeyCode() == 40) {
            if (jTextFieldcenterNum.getText().length() != 0) {
                jTable10.grabFocus();
                ListSelectionModel selectionModel = jTable10.getSelectionModel();
                selectionModel.setSelectionInterval(0, 0);
            } else {
                jScrollPane9.setVisible(false);
                jTable10.setVisible(false);
            }

        }
    }//GEN-LAST:event_jTextFieldcenterNumKeyPressed

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jTextField129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField129ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField129ActionPerformed

    private void jTextField133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField133ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField133ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) jTable6.getModel();
        int i = jTable6.getSelectedRow() + 1;
        int y = dtm.getRowCount();
        String f = "" + i;
        if (f != null) {
            int g = JOptionPane.showConfirmDialog(null, "Are you sure want to remove Item");
            if (g == JOptionPane.YES_OPTION) {
                for (int x = 0; x < y; x++) {

                    if (jTable6.getValueAt(x, 2).toString().equals("Win")) {
//                        i++;
                        System.out.println("ioppp  eka win : " + op.getval(i).toString());
                        String val[] = op.getval(i).toString().split("/");
                        passNew(200, Integer.parseInt(val[0].toString()), Integer.parseInt(val[1].toString()), Integer.parseInt(val[0].toString()), new Color(240, 240, 240));
                        passNew(200, Integer.parseInt(val[2].toString()), Integer.parseInt(val[3].toString()), Integer.parseInt(val[2].toString()), new Color(240, 240, 240));
                        passNew(Integer.parseInt(val[1].toString()), Integer.parseInt(val[0].toString()), Integer.parseInt(val[3].toString()), Integer.parseInt(val[2].toString()), new Color(240, 240, 240));
                        passNew(Integer.parseInt(val[3].toString()), Integer.parseInt(val[5].toString()), Integer.parseInt(val[4].toString()), Integer.parseInt(val[5].toString()), new Color(240, 240, 240));
                        if (val[6].toString().equals("44")) {
                            jTextField44.setText("");
                        } else if (val[6].toString().equals("56")) {
                            jTextField56.setText("");
                        } else if (val[6].toString().equals("42")) {
                            jTextField42.setText("");
                        } else if (val[6].toString().equals("57")) {
                            jTextField57.setText("");
                        } else if (val[6].toString().equals("45")) {
                            jTextField45.setText("");
                        } else if (val[6].toString().equals("58")) {
                            jTextField58.setText("");
                        } else if (val[6].toString().equals("4")) {
                            jTextField4.setText("");
                        } else if (val[6].toString().equals("59")) {
                            jTextField59.setText("");
                        } else if (val[6].toString().equals("49")) {
                            jTextField49.setText("");
                        } else if (val[6].toString().equals("60")) {
                            jTextField60.setText("");
                        } else if (val[6].toString().equals("50")) {
                            jTextField50.setText("");
                        } else if (val[6].toString().equals("61")) {
                            jTextField61.setText("");
                        } else if (val[6].toString().equals("52")) {
                            jTextField52.setText("");
                        } else if (val[6].toString().equals("62")) {
                            jTextField62.setText("");
                        } else if (val[6].toString().equals("53")) {
                            jTextField53.setText("");
                        } else if (val[6].toString().equals("63")) {
                            jTextField63.setText("");
                        } else if (val[6].toString().equals("54")) {
                            jTextField54.setText("");
                        } else if (val[6].toString().equals("86")) {
                            jTextField86.setText("");
                        } else if (val[6].toString().equals("39")) {
                            jTextField39.setText("");
                        } else if (val[6].toString().equals("73")) {
                            jTextField73.setText("");
                        } else if (val[6].toString().equals("84")) {
                            jTextField84.setText("");
                        } else if (val[6].toString().equals("71")) {
                            jTextField71.setText("");
                        } else if (val[6].toString().equals("82")) {
                            jTextField82.setText("");
                        } else if (val[6].toString().equals("70")) {
                            jTextField70.setText("");
                        } else if (val[6].toString().equals("81")) {
                            jTextField81.setText("");
                        } else if (val[6].toString().equals("68")) {
                            jTextField68.setText("");
                        } else if (val[6].toString().equals("80")) {
                            jTextField80.setText("");
                        } else if (val[6].toString().equals("67")) {
                            jTextField67.setText("");
                        } else if (val[6].toString().equals("97")) {
                            jTextField44.setText("");
                        } else if (val[6].toString().equals("66")) {
                            jTextField66.setText("");
                        } else if (val[6].toString().equals("79")) {
                            jTextField79.setText("");
                        } else if (val[6].toString().equals("102")) {
                            jTextField102.setText("");
                        } else if (val[6].toString().equals("83")) {
                            jTextField83.setText("");
                        } else if (val[6].toString().equals("101")) {
                            jTextField101.setText("");
                        } else if (val[6].toString().equals("103")) {
                            jTextField103.setText("");
                        } else if (val[6].toString().equals("100")) {
                            jTextField100.setText("");
                        } else if (val[6].toString().equals("104")) {
                            jTextField104.setText("");
                        } else if (val[6].toString().equals("99")) {
                            jTextField99.setText("");
                        } else if (val[6].toString().equals("105")) {
                            jTextField105.setText("");
                        } else if (val[6].toString().equals("98")) {
                            jTextField98.setText("");
                        } else if (val[6].toString().equals("106")) {
                            jTextField106.setText("");
                        } else if (val[6].toString().equals("72")) {
                            jTextField72.setText("");
                        }

                    } else if (jTable6.getValueAt(x, 2).toString().equals("Place")) {
                        System.out.println("i eka : " + i);
                        String val[] = op.getval(i).toString().split("/");
                        passNew(370, Integer.parseInt(val[0].toString()), Integer.parseInt(val[1].toString()), Integer.parseInt(val[0].toString()), new Color(240, 240, 240));
                        passNew(370, Integer.parseInt(val[2].toString()), Integer.parseInt(val[3].toString()), Integer.parseInt(val[2].toString()), new Color(240, 240, 240));
                        passNew(Integer.parseInt(val[1].toString()), Integer.parseInt(val[0].toString()), Integer.parseInt(val[3].toString()), Integer.parseInt(val[2].toString()), new Color(240, 240, 240));
                        passNew(Integer.parseInt(val[3].toString()), Integer.parseInt(val[5].toString()), Integer.parseInt(val[4].toString()), Integer.parseInt(val[5].toString()), new Color(240, 240, 240));
                        System.out.println(" txt eka :" + val[6].toString());
                        if (val[6].toString().equals("129")) {
                            jTextField129.setText("");
                        } else if (val[6].toString().equals("151")) {
                            jTextField151.setText("");
                        } else if (val[6].toString().equals("130")) {
                            jTextField130.setText("");
                        } else if (val[6].toString().equals("152")) {
                            jTextField152.setText("");
                        } else if (val[6].toString().equals("131")) {
                            jTextField131.setText("");
                        } else if (val[6].toString().equals("153")) {
                            jTextField153.setText("");
                        } else if (val[6].toString().equals("132")) {
                            jTextField132.setText("");
                        } else if (val[6].toString().equals("154")) {
                            jTextField154.setText("");
                        } else if (val[6].toString().equals("133")) {
                            jTextField133.setText("");
                        } else if (val[6].toString().equals("155")) {
                            jTextField155.setText("");
                        } else if (val[6].toString().equals("134")) {
                            jTextField134.setText("");
                        } else if (val[6].toString().equals("156")) {
                            jTextField156.setText("");
                        } else if (val[6].toString().equals("135")) {
                            jTextField135.setText("");
                        } else if (val[6].toString().equals("157")) {
                            jTextField157.setText("");
                        } else if (val[6].toString().equals("136")) {
                            jTextField136.setText("");
                        } else if (val[6].toString().equals("112")) {
                            jTextField112.setText("");
                        } else if (val[6].toString().equals("158")) {
                            jTextField158.setText("");
                        } else if (val[6].toString().equals("137")) {
                            jTextField137.setText("");
                        } else if (val[6].toString().equals("159")) {
                            jTextField159.setText("");
                        } else if (val[6].toString().equals("138")) {
                            jTextField138.setText("");
                        } else if (val[6].toString().equals("160")) {
                            jTextField160.setText("");
                        } else if (val[6].toString().equals("139")) {
                            jTextField139.setText("");
                        } else if (val[6].toString().equals("161")) {
                            jTextField161.setText("");
                        } else if (val[6].toString().equals("140")) {
                            jTextField140.setText("");
                        } else if (val[6].toString().equals("162")) {
                            jTextField162.setText("");
                        } else if (val[6].toString().equals("141")) {
                            jTextField141.setText("");
                        } else if (val[6].toString().equals("163")) {
                            jTextField163.setText("");
                        } else if (val[6].toString().equals("142")) {
                            jTextField142.setText("");
                        } else if (val[6].toString().equals("164")) {
                            jTextField164.setText("");
                        } else if (val[6].toString().equals("143")) {
                            jTextField143.setText("");
                        } else if (val[6].toString().equals("165")) {
                            jTextField165.setText("");
                        } else if (val[6].toString().equals("144")) {
                            jTextField144.setText("");
                        } else if (val[6].toString().equals("166")) {
                            jTextField166.setText("");
                        } else if (val[6].toString().equals("145")) {
                            jTextField145.setText("");
                        } else if (val[6].toString().equals("167")) {
                            jTextField167.setText("");
                        } else if (val[6].toString().equals("146")) {
                            jTextField146.setText("");
                        } else if (val[6].toString().equals("168")) {
                            jTextField168.setText("");
                        } else if (val[6].toString().equals("147")) {
                            jTextField147.setText("");
                        } else if (val[6].toString().equals("169")) {
                            jTextField169.setText("");
                        } else if (val[6].toString().equals("148")) {
                            jTextField148.setText("");
                        } else if (val[6].toString().equals("170")) {
                            jTextField170.setText("");
                        } else if (val[6].toString().equals("149")) {
                            jTextField149.setText("");
                        } else if (val[6].toString().equals("171")) {
                            jTextField171.setText("");
                        } else if (val[6].toString().equals("150")) {
                            jTextField150.setText("");
                        }
                    } else if (jTable6.getValueAt(x, 2).toString().equals("Win/Place")) {
//                        i++;

                        System.out.println("ioppp deka place : " + op.getval(i).toString());
                        System.out.println("ccc : " + dtm.getValueAt(x, 2));
                        String val[] = op.getval(i).toString().split("/");
                        if (val.length > 7) {
                            System.out.println("Length eka bn meka : " + val.length);
                            System.out.println("error eka ena thana : " + Integer.parseInt(val[1].toString()));
                            passNew(200, Integer.parseInt(val[7].toString()), Integer.parseInt(val[8].toString()), Integer.parseInt(val[7].toString()), new Color(240, 240, 240));
                            passNew(200, Integer.parseInt(val[9].toString()), Integer.parseInt(val[10].toString()), Integer.parseInt(val[9].toString()), new Color(240, 240, 240));
                            passNew(Integer.parseInt(val[8].toString()), Integer.parseInt(val[7].toString()), Integer.parseInt(val[10].toString()), Integer.parseInt(val[9].toString()), new Color(240, 240, 240));
                            passNew(Integer.parseInt(val[10].toString()), Integer.parseInt(val[12].toString()), Integer.parseInt(val[11].toString()), Integer.parseInt(val[12].toString()), new Color(240, 240, 240));
                            if (val[6].toString().equals("44")) {
                                jTextField44.setText("");
                            } else if (val[6].toString().equals("56")) {
                                jTextField56.setText("");
                            } else if (val[6].toString().equals("42")) {
                                jTextField42.setText("");
                            } else if (val[6].toString().equals("57")) {
                                jTextField57.setText("");
                            } else if (val[6].toString().equals("45")) {
                                jTextField45.setText("");
                            } else if (val[6].toString().equals("58")) {
                                jTextField58.setText("");
                            } else if (val[6].toString().equals("4")) {
                                jTextField4.setText("");
                            } else if (val[6].toString().equals("59")) {
                                jTextField59.setText("");
                            } else if (val[6].toString().equals("49")) {
                                jTextField49.setText("");
                            } else if (val[6].toString().equals("60")) {
                                jTextField60.setText("");
                            } else if (val[6].toString().equals("50")) {
                                jTextField50.setText("");
                            } else if (val[6].toString().equals("61")) {
                                jTextField61.setText("");
                            } else if (val[6].toString().equals("52")) {
                                jTextField52.setText("");
                            } else if (val[6].toString().equals("62")) {
                                jTextField62.setText("");
                            } else if (val[6].toString().equals("53")) {
                                jTextField53.setText("");
                            } else if (val[6].toString().equals("63")) {
                                jTextField63.setText("");
                            } else if (val[6].toString().equals("54")) {
                                jTextField54.setText("");
                            } else if (val[6].toString().equals("86")) {
                                jTextField86.setText("");
                            } else if (val[6].toString().equals("39")) {
                                jTextField39.setText("");
                            } else if (val[6].toString().equals("73")) {
                                jTextField73.setText("");
                            } else if (val[6].toString().equals("84")) {
                                jTextField84.setText("");
                            } else if (val[6].toString().equals("71")) {
                                jTextField71.setText("");
                            } else if (val[6].toString().equals("82")) {
                                jTextField82.setText("");
                            } else if (val[6].toString().equals("70")) {
                                jTextField70.setText("");
                            } else if (val[6].toString().equals("81")) {
                                jTextField81.setText("");
                            } else if (val[6].toString().equals("68")) {
                                jTextField68.setText("");
                            } else if (val[6].toString().equals("80")) {
                                jTextField80.setText("");
                            } else if (val[6].toString().equals("67")) {
                                jTextField67.setText("");
                            } else if (val[6].toString().equals("97")) {
                                jTextField44.setText("");
                            } else if (val[6].toString().equals("66")) {
                                jTextField66.setText("");
                            } else if (val[6].toString().equals("79")) {
                                jTextField79.setText("");
                            } else if (val[6].toString().equals("102")) {
                                jTextField102.setText("");
                            } else if (val[6].toString().equals("83")) {
                                jTextField83.setText("");
                            } else if (val[6].toString().equals("101")) {
                                jTextField101.setText("");
                            } else if (val[6].toString().equals("103")) {
                                jTextField103.setText("");
                            } else if (val[6].toString().equals("100")) {
                                jTextField100.setText("");
                            } else if (val[6].toString().equals("104")) {
                                jTextField104.setText("");
                            } else if (val[6].toString().equals("99")) {
                                jTextField99.setText("");
                            } else if (val[6].toString().equals("105")) {
                                jTextField105.setText("");
                            } else if (val[6].toString().equals("98")) {
                                jTextField98.setText("");
                            } else if (val[6].toString().equals("106")) {
                                jTextField106.setText("");
                            } else if (val[6].toString().equals("72")) {
                                jTextField72.setText("");
                            }
                            System.out.println("i deka : " + i);
                            System.out.println("ioppp  eka : " + op.getval(i).toString());
                            String valb[] = op.getval(i).toString().split("/");
                            passNew(370, Integer.parseInt(valb[0].toString()), Integer.parseInt(valb[1].toString()), Integer.parseInt(valb[0].toString()), new Color(240, 240, 240));
                            passNew(370, Integer.parseInt(valb[2].toString()), Integer.parseInt(valb[3].toString()), Integer.parseInt(valb[2].toString()), new Color(240, 240, 240));
                            passNew(Integer.parseInt(valb[1].toString()), Integer.parseInt(valb[0].toString()), Integer.parseInt(valb[3].toString()), Integer.parseInt(valb[2].toString()), new Color(240, 240, 240));
                            passNew(Integer.parseInt(valb[3].toString()), Integer.parseInt(valb[5].toString()), Integer.parseInt(valb[4].toString()), Integer.parseInt(valb[5].toString()), new Color(240, 240, 240));
                            System.out.println(" txt eka :" + valb[6].toString());
                            if (valb[6].toString().equals("129")) {
                                jTextField129.setText("");
                            } else if (valb[6].toString().equals("151")) {
                                jTextField151.setText("");
                            } else if (valb[6].toString().equals("130")) {
                                jTextField130.setText("");
                            } else if (valb[6].toString().equals("152")) {
                                jTextField152.setText("");
                            } else if (valb[6].toString().equals("131")) {
                                jTextField131.setText("");
                            } else if (valb[6].toString().equals("153")) {
                                jTextField153.setText("");
                            } else if (valb[6].toString().equals("132")) {
                                jTextField132.setText("");
                            } else if (valb[6].toString().equals("154")) {
                                jTextField154.setText("");
                            } else if (valb[6].toString().equals("133")) {
                                jTextField133.setText("");
                            } else if (valb[6].toString().equals("155")) {
                                jTextField155.setText("");
                            } else if (valb[6].toString().equals("134")) {
                                jTextField134.setText("");
                            } else if (valb[6].toString().equals("156")) {
                                jTextField156.setText("");
                            } else if (valb[6].toString().equals("135")) {
                                jTextField135.setText("");
                            } else if (valb[6].toString().equals("157")) {
                                jTextField157.setText("");
                            } else if (valb[6].toString().equals("136")) {
                                jTextField136.setText("");
                            } else if (valb[6].toString().equals("112")) {
                                jTextField112.setText("");
                            } else if (valb[6].toString().equals("158")) {
                                jTextField158.setText("");
                            } else if (valb[6].toString().equals("137")) {
                                jTextField137.setText("");
                            } else if (valb[6].toString().equals("159")) {
                                jTextField159.setText("");
                            } else if (valb[6].toString().equals("138")) {
                                jTextField138.setText("");
                            } else if (valb[6].toString().equals("160")) {
                                jTextField160.setText("");
                            } else if (valb[6].toString().equals("139")) {
                                jTextField139.setText("");
                            } else if (valb[6].toString().equals("161")) {
                                jTextField161.setText("");
                            } else if (valb[6].toString().equals("140")) {
                                jTextField140.setText("");
                            } else if (valb[6].toString().equals("162")) {
                                jTextField162.setText("");
                            } else if (valb[6].toString().equals("141")) {
                                jTextField141.setText("");
                            } else if (valb[6].toString().equals("163")) {
                                jTextField163.setText("");
                            } else if (valb[6].toString().equals("142")) {
                                jTextField142.setText("");
                            } else if (valb[6].toString().equals("164")) {
                                jTextField164.setText("");
                            } else if (valb[6].toString().equals("143")) {
                                jTextField143.setText("");
                            } else if (valb[6].toString().equals("165")) {
                                jTextField165.setText("");
                            } else if (valb[6].toString().equals("144")) {
                                jTextField144.setText("");
                            } else if (valb[6].toString().equals("166")) {
                                jTextField166.setText("");
                            } else if (valb[6].toString().equals("145")) {
                                jTextField145.setText("");
                            } else if (valb[6].toString().equals("167")) {
                                jTextField167.setText("");
                            } else if (valb[6].toString().equals("146")) {
                                jTextField146.setText("");
                            } else if (valb[6].toString().equals("168")) {
                                jTextField168.setText("");
                            } else if (valb[6].toString().equals("147")) {
                                jTextField147.setText("");
                            } else if (valb[6].toString().equals("169")) {
                                jTextField169.setText("");
                            } else if (valb[6].toString().equals("148")) {
                                jTextField148.setText("");
                            } else if (valb[6].toString().equals("170")) {
                                jTextField170.setText("");
                            } else if (valb[6].toString().equals("149")) {
                                jTextField149.setText("");
                            } else if (valb[6].toString().equals("171")) {
                                jTextField171.setText("");
                            } else if (valb[6].toString().equals("150")) {
                                jTextField150.setText("");
                            }
                        }
                    }

                }
                int selectedRaw = jTable6.getSelectedRow();
                System.out.println("selectedRaw : " + selectedRaw);
                double deductBracketValue = Double.parseDouble(jTable6.getValueAt(selectedRaw, 3).toString());
                brackets -= deductBracketValue;
                jTextField89.setText("" + brackets);
                System.out.println("bracket : " + brackets);
                if (jTextField78.getText().equals("")) {
                    totdouble = 0;
                } else {
                    totdouble = Double.parseDouble(jTextField78.getText());
                }
                if (jTextField87.getText().equals("")) {
                    tottrible = 0;
                } else {
                    tottrible = Double.parseDouble(jTextField87.getText());
                }
                if (jTextField77.getText().equals("")) {
                    totq = 0;
                } else {
                    totq = Double.parseDouble(jTextField77.getText());
                }
                if (jTextField88.getText().equals("")) {
                    totqq = 0;
                } else {
                    totqq = Double.parseDouble(jTextField88.getText());
                }
                if (jTextField89.getText().equals("")) {
                    brackets = 0;
                } else {
                    brackets = Double.parseDouble(jTextField89.getText());
                }
                Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
                jLabel39.setText("" + Investment);

//                jTextField89.setText(""+brackets);
                dtm.removeRow(jTable6.getSelectedRow());
                jTextField2.grabFocus();
            }

        }
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected()) {
//            jTextField11.setText(jTextField9.getText());
//
//        }
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected() && jCheckBox4.isSelected()) {
//            jTextField11.setText(jTextField9.getText());
//            jTextField14.setText(jTextField9.getText());
//
//        }
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()) {
//            jTextField11.setText(jTextField9.getText());
//            jTextField14.setText(jTextField9.getText());
//            jTextField17.setText(jTextField9.getText());
//        }
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
//
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected()) {
//
//            if (tribleMin != 0 & tribleMin < 3) {
//
//            } else {
////                JOptionPane.showMessageDialog(null, "sdf sef efr ser s");
//                jTextField12.setText(jTextField8.getText());
//            }
//
//        }
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected() && jCheckBox4.isSelected()) {
//
//            jTextField12.setText(jTextField8.getText());
//            jTextField15.setText(jTextField8.getText());
//
//        }
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()) {
//            jTextField12.setText(jTextField8.getText());
//            jTextField15.setText(jTextField8.getText());
//            jTextField18.setText(jTextField8.getText());
//
//        }
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected()) {
//            jTextField13.setText(jTextField6.getText());
//
//        }
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected() && jCheckBox4.isSelected()) {
//            jTextField13.setText(jTextField6.getText());
//            jTextField16.setText(jTextField6.getText());
//
//        }
//        if (jCheckBox3.isSelected() && jCheckBox2.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected()) {
//            jTextField13.setText(jTextField6.getText());
//            jTextField16.setText(jTextField6.getText());
//            jTextField19.setText(jTextField6.getText());
//
//        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextFieldchitNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldchitNum1ActionPerformed
        jTextFieldHorseName.grabFocus();
    }//GEN-LAST:event_jTextFieldchitNum1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        int i = jTable2.getSelectedRow();
        int y = dtm.getRowCount();
        String getVal = dtm.getValueAt(i, 3).toString();
        double end = Double.parseDouble(getVal);
        String f = "" + i;
        if (f != null) {
            int g = JOptionPane.showConfirmDialog(null, "Are you sure want to remove Item");
            if (g == JOptionPane.YES_OPTION) {
                for (int x = 0; x < y; x++) {
                    int pixel = (int) (end * 23) + 44;
                    passdoublesWhite(40, pixel, 200, pixel);
                    passdoublesWhite(40, pixel + 1, 230, pixel + 1);

                    if (end == 2) {
                        jTextField69.setText("");
                    } else if (end == 3) {
                        jTextField64.setText("");
                    } else if (end == 4) {
                        jTextField75.setText("");
                    } else if (end == 5) {
                        jTextField74.setText("");
                    } else if (end == 6) {
                        jTextField96.setText("");
                    } else if (end == 7) {
                        jTextField95.setText("");
                    } else if (end == 8) {
                        jTextField94.setText("");
                    } else if (end == 9) {
                        jTextField93.setText("");
                    } else if (end == 10) {
                        jTextField113.setText("");
                    } else if (end == 11) {
                        jTextField65.setText("");
                    } else if (end == 12) {
                        jTextField112.setText("");
                    } else if (end == 13) {
                        jTextField111.setText("");
                    } else if (end == 14) {
                        jTextField110.setText("");
                    } else if (end == 15) {
                        jTextField109.setText("");
                    } else if (end == 16) {
                        jTextField108.setText("");
                    } else if (end == 17) {
                        jTextField107.setText("");
                    } else if (end == 18) {
                        jTextField118.setText("");
                    } else if (end == 19) {
                        jTextField119.setText("");
                    } else if (end == 20) {
                        jTextField117.setText("");
                    }

                }
                int selectedRaw = jTable2.getSelectedRow();
                if (jTable2.getValueAt(selectedRaw, 0).equals("Doubles")) {

                    double deductDoubleValue = Double.parseDouble(jTable2.getValueAt(selectedRaw, 5).toString());

                    totdouble = totdouble - deductDoubleValue;
                    jTextField78.setText("" + totdouble);

                    if (jTextField78.getText().equals("")) {
                        totdouble = 0;
                    } else {
                        totdouble = Double.parseDouble(jTextField78.getText());
                    }
                    if (jTextField87.getText().equals("")) {
                        tottrible = 0;
                    } else {
                        tottrible = Double.parseDouble(jTextField87.getText());
                    }
                    if (jTextField77.getText().equals("")) {
                        totq = 0;
                    } else {
                        totq = Double.parseDouble(jTextField77.getText());
                    }
                    if (jTextField88.getText().equals("")) {
                        totqq = 0;
                    } else {
                        totqq = Double.parseDouble(jTextField88.getText());
                    }
                    if (jTextField89.getText().equals("")) {
                        brackets = 0;
                    } else {
                        brackets = Double.parseDouble(jTextField89.getText());
                    }
                    Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
                    jLabel39.setText("" + Investment);

                } else if (jTable2.getValueAt(selectedRaw, 0).equals("Tribles")) {
                    double deductTribleValue = Double.parseDouble(jTable2.getValueAt(selectedRaw, 5).toString());
                    tottrible = tottrible - deductTribleValue;
                    jTextField87.setText("" + tottrible);

                    if (jTextField78.getText().equals("")) {
                        totdouble = 0;
                    } else {
                        totdouble = Double.parseDouble(jTextField78.getText());
                    }
                    if (jTextField87.getText().equals("")) {
                        tottrible = 0;
                    } else {
                        tottrible = Double.parseDouble(jTextField87.getText());
                    }
                    if (jTextField77.getText().equals("")) {
                        totq = 0;
                    } else {
                        totq = Double.parseDouble(jTextField77.getText());
                    }
                    if (jTextField88.getText().equals("")) {
                        totqq = 0;
                    } else {
                        totqq = Double.parseDouble(jTextField88.getText());
                    }
                    if (jTextField89.getText().equals("")) {
                        brackets = 0;
                    } else {
                        brackets = Double.parseDouble(jTextField89.getText());
                    }
                    Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
                    jLabel39.setText("" + Investment);
                } else if (jTable2.getValueAt(selectedRaw, 0).equals("Quadruple (Q)")) {
                    double deductQuadValue = Double.parseDouble(jTable2.getValueAt(selectedRaw, 5).toString());
                    totq = totq - deductQuadValue;
                    jTextField77.setText("" + totq);

                    if (jTextField78.getText().equals("")) {
                        totdouble = 0;
                    } else {
                        totdouble = Double.parseDouble(jTextField78.getText());
                    }
                    if (jTextField87.getText().equals("")) {
                        tottrible = 0;
                    } else {
                        tottrible = Double.parseDouble(jTextField87.getText());
                    }
                    if (jTextField77.getText().equals("")) {
                        totq = 0;
                    } else {
                        totq = Double.parseDouble(jTextField77.getText());
                    }
                    if (jTextField88.getText().equals("")) {
                        totqq = 0;
                    } else {
                        totqq = Double.parseDouble(jTextField88.getText());
                    }
                    if (jTextField89.getText().equals("")) {
                        brackets = 0;
                    } else {
                        brackets = Double.parseDouble(jTextField89.getText());
                    }
                    Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
                    jLabel39.setText("" + Investment);
                } else if (jTable2.getValueAt(selectedRaw, 0).equals("Quintuple  (QQ)")) {
                    double deductQuadValue = Double.parseDouble(jTable2.getValueAt(selectedRaw, 5).toString());
                    totqq = totqq - deductQuadValue;

                    jTextField88.setText("" + totqq);

                    if (jTextField78.getText().equals("")) {
                        totdouble = 0;
                    } else {
                        totdouble = Double.parseDouble(jTextField78.getText());
                    }
                    if (jTextField87.getText().equals("")) {
                        tottrible = 0;
                    } else {
                        tottrible = Double.parseDouble(jTextField87.getText());
                    }
                    if (jTextField77.getText().equals("")) {
                        totq = 0;
                    } else {
                        totq = Double.parseDouble(jTextField77.getText());
                    }
                    if (jTextField88.getText().equals("")) {
                        totqq = 0;
                    } else {
                        totqq = Double.parseDouble(jTextField88.getText());
                    }
                    if (jTextField89.getText().equals("")) {
                        brackets = 0;
                    } else {
                        brackets = Double.parseDouble(jTextField89.getText());
                    }
                    Investment = totsingles + totdouble + tottrible + totq + totqq + brackets;
                    jLabel39.setText("" + Investment);
                }

//                jTextField89.setText(""+brackets);
                dtm.removeRow(jTable2.getSelectedRow());
                jTextField9.grabFocus();
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) addHorse.getModel();
            DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel dtm3 = (DefaultTableModel) jTable6.getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
            String f = "" + i;
            if (f != null) {
                int g = JOptionPane.showConfirmDialog(null, "Are you sure want to Add this chit");
                if (g == JOptionPane.YES_OPTION) {

                    int max = ChitRegistrationController.serchMaxItem();
//                    List<ChitRegistration> list = ChitRegistrationController.serchMaxItem();
//                    int max = 1;
//                    for (int i = 0; i < list.size(); i++) {
//                        System.out.println("mokakda me : "+list.get(i).getChitRegistration_ID());
                    System.out.println("mokakda me3 : " + max);
////                        max = list.get(i).getChitRegistration_ID();
//                        max++;
//                    }
                    ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                    ResultSet rs = Db.search("SELECT MAX(Chit_ID)FROM chit_registration");
//                    int max = 1;
//                    while (rs.next()) {
//                        max = rs.getInt("MAX(Chit_ID)");
//                        max++;
//                    }
                    ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                    Date date = new Date();
                    String currentDate = dateFormat.format(date);

                    int y = dtm.getRowCount();
                    int horcesOfChitItem;
                    for (int i = 0; i < y; i++) {
                        horcesOfChitItem = Integer.parseInt(dtm.getValueAt(i, 0).toString());
                        System.out.println("item 1 : " + "null");
                        System.out.println("item 2 : " + horcesOfChitItem);
                        System.out.println("item 3 : " + max);
                        System.out.println("item 41 : " + dtm.getValueAt(i, 1).toString());
                        System.out.println("item 5 : " + dtm.getValueAt(i, 2).toString());
                        HorcesOfChit hoc = new HorcesOfChit(null, horcesOfChitItem, max, dtm.getValueAt(i, 1).toString(), dtm.getValueAt(i, 2).toString());
                        HorcesOfChitController.addHorcesOfChit(hoc);

                        ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                        Db.sud("INSERT into horses_of_chit (item_ID,Chit_ID,Horse_Name,Pora)VALUES('" + dtm.getValueAt(i, 0) + "','" + max + "','" + dtm.getValueAt(i, 1) + "','" + dtm.getValueAt(i, 2) + "')");
                        ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                    }
                    int Packet_NO = Integer.parseInt(jTextFieldcenterNum.getText());
                    double Current_IN = Double.parseDouble(jTextFieldchitNum1.getText());
                    double Actual_IN = Double.parseDouble(jLabel39.getText());
                    ChitRegistration chtregistration = new ChitRegistration(null, Packet_NO, jTextFieldchitNum.getText(), Current_IN, Actual_IN, maxLesCommision, jTextField11.getText());
                    ChitRegistrationController.addChitRegistration(chtregistration);

                    ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                    Db.sud("INSERT into chit_registration (Packet_NO,Chit_NO,Current_IN,Actual_IN,Date) VALUES('" + jTextFieldcenterNum.getText() + "','" + jTextFieldchitNum.getText() + "','" + jTextFieldchitNum1.getText() + "','" + jLabel39.getText() + "','" + jTextField11.getText() + "')");
//                    System.out.println("dd : " + jTable2.getRowCount());
                    ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                    int count = jTable2.getRowCount();
                    if (jTable2.getRowCount() != 0) {
                        for (int i = 0; i < count; i++) {
                            if (dtm2.getValueAt(i, 0).equals("Singales")) {
                                SingleM singles = new SingleM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                SinglesController.addSingles(singles);
                            }
                            if (dtm2.getValueAt(i, 0).equals("Doubles")) {
                                DoublesM doubles = new DoublesM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                DoublesController.addDoubles(doubles);
                                ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                                Db.sud("INSERT into doubles VALUES('" + max + "','" + dtm2.getValueAt(i, 1) + "','" + dtm2.getValueAt(i, 2) + "','" + dtm2.getValueAt(i, 3) + "','" + dtm2.getValueAt(i, 4) + "','" + dtm2.getValueAt(i, 5) + "','" + dtm2.getValueAt(i, 6) + "')");
                                ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                            }
                            if (dtm2.getValueAt(i, 0).equals("Tribles")) {
                                TriblesM tribles = new TriblesM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                TriblesController.addDoubles(tribles);
                                ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                                Db.sud("INSERT into tribles VALUES('" + max + "','" + dtm2.getValueAt(i, 1) + "','" + dtm2.getValueAt(i, 2) + "','" + dtm2.getValueAt(i, 3) + "','" + dtm2.getValueAt(i, 4) + "','" + dtm2.getValueAt(i, 5) + "','" + dtm2.getValueAt(i, 6) + "')");
                                ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                            }
                            if (dtm2.getValueAt(i, 0).equals("Quadruple (Q)")) {
                                QuadrupleM quad = new QuadrupleM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                QuadrupleController.addDoubles(quad);
                                ////////////////////////modified2015-08-11//////////////////////////////////////////            
//                                Db.sud("INSERT into quadruple VALUES('" + max + "','" + dtm2.getValueAt(i, 1) + "','" + dtm2.getValueAt(i, 2) + "','" + dtm2.getValueAt(i, 3) + "','" + dtm2.getValueAt(i, 4) + "','" + dtm2.getValueAt(i, 5) + "','" + dtm2.getValueAt(i, 6) + "')");
                                ////////////////////////modified2015-08-11//////////////////////////////////////////            
                            }
                            if (dtm2.getValueAt(i, 0).equals("Quintuple  (QQ)")) {
                                QuintupleM quin = new QuintupleM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                QuintupleController.addDoubles(quin);
                                ////////////////////////modified2015-08-11//////////////////////////////////////////            
//                                Db.sud("INSERT into quadruple VALUES('" + max + "','" + dtm2.getValueAt(i, 1) + "','" + dtm2.getValueAt(i, 2) + "','" + dtm2.getValueAt(i, 3) + "','" + dtm2.getValueAt(i, 4) + "','" + dtm2.getValueAt(i, 5) + "','" + dtm2.getValueAt(i, 6) + "')");
                                ////////////////////////modified2015-08-11//////////////////////////////////////////            
                            }

                        }

                    }

                    int bracket = jTable6.getRowCount();
                    if (jTable6.getRowCount() != 0) {
                        for (int i = 0; i < bracket; i++) {
                            Bracket brackets = new Bracket(max, dtm3.getValueAt(i, 0).toString(), dtm3.getValueAt(i, 1).toString(), dtm3.getValueAt(i, 2).toString(), dtm3.getValueAt(i, 3).toString(), dtm3.getValueAt(i, 4).toString());
                            BracketController.addBrackets(brackets);
////////////////////////modified2015-08-11//////////////////////////////////////////            
//                            Db.sud("INSERT into bracket VALUES('" + max + "','" + dtm3.getValueAt(i, 0) + "','" + dtm3.getValueAt(i, 1) + "','" + dtm3.getValueAt(i, 2) + "','" + dtm3.getValueAt(i, 3) + "','" + dtm3.getValueAt(i, 4) + "')");
////////////////////////modified2015-08-11//////////////////////////////////////////            
                        }

                    }
                }

            }
            item = 1;
            jTextFieldchitNum.setText("");
            jTextFieldchitNum1.setText("");
            dtm.setRowCount(0);
            dtm2.setRowCount(0);
            dtm3.setRowCount(0);
            dtm1.setRowCount(0);
            jTextField76.setText("");
            jTextField78.setText("");
            jTextField87.setText("");
            jTextField77.setText("");
            jTextField88.setText("");
            jTextField89.setText("");
            jLabel39.setText("");
            canvas.updateUI();

            jTextField93.setText("");
            jTextField94.setText("");
            jTextField95.setText("");
            jTextField96.setText("");
            jTextField69.setText("");
            jTextField64.setText("");
            jTextField74.setText("");
            jTextField75.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField20.setText("");
            jTextField21.setText("");
            jTextField22.setText("");
            jTextField23.setText("");
            jTextField24.setText("");
            jTextField25.setText("");
            jTextField26.setText("");
            jTextField27.setText("");
            jTextField28.setText("");
            jTextField29.setText("");
            jTextField30.setText("");
            jTextField31.setText("");
            jTextField32.setText("");
            jTextField33.setText("");
            jTextField34.setText("");
            jTextField35.setText("");
            jTextField36.setText("");
            jTextField37.setText("");
            jTextField38.setText("");
            jTextField39.setText("");
            jTextField42.setText("");
            jTextField44.setText("");
            jTextField45.setText("");
            jTextField49.setText("");
            jTextField50.setText("");
            jTextField52.setText("");
            jTextField53.setText("");
            jTextField56.setText("");
            jTextField57.setText("");
            jTextField58.setText("");
            jTextField59.setText("");
            jTextField60.setText("");
            jTextField61.setText("");
            jTextField62.setText("");
            jTextField63.setText("");
            jTextField54.setText("");
            jTextField66.setText("");
            jTextField67.setText("");
            jTextField68.setText("");
            jTextField70.setText("");
            jTextField71.setText("");
            jTextField73.setText("");
            jTextField79.setText("");
            jTextField80.setText("");
            jTextField81.setText("");
            jTextField82.setText("");
            jTextField83.setText("");
            jTextField84.setText("");
            jTextField85.setText("");
            jTextField86.setText("");
            jTextField97.setText("");
            jTextField72.setText("");
            jTextField98.setText("");
            jTextField99.setText("");
            jTextField100.setText("");
            jTextField101.setText("");
            jTextField102.setText("");
            jTextField103.setText("");
            jTextField104.setText("");
            jTextField105.setText("");
            jTextField106.setText("");
            jTextField107.setText("");
            jTextField108.setText("");
            jTextField109.setText("");
            jTextField110.setText("");
            jTextField111.setText("");
            jTextField112.setText("");
            jTextField65.setText("");
            jTextField113.setText("");
            jTextField117.setText("");
            jTextField118.setText("");
            jTextField119.setText("");
            jTextField40.setText("");
            jTextField41.setText("");
            jTextField43.setText("");
            jTextField46.setText("");
            jTextField47.setText("");
            jTextField48.setText("");
            jTextField51.setText("");
            jTextField55.setText("");
            jTextField114.setText("");
            jTextField115.setText("");
            jTextField116.setText("");
            jTextField120.setText("");
            jTextField121.setText("");
            jTextField122.setText("");
            jTextField123.setText("");
            jTextField124.setText("");
            jTextField125.setText("");
            jTextField126.setText("");
            jTextField127.setText("");
            jTextField128.setText("");
            jTextField129.setText("");
            jTextField130.setText("");
            jTextField131.setText("");
            jTextField132.setText("");
            jTextField133.setText("");
            jTextField134.setText("");
            jTextField135.setText("");
            jTextField136.setText("");
            jTextField137.setText("");
            jTextField138.setText("");
            jTextField139.setText("");
            jTextField140.setText("");
            jTextField141.setText("");
            jTextField142.setText("");
            jTextField143.setText("");
            jTextField144.setText("");
            jTextField145.setText("");
            jTextField146.setText("");
            jTextField147.setText("");
            jTextField148.setText("");
            jTextField149.setText("");
            jTextField150.setText("");
            jTextField151.setText("");
            jTextField152.setText("");
            jTextField153.setText("");
            jTextField154.setText("");
            jTextField155.setText("");
            jTextField156.setText("");
            jTextField157.setText("");
            jTextField158.setText("");
            jTextField159.setText("");
            jTextField160.setText("");
            jTextField161.setText("");
            jTextField162.setText("");
            jTextField163.setText("");
            jTextField164.setText("");
            jTextField165.setText("");
            jTextField166.setText("");
            jTextField167.setText("");
            jTextField168.setText("");
            jTextField169.setText("");
            jTextField170.setText("");
            jTextField171.setText("");

            double invsetments = 0;
            List<ChitRegistration> list1 = ChitRegistrationController.searchChitRegistrationByDateAndCenterId(jTextField11.getText(), jTextFieldcenterNum.getText());
            for (int i = 0; i < list1.size(); i++) {
                invsetments += list1.get(i).getChitRegistration_ActualInvestment();
            }
            jLabel44.setText("" + invsetments);

            totsingles = 0;
            totdouble = 0;
            tottrible = 0;
            totq = 0;
            totqq = 0;
            brackets = 0;
            Investment = 0;
            one = two = three = four = five = six = seven = eight = nine = ten = eleven = twelve = thirteen = fourteen = fifteen = sixteen = seventeen = eighteen = nineteen = twenty = 0;
///////////////////////modified2015-08-11//////////////////////////////////////////            
//            ResultSet rs = Db.search("SELECT Actual_IN FROM chit_registration WHERE Date='" + jTextField11.getText() + "' AND Packet_NO='" + jTextFieldcenterNum.getText() + "'");
//            double invsetment = 0;
//            while (rs.next()) {
//                invsetment += Double.parseDouble(rs.getString("Actual_IN"));
//
//            }
//            jLabel44.setText("" + invsetment);
            ///////////////////////modified2015-08-11//////////////////////////////////////////   
            jTextFieldHorseName.setText("");
            jTextFieldchitNum.grabFocus();

        } catch (Exception ex) {
            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            operations op = new operations();
            String date = op.getVal();
            Calculations c = new Calculations();
            ArrayList<Double> winSide = new ArrayList<Double>();
            ArrayList<Double> doubles = new ArrayList<Double>();

            List<Packet> listPacket = PacketController.serchAllItem(date);
            List<ChitRegistration> listChitRegistration;
            List<HorcesOfChit> listHorcesOfChit;
            List<Results> ListResults;
            List<ResultDetails> ListResultDetails;
            List<DoublesM> ListDoubles;
            int Center_ID;
            int chitRegistration_ID = 0;
            int result_ID;
            String horseOfChit_Pora;
            String HorcesOfChit_Horsename;
            double winValue = 0;
            int counter = 0;
            int finishedPacket = 0;
            for (int i = 0; i < listPacket.size(); i++) {
                Center_ID = listPacket.get(i).getCenter_ID();
                listChitRegistration = ChitRegistrationController.searchAllChitRegistrationByIDNumber(Center_ID);

                for (int j = 0; j < listChitRegistration.size(); j++) {
                    System.out.println("packet ekaka chits : " + listChitRegistration.get(j).getChitRegistration_ID());
                    chitRegistration_ID = listChitRegistration.get(j).getChitRegistration_ID();
                    listHorcesOfChit = HorcesOfChitController.searchAllHorcesOfChitByIDNumber(chitRegistration_ID);

                    for (int k = 0; k < listHorcesOfChit.size(); k++) {
                        HorcesOfChit_Horsename = listHorcesOfChit.get(k).getHorcesOfChit_HorseName();
                        System.out.println("chit ekaka inna horses : " + listHorcesOfChit.get(k).getHorcesOfChit_HorseName());
                        horseOfChit_Pora = listHorcesOfChit.get(k).getHorcesOfChit_Pora();
                        ListResults = ResultsController.serchAllItem();

                        for (int l = 0; l < ListResults.size(); l++) {
                            if (horseOfChit_Pora.equals(ListResults.get(l).getPora())) {
                                result_ID = ListResults.get(l).getResult_ID();
                                //       System.out.println("equal pora : " + ListResults.get(l).getPora());
                                //       System.out.println("equal pora : " + listHorcesOfChit.get(k).getHorcesOfChit_HorseName());      

                                ListResultDetails = ResultDetailsController.serchAllItem();

                                for (int m = 0; m < ListResultDetails.size(); m++) {
                                    if (result_ID == ListResultDetails.get(m).getResult_ID()) {
                                        if (HorcesOfChit_Horsename.equals(ListResultDetails.get(m).getResultDetails_HorseName())) {
                                            //         System.out.println("HorcesOfChit_Horsename : " + HorcesOfChit_Horsename);
                                            //         System.out.println("ListResultDetails : " + ListResultDetails.get(m).getResultDetails_HorseName());
                                            if ("Win (1)".equals(ListResultDetails.get(m).getResultDetails_result())) {
                                                winValue = Double.parseDouble(ListResultDetails.get(m).getResultDetails_Win());
                                                winSide.add(winValue);
                                                counter = 1;
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
                        } else {
                            counter = 0;
                        }

                    }
                    System.out.println("win side : " + winSide.toString());
                    System.out.println("aaaaaaaaaaaaa");
                    int startVal = 0;
                    int endVal = 0;
                    ListDoubles = DoublesController.searchAllDoublesByIDNumber(chitRegistration_ID);
                    for (int n = 0; n < ListDoubles.size(); n++) {
                        startVal = Integer.parseInt(ListDoubles.get(n).getDoubles_To().toString());
                        endVal = Integer.parseInt(ListDoubles.get(n).getDoubles_For().toString());
                        for (int t = (startVal - 1); t < endVal; t++) {
                            doubles.add(winSide.get(t));
                        }
                    }
                    c.passToDouble(doubles);
                    winSide.clear();
                    doubles.clear();
                }
                if (finishedPacket == 1) {
//                    ChitRegistration chtregistration = ChitRegistrationController.searchCenterIdByIDNumber(listHorcesOfChit.get(k).getChitRegistration_ID());
//                    System.out.println("cenetr ID eka : " + chtregistration.getCenter_ID());
                    System.out.println("packet complete : " + listPacket.get(i).getCenter_ID());
                    System.out.println("packet complete : " + listPacket.get(i).getCenter_ID());
                    finishedPacket = 0;
                }
            }

            //        try {
            //            Calculations c = new Calculations();
            //            ArrayList<Double> winSide = new ArrayList<Double>();
            //            ArrayList<Double> placeSide = new ArrayList<Double>();
            //            ArrayList<Double> doubles = new ArrayList<Double>();
            //            String chitID = null;
            //
            //            String packetNO;
            //            ResultSet rsfilterPacket = Db.search("SELECT Packet_NO FROM packet");
            //            ResultSet rsfilterChit;
            //            while (rsfilterPacket.next()) {
            //                int nulValue = 0;
            //                packetNO = rsfilterPacket.getString("Packet_NO");
            //                rsfilterChit = Db.search("SELECT chit_registration.Chit_ID,chit_registration.Packet_NO,horses_of_chit.Chit_ID FROM chit_registration INNER JOIN horses_of_chit ON chit_registration.Chit_ID=horses_of_chit.Chit_ID WHERE Packet_NO='" + packetNO + "'");
            //                while (rsfilterChit.next()) {
            //                    System.out.println("chit IDxczxczxczxczxczczxczczxczc  : " + rsfilterChit.getString("Chit_ID"));
            //                    System.out.println("packet number eka : " + packetNO);
            //
            //                    ResultSet rss = Db.search("SELECT horses_of_chit.Chit_ID,horses_of_chit.Pora,result_of_pora.pora,result_of_pora.Result_Of_Pora_ID FROM horses_of_chit LEFT JOIN result_of_pora ON horses_of_chit.Pora=result_of_pora.pora ORDER BY horses_of_chit_ID");
            //
            //                    while (rss.next()) {
            //                        if (null == rss.getString("Result_Of_Pora_ID")) {
            //                            nulValue = 1;
            //                            chitID = rss.getString("Chit_ID");
            //                            System.out.println("dddddddddddddddddddd : " + chitID);
            //                        }
            //
            //                    }
            //                }
            //                if (nulValue != 1) {
            //                    ResultSet rs = Db.search("SELECT horses_of_chit.Chit_ID,horses_of_chit.item_ID,horses_of_chit.Horse_Name,result_of_pora.Pora,result_of_pora.Result_Of_Pora_ID FROM horses_of_chit INNER JOIN result_of_pora ON horses_of_chit.Pora=result_of_pora.Pora");
            //                    ResultSet rs1;
            //                    String resultOfPora;
            //                    int itemId;
            //                    double winValue;
            //                    double placeValue;
            //                    String horseName;
            //
            //                    while (rs.next()) {
            //
            //                        itemId = Integer.parseInt(rs.getString("item_ID"));
            //                        horseName = rs.getString("Horse_Name");
            //                        resultOfPora = rs.getString("Result_Of_Pora_ID");
            //                        rs1 = Db.search("SELECT*From result_of_pora_details WHERE Result_Of_Pora_ID='" + resultOfPora + "'");
            //                        while (rs1.next()) {
            //
            //                            if (rs1.getString("Results").equals("Win (1)")) {
            //                                if (horseName.equals(rs1.getString("Horse_name"))) {
            //
            //                                    winValue = Double.parseDouble(rs1.getString("Win"));
            ////                            placeValue = Double.parseDouble(rs1.getString("Place"));
            //                                    winSide.add(winValue);
            //
            ////                            placeSide.add(placeValue);
            //                                } else {
            //                                    winSide.add(0.0);
            ////                        placeSide.add(0.0);
            //                                }
            //                            }
            //
            //                        }
            //                    }
            //                    ResultSet rsDouble = Db.search("SELECT*FROM doubles");
            //                    int startVal = 0;
            //                    int endVal = 0;
            //                    while (rsDouble.next()) {
            //                        startVal = rsDouble.getInt("To");
            //                        endVal = rsDouble.getInt("For");
            //                        for (int i = (startVal - 1); i < endVal; i++) {
            //                            doubles.add(winSide.get(i));
            //
            //                            c.passToDouble(doubles);
            //
            //                        }
            //                        getTotDouble += c.getDouble();
            //                        doubles.clear();
            //                    }
            //                } else {
            //                    ResultSet rspendingPacket = Db.search("SELECT Chit_ID,Packet_NO FROM chit_registration WHERE Chit_ID='" + chitID + "'");
            //                    while (rspendingPacket.next()) {
            //                        System.out.println("scr  : " + rspendingPacket.getString("Packet_NO"));
            //                    }
            //
            //                    System.out.println("value ekak adui: ");
            //                }
            //            }
            //
            ////            c.passToTribles(winSide);
            //        } catch (Exception ex) {
            //            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
            //        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            jTextFieldcenterNum.grabFocus();
            int centerID = Integer.parseInt(jTextFieldcenterNum.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(jTextField11.getText());

            Packet packet = new Packet(null, centerID, date, Double.parseDouble(jLabel44.getText()));
            PacketController.addPacket(packet);
//            Db.sud("INSERT into packet (Packet_NO,Date,FC) VALUES('" + jTextFieldcenterNum.getText() + "','" + jTextField11.getText() + "','" + jLabel44.getText() + "')");
//
            operations dr = new operations();
            dr.passVal("");
            jTextFieldcenterNum.setText("");
//            jLabel11.setText("");
//            jTextFieldcash.setText("");
            jLabel44.setText("");
////            String sql1 = "C:/Program Files/MySQL/MySQL Server 4.1/bin/mysqldump -uroot -p123 racebyrace -r j:\\racebyrace.sql";
////            Runtime.getRuntime().exec(sql1);
        } catch (Exception ex) {
            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost

        int minimum = 0;
        if (jTextField8.getText().length() != 0) {
            minimum = Integer.parseInt(jTextField8.getText());
        }

        if (jCheckBox3.isSelected()) {
            if (minimum < 3) {
                JOptionPane.showMessageDialog(rootPane, "Minimum tribles are 3");
                jTextField8.setText("");
                jTextField9.grabFocus();
            }

        }
        if (jCheckBox4.isSelected()) {
            if (minimum < 4) {
                JOptionPane.showMessageDialog(rootPane, "Minimum Quadruples are 4");
                jTextField8.setText("");
                jTextField9.grabFocus();
            }

        }
        if (jCheckBox5.isSelected()) {
            if (minimum < 5) {
                JOptionPane.showMessageDialog(rootPane, "Minimum Quintuples are 5");
                jTextField8.setText("");
                jTextField9.grabFocus();
            }

        }
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextFieldcenterNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldcenterNumFocusGained
        operations dr = new operations();
        System.out.println("A : " + dr.getVal());
        jTextFieldcenterNum.setText(dr.getVal());
    }//GEN-LAST:event_jTextFieldcenterNumFocusGained

    private void jTextFieldcenterNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldcenterNumFocusLost
        try {

            boolean result = PacketController.searchChitRegistrationByDateAndCenterId(jTextField11.getText(), jTextFieldcenterNum.getText());
            if (result == true) {
                System.out.println("athule bn");
                JOptionPane.showMessageDialog(rootPane, "This packet is allredy added");
                operations dr = new operations();
                dr.passVal("");
                jTextFieldcenterNum.selectAll();
                jTextFieldcenterNum.grabFocus();
//                jLabel11.setText("");
            } else {
                System.out.println("eliye bn");
//            ResultSet rsPacket = Db.search("SELECT Packet_NO,Date FROM packet WHERE Packet_NO='" + jTextFieldcenterNum.getText() + "' AND Date='" + jTextField11.getText() + "'");
//            int inner = 0;
//            while (rsPacket.next()) {
//                inner = 1;
//
//            }
//            if (inner == 1) {
//
//                JOptionPane.showMessageDialog(rootPane, "This packet is allredy added");
//                operations dr = new operations();
//                dr.passVal("");
//                jTextFieldcenterNum.setText("");
//                jTextFieldcenterNum.grabFocus();
//                jLabel11.setText("");
//            }

                List<Center> list = CenterController.searchCenterByName(jTextFieldcenterNum.getText());
                for (int i = 0; i < list.size(); i++) {
//                    jLabel11.setText(list.get(i).getCenter_Name());

                }
//            ResultSet rsCenter = Db.search("SELECT c_name from center WHERE c_number='" + jTextFieldcenterNum.getText() + "'");
//            while (rsCenter.next()) {
//                jLabel11.setText(rsCenter.getString("c_name"));
//
//            }
                double invsetments = 0;
                List<ChitRegistration> list1 = ChitRegistrationController.searchChitRegistrationByDateAndCenterId(jTextField11.getText(), jTextFieldcenterNum.getText());
                for (int i = 0; i < list1.size(); i++) {
                    invsetments += list1.get(i).getChitRegistration_ActualInvestment();
                }
                jLabel44.setText("" + invsetments);
//            ResultSet rs = Db.search("SELECT Actual_IN FROM chit_registration WHERE Date='" + jTextField11.getText() + "' AND Packet_NO='" + jTextFieldcenterNum.getText() + "'");
//            double invsetment = 0;
//            while (rs.next()) {
//                invsetment += Double.parseDouble(rs.getString("Actual_IN"));
//
//            }
            }
        } catch (Exception ex) {
            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldcenterNumFocusLost

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed

        if (evt.getKeyCode() == 32) {
            if (jTextField7.getText().length() != 0) {
                System.out.println("lenth eka 0 nevei ");
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jButton3.grabFocus();
            } else if (jTextField7.getText().length() == 0) {
                System.out.println("lenth eka 0  ");

                jLabel2.grabFocus();
            }
        }

    }//GEN-LAST:event_jTextField7KeyPressed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        jLabel20.setVisible(false);
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        jLabel20.setVisible(true);
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        if (jCheckBox7.isSelected()) {

            if (jTextField10.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Field is con't empty");
                jTextField10.grabFocus();
            } else {
                jButton8.grabFocus();
            }

        }
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jLabel20.setVisible(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel20.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        if (evt.getKeyCode() == 112) {
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(false);
            jTextField3.grabFocus();
            jTextField10.setText("");
            jLabel23.setVisible(false);
            jLabel22.setVisible(false);
        }
        if (evt.getKeyCode() == 113) {
            jCheckBox7.setSelected(true);
            jCheckBox6.setSelected(false);
            jTextField3.setText("");
            jTextField10.grabFocus();
            jLabel22.setVisible(true);
            jLabel23.setVisible(false);
        }
        if (evt.getKeyCode() == 114) {
            jCheckBox7.setSelected(true);
            jCheckBox6.setSelected(true);
            jTextField3.grabFocus();
            jLabel23.setVisible(true);
            jLabel22.setVisible(false);
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void addHorseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addHorseMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) addHorse.getModel();
        DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();

        int y = addHorse.getSelectedRow();
        dtm.removeRow(y);
        dtm1.removeRow(y);
        item--;


    }//GEN-LAST:event_addHorseMouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed

        if (jTextField7.getText().length() != 0) {
            jButton3.grabFocus();
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
        } else {
            jLabel2.grabFocus();
        }

    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
        try {
            DefaultTableModel dtm = (DefaultTableModel) addHorse.getModel();
            DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel dtm3 = (DefaultTableModel) jTable6.getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
            String f = "" + i;
            if (f != null) {
                int g = JOptionPane.showConfirmDialog(null, "Are you sure want to remove Item");
                if (g == JOptionPane.YES_OPTION) {

                    int max = ChitRegistrationController.serchMaxItem();
//                    List<ChitRegistration> list = ChitRegistrationController.serchMaxItem();
//                    int max = 1;
//                    for (int i = 0; i < list.size(); i++) {
//                        System.out.println("mokakda me : "+list.get(i).getChitRegistration_ID());
                    System.out.println("mokakda me3 : " + max);
////                        max = list.get(i).getChitRegistration_ID();
//                        max++;
//                    }
                    ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                    ResultSet rs = Db.search("SELECT MAX(Chit_ID)FROM chit_registration");
//                    int max = 1;
//                    while (rs.next()) {
//                        max = rs.getInt("MAX(Chit_ID)");
//                        max++;
//                    }
                    ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                    Date date = new Date();
                    String currentDate = dateFormat.format(date);

                    int y = dtm.getRowCount();
                    int horcesOfChitItem;
                    for (int i = 0; i < y; i++) {
                        horcesOfChitItem = Integer.parseInt(dtm.getValueAt(i, 0).toString());
                        System.out.println("item 1 : " + "null");
                        System.out.println("item 2 : " + horcesOfChitItem);
                        System.out.println("item 3 : " + max);
                        System.out.println("item 41 : " + dtm.getValueAt(i, 1).toString());
                        System.out.println("item 5 : " + dtm.getValueAt(i, 2).toString());
                        HorcesOfChit hoc = new HorcesOfChit(null, horcesOfChitItem, max, dtm.getValueAt(i, 1).toString(), dtm.getValueAt(i, 2).toString());
                        HorcesOfChitController.addHorcesOfChit(hoc);

                        ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                        Db.sud("INSERT into horses_of_chit (item_ID,Chit_ID,Horse_Name,Pora)VALUES('" + dtm.getValueAt(i, 0) + "','" + max + "','" + dtm.getValueAt(i, 1) + "','" + dtm.getValueAt(i, 2) + "')");
                        ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                    }
                    int Packet_NO = Integer.parseInt(jTextFieldcenterNum.getText());
                    double Current_IN = Double.parseDouble(jTextFieldchitNum1.getText());
                    double Actual_IN = Double.parseDouble(jLabel39.getText());
                    ChitRegistration chtregistration = new ChitRegistration(null, Packet_NO, jTextFieldchitNum.getText(), Current_IN, Actual_IN, maxLesCommision, jTextField11.getText());
                    ChitRegistrationController.addChitRegistration(chtregistration);

                    ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                    Db.sud("INSERT into chit_registration (Packet_NO,Chit_NO,Current_IN,Actual_IN,Date) VALUES('" + jTextFieldcenterNum.getText() + "','" + jTextFieldchitNum.getText() + "','" + jTextFieldchitNum1.getText() + "','" + jLabel39.getText() + "','" + jTextField11.getText() + "')");
//                    System.out.println("dd : " + jTable2.getRowCount());
                    ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                    int count = jTable2.getRowCount();
                    if (jTable2.getRowCount() != 0) {
                        for (int i = 0; i < count; i++) {
                            if (dtm2.getValueAt(i, 0).equals("Singales")) {
                                SingleM singles = new SingleM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                SinglesController.addSingles(singles);
                            }
                            if (dtm2.getValueAt(i, 0).equals("Doubles")) {
                                DoublesM doubles = new DoublesM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                DoublesController.addDoubles(doubles);
                                ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                                Db.sud("INSERT into doubles VALUES('" + max + "','" + dtm2.getValueAt(i, 1) + "','" + dtm2.getValueAt(i, 2) + "','" + dtm2.getValueAt(i, 3) + "','" + dtm2.getValueAt(i, 4) + "','" + dtm2.getValueAt(i, 5) + "','" + dtm2.getValueAt(i, 6) + "')");
                                ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                            }
                            if (dtm2.getValueAt(i, 0).equals("Tribles")) {
                                TriblesM tribles = new TriblesM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                TriblesController.addDoubles(tribles);
                                ////////////////////////modified2015-08-11//////////////////////////////////////////                  
//                                Db.sud("INSERT into tribles VALUES('" + max + "','" + dtm2.getValueAt(i, 1) + "','" + dtm2.getValueAt(i, 2) + "','" + dtm2.getValueAt(i, 3) + "','" + dtm2.getValueAt(i, 4) + "','" + dtm2.getValueAt(i, 5) + "','" + dtm2.getValueAt(i, 6) + "')");
                                ////////////////////////modified2015-08-11//////////////////////////////////////////                  
                            }
                            if (dtm2.getValueAt(i, 0).equals("Quadruple (Q)")) {
                                QuadrupleM quad = new QuadrupleM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                QuadrupleController.addDoubles(quad);
                                ////////////////////////modified2015-08-11//////////////////////////////////////////            
//                                Db.sud("INSERT into quadruple VALUES('" + max + "','" + dtm2.getValueAt(i, 1) + "','" + dtm2.getValueAt(i, 2) + "','" + dtm2.getValueAt(i, 3) + "','" + dtm2.getValueAt(i, 4) + "','" + dtm2.getValueAt(i, 5) + "','" + dtm2.getValueAt(i, 6) + "')");
                                ////////////////////////modified2015-08-11//////////////////////////////////////////            
                            }
                            if (dtm2.getValueAt(i, 0).equals("Quintuple  (QQ)")) {
                                QuintupleM quin = new QuintupleM(max, dtm2.getValueAt(i, 1).toString(), dtm2.getValueAt(i, 2).toString(), dtm2.getValueAt(i, 3).toString(), dtm2.getValueAt(i, 4).toString(), dtm2.getValueAt(i, 5).toString(), dtm2.getValueAt(i, 6).toString());
                                QuintupleController.addDoubles(quin);
                                ////////////////////////modified2015-08-11//////////////////////////////////////////            
//                                Db.sud("INSERT into quadruple VALUES('" + max + "','" + dtm2.getValueAt(i, 1) + "','" + dtm2.getValueAt(i, 2) + "','" + dtm2.getValueAt(i, 3) + "','" + dtm2.getValueAt(i, 4) + "','" + dtm2.getValueAt(i, 5) + "','" + dtm2.getValueAt(i, 6) + "')");
                                ////////////////////////modified2015-08-11//////////////////////////////////////////            
                            }

                        }

                    }

                    int bracket = jTable6.getRowCount();
                    if (jTable6.getRowCount() != 0) {
                        for (int i = 0; i < bracket; i++) {
                            Bracket brackets = new Bracket(max, dtm3.getValueAt(i, 0).toString(), dtm3.getValueAt(i, 1).toString(), dtm3.getValueAt(i, 2).toString(), dtm3.getValueAt(i, 3).toString(), dtm3.getValueAt(i, 4).toString());
                            BracketController.addBrackets(brackets);
////////////////////////modified2015-08-11//////////////////////////////////////////            
//                            Db.sud("INSERT into bracket VALUES('" + max + "','" + dtm3.getValueAt(i, 0) + "','" + dtm3.getValueAt(i, 1) + "','" + dtm3.getValueAt(i, 2) + "','" + dtm3.getValueAt(i, 3) + "','" + dtm3.getValueAt(i, 4) + "')");
////////////////////////modified2015-08-11//////////////////////////////////////////            
                        }

                    }
                }

            }
            item = 1;
            jTextFieldchitNum.setText("");
            jTextFieldchitNum1.setText("");
            dtm.setRowCount(0);
            dtm2.setRowCount(0);
            dtm3.setRowCount(0);
            dtm1.setRowCount(0);
            jTextField76.setText("");
            jTextField78.setText("");
            jTextField87.setText("");
            jTextField77.setText("");
            jTextField88.setText("");
            jLabel39.setText("");
            canvas.updateUI();

            jTextField93.setText("");
            jTextField94.setText("");
            jTextField95.setText("");
            jTextField96.setText("");
            jTextField69.setText("");
            jTextField64.setText("");
            jTextField74.setText("");
            jTextField75.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField20.setText("");
            jTextField21.setText("");
            jTextField22.setText("");
            jTextField23.setText("");
            jTextField24.setText("");
            jTextField25.setText("");
            jTextField26.setText("");
            jTextField27.setText("");
            jTextField28.setText("");
            jTextField29.setText("");
            jTextField30.setText("");
            jTextField31.setText("");
            jTextField32.setText("");
            jTextField33.setText("");
            jTextField34.setText("");
            jTextField35.setText("");
            jTextField36.setText("");
            jTextField37.setText("");
            jTextField38.setText("");
            jTextField39.setText("");
            jTextField42.setText("");
            jTextField44.setText("");
            jTextField45.setText("");
            jTextField49.setText("");
            jTextField50.setText("");
            jTextField52.setText("");
            jTextField53.setText("");
            jTextField56.setText("");
            jTextField57.setText("");
            jTextField58.setText("");
            jTextField59.setText("");
            jTextField60.setText("");
            jTextField61.setText("");
            jTextField62.setText("");
            jTextField63.setText("");
            jTextField54.setText("");
            jTextField66.setText("");
            jTextField67.setText("");
            jTextField68.setText("");
            jTextField70.setText("");
            jTextField71.setText("");
            jTextField73.setText("");
            jTextField79.setText("");
            jTextField80.setText("");
            jTextField81.setText("");
            jTextField82.setText("");
            jTextField83.setText("");
            jTextField84.setText("");
            jTextField85.setText("");
            jTextField86.setText("");
            jTextField97.setText("");
            jTextField72.setText("");
            jTextField98.setText("");
            jTextField99.setText("");
            jTextField100.setText("");
            jTextField101.setText("");
            jTextField102.setText("");
            jTextField103.setText("");
            jTextField104.setText("");
            jTextField105.setText("");
            jTextField106.setText("");
            jTextField107.setText("");
            jTextField108.setText("");
            jTextField109.setText("");
            jTextField110.setText("");
            jTextField111.setText("");
            jTextField112.setText("");
            jTextField65.setText("");
            jTextField113.setText("");
            jTextField117.setText("");
            jTextField118.setText("");
            jTextField119.setText("");
            jTextField40.setText("");
            jTextField41.setText("");
            jTextField43.setText("");
            jTextField46.setText("");
            jTextField47.setText("");
            jTextField48.setText("");
            jTextField51.setText("");
            jTextField55.setText("");
            jTextField114.setText("");
            jTextField115.setText("");
            jTextField116.setText("");
            jTextField120.setText("");
            jTextField121.setText("");
            jTextField122.setText("");
            jTextField123.setText("");
            jTextField124.setText("");
            jTextField125.setText("");
            jTextField126.setText("");
            jTextField127.setText("");
            jTextField128.setText("");
            jTextField129.setText("");
            jTextField130.setText("");
            jTextField131.setText("");
            jTextField132.setText("");
            jTextField133.setText("");
            jTextField134.setText("");
            jTextField135.setText("");
            jTextField136.setText("");
            jTextField137.setText("");
            jTextField138.setText("");
            jTextField139.setText("");
            jTextField140.setText("");
            jTextField141.setText("");
            jTextField142.setText("");
            jTextField143.setText("");
            jTextField144.setText("");
            jTextField145.setText("");
            jTextField146.setText("");
            jTextField147.setText("");
            jTextField148.setText("");
            jTextField149.setText("");
            jTextField150.setText("");
            jTextField151.setText("");
            jTextField152.setText("");
            jTextField153.setText("");
            jTextField154.setText("");
            jTextField155.setText("");
            jTextField156.setText("");
            jTextField157.setText("");
            jTextField158.setText("");
            jTextField159.setText("");
            jTextField160.setText("");
            jTextField161.setText("");
            jTextField162.setText("");
            jTextField163.setText("");
            jTextField164.setText("");
            jTextField165.setText("");
            jTextField166.setText("");
            jTextField167.setText("");
            jTextField168.setText("");
            jTextField169.setText("");
            jTextField170.setText("");
            jTextField171.setText("");

            double invsetments = 0;
            List<ChitRegistration> list1 = ChitRegistrationController.searchChitRegistrationByDateAndCenterId(jTextField11.getText(), jTextFieldcenterNum.getText());
            for (int i = 0; i < list1.size(); i++) {
                invsetments += list1.get(i).getChitRegistration_ActualInvestment();
            }
            jLabel44.setText("" + invsetments);

            totsingles = 0;
            totdouble = 0;
            tottrible = 0;
            totq = 0;
            totqq = 0;
            brackets = 0;
            Investment = 0;
            one = two = three = four = five = six = seven = eight = nine = ten = eleven = twelve = thirteen = fourteen = fifteen = sixteen = seventeen = eighteen = nineteen = twenty = 0;
///////////////////////modified2015-08-11//////////////////////////////////////////            
//            ResultSet rs = Db.search("SELECT Actual_IN FROM chit_registration WHERE Date='" + jTextField11.getText() + "' AND Packet_NO='" + jTextFieldcenterNum.getText() + "'");
//            double invsetment = 0;
//            while (rs.next()) {
//                invsetment += Double.parseDouble(rs.getString("Actual_IN"));
//
//            }
//            jLabel44.setText("" + invsetment);
            ///////////////////////modified2015-08-11//////////////////////////////////////////   
            jTextFieldHorseName.setText("");
            jTextFieldchitNum.grabFocus();

        } catch (Exception ex) {
            Logger.getLogger(addChits.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) addHorse.getModel();
        DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel dtm3 = (DefaultTableModel) jTable6.getModel();

        item = 1;
        jTextFieldchitNum.setText("");
        jTextFieldchitNum1.setText("");
        dtm.setRowCount(0);
        dtm1.setRowCount(0);
        dtm2.setRowCount(0);
        dtm3.setRowCount(0);
        jTextField76.setText("");
        jTextField78.setText("");
        jTextField87.setText("");
        jTextField77.setText("");
        jTextField88.setText("");
        jTextField89.setText("");
        jLabel39.setText("");
        canvas.updateUI();

        jTextField93.setText("");
        jTextField94.setText("");
        jTextField95.setText("");
        jTextField96.setText("");
        jTextField69.setText("");
        jTextField64.setText("");
        jTextField74.setText("");
        jTextField75.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField42.setText("");
        jTextField44.setText("");
        jTextField45.setText("");
        jTextField49.setText("");
        jTextField50.setText("");
        jTextField52.setText("");
        jTextField53.setText("");
        jTextField56.setText("");
        jTextField57.setText("");
        jTextField58.setText("");
        jTextField59.setText("");
        jTextField60.setText("");
        jTextField61.setText("");
        jTextField62.setText("");
        jTextField63.setText("");
        jTextField54.setText("");
        jTextField66.setText("");
        jTextField67.setText("");
        jTextField68.setText("");
        jTextField70.setText("");
        jTextField71.setText("");
        jTextField73.setText("");
        jTextField79.setText("");
        jTextField80.setText("");
        jTextField81.setText("");
        jTextField82.setText("");
        jTextField83.setText("");
        jTextField84.setText("");
        jTextField85.setText("");
        jTextField86.setText("");
        jTextField97.setText("");
        jTextField72.setText("");
        jTextField98.setText("");
        jTextField99.setText("");
        jTextField100.setText("");
        jTextField101.setText("");
        jTextField102.setText("");
        jTextField103.setText("");
        jTextField104.setText("");
        jTextField105.setText("");
        jTextField106.setText("");
        jTextField107.setText("");
        jTextField108.setText("");
        jTextField109.setText("");
        jTextField110.setText("");
        jTextField111.setText("");
        jTextField112.setText("");
        jTextField65.setText("");
        jTextField113.setText("");
        jTextField117.setText("");
        jTextField118.setText("");
        jTextField119.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        jTextField43.setText("");
        jTextField46.setText("");
        jTextField47.setText("");
        jTextField48.setText("");
        jTextField51.setText("");
        jTextField55.setText("");
        jTextField114.setText("");
        jTextField115.setText("");
        jTextField116.setText("");
        jTextField120.setText("");
        jTextField121.setText("");
        jTextField122.setText("");
        jTextField123.setText("");
        jTextField124.setText("");
        jTextField125.setText("");
        jTextField126.setText("");
        jTextField127.setText("");
        jTextField128.setText("");
        jTextField129.setText("");
        jTextField130.setText("");
        jTextField131.setText("");
        jTextField132.setText("");
        jTextField133.setText("");
        jTextField134.setText("");
        jTextField135.setText("");
        jTextField136.setText("");
        jTextField137.setText("");
        jTextField138.setText("");
        jTextField139.setText("");
        jTextField140.setText("");
        jTextField141.setText("");
        jTextField142.setText("");
        jTextField143.setText("");
        jTextField144.setText("");
        jTextField145.setText("");
        jTextField146.setText("");
        jTextField147.setText("");
        jTextField148.setText("");
        jTextField149.setText("");
        jTextField150.setText("");
        jTextField151.setText("");
        jTextField152.setText("");
        jTextField153.setText("");
        jTextField154.setText("");
        jTextField155.setText("");
        jTextField156.setText("");
        jTextField157.setText("");
        jTextField158.setText("");
        jTextField159.setText("");
        jTextField160.setText("");
        jTextField161.setText("");
        jTextField162.setText("");
        jTextField163.setText("");
        jTextField164.setText("");
        jTextField165.setText("");
        jTextField166.setText("");
        jTextField167.setText("");
        jTextField168.setText("");
        jTextField169.setText("");
        jTextField170.setText("");
        jTextField171.setText("");

        totsingles = 0;
        totdouble = 0;
        tottrible = 0;
        totq = 0;
        totqq = 0;
        brackets = 0;
        Investment = 0;
        one = two = three = four = five = six = seven = eight = nine = ten = eleven = twelve = thirteen = fourteen = fifteen = sixteen = seventeen = eighteen = nineteen = twenty = 0;

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        jButton3.grabFocus();
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTable10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MousePressed

    }//GEN-LAST:event_jTable10MousePressed

    private void jTable10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable10KeyPressed
        if (evt.getKeyCode() == 10) {
            try {

                int Row = jTable10.getSelectedRow();
                jTextFieldcenterNum.setText(jTable10.getValueAt(Row, 0).toString());
                center_id = jTable10.getValueAt(Row, 1).toString();
                jLabel2.setText(jTable10.getValueAt(Row, 2).toString());
                jScrollPane9.setVisible(false);
                jTable10.setVisible(false);

                jTextFieldchitNum.grabFocus();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

    }//GEN-LAST:event_jTable10KeyPressed

    private void jTable10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable10KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable10KeyReleased

    private void jTextFieldcenterNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldcenterNumKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) jTable10.getModel();

        try {
            if (jTextFieldcenterNum.getText().trim().length() != 0) {
                List<Center> centerList = CenterController.sercLikeCenterNameAndCenterID(jTextFieldcenterNum.getText().trim());
                String account;

                dtm.setRowCount(0);
                if (centerList != null) {
                    for (int i = 0; i < centerList.size(); i++) {
                        account = AccountController.searchAccountById("" + centerList.get(i).getAccount_ID());
                        //System.out.println("dasd : " + centerList.get(i).getCenter_ID());
                        Vector v = new Vector();
                        v.add(centerList.get(i).getCenter_Name());
                        v.add(centerList.get(i).getCenter_ID());
                        v.add(account);

                        dtm.addRow(v);
                        jScrollPane9.setVisible(true);
                        jTable10.setVisible(true);

                    }

                    if (dtm.getRowCount() == 0) {
                        jScrollPane9.setVisible(false);
                        jTable10.setVisible(false);
                    } else {
                        jScrollPane9.setVisible(true);
                        jTable10.setVisible(true);
                    }
                }
                centerList = null;
            } else {
                dtm.setRowCount(0);
                jScrollPane9.setVisible(false);
                jTable10.setVisible(false);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTextFieldcenterNumKeyReleased

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        jTextField14.grabFocus();
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        jButton1.grabFocus();
    }//GEN-LAST:event_jTextField14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addChits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addChits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addChits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addChits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addChits dialog = new addChits(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable addHorse;
    private javax.swing.JPanel bracketPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel canvas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField102;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField111;
    private javax.swing.JTextField jTextField112;
    private javax.swing.JTextField jTextField113;
    private javax.swing.JTextField jTextField114;
    private javax.swing.JTextField jTextField115;
    private javax.swing.JTextField jTextField116;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField118;
    private javax.swing.JTextField jTextField119;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField120;
    private javax.swing.JTextField jTextField121;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextField123;
    private javax.swing.JTextField jTextField124;
    private javax.swing.JTextField jTextField125;
    private javax.swing.JTextField jTextField126;
    private javax.swing.JTextField jTextField127;
    private javax.swing.JTextField jTextField128;
    private javax.swing.JTextField jTextField129;
    private javax.swing.JTextField jTextField130;
    private javax.swing.JTextField jTextField131;
    private javax.swing.JTextField jTextField132;
    private javax.swing.JTextField jTextField133;
    private javax.swing.JTextField jTextField134;
    private javax.swing.JTextField jTextField135;
    private javax.swing.JTextField jTextField136;
    private javax.swing.JTextField jTextField137;
    private javax.swing.JTextField jTextField138;
    private javax.swing.JTextField jTextField139;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField140;
    private javax.swing.JTextField jTextField141;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField146;
    private javax.swing.JTextField jTextField147;
    private javax.swing.JTextField jTextField148;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField150;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField153;
    private javax.swing.JTextField jTextField154;
    private javax.swing.JTextField jTextField155;
    private javax.swing.JTextField jTextField156;
    private javax.swing.JTextField jTextField157;
    private javax.swing.JTextField jTextField158;
    private javax.swing.JTextField jTextField159;
    private javax.swing.JTextField jTextField160;
    private javax.swing.JTextField jTextField161;
    private javax.swing.JTextField jTextField162;
    private javax.swing.JTextField jTextField163;
    private javax.swing.JTextField jTextField164;
    private javax.swing.JTextField jTextField165;
    private javax.swing.JTextField jTextField166;
    private javax.swing.JTextField jTextField167;
    private javax.swing.JTextField jTextField168;
    private javax.swing.JTextField jTextField169;
    private javax.swing.JTextField jTextField170;
    private javax.swing.JTextField jTextField171;
    private javax.swing.JTextField jTextField172;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    private javax.swing.JTextField jTextFieldHorseName;
    private javax.swing.JTextField jTextFieldcenterNum;
    private javax.swing.JTextField jTextFieldchitNum;
    private javax.swing.JTextField jTextFieldchitNum1;
    // End of variables declaration//GEN-END:variables

    public void pass(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(Color.BLACK);
        gs.drawLine(x1, y1, x2, y2);

    }

    private void pass1(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(Color.BLACK);
        gs.drawLine(x1, y1, x2, y2);

    }

    private void pass2(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(Color.GREEN);
        gs.drawLine(x1, y1, x2, y2);

    }

    private void pass3(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(Color.BLUE);
        gs.drawLine(x1, y1, x2, y2);

    }

    private void pass4(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(Color.CYAN);
        gs.drawLine(x1, y1, x2, y2);

    }

    private void deleteLine(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(new Color(238, 239, 240));
        gs.drawLine(x1, y1, x2, y2);

    }

    private void pass5(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(Color.MAGENTA);
        gs.drawLine(x1, y1, x2, y2);

    }

    private void pass6(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(Color.DARK_GRAY);
        gs.drawLine(x1, y1, x2, y2);

    }

    private void passdoubles(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(Color.MAGENTA);
        gs.drawLine(x1, y1, x2, y2);

    }

    private void passdoublesWhite(int x1, int y1, int x2, int y2) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(new Color(240, 240, 240));
        gs.drawLine(x1, y1, x2, y2);

    }

    private void passNew(int x1, int y1, int x2, int y2, Color colr) {
        Graphics2D gs = (Graphics2D) canvas.getGraphics();
        gs.setColor(colr);
        gs.drawLine(x1, y1, x2, y2);

    }
}
