

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class AdminRequests extends javax.swing.JFrame {

    DLLOpt qu=new DLLOpt(); 
    public static DoublyNode navigate;
    
  
    /**
     * Creates new form AdminRequests
     */
    public AdminRequests()  {
        initComponents();
        try {
            setQueue();
        } catch (IOException ex) {
            Logger.getLogger(AdminRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(qu.isEmpty())
        {
            NoReq.setVisible(true);
            ReqPanel.setVisible(false);
            Next.setVisible(false);
            Previous.setVisible(false);
            Delete.setVisible(false);
        }
        else
        {
             NoReq.setVisible(false);
            ReqPanel.setVisible(true);
            navigate=qu.set();
            showResult();
        }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReqPanel = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Auth = new javax.swing.JLabel();
        NameAns = new javax.swing.JLabel();
        AuthAns = new javax.swing.JLabel();
        Navigator = new javax.swing.JLabel();
        ReqNo = new javax.swing.JLabel();
        NoReq = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        Previous = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Main = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check Requests");

        ReqPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Name.setText("Name:");

        Auth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Auth.setText("Author:");

        NameAns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameAns.setText("                              ");

        AuthAns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AuthAns.setText("                              ");

        Navigator.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Navigator.setForeground(new java.awt.Color(204, 0, 0));
        Navigator.setText("      ");

        ReqNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReqNo.setForeground(new java.awt.Color(0, 0, 255));
        ReqNo.setText("   ");

        javax.swing.GroupLayout ReqPanelLayout = new javax.swing.GroupLayout(ReqPanel);
        ReqPanel.setLayout(ReqPanelLayout);
        ReqPanelLayout.setHorizontalGroup(
            ReqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReqPanelLayout.createSequentialGroup()
                .addGroup(ReqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReqPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(ReqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReqPanelLayout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameAns, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReqPanelLayout.createSequentialGroup()
                                .addComponent(Auth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AuthAns, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ReqPanelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(ReqNo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReqPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Navigator, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        ReqPanelLayout.setVerticalGroup(
            ReqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReqPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ReqNo)
                .addGap(18, 18, 18)
                .addGroup(ReqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(NameAns))
                .addGap(18, 18, 18)
                .addGroup(ReqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Auth)
                    .addComponent(AuthAns))
                .addGap(18, 18, 18)
                .addComponent(Navigator)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        NoReq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NoReq.setForeground(new java.awt.Color(204, 0, 0));
        NoReq.setText("No Requests !!");

        Next.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Next.setForeground(new java.awt.Color(0, 51, 204));
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Previous.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Previous.setForeground(new java.awt.Color(0, 51, 204));
        Previous.setText("Previous");
        Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setForeground(new java.awt.Color(204, 0, 0));
        Delete.setText("Delete this req");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Main.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                        .addGap(242, 242, 242)
                        .addComponent(NoReq))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Main)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Previous)
                                .addGap(192, 192, 192)
                                .addComponent(Next))
                            .addComponent(ReqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(Delete)))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(NoReq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next)
                    .addComponent(Previous))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Main)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        DoublyNode stillnavigate=navigate;
        
        Navigator.setText("");
        navigate=qu.forward(navigate);
        
        
        if(navigate==stillnavigate)
        {
            Navigator.setText("End of List");
        }
       
        showResult();
    }//GEN-LAST:event_NextActionPerformed

    private void PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousActionPerformed
        // TODO add your handling code here:
        
         DoublyNode stillnavigate=navigate;
         
        Navigator.setText("");
        navigate=qu.backward(navigate);
        
        if(navigate==stillnavigate)
        {
            Navigator.setText("Start of List");
        }
;
        showResult();
                                        

    }//GEN-LAST:event_PreviousActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       
        DoublyNode thisNavigate=navigate;
        
        qu.deleteNode(navigate);
        navigate=qu.check(thisNavigate);
       
        try {
            DeleteFromFile(thisNavigate.name);
        } catch (IOException ex) {
            Logger.getLogger(AdminRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(qu.isEmpty())
        {
             try {
                clearFile();
            } catch (IOException ex) {
                Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(navigate==null)
        {
            NoReq.setVisible(true);
            ReqPanel.setVisible(false);
            Next.setVisible(false);
            Previous.setVisible(false);
            Delete.setVisible(false);
        }
        
        else
        {
            showResult();
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        // TODO add your handling code here:
        
         this.setVisible(false);
                new AdminFunc().setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRequests().setVisible(true);
            }
        });
    }
    
    public static void clearFile() throws IOException
    {
        File f=new File("E:\\3rd Semester\\DSA Lab\\Final_Project\\src\\Requests.txt");
     PrintWriter wr =new PrintWriter(new FileWriter(f, false));
       BufferedWriter bw =new BufferedWriter(wr);      
       
          bw.close();
    }
    
    public void setQueue() throws IOException
    {
        String book,author;
         File fr =new File("E:\\3rd Semester\\DSA Lab\\Final_Project\\src\\Requests.txt");
         BufferedReader buffer;
           buffer = new BufferedReader(new FileReader(fr));
          String line=buffer.readLine();
            
                while(line!=null)
                {
                      if(line.equals("*****"))
                    {
                        break;
                    }
                    book=line;
                    line=buffer.readLine();
                    author=line;
                    line=buffer.readLine();
                    qu.insertAtEnd(book, author);
                  
                }
    }
    
    public void showResult()
    {
        ReqNo.setText("Request No. "+qu.num);
        NameAns.setText(navigate.name);
        AuthAns.setText(navigate.author);
        
    }
    
    public void DeleteFromFile(String name) throws FileNotFoundException, IOException
    {
           StringBuilder sb = new StringBuilder();
    File f =new File("E:\\3rd Semester\\DSA Lab\\Final_Project\\src\\Requests.txt");
    try (Scanner sc = new Scanner(f)) {
        String currentLine;
        while(sc.hasNext()){
            currentLine = sc.nextLine();
            if(currentLine.equals(name)){
               currentLine = sc.nextLine();
                continue;
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
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Auth;
    private javax.swing.JLabel AuthAns;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Main;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameAns;
    public javax.swing.JLabel Navigator;
    private javax.swing.JButton Next;
    private javax.swing.JLabel NoReq;
    private javax.swing.JButton Previous;
    private javax.swing.JLabel ReqNo;
    private javax.swing.JPanel ReqPanel;
    // End of variables declaration//GEN-END:variables

    
}
