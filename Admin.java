
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamid
 */
public class Admin extends javax.swing.JFrame {
   static Connection con;
    public static boolean who=false;
    public static String nameAdmin;
     Intermediate obj =new Intermediate();
    /**
     * Creates new form 
     */
    public Admin() {
          BackImage();
        initComponents();
         Connect();
          
         NameError.setVisible(false);
        PassError.setVisible(false);
    }
         public void Connect()
    {
     
      con=obj.Connect();
      
    }
     public void BackImage ()
    {
        BufferedImage img = null;
try {
    img = ImageIO.read(new File("E:\\5th Semester\\SCD Lab\\Library_Management_System\\src\\back.jpg"));
} catch (IOException e) {
    e.printStackTrace();
}
Image dimg = img.getScaledInstance(704, 361, Image.SCALE_SMOOTH);
ImageIcon imageIcon = new ImageIcon(dimg);
setContentPane(new JLabel(imageIcon));
    }
     
       public boolean NameCheck(String Name) {
         boolean found =false;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM admins WHERE Name like '"+Name+"'");

            while (rs.next()) {
               found=true;
               
            }

            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return found;
    }
        public boolean PassCheck(String Name, String pass) {
         boolean found =false;
        try {
            Statement stat = con.createStatement();
              ResultSet rs = stat.executeQuery("SELECT Password FROM admins WHERE Name like '"+Name+"'");

            while (rs.next()) {
                 String Passfound = rs.getNString("Password");
                 
                 if(Passfound.equals(pass))
                 {
                      found=true;
                 }
                 
                 
            }

            stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return found;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasswordField = new javax.swing.JPasswordField();
        AdminName = new javax.swing.JLabel();
        AdminField = new javax.swing.JTextField();
        AdminPassword = new javax.swing.JLabel();
        UserLink = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        NameError = new javax.swing.JLabel();
        PassError = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        Please = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        AdminName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminName.setForeground(new java.awt.Color(102, 102, 0));
        AdminName.setText("Enter Your Name:");

        AdminField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminFieldActionPerformed(evt);
            }
        });

        AdminPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminPassword.setForeground(new java.awt.Color(102, 102, 0));
        AdminPassword.setText("Enter Your Password:");

        UserLink.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UserLink.setText("I'm a user");
        UserLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLinkMouseClicked(evt);
            }
        });

        Login.setText("Log in");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        NameError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameError.setForeground(new java.awt.Color(204, 0, 0));
        NameError.setText("**No Admin Found for this name");

        PassError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PassError.setForeground(new java.awt.Color(204, 0, 0));
        PassError.setText("**Wrong Password");

        Welcome.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(0, 51, 204));
        Welcome.setText("Welcome!!");

        Please.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Please.setText("Please Login to Continue");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 575, Short.MAX_VALUE)
                .addComponent(UserLink, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Login)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AdminPassword)
                                .addComponent(AdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AdminField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameError)
                            .addComponent(PassError, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Please, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Welcome)
                .addGap(23, 23, 23)
                .addComponent(Please, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Login)
                .addGap(16, 16, 16)
                .addComponent(NameError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassError)
                .addGap(27, 27, 27)
                .addComponent(UserLink))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void AdminFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminFieldActionPerformed

    private void UserLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLinkMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new MainScreen().setVisible(true);

    }//GEN-LAST:event_UserLinkMouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        
         NameError.setVisible(false);
        PassError.setVisible(false);
        
        String name;
        String pass;
        
        name=this.AdminField.getText();
        pass=this.PasswordField.getText();
        
         if(NameCheck(name))
         {
             if(PassCheck(name,pass))
             {
                 who=true;
                 nameAdmin=name;
                 this.setVisible(false);
                new AdminFunc().setVisible(true);
             }
             else
             {
                 PassError.setVisible(true);
                 PasswordField.setText("");
             }
             
         }
         
         else
         {
             NameError.setVisible(true);
             PasswordField.setText("");
         }
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    
    
    
   
    
   
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminField;
    private javax.swing.JLabel AdminName;
    private javax.swing.JLabel AdminPassword;
    private javax.swing.JButton Login;
    private javax.swing.JLabel NameError;
    private javax.swing.JLabel PassError;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel Please;
    private javax.swing.JLabel UserLink;
    private javax.swing.JLabel Welcome;
    // End of variables declaration//GEN-END:variables
}
