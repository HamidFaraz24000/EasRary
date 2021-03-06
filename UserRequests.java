
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamid
 */
public class UserRequests extends javax.swing.JFrame {

    /**
     * Creates new form UserRequests
     */
    public UserRequests() {
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

        ReqDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        ReqAnother = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        NameField = new javax.swing.JTextField();
        AuthorField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        AuthorLabel = new javax.swing.JLabel();
        Request = new javax.swing.JButton();
        Main = new javax.swing.JButton();

        ReqDialog.setMinimumSize(new java.awt.Dimension(400, 175));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Request made Successfully!!");

        ReqAnother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ReqAnother.setText("Request Another Book");
        ReqAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReqAnotherActionPerformed(evt);
            }
        });

        Return.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Return.setText("Return to Main Screen");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReqDialogLayout = new javax.swing.GroupLayout(ReqDialog.getContentPane());
        ReqDialog.getContentPane().setLayout(ReqDialogLayout);
        ReqDialogLayout.setHorizontalGroup(
            ReqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReqDialogLayout.createSequentialGroup()
                .addGroup(ReqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReqDialogLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ReqAnother)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReqDialogLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        ReqDialogLayout.setVerticalGroup(
            ReqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReqDialogLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReqAnother)
                    .addComponent(Return))
                .addGap(47, 47, 47))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Request");

        NameField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameField.setForeground(new java.awt.Color(0, 102, 255));
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        AuthorField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AuthorField.setForeground(new java.awt.Color(0, 102, 255));
        AuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorFieldActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameLabel.setText("Enter the Book Name:");

        AuthorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AuthorLabel.setText("Enter the Author Name:");

        Request.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Request.setText("Make Request");
        Request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestActionPerformed(evt);
            }
        });

        Main.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Main.setText("Main Menu");
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(Request))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Main)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AuthorLabel)
                    .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(Request)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(Main)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void AuthorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorFieldActionPerformed

    private void RequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestActionPerformed
        // TODO add your handling code here:
        
        String name, author;

        name = this.NameField.getText();
        author = this.AuthorField.getText();
        
        try {
            addReq(name, author);
        } catch (IOException ex) {
            Logger.getLogger(UserRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ReqDialog.setLocationRelativeTo(this);
        ReqDialog.setVisible(true);

    }//GEN-LAST:event_RequestActionPerformed

    private void ReqAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReqAnotherActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        ReqDialog.dispose();
        new UserRequests().setVisible(true);
    }//GEN-LAST:event_ReqAnotherActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        ReqDialog.dispose();
        new UserScreen().setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new UserScreen().setVisible(true);
    }//GEN-LAST:event_MainActionPerformed

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
            java.util.logging.Logger.getLogger(UserRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRequests().setVisible(true);
            }
        });
    }
    
     public void addReq(String name, String author) throws IOException
    {
        StringBuilder sb = new StringBuilder();
         File f=new File("E:\\3rd Semester\\DSA Lab\\Final_Project\\src\\Requests.txt");
       try (Scanner sc = new Scanner(f)) {
        String currentLine;
        while(sc.hasNext()){
            currentLine = sc.nextLine();
            if(currentLine.equals("*****")){
              
                break;
//skips lineToRemove
            }
            sb.append(currentLine).append("\n");
        }
    }
    //Delete File Content
    PrintWriter pw = new PrintWriter(f);
    pw.close();

    BufferedWriter writer = new BufferedWriter(new FileWriter(f, true));
    writer.append(sb.toString());
    writer.close();
    
    WriteNow(name,author);

    }
      public void WriteNow(String name, String author) throws IOException
    {
          
      File f=new File("E:\\3rd Semester\\DSA Lab\\Final_Project\\src\\Requests.txt");
     PrintWriter wr =new PrintWriter(new FileWriter(f, true));
       BufferedWriter bw =new BufferedWriter(wr);      
            
    
     bw.write(name);
     bw.newLine();
     bw.write(author);
     bw.newLine();
     bw.write("*****");
     bw.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuthorField;
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JButton Main;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton ReqAnother;
    private javax.swing.JDialog ReqDialog;
    private javax.swing.JButton Request;
    private javax.swing.JButton Return;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
