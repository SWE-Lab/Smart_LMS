package LMS;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Vector;
import java.util.regex.*;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.json.simple.JSONArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author angshuman
 */
public class Home extends javax.swing.JFrame {

    private Member member;
    private int index;
    private MemberManager memmanager;
    private LoanManager lm;
    private BookManager bookObj = new BookManager("dtb-array.json");
    private String arr[] = {"", "", "", "", "", "", "", ""};

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        AddBook.setFocusable(true);
        jPanel1.setFocusable(true);
        jPanel15.setFocusable(true);
//        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("Logo.png"));//"logo.png");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Logo.png")));
        jLabel9.setVisible(false);
        jLabel14.setVisible(false);
        jLabel8.setVisible(false);
        jLabel11.setVisible(false);
        jLabel10.setVisible(false);
        jLabel29.setVisible(false);
        jLabel39.setVisible(false);
    }

    public Home(MemberManager memMan, Member member, int index) {
        this.memmanager = memMan;
        this.member = member;
        this.index = index;
        this.lm = new LoanManager(this.memmanager, this.index);
        initComponents();
        AddBook.setFocusable(true);
        jPanel1.setFocusable(true);
        jPanel15.setFocusable(true);
//        File file = new File(getClass().getResource("/Resources/").getFile());
//        String[] imageList =file.list();
//        System.out.println(imageList);
//        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("Logo.png"));//"logo.png");
//        this.setIconImage(Toolkit.ge);
//        ImageIcon img = new ImageIcon("src/Resources/Logo.png");
//        this.setIconImage(img.getImage());
        if (this.member.getRole().equals("Student")) {
            if (this.member.getFine() == 0) {
                this.jButton1.setVisible(true);
                this.jButton2.setVisible(true);
                this.jLabel41.setVisible(false);
                this.jButton16.setVisible(true);
                this.jButton3.setVisible(false);
                this.jButton4.setVisible(false);
                this.jButton18.setVisible(false);
                this.jButton15.setVisible(false);
            } else {
                this.jButton1.setVisible(true);
                this.jButton2.setVisible(false);
                this.jLabel41.setVisible(true);
                this.jButton11.setVisible(false);
                this.jButton16.setVisible(true);
                this.jButton3.setVisible(false);
                this.jButton4.setVisible(false);
                this.jButton18.setVisible(false);
                this.jButton15.setVisible(true);
            }

        } else {
            if (this.member.getFine() == 0) {
                this.jButton11.setVisible(true);
                this.jButton2.setVisible(true);
                this.jLabel41.setVisible(false);
            } else {
                this.jButton11.setVisible(false);
                this.jButton2.setVisible(false);
                this.jLabel41.setVisible(true);
            }
            this.jButton1.setVisible(true);
//            this.jButton2.setVisible(false);
            this.jButton16.setVisible(true);
            this.jButton18.setVisible(true);
            this.jButton3.setVisible(true);
            this.jButton4.setVisible(true);
            this.jLabel24.setVisible(false);
            this.jButton14.setVisible(false);
            this.jLabel32.setVisible(false);

        }
        this.jLabel9.setVisible(false);
        this.jLabel14.setVisible(false);
        this.jLabel8.setVisible(false);
        this.jLabel11.setVisible(false);
        this.jLabel10.setVisible(false);
        this.jLabel29.setVisible(false);
        this.jLabel39.setVisible(false);
        Thread p = new Thread(() -> this.bookObj.writeJSON());
        Thread q = new Thread(() -> this.memmanager.writeJSON());
        Runtime.getRuntime().addShutdownHook(p);
        Runtime.getRuntime().addShutdownHook(q);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        MyProfile = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        BorrowBook = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        AddBook = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        down = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        BookDetails = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        MemberDetails = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jTextField10 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        Payments = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton15.setBackground(new java.awt.Color(169, 224, 49));

        jButton15.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        jButton15.setForeground(new java.awt.Color(31, 36, 42));
        jLabel34 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MY PROFILE");
        setMinimumSize(new java.awt.Dimension(1280, 770));
        setPreferredSize(new java.awt.Dimension(1280, 770));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));

        jButton1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PROFILE");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BORROW BOOK");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD BOOK");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BOOK DETAILS");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://lh3.googleusercontent.com/pw/ACtC-3cU2MKqvuAPO7U9YLvDcmll6hyFW436htGxDtoHTrbIbiHE8nuIa3iJ3Jcmc4sOAlUcTNqkJOsi2pAKb3ycXiA7BjMM2ka9Uu1hjphYZ6CQZ4kYZpvwIQkHVfqLpWp7q8Z_pVpkP79Gau4LefxIXjSedA=w190-h901-no?authuser=0")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton16.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton16.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("PAYMENTS");
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        jButton18.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("MEMBER DETAILS");
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(1280, 770));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        MyProfile.setBackground(new java.awt.Color(31, 36, 42));
        MyProfile.setMaximumSize(new java.awt.Dimension(1280, 770));
        MyProfile.setLayout(new java.awt.CardLayout());

        jPanel11.setBackground(new java.awt.Color(31, 36, 42));
        jPanel11.setMaximumSize(new java.awt.Dimension(1280, 1270));
        jPanel11.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel12.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 224, 49));
        jLabel6.setText("EMAIL - " +this.member.getEmail());

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(169, 224, 49));
        jLabel22.setText("PHONE NO - " + this.member.getPhNo());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 224, 49));
        jLabel4.setText("ENROLL NO - " + this.member.getEnrollNo());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 224, 49));
        jLabel3.setText("NAME - " + this.member.getName());

        jLabel23.setForeground(new java.awt.Color(169, 224, 49));
        String profilepic = this.member.getPicPath();
        jLabel23.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL(profilepic)
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(169, 224, 49));
        jLabel40.setText("Total Issued books - " +this.member.getTotalMemBook());

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(0, 0, 0))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jTable1.setBackground(new java.awt.Color(31, 36, 42));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(169, 224, 49));
        DefaultTableModel jsonData = new DefaultTableModel(){

            boolean[] canEdit = new boolean[]{
                false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jsonData.addColumn("Book Code");
        jsonData.addColumn("Name");
        jsonData.addColumn("Author Name");
        jsonData.addColumn("DOI");
        int i = 0;
        while(i<this.member.getMemBookArr().size()){
            //        BookManager bm = new BookManager("dtb-array.json");
            JSONArray ja = (JSONArray) this.member.getMemBookArr().get(i);
            Book TBook = this.bookObj.searchBook((String) ja.get(0));
            Vector<String> v = new Vector<String>();
            v.add(TBook.getCode());
            v.add(TBook.getName());
            v.add(TBook.getAuthor());
            v.add((String)ja.get(1));
            jsonData.addRow(v);
            i++;
        }
        jTable1.setModel(jsonData);
        jTable1.setRowHeight(40);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(102, 255, 0));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jButton11.setBackground(new java.awt.Color(169, 224, 49));
        jButton11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 51));
        jButton11.setText("ADD BOOKS");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(169, 224, 49));
        jButton12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 51, 51));
        jButton12.setText("LOGOUT");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(169, 224, 49));
        jButton13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 51, 51));
        jButton13.setText("RETURN");
        jButton13.setMaximumSize(new java.awt.Dimension(113, 26));
        jButton13.setMinimumSize(new java.awt.Dimension(113, 26));
        jButton13.setPreferredSize(new java.awt.Dimension(113, 26));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(31, 36, 42));
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(192, 192, 192));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Enter Book Code for Searching");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 3, true));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        int diffDays = 0;
        String formattedString1 = "",formattedString2 = "";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-LL-dd");
            formattedString1 = LocalDate.now().format(formatter);
            formattedString2 = this.member.getDate().format(formatter);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-LL-dd");
            Date obj1 = sdf.parse(formattedString1);
            Date obj2 = sdf.parse(formattedString2);
            long diff = obj2.getTime() - obj1.getTime();
            diffDays = (int) (diff / (24 * 60 * 60 * 1000));
        } catch (Exception e) {
            System.out.println(e);
        }
        if(diffDays<=60){
            jLabel24.setForeground(new java.awt.Color(255, 0, 0));
            jLabel24.setText("MEMBERSHIP EXPIRES IN " + diffDays + " DAYS");
        }
        else
        jLabel24.setText("MEMBERSHIP EXPIRES ON : " + this.member.getDate());

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText(" FINE/ LOAN : ₹"+this.member.getFine());

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("*Clear FIne to Borrow new Book");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 747, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(854, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(153, 255, 153));
        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(169, 224, 49));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("MY PROFILE");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 136, 543, 45));

        jLabel28.setBackground(new java.awt.Color(153, 255, 153));
        jLabel28.setForeground(new java.awt.Color(169, 224, 49));
        jLabel28.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://softwareengteam.page.link/smallpic")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel14.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 6, -1, -1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MyProfile.add(jPanel11, "card2");

        jLayeredPane1.add(MyProfile, "card4");

        BorrowBook.setBackground(new java.awt.Color(31, 36, 42));
        BorrowBook.setLayout(new java.awt.CardLayout());

        jPanel10.setBackground(new java.awt.Color(31, 36, 42));

        jPanel16.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel18.setBackground(new java.awt.Color(169, 224, 49));
        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(169, 224, 49));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("BOOK AVAILABILITY");

        jLabel19.setBackground(new java.awt.Color(255, 255, 153));
        jLabel19.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://softwareengteam.page.link/smallpic")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        jPanel15.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jTable3.setBackground(new java.awt.Color(31, 36, 42));
        jTable3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTable3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTable3.setForeground(new java.awt.Color(169, 224, 49));
        DefaultTableModel jsonData1 = new DefaultTableModel(){

            boolean[] canEdit = new boolean[]{
                false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jsonData1.addColumn("Book Code");
        jsonData1.addColumn("Name");
        i = 0;
        while(i<this.bookObj.getTotalBooks()){
            Book TBook1= this.bookObj.getBook(i);
            Vector<String> v = new Vector<String>();
            v.add(TBook1.getCode());
            v.add(TBook1.getName());
            jsonData1.addRow(v);
            i++;
        }
        jTable3.setModel(jsonData1);
        jTable3.setRowHeight(30);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(70);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        jTextField4.setBackground(new java.awt.Color(31, 36, 42));
        jTextField4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(192, 192, 192));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Just Enter the Book Name for Searching");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 3, true));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("aa")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jButton17.setBackground(new java.awt.Color(169, 224, 49));
        jButton17.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(51, 51, 51));
        jButton17.setText("BORROW");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BorrowBook.add(jPanel10, "card2");

        jLayeredPane1.add(BorrowBook, "card3");

        AddBook.setBackground(new java.awt.Color(31, 36, 42));

        jPanel6.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel17.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(31, 36, 42));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(169, 224, 49));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ADD NEW BOOK");
        jPanel17.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, -1, 54));

        jLabel21.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://softwareengteam.page.link/smallpic")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 6, 128, -1));

        jPanel23.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jTextField8.setBackground(new java.awt.Color(31, 36, 42));
        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(192, 192, 192));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Publisher");
        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("NO special char/no.");

        jLabel13.setBackground(new java.awt.Color(31, 36, 42));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(169, 224, 49));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Name of Publisher :");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jTextField7.setBackground(new java.awt.Color(31, 36, 42));
        jTextField7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(192, 192, 192));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Name");
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(31, 36, 42));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(169, 224, 49));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Name of Book :");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel15.setBackground(new java.awt.Color(31, 36, 42));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(169, 224, 49));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Name of Authors :");

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("No special char/no.");

        jTextField9.setBackground(new java.awt.Color(31, 36, 42));
        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(192, 192, 192));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Authors");
        jTextField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        down.setBackground(new java.awt.Color(31, 36, 42));
        down.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        down.setForeground(new java.awt.Color(192, 192, 192));
        down.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTOMATA", "PHYSICS", "CHEMISTRY", "MATHS", "ENGLISH", "BIOLOGY", "HISTORY", "SOCIAL SCIENCE", "DATA STRUCTURE & ALGORITHM", "COMPILER DESIGNING", "COMPUTER ORGANIZATION", "CONSTITUTION OF INDIA", "DBMS", "OOPS", "OS", "NETWORKING", "BASIC ELECTRICAL", "EVS" }));
        down.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        down.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(31, 36, 42));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 224, 49));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Genre :");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel2.setBackground(new java.awt.Color(31, 36, 42));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 224, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ISBN :");

        jTextField2.setBackground(new java.awt.Color(31, 36, 42));
        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(192, 192, 192));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("ISBN");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Follow ISBN 13 format");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel5.setBackground(new java.awt.Color(31, 36, 42));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 224, 49));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Price of Book :");

        jTextField5.setBackground(new java.awt.Color(31, 36, 42));
        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(192, 192, 192));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("INR");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Invalid Entry");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel31.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel38.setBackground(new java.awt.Color(31, 36, 42));
        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(169, 224, 49));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Quantity :");

        jTextField6.setBackground(new java.awt.Color(31, 36, 42));
        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(192, 192, 192));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Total Books");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel39.setForeground(java.awt.Color.red);
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Invalid Entry");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel7.setBackground(new java.awt.Color(31, 36, 42));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(169, 224, 49));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Add Cover Image :");

        jButton5.setBackground(new java.awt.Color(169, 224, 49));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(31, 36, 42));
        jButton5.setText("Upload");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(169, 224, 49));
        jLabel29.setText("jLabel29");

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("JPEG/JPG is accepted");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(55, 55, 55)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton6.setBackground(new java.awt.Color(169, 224, 49));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(31, 36, 42));
        jButton6.setText("Submit");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AddBookLayout = new javax.swing.GroupLayout(AddBook);
        AddBook.setLayout(AddBookLayout);
        AddBookLayout.setHorizontalGroup(
            AddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookLayout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        AddBookLayout.setVerticalGroup(
            AddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(692, Short.MAX_VALUE))
        );

        jLayeredPane1.add(AddBook, "card2");

        BookDetails.setBackground(new java.awt.Color(31, 36, 42));
        BookDetails.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(31, 36, 42));

        jPanel8.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jTable2.setBackground(new java.awt.Color(31, 36, 42));
        jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTable2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(169, 224, 49));
        DefaultTableModel jsonData3 = new DefaultTableModel(){

            boolean[] canEdit = new boolean[]{
                false, false, false, false, true, false, true,true
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jsonData3.addColumn("Book Code");
        jsonData3.addColumn("Subject");
        jsonData3.addColumn("Name");
        jsonData3.addColumn("Author Name");
        jsonData3.addColumn("Publisher");
        jsonData3.addColumn("ISBN");
        jsonData3.addColumn("Price");
        jsonData3.addColumn("Quantity");
        i = 0;
        while(i < this.bookObj.getTotalBooks()){
            Book TBook3 = this.bookObj.getBook(i);
            Vector<String> v3 = new Vector<String>();
            v3.add(TBook3.getCode());
            v3.add(TBook3.getSubject());
            v3.add(TBook3.getName());
            v3.add(TBook3.getAuthor());
            v3.add(TBook3.getPublisher());
            v3.add(TBook3.getISBN());
            v3.add(Long.toString(TBook3.getPrice()));
            v3.add(Long.toString(TBook3.getQuantity()));
            jsonData3.addRow(v3);
            i++;
        }
        jTable2.setModel(jsonData3);
        jTable2.setEditingColumn(3);
        jTable2.setEditingColumn(5);
        jTable2.setEditingColumn(6);
        jTable2.setRowHeight(40);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(80);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        jButton7.setBackground(new java.awt.Color(169, 224, 49));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(31, 36, 42));
        jButton7.setText("DELETE BOOK");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(169, 224, 49));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(31, 36, 42));
        jButton8.setText("ADD BOOK");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(169, 224, 49));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(31, 36, 42));
        jButton9.setText("UPDATE");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setPreferredSize(new java.awt.Dimension(102, 25));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(169, 224, 49));
        jButton10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(31, 36, 42));
        jButton10.setText("SAVE AS CSV");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(90, 25));
        jButton10.setMinimumSize(new java.awt.Dimension(90, 25));
        jButton10.setPreferredSize(new java.awt.Dimension(102, 25));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        jPanel9.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setBackground(new java.awt.Color(31, 36, 42));
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(192, 192, 192));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Enter Book Code to Search");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 3, true));
        jTextField3.setCaretColor(new java.awt.Color(169, 224, 49));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel9.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 1079, 38));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(169, 224, 49));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("BOOK DETAILS");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 352, -1, 56));

        jLabel20.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://softwareengteam.page.link/smallpic")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 181, -1, 132));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BookDetails.add(jPanel7, "card2");

        jLayeredPane1.add(BookDetails, "card5");

        MemberDetails.setMaximumSize(new java.awt.Dimension(1280, 720));
        MemberDetails.setPreferredSize(new java.awt.Dimension(1280, 720));
        MemberDetails.setLayout(new java.awt.CardLayout());

        jPanel21.setBackground(new java.awt.Color(31, 36, 42));
        jPanel21.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel21.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel32.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel36.setBackground(new java.awt.Color(255, 255, 153));
        jLabel36.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://softwareengteam.page.link/smallpic")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel35.setBackground(new java.awt.Color(169, 224, 49));
        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(169, 224, 49));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("MEMBER DETAILS");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addGap(0, 0, 0))
        );

        jPanel22.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel37.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("aa")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jTable6.setBackground(new java.awt.Color(31, 36, 42));
        jTable6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
        jTable6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTable6.setForeground(new java.awt.Color(169, 224, 49));
        DefaultTableModel jsonData4 = new DefaultTableModel(){

            boolean[] canEdit = new boolean[]{
                false, true, true, true, false , true, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jsonData4.addColumn("Enrollment Number");
        jsonData4.addColumn("Name");
        jsonData4.addColumn("Email");
        jsonData4.addColumn("PhNo");
        jsonData4.addColumn("Membership Expires");
        jsonData4.addColumn("Fine");
        jsonData4.addColumn("Books Issued");
        i = 0;
        MemberManager bm4 = this.memmanager;
        //        Vector<Member> memberArr = this.member.getMemberArray();
        while(i<this.memmanager.getTotalMembers()){
            //        Book TBook1= bm.getBook(i);

            //            System.out.println(bm4.getMember(i).getEmail());
            //            System.out.println(bm.getMember(i).);
            Vector<String> v4 = new Vector<String>();
            v4.add(bm4.getMember(i).getEnrollNo());
            v4.add(bm4.getMember(i).getName());
            v4.add(bm4.getMember(i).getEmail());
            v4.add(bm4.getMember(i).getPhNo());
            LocalDate date = bm4.getMember(i).getDate();
            v4.add(date.toString());
            v4.add(Long.toString(bm4.getMember(i).getFine()));
            v4.add(String.valueOf(bm4.getMember(i).getMemBookArr().size()));
            //            v.add(TBook1.getName());
            jsonData4.addRow(v4);
            i++;
        }
        jTable6.setModel(jsonData4);
        jTable6.setEditingColumn(1);
        jTable6.setEditingColumn(2);
        jTable6.setEditingColumn(3);
        jTable6.setEditingColumn(5);
        jTable6.setRowHeight(40);
        jTable6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);
        /*
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(70);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(70);
        }
        */
        jTable6.getColumnModel().getColumn(0).setWidth(100);
        jTable6.getColumnModel().getColumn(1).setWidth(100);
        jTable6.getColumnModel().getColumn(2).setWidth(70);
        jTable6.getColumnModel().getColumn(3).setWidth(100);
        jTable6.getColumnModel().getColumn(4).setWidth(100);
        jTable6.getColumnModel().getColumn(5).setWidth(20);
        jTable6.getColumnModel().getColumn(6).setWidth(10);

        jTextField10.setBackground(new java.awt.Color(31, 36, 42));
        jTextField10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(192, 192, 192));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Enter the Enrollment Number to Search");
        jTextField10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 3, true));
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(169, 224, 49));
        jButton19.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(51, 51, 51));
        jButton19.setText("UPDATE");
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(169, 224, 49));
        jButton20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(51, 51, 51));
        jButton20.setText("SAVE AS CSV");
        jButton20.setMaximumSize(new java.awt.Dimension(105, 29));
        jButton20.setMinimumSize(new java.awt.Dimension(105, 29));
        jButton20.setPreferredSize(new java.awt.Dimension(105, 29));
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
                .addGap(184, 184, 184)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(850, 850, 850))
        );

        MemberDetails.add(jPanel21, "card2");

        jLayeredPane1.add(MemberDetails, "card7");

        Payments.setBackground(new java.awt.Color(31, 36, 42));

        jPanel20.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jButton14 = new javax.swing.JButton();
        jButton14.setBackground(new java.awt.Color(169, 224, 49));

        jButton14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        jButton14.setForeground(new java.awt.Color(31, 36, 42));
        jButton14.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton14.setText("RENEW");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(169, 224, 49));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Membership Ends in : " + this.member.getDate());

        jButton15.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton15.setText("PAY");
        jButton15.setMaximumSize(new java.awt.Dimension(98, 27));
        jButton15.setMinimumSize(new java.awt.Dimension(98, 27));
        jButton15.setPreferredSize(new java.awt.Dimension(98, 27));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(169, 224, 49));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Total Fine/ Loan : ₹" + this.memmanager.getMember(this.index).getFine());
        jLabel34.setPreferredSize(new java.awt.Dimension(142, 29));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                .addGap(0, 174, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel30.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(169, 224, 49));
        jLabel30.setText("PAYMENTS DETAILS");

        jLabel31.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://softwareengteam.page.link/smallpic")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap())
        );

        javax.swing.GroupLayout PaymentsLayout = new javax.swing.GroupLayout(Payments);
        Payments.setLayout(PaymentsLayout);
        PaymentsLayout.setHorizontalGroup(
            PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaymentsLayout.setVerticalGroup(
            PaymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentsLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane1.add(Payments, "card6");

        jSplitPane1.setRightComponent(jLayeredPane1);

        getContentPane().add(jSplitPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jTable2.getModel());
        jTable2.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField3.getText().trim().toLowerCase()));
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText().trim().equals("") || jTextField3.getText().trim().toLowerCase().equals("enter book code to search")) {
            jTextField3.setText("Enter Book Code to Search");
            jTextField3.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if (jTextField3.getText().trim().toLowerCase().equals("enter book code to search")) {
            jTextField3.setText("");
            jTextField3.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        Vector<String> v = new Vector<String>();
        v.add((String) ((JComboBox) evt.getSource()).getSelectedItem());
        this.arr[3] = v.lastElement();
    }//GEN-LAST:event_downActionPerformed

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        // TODO add your handling code here:
        String s = jTextField9.getText().trim();
        if (Pattern.matches("[A-Za-z\\s]+", s)) {
            this.arr[2] = s;
            this.jLabel14.setVisible(false);
        } else {
            this.jLabel14.setVisible(true);
        }
        if (jTextField9.getText().trim().equals("") || jTextField9.getText().trim().toLowerCase().equals("authors")) {
            jTextField9.setText("Authors");
            jTextField9.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        // TODO add your handling code here:
        if (jTextField9.getText().trim().toLowerCase().equals("authors")) {
            jTextField9.setText("");
            jTextField9.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
        String s = jTextField8.getText().trim();
        if (Pattern.matches("[A-Za-z\\s]+", s)) {
            this.arr[0] = s;
            this.jLabel9.setVisible(false);
        } else {
            this.jLabel9.setVisible(true);
        }
        if (jTextField8.getText().trim().equals("") || jTextField8.getText().trim().toLowerCase().equals("publisher")) {
            jTextField8.setText("Publisher");
            jTextField8.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        if (jTextField8.getText().trim().toLowerCase().equals("publisher")) {
            jTextField8.setText("");
            jTextField8.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        // TODO add your handling code here:
        String s = jTextField7.getText().trim();
        this.arr[1] = s;
        if (jTextField7.getText().trim().equals("") || jTextField7.getText().trim().toLowerCase().equals("name")) {
            jTextField7.setText("Name");
            jTextField7.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        // TODO add your handling code here:
        if (jTextField7.getText().trim().toLowerCase().equals("name")) {
            jTextField7.setText("");
            jTextField7.setForeground(new Color(169, 224, 49));

        }
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
        String s = jTextField5.getText().trim();
        if (Pattern.matches("[0-9]+([,.][0-9]{1,2})?", s)) {
            this.arr[5] = s;
            this.jLabel10.setVisible(false);
        } else {
            this.jLabel10.setVisible(true);
        }
        if (jTextField5.getText().trim().equals("") || jTextField5.getText().trim().toLowerCase().equals("inr")) {
            jTextField5.setText("INR");
            jTextField5.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        if (jTextField5.getText().trim().toLowerCase().equals("inr")) {
            jTextField5.setText("");
            jTextField5.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        String ISBN13 = "^(?:ISBN(?:-13)?:? )?(?=[0-9]{13}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)97[89][- ]?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9]$";
        String s = jTextField2.getText().trim();
        if (Pattern.matches(ISBN13, s)) {
            this.arr[4] = s;
            this.jLabel8.setVisible(false);
        } else {
            this.jLabel8.setVisible(true);
        }
        if (jTextField2.getText().trim().equals("") || jTextField2.getText().trim().toLowerCase().equals("isbn")) {
            jTextField2.setText("ISBN");
            jTextField2.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        if (jTextField2.getText().trim().toLowerCase().equals("isbn")) {
            jTextField2.setText("");
            jTextField2.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jTable3.getModel());
        jTable3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField4.getText().trim().toLowerCase()));
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        if (jTextField4.getText().trim().equals("") || jTextField4.getText().trim().toLowerCase().equals("just enter the book name for searching")) {
            jTextField4.setText("Just Enter the Book Name for Searching");
            jTextField4.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        if (jTextField4.getText().trim().toLowerCase().equals("just enter the book name for searching")) {
            jTextField4.setText("");
            jTextField4.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jTable1.getModel());
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim().toLowerCase()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if (jTextField1.getText().trim().equals("") || jTextField1.getText().trim().toLowerCase().equals("enter book code for searching")) {
            jTextField1.setText("Enter Book Code for Searching");
            jTextField1.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if (jTextField1.getText().trim().toLowerCase().equals("enter book code for searching")) {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //        cl.show(jPanel2,"ProfileCard");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        if (jTable3.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No Books Available");
        } else if (jTable3.getSelectedRow() >= 0) {
            int row = jTable3.getSelectedRow();
            String bookName = (String) jTable3.getValueAt(row, 1);
            if (this.memmanager.getMember(this.index).searchBookArray(bookName) == -1) {
                JOptionPane.showMessageDialog(this, "Book Already Issued");
            } else {
                Book bk = this.bookObj.searchBook(bookName);
                if (this.bookObj.decBook(this.bookObj.getIndex(bookName)) == -1) {
                    JOptionPane.showMessageDialog(this, "Out of Stock");
                } else {
                    int result = this.memmanager.addMemBook(this.index, bookName);
                    if (result == -1) {
                        JOptionPane.showMessageDialog(this, "6 Books Borrowed\nBorrowing limit reached\nReturn Borrowed Books");
                    } else {
                        jTable1.setBackground(new java.awt.Color(31, 36, 42));
                        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
                        jTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
                        jTable1.setForeground(new java.awt.Color(169, 224, 49));
                        DefaultTableModel jsonData = new DefaultTableModel() {
                            boolean[] canEdit = new boolean[]{
                                false, false, false
                            };

                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                            }
                        };
                        jsonData.addColumn("Book Code");
                        jsonData.addColumn("Name");
                        jsonData.addColumn("Author Name");
                        jsonData.addColumn("DOI");
                        int i = 0;
                        while (i < this.memmanager.getMember(this.index).getMemBookArr().size()) {
//                            BookManager bm = new BookManager("dtb-array.json");
                            JSONArray ja = (JSONArray) this.memmanager.getMember(this.index).getMemBookArr().get(i);
                            Book TBook = this.bookObj.searchBook((String) ja.get(0));
                            Vector<String> v = new Vector<String>();
                            v.add(TBook.getCode());
                            v.add(TBook.getName());
                            v.add(TBook.getAuthor());
                            v.add((String) ja.get(1));
                            jsonData.addRow(v);
                            i++;
                        }
                        jTable1.setModel(jsonData);
                        jScrollPane1.setViewportView(jTable1);
                        if (jTable1.getColumnModel().getColumnCount() > 0) {
                            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
                            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
                        }
                        jLabel40.setText("Total Issued books - " + this.member.getTotalMemBook());
                        JOptionPane.showMessageDialog(this, "Book successfully borrowed");

                        jTable2.setBackground(new java.awt.Color(31, 36, 42));

                        jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));

                        jTable2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

                        jTable2.setForeground(new java.awt.Color(169, 224, 49));
                        DefaultTableModel jsonData3 = new DefaultTableModel() {

                            boolean[] canEdit = new boolean[]{
                                false, false, false, false, true, false, true, true
                            };

                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                            }
                        };
                        jsonData3.addColumn("Book Code");
                        jsonData3.addColumn("Subject");
                        jsonData3.addColumn("Name");
                        jsonData3.addColumn("Author Name");
                        jsonData3.addColumn("Publisher");
                        jsonData3.addColumn("ISBN");
                        jsonData3.addColumn("Price");
                        jsonData3.addColumn("Quantity");
                        i = 0;
                        while (i < this.bookObj.getTotalBooks()) {
                            Book TBook3 = this.bookObj.getBook(i);
                            Vector<String> v3 = new Vector<String>();
                            v3.add(TBook3.getCode());
                            v3.add(TBook3.getSubject());
                            v3.add(TBook3.getName());
                            v3.add(TBook3.getAuthor());
                            v3.add(TBook3.getPublisher());
                            v3.add(TBook3.getISBN());
                            v3.add(Long.toString(TBook3.getPrice()));
                            v3.add(Long.toString(TBook3.getQuantity()));
                            jsonData3.addRow(v3);
                            i++;
                        }
                        jTable2.setModel(jsonData3);
                        jTable2.setEditingColumn(3);
                        jTable2.setEditingColumn(5);
                        jTable2.setEditingColumn(6);
                        jTable2.setRowHeight(40);
                        jScrollPane2.setViewportView(jTable2);
                        if (jTable2.getColumnModel().getColumnCount() > 0) {
                            jTable2.getColumnModel().getColumn(0).setMinWidth(80);
                            jTable2.getColumnModel().getColumn(0).setMaxWidth(70);
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select Book for borrowing");
        }
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        int row = 0, col = 0;
        if (jTable2.getSelectedRow() >= 0) {
            row = jTable2.getSelectedRow();
        }
        if (jTable2.getSelectedColumn() >= 0) {
            col = jTable2.getSelectedColumn();
        }
        String check = (String) jTable2.getValueAt(row, col);
        if ((Pattern.matches("[A-Za-z\\s]+", check)) || (Pattern.matches("[0-9]+([,.][0-9]{1,2})?", check)) || (Pattern.matches("[0-9]", check))) {
            this.bookObj.updateBook(row, jTable2.getColumnName(col), check);
//            this.bookObj.writeJSON();
            JOptionPane.showMessageDialog(this, "Updated in database");

        } else {
            JOptionPane.showMessageDialog(this, "Incorrect entry");
        }
        DefaultTableModel jTable = (DefaultTableModel) jTable2.getModel();
        jTable.fireTableDataChanged();
        jTable2.updateUI();//.setModel(jTable);
//        jTable2.setBackground(new java.awt.Color(31, 36, 42));
//        jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
//        jTable2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
//        jTable2.setForeground(new java.awt.Color(169, 224, 49));
//        DefaultTableModel jsonData3 = new DefaultTableModel() {
//            boolean[] canEdit = new boolean[]{
//                false, false, false, false, true, false, true, true
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit[columnIndex];
//            }
//        };
//        jsonData3.addColumn("Book Code");
//        jsonData3.addColumn("Subject");
//        jsonData3.addColumn("Name");
//        jsonData3.addColumn("Author Name");
//        jsonData3.addColumn("Publisher");
//        jsonData3.addColumn("ISBN");
//        jsonData3.addColumn("Price");
//        jsonData3.addColumn("Quantity");
//        int i = 0;
//        while (i < this.bookObj.getTotalBooks()) {
//            Book TBook3 = this.bookObj.getBook(i);
//            Vector<String> v3 = new Vector<String>();
//            v3.add(TBook3.getCode());
//            v3.add(TBook3.getSubject());
//            v3.add(TBook3.getName());
//            v3.add(TBook3.getAuthor());
//            v3.add(TBook3.getPublisher());
//            v3.add(TBook3.getISBN());
//            v3.add(Long.toString(TBook3.getPrice()));
//            v3.add(Long.toString(TBook3.getQuantity()));
//            jsonData3.addRow(v3);
//            i++;
//        }
//
//        jTable2.setModel(jsonData3);
//        jScrollPane2.setViewportView(jTable2);
//        if (jTable2.getColumnModel().getColumnCount() > 0) {
//            jTable2.getColumnModel().getColumn(0).setMinWidth(80);
//            jTable2.getColumnModel().getColumn(0).setMaxWidth(70);
//        }
//        jTable2.setModel(jTable);
//        jTable2.setEditingColumn(3);
//        jTable2.setEditingColumn(5);
//        jTable2.setEditingColumn(6);

    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No Books Available to Return");
        } else if (jTable1.getSelectedRow() >= 0) {
            int row = jTable1.getSelectedRow();
            String bookName = (String) jTable1.getValueAt(row, 1);
            this.memmanager.delMemBook(this.index, row);
            this.bookObj.incBook(this.bookObj.getIndex(bookName));
            System.out.println(this.bookObj.getBook(this.bookObj.getIndex(bookName)).getQuantity());
            jTable1.setBackground(new java.awt.Color(31, 36, 42));
            jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
            jTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
            jTable1.setForeground(new java.awt.Color(169, 224, 49));
            DefaultTableModel jsonData = new DefaultTableModel() {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            jsonData.addColumn("Book Code");
            jsonData.addColumn("Name");
            jsonData.addColumn("Author Name");
            jsonData.addColumn("DOI");
            int i = 0;
            while (i < this.memmanager.getMember(this.index).getMemBookArr().size()) {
                JSONArray ja = (JSONArray) this.memmanager.getMember(this.index).getMemBookArr().get(i);
                Book TBook = this.bookObj.searchBook((String) ja.get(0));
                Vector<String> v = new Vector<String>();
                v.add(TBook.getCode());
                v.add(TBook.getName());
                v.add(TBook.getAuthor());
                v.add((String) ja.get(1));
                jsonData.addRow(v);
                i++;
            }
            jTable1.setModel(jsonData);
            jScrollPane1.setViewportView(jTable1);
            if (jTable1.getColumnModel().getColumnCount() > 0) {
                jTable1.getColumnModel().getColumn(0).setMinWidth(80);
                jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
            }
            jLabel40.setText("Total Issued books - " + this.member.getTotalMemBook());
            JOptionPane.showMessageDialog(this, "Book successfully removed");

            jTable2.setBackground(new java.awt.Color(31, 36, 42));
            jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
            jTable2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
            jTable2.setForeground(new java.awt.Color(169, 224, 49));
            DefaultTableModel jsonData3 = new DefaultTableModel() {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, true, false, true, true
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            jsonData3.addColumn("Book Code");
            jsonData3.addColumn("Subject");
            jsonData3.addColumn("Name");
            jsonData3.addColumn("Author Name");
            jsonData3.addColumn("Publisher");
            jsonData3.addColumn("ISBN");
            jsonData3.addColumn("Price");
            jsonData3.addColumn("Quantity");
            i = 0;
            while (i < this.bookObj.getTotalBooks()) {
                Book TBook3 = this.bookObj.getBook(i);
                Vector<String> v3 = new Vector<String>();
                v3.add(TBook3.getCode());
                v3.add(TBook3.getSubject());
                v3.add(TBook3.getName());
                v3.add(TBook3.getAuthor());
                v3.add(TBook3.getPublisher());
                v3.add(TBook3.getISBN());
                v3.add(Long.toString(TBook3.getPrice()));
                v3.add(Long.toString(TBook3.getQuantity()));
                jsonData3.addRow(v3);
                i++;
            }
            jTable2.setModel(jsonData3);
            jTable2.setEditingColumn(3);
            jTable2.setEditingColumn(5);
            jTable2.setEditingColumn(6);
            jTable2.setRowHeight(40);
            jScrollPane2.setViewportView(jTable2);
            if (jTable2.getColumnModel().getColumnCount() > 0) {
                jTable2.getColumnModel().getColumn(0).setMinWidth(80);
                jTable2.getColumnModel().getColumn(0).setMaxWidth(70);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select Book for removing");
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
//        DefaultTableModel tbModel = (DefaultTableModel) jTable2.getModel();
        if (jTable2.getSelectedRow() >= 0) {
            int row = jTable2.getSelectedRow();
            this.bookObj.deleteBook(row);
//            this.bookObj.writeJSON();
            JOptionPane.showMessageDialog(this, "Book deleted successfully form database");
            jTable2.setBackground(new java.awt.Color(31, 36, 42));
            jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));
            jTable2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
            jTable2.setForeground(new java.awt.Color(169, 224, 49));
            DefaultTableModel jsonData3 = new DefaultTableModel() {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, true, false, true, true
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            jsonData3.addColumn("Book Code");
            jsonData3.addColumn("Subject");
            jsonData3.addColumn("Name");
            jsonData3.addColumn("Author Name");
            jsonData3.addColumn("Publisher");
            jsonData3.addColumn("ISBN");
            jsonData3.addColumn("Price");
            jsonData3.addColumn("Quantity");
            int i = 0;
            while (i < this.bookObj.getTotalBooks()) {
                Book TBook3 = this.bookObj.getBook(i);
                Vector<String> v3 = new Vector<String>();
                v3.add(TBook3.getCode());
                v3.add(TBook3.getSubject());
                v3.add(TBook3.getName());
                v3.add(TBook3.getAuthor());
                v3.add(TBook3.getPublisher());
                v3.add(TBook3.getISBN());
                v3.add(Long.toString(TBook3.getPrice()));
                v3.add(Long.toString(TBook3.getQuantity()));
                jsonData3.addRow(v3);
                i++;
            }

            jTable2.setModel(jsonData3);
            jScrollPane2.setViewportView(jTable2);
            if (jTable2.getColumnModel().getColumnCount() > 0) {
                jTable2.getColumnModel().getColumn(0).setMinWidth(80);
                jTable2.getColumnModel().getColumn(0).setMaxWidth(70);
            }

            jTable2.setModel(jsonData3);

            jTable2.setEditingColumn(3);
            jTable2.setEditingColumn(5);
            jTable2.setEditingColumn(6);
        } else {
            if (jTable2.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No Books Available");
            } else {
                JOptionPane.showMessageDialog(this, "Please Select Book for delete");
            }
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        if ((jLabel29.isVisible() && !jTextField8.getText().trim().toLowerCase().equals("publisher") && !jTextField8.getText().trim().toLowerCase().equals("name") && !jTextField8.getText().trim().toLowerCase().equals("authors") && !jTextField8.getText().trim().toLowerCase().equals("isbn") && !jTextField8.getText().trim().toLowerCase().equals("inr"))) {
            if (jLabel9.isVisible() || jLabel14.isVisible() || jLabel8.isVisible() || jLabel10.isVisible()) {
                JOptionPane.showMessageDialog(this, "Fill details correctly");
            } else {
                this.bookObj.addBook(this.arr);
//                this.bookObj.writeJSON();
                JOptionPane.showMessageDialog(this, "Operation successfully done");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fill the details");
        }

        jTable2.setBackground(new java.awt.Color(31, 36, 42));

        jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(169, 224, 49), 2, true));

        jTable2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jTable2.setForeground(new java.awt.Color(169, 224, 49));
        DefaultTableModel jsonData3 = new DefaultTableModel() {

            boolean[] canEdit = new boolean[]{
                false, false, false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jsonData3.addColumn("Book Code");
        jsonData3.addColumn("Subject");
        jsonData3.addColumn("Name");
        jsonData3.addColumn("Author Name");
        jsonData3.addColumn("Publisher");
        jsonData3.addColumn("ISBN");
        jsonData3.addColumn("Price");
        jsonData3.addColumn("Quantity");
        int i = 0;
        while (i < this.bookObj.getTotalBooks()) {
            Book TBook3 = this.bookObj.getBook(i);
            Vector<String> v3 = new Vector<String>();
            v3.add(TBook3.getCode());
            v3.add(TBook3.getSubject());
            v3.add(TBook3.getName());
            v3.add(TBook3.getAuthor());
            v3.add(TBook3.getPublisher());
            v3.add(TBook3.getISBN());
            v3.add(Long.toString(TBook3.getPrice()));
            v3.add(Long.toString(TBook3.getQuantity()));
            jsonData3.addRow(v3);
            i++;
        }
        jTable2.setModel(jsonData3);

        jTable2.setEditingColumn(3);
        jTable2.setEditingColumn(5);
        jTable2.setEditingColumn(6);

        jTable2.setRowHeight(40);
        jScrollPane2.setViewportView(jTable2);

        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(80);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(70);
        }

    }//GEN-LAST:event_jButton6MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int row = 0;
        if (jTable3.getSelectedRow() >= 0) {
            row = jTable3.getSelectedRow();
        }
        String pic = this.bookObj.getBook(row).getPicPath();
        jLabel33.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                            new java.net.URL(pic)
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        // TODO add your handling code here:
        int row = 0;
        if (jTable6.getSelectedRow() >= 0) {
            row = jTable6.getSelectedRow();
        }
        String pic = this.member.getPicPath();
        jLabel37.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                            new java.net.URL(pic)
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

    }//GEN-LAST:event_jTable6MouseClicked

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        if (jTextField10.getText().trim().toLowerCase().equals("Enter the Enrollment Number to Search")) {
            jTextField10.setText("");
            jTextField10.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
        if (jTextField10.getText().trim().equals("") || jTextField10.getText().trim().toLowerCase().equals("enter the enrollment number to search")) {
            jTextField10.setText("Enter the Enrollment Number to Search");
            jTextField10.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField10FocusLost

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
        int row = 0, col = 0;
        if (jTable6.getSelectedRow() >= 0) {
            row = jTable6.getSelectedRow();
        }
        if (jTable6.getSelectedColumn() >= 0) {
            col = jTable6.getSelectedColumn();
        }
        this.memmanager.updateMember(row, jTable6.getColumnName(col), (String) jTable6.getValueAt(row, col));
//        this.memmanager.writeJSON();

        DefaultTableModel jsonData4 = new DefaultTableModel() {

            boolean[] canEdit = new boolean[]{
                false, true, true, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jsonData4.addColumn("Enrollment Number");
        jsonData4.addColumn("Name");
        jsonData4.addColumn("Email");
        jsonData4.addColumn("PhNo");
        jsonData4.addColumn("Membership Expires");
        jsonData4.addColumn("Fine");
        jsonData4.addColumn("Books Issued");
        int i = 0;
        MemberManager bm4 = this.memmanager;
        while (i < this.memmanager.getTotalMembers()) {
            Vector<String> v4 = new Vector<String>();
            v4.add(bm4.getMember(i).getEnrollNo());
            v4.add(bm4.getMember(i).getName());
            v4.add(bm4.getMember(i).getEmail());
            v4.add(bm4.getMember(i).getPhNo());
            LocalDate date = bm4.getMember(i).getDate();
            v4.add(date.toString());
            v4.add(Long.toString(bm4.getMember(i).getFine()));
            v4.add(String.valueOf(bm4.getMember(i).getMemBookArr().size()));
            jsonData4.addRow(v4);
            i++;
        }
        jTable6.setModel(jsonData4);
        jTable6.setEditingColumn(1);
        jTable6.setEditingColumn(2);
        jTable6.setEditingColumn(3);
        jTable6.setEditingColumn(5);
        jTable6.setRowHeight(40);
        jTable6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(169, 224, 49));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boolean flag = true;
        if (flag) {
            this.memmanager.getMember(this.index).setDate(this.memmanager.getMember(this.index).getDate());
        } else {
            JOptionPane.showMessageDialog(this, "Membership renewal failed");
        }
        jLabel32.setText("Membership Ends in : " + this.memmanager.getMember(this.index).getDate());
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("MEMBERSHIP EXPIRES ON : " + this.memmanager.getMember(this.index).getDate());
        JOptionPane.showMessageDialog(this, "Membership successfully renewed");
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(169, 224, 49));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        jLabel34.setText("Total Fine/ Loan : ₹" + lm.getTotalFine());
        jLabel34.setPreferredSize(new java.awt.Dimension(142, 29));
        boolean flag = true;
        if (flag) {
            this.memmanager.getMember(this.index).setFine(0);
//            this.memmanager.writeJSON();
            this.jButton15.setVisible(false);
            this.jButton2.setVisible(true);
            this.jLabel41.setVisible(false);
            this.jButton11.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Payment Failed");
        }
        jLabel34.setText("Total Fine/ Loan : ₹" + this.memmanager.getMember(this.index).getFine());
        jLabel25.setText(" FINE/ LOAN : ₹" + this.memmanager.getMember(this.index).getFine());
        JOptionPane.showMessageDialog(this, "Loan/ Fine paid successfully");
    }//GEN-LAST:event_jButton15MouseClicked

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
        if (jTextField6.getText().trim().toLowerCase().equals("total books")) {
            jTextField6.setText("");
            jTextField6.setForeground(new Color(169, 224, 49));
        }
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        String s = jTextField6.getText().trim();
        if (Pattern.matches("[0-9]?", s)) {
            this.arr[7] = s;
            this.jLabel39.setVisible(false);
        } else {
            this.jLabel39.setVisible(true);
        }
        if (jTextField6.getText().trim().equals("") || jTextField6.getText().trim().toLowerCase().equals("total books")) {
            jTextField6.setText("Total Books");
            jTextField6.setForeground(new Color(192, 192, 192));
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        this.bookObj.writeCSV();
        JOptionPane.showMessageDialog(this, "CSV SAVED");
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        this.memmanager.writeCSV();
        JOptionPane.showMessageDialog(this, "CSV SAVED");
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        this.setTitle("PAYMENT DETAILS");
        jLayeredPane1.removeAll();
        jLayeredPane1.add(Payments);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        this.setTitle("BOOK DETAILS");
        jLayeredPane1.removeAll();
        jLayeredPane1.add(BookDetails);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        this.setTitle("MEMBER DETAILS");
        jLayeredPane1.removeAll();
        jLayeredPane1.add(MemberDetails);
        jLayeredPane1.repaint();;
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.setTitle("ADD BOOK");
        jLayeredPane1.removeAll();
        jLayeredPane1.add(AddBook);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setTitle("BORROW BOOK");
        jLayeredPane1.removeAll();
        jLayeredPane1.add(BorrowBook);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setTitle("MY PROFILE");
        jLayeredPane1.removeAll();
        jLayeredPane1.add(MyProfile);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        this.setTitle("BORROW BOOKS");
        jLayeredPane1.removeAll();
        jLayeredPane1.add(BorrowBook);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
        this.memmanager.writeJSON();
        this.bookObj.writeJSON();
        if (this.memmanager.getMember(this.index).getRole().equalsIgnoreCase("Librarian")) {
            this.bookObj.writeJSON();
        }
        this.dispose();
        WelcomeScreen wscreen = new WelcomeScreen();
        wscreen.setVisible(true);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        JFileChooser j = new JFileChooser(new File("C:\\Users\\pc\\Documents\\"));
        j.showSaveDialog(null);
        File f = j.getSelectedFile();
        String fn = f.getPath();
        this.arr[6] = fn;
        jLabel29.setText(fn);
        jLabel29.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        this.setTitle("ADD BOOK");
        jLayeredPane1.removeAll();
        jLayeredPane1.add(AddBook);
        jLayeredPane1.repaint();;
        jLayeredPane1.revalidate();
    }//GEN-LAST:event_jButton8MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        MemberManager memmanager = new MemberManager("dtb-member.json");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home hpage = new Home(memmanager, memmanager.getMember(0), 0);
                hpage.show();
//                //new Home().setVisible(true);
//                Home display = new Home();
//                display.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddBook;
    private javax.swing.JPanel BookDetails;
    private javax.swing.JPanel BorrowBook;
    private javax.swing.JPanel MemberDetails;
    private javax.swing.JPanel MyProfile;
    private javax.swing.JPanel Payments;
    private javax.swing.JComboBox<String> down;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
