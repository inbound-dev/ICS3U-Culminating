/*
 * This is A rock Paper Scissors Program 
 * 
 * This Program Was Created By Jordan Hamilton On January 22, 2020
 *
 * Patent Pending
 */

package ics3u.culminating.RPS;
import java.util.*;



/**
 *
 * @author joham3169
 */
public class PLAYERSCREEN extends javax.swing.JFrame {
    // creating all public arrays and variables
    
    String CRI;
    int USER_CHOICE;
    int UC;
    int LastInt;
    int CurrentInt;
    int [] arr = new int [2];
    int win;
    int loss;
    double wlr;
    String lloss;
    String wwin;
    double wwwin;
    double llloss;
    String wlrt;
    
    
    
    Random randint = new Random();
    int RI = randint.nextInt(4);
    
    
    /**
     * Creates new form PLAYERSCREEN
     */
    public PLAYERSCREEN() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        USER_ROCK = new javax.swing.JButton();
        USER_PAPER = new javax.swing.JButton();
        USER_SCISSORS = new javax.swing.JButton();
        CompChoice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        WINSTATE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WINS = new javax.swing.JLabel();
        LOSSES = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Ratio = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255,255,255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setText("Rock Paper Scissors ");

        USER_ROCK.setText("Rock");
        USER_ROCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USER_ROCKActionPerformed(evt);
            }
        });

        USER_PAPER.setText("Paper");
        USER_PAPER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USER_PAPERActionPerformed(evt);
            }
        });

        USER_SCISSORS.setText("Scissors");
        USER_SCISSORS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USER_SCISSORSActionPerformed(evt);
            }
        });

        CompChoice.setText("Pending...");

        jLabel3.setText("USER");

        jLabel4.setText("COMPUTER");

        WINSTATE.setText("Pending..");

        jLabel6.setText("Win Or Loss Status");

        WINS.setText("Pending....");

        LOSSES.setText("Pending...");

        jLabel7.setText("W/L Ratio");

        Ratio.setText("Pending....");

        jLabel9.setText("Wins");

        jLabel10.setText("Losses");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(WINS))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(USER_ROCK)
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(USER_PAPER)
                                        .addGap(165, 165, 165)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Ratio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(WINSTATE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LOSSES)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CompChoice)))))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(USER_SCISSORS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(USER_ROCK)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(CompChoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WINS)
                            .addComponent(LOSSES))
                        .addGap(18, 18, 18)
                        .addComponent(USER_PAPER)))
                .addGap(27, 27, 27)
                .addComponent(Ratio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(USER_SCISSORS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(WINSTATE)
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USER_SCISSORSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USER_SCISSORSActionPerformed
    //Scissors
    USER_CHOICE = 3;
    EXECUTION();
    }//GEN-LAST:event_USER_SCISSORSActionPerformed

    private void USER_PAPERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USER_PAPERActionPerformed
    //Paper
    
    USER_CHOICE = 2;
    EXECUTION();
    }//GEN-LAST:event_USER_PAPERActionPerformed

    private void USER_ROCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USER_ROCKActionPerformed
    // ROCK
    
    USER_CHOICE = 1;
    EXECUTION();
    }//GEN-LAST:event_USER_ROCKActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        System.out.println("Note The Error You See is just That it is Trying to Print a Double But it starts at 0");
        
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
            java.util.logging.Logger.getLogger(PLAYERSCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLAYERSCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLAYERSCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLAYERSCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PLAYERSCREEN().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompChoice;
    private javax.swing.JLabel LOSSES;
    private javax.swing.JLabel Ratio;
    private javax.swing.JButton USER_PAPER;
    private javax.swing.JButton USER_ROCK;
    private javax.swing.JButton USER_SCISSORS;
    private javax.swing.JLabel WINS;
    private javax.swing.JLabel WINSTATE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
// This Method Checks to see if the random number generated by the computer are out of range
// if it is out of range it will add or subtract to make it in range
   
    public void RNG(){
        
    Random randint = new Random();
    
    RI = randint.nextInt(4);
    
        if (RI == 0){
           RI = RI + 1; 
           
        }
        if (RI == 4){
            RI = RI - 1;
             
        }
    CRI  = String.valueOf(RI);
   }
   
   // This Method Checks To See What The Value Of The User Choice Is And What
   // The Value Of The Computer's Choice Is Then Shows the User Their "WINSATE"
   
   public void choices(){
       
       UC = Integer.valueOf(CRI);
       
       if(USER_CHOICE == 1 && UC == 1){
           WINSTATE.setText("You Tied"); 
           
       }
       if(USER_CHOICE == 1 && UC == 3){
           WINSTATE.setText("You won");
           win = win + 1;
           wwin = String.valueOf(win);
           WINS.setText(wwin);
       }
       if(USER_CHOICE == 1 && UC == 2){
           WINSTATE.setText("You Lost"); 
           loss = loss + 1; 
           lloss = String.valueOf(loss);
           LOSSES.setText(lloss);
       }
       if(USER_CHOICE == 2 && UC == 2){
           WINSTATE.setText("You Tied"); 
           
       }
       if(USER_CHOICE == 2 && UC == 1){
           WINSTATE.setText("You won"); 
           win = win + 1;
           wwin = String.valueOf(win);
           WINS.setText(wwin);
       }
       if(USER_CHOICE == 2 && UC == 3){
           WINSTATE.setText("You Lost"); 
           loss = l + 1; 
           lloss = String.valueOf(loss);
           LOSSES.setText(lloss);
       }
       if(USER_CHOICE == 3 && UC == 3){
           WINSTATE.setText("You Tied"); 
           
       }
       if(USER_CHOICE == 3 && UC == 1){
           WINSTATE.setText("You won");
           win = win + 1;
           wwin = String.valueOf(win);
           WINS.setText(wwin);
       }
       if(USER_CHOICE == 3 && UC == 2){
           WINSTATE.setText("You Lost");
           loss = loss + 1oss; 
           ll = String.valueOf(loss);
           LOSSES.setText(lloss);
       }
      wwwin = Integer.valueOf(wwin);
      llloss = Integer.valueOf(lloss);
      wlr = wwwin / llloss;
      wlrt = String.valueOf(wlr);
      Ratio.setText(wlrt);
      //wlrt is win loss ratio text
   }
   
   // This Method Checks What The Value Of The Computer's Choice Is And Makes 
   // That A Word That Is Easier To Understand To The User
   
   public void NumToChoice(){
       if(UC == 1){
           CompChoice.setText("Rock");
       }
       if(UC == 2){
           CompChoice.setText("Paper");
       }
       if(UC == 3){
           CompChoice.setText("Scissors");
       }
   }
   // This Method Takes all Methods and Combines them to be called all at once
   public void EXECUTION(){
    RNG();
    choices();
    NumToChoice();
   }
}
