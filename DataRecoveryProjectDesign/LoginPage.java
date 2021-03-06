/*

 *     Rex
 */
package justdemo;

import javax.swing.ImageIcon;

/**
 *
 * @author Regis
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        inputBox = new javax.swing.JTextField();
        passwordBox = new javax.swing.JPasswordField();
        signupLabel = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        signinLabel = new javax.swing.JLabel();
        lockIcon = new javax.swing.JLabel();
        personIcon = new javax.swing.JLabel();
        whiteBackground = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(inputBox);
        inputBox.setBounds(170, 160, 210, 50);
        getContentPane().add(passwordBox);
        passwordBox.setBounds(170, 230, 210, 50);

        signupLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Regis\\Documents\\NetBeansProjects\\LearningJava\\src\\justdemo\\images\\defaultsignup.png")); // NOI18N
        signupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signupLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signupLabelMouseReleased(evt);
            }
        });
        getContentPane().add(signupLabel);
        signupLabel.setBounds(270, 330, 130, 40);

        loginTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginTitle.setText("DashBoard");
        loginTitle.setToolTipText("");
        getContentPane().add(loginTitle);
        loginTitle.setBounds(190, 100, 150, 40);

        signinLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Regis\\Documents\\NetBeansProjects\\LearningJava\\src\\justdemo\\images\\defaultsignin.png")); // NOI18N
        signinLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signinLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signinLabelMouseReleased(evt);
            }
        });
        getContentPane().add(signinLabel);
        signinLabel.setBounds(100, 330, 130, 40);

        lockIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Regis\\Documents\\NetBeansProjects\\LearningJava\\src\\justdemo\\images\\lockIcon.png")); // NOI18N
        getContentPane().add(lockIcon);
        lockIcon.setBounds(100, 240, 40, 35);

        personIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Regis\\Documents\\NetBeansProjects\\LearningJava\\src\\justdemo\\images\\personIcon.png")); // NOI18N
        getContentPane().add(personIcon);
        personIcon.setBounds(100, 160, 40, 40);

        whiteBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Regis\\Documents\\NetBeansProjects\\LearningJava\\src\\justdemo\\images\\WhiteBackground.png")); // NOI18N
        getContentPane().add(whiteBackground);
        whiteBackground.setBounds(70, 70, 350, 350);

        backgroundImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Regis\\Documents\\NetBeansProjects\\LearningJava\\src\\justdemo\\images\\backgroundImge.png")); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLabelMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("\\images\\SigninMouseHover.png"));
        signinLabel.setIcon(image);
    }//GEN-LAST:event_signinLabelMouseEntered

    private void signinLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLabelMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("\\images\\defaultsignin.png"));
        signinLabel.setIcon(image);
    }//GEN-LAST:event_signinLabelMouseExited

    private void signinLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLabelMousePressed

        ImageIcon image = new ImageIcon(getClass().getResource("\\images\\pressedSigninButton.png"));
        signinLabel.setIcon(image);
    }//GEN-LAST:event_signinLabelMousePressed

    private void signinLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinLabelMouseReleased
        ImageIcon image = new ImageIcon(getClass().getResource("\\images\\defaultsignin.png"));
        signinLabel.setIcon(image);
    }//GEN-LAST:event_signinLabelMouseReleased

    private void signupLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseEntered
        ImageIcon image = new ImageIcon(getClass().getResource("\\images\\singupMouseHover.png"));
        signupLabel.setIcon(image);
    }//GEN-LAST:event_signupLabelMouseEntered

    private void signupLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseExited
        ImageIcon image = new ImageIcon(getClass().getResource("\\images\\defaultsignup.png"));
        signupLabel.setIcon(image);
    }//GEN-LAST:event_signupLabelMouseExited

    private void signupLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMousePressed
        ImageIcon image = new ImageIcon(getClass().getResource("\\images\\pressedSignupButton.png"));
        signupLabel.setIcon(image);
    }//GEN-LAST:event_signupLabelMousePressed

    private void signupLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseReleased
        ImageIcon image = new ImageIcon(getClass().getResource("\\images\\defaultsignup.png"));
        signupLabel.setIcon(image);
    }//GEN-LAST:event_signupLabelMouseReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTextField inputBox;
    private javax.swing.JLabel lockIcon;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JLabel personIcon;
    private javax.swing.JLabel signinLabel;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JLabel whiteBackground;
    // End of variables declaration//GEN-END:variables
}
