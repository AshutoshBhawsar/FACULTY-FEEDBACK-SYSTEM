/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback.system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author akshay
 */
public class Feedback_Theory extends javax.swing.JFrame {

    /**
     * Creates new form Feedback_Theory
     */
    public Feedback_Theory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Answer3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Answer1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Answer2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(167, 22, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "________________________________________________________________________________", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(30, 0, 214))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(254, 250, 165));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Feedback", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("URW Bookman L", 1, 24), new java.awt.Color(9, 31, 221))); // NOI18N

        Answer3.setColumns(20);
        Answer3.setRows(5);
        jScrollPane3.setViewportView(Answer3);

        jLabel2.setText("B)  Does the teacher solve questions from GATE/Online/ University Exams  ?");

        jLabel1.setText("A)  Would you like the faculty member to teach you again in further semester?  Why?");

        Answer1.setColumns(20);
        Answer1.setRows(5);
        jScrollPane1.setViewportView(Answer1);

        Answer2.setColumns(20);
        Answer2.setRows(5);
        jScrollPane2.setViewportView(Answer2);

        jLabel3.setText("C) Your suggestions and additional comments, if any.");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login.feedback_A= Answer1.getText();
        Login.feedback_B= Answer2.getText();
        Login.feedback_C= Answer3.getText();
        //new Feedback_Report().setVisible(true)      
        
        try {
            if (Answer1.getText().equals("") && Answer2.getText().equals("") && Answer3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You can not leave any field blank !!","Please fill the blank fields", JOptionPane.ERROR_MESSAGE);
            } 
        else {
                
                
                BufferedReader rdfile = new BufferedReader(new FileReader(Login.filename));

                String[] itemline = new String[100];
                //String prod = "";
                //int qty = 0;
                //double price = 0.0;
                //boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    x++;
                }
                rdfile.close();
                PrintWriter wrfile = new PrintWriter(new FileWriter(Login.filename));
                wrfile.println(Login.feedback_A);
                wrfile.println(Login.feedback_B);
                wrfile.println(Login.feedback_C);
                wrfile.close();
                Connection conn;
                try {
                    conn = DriverManager.getConnection("jdbc:sqlite:/home/akshay/NetBeansProjects/Feedback System/feedback.sqlite");
                   // Statement stmt=conn.createStatement(); 
                   String nm=Login.filename;
                   int len=nm.length();
                   nm=nm.substring(0,len-4);
                   String nm1="";
                   switch(Login.year){
                       case 1:nm1="first_";
                                break;
                       case 2: nm1="second_";
                                break;
                       case 3: nm1="third_";
                                break;
                       case 4: nm1="forth_";
                                break;
                   }
                   nm1=nm1+Login.division+"_";                 
                   switch(Login.SubjectCode){
                       case 1:nm1=nm1+"1";
                                break;
                       case 2:nm1=nm1+"2";
                                break;
                       case 3:nm1=nm1+"3";
                                break;
                       case 4:nm1=nm1+"4";
                                break;
                       case 5:nm1=nm1+"5";
                                break;
                   }
                   JOptionPane.showMessageDialog(this, nm1);
                   ResultSet rs1;
                   boolean flag2=false;
                   rs1=conn.getMetaData().getTables(null,null,nm1,null);
//                   JOptionPane.showMessageDialog(this, rs1.getString(3));
                   while(rs1.next()){
                       String catalogs=rs1.getString(3);
                       if(nm1.equals(catalogs)){
                            flag2=true;
                            break;
                       }
                       
                   }
                   if(!flag2){ 
                        Statement statement=conn.createStatement();
                       String query1="CREATE TABLE "+nm1+" ('1' VARCHAR, '2' VARCHAR, '3' VARCHAR, '4' VARCHAR, '5' VARCHAR, '6' VARCHAR, '7' VARCHAR, '8' VARCHAR, 'again' VARCHAR, 'solve' VARCHAR, 'comments' VARCHAR)";
                       statement.executeUpdate(query1);
                       
                   }
                            String query="insert into "+nm1+" values(?,?,?,?,?,?,?,?,?,?,?)";
                            PreparedStatement pst=conn.prepareStatement(query);
                            int i;
                            for(i=1;i<=8;i++)
                                 pst.setString(i,Login.ans[i]);
                            pst.setString(9, Login.feedback_A);
                            pst.setString(10, Login.feedback_B);
                            pst.setString(11, Login.feedback_C);
                            pst.execute();
                            conn.close();
// ResultSet rs=stmt.executeQuery("insert into cn values(?,'ans[2]','good','good','good','good','good','good','good','good','good')");
                } catch (SQLException ex) {
                    Logger.getLogger(CN.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Feedback_Report().setVisible(true);
                        //JOptionPane.showMessageDialog(null, "Succesfully Added!", " Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
               }
           } 
        catch (IOException ex) {
            Logger.getLogger(Feedback_Theory.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback_Theory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback_Theory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback_Theory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback_Theory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback_Theory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Answer1;
    private javax.swing.JTextArea Answer2;
    private javax.swing.JTextArea Answer3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
