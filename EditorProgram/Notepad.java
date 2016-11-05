/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorProgram;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Regis
 */
public class Notepad extends javax.swing.JFrame {

    String filename;
    int status_jfile;
    int initial;
    int file_length=0;
    int update_counter=0;

    public Notepad() {
        initComponents();
        edit_area.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                update_counter++;
                System.out.println(" insert update happened "+update_counter);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                update_counter++;
System.out.println(" remove updated happened "+update_counter);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                 update_counter++;
System.out.println(" change updated happened "+update_counter);
            }
                
        
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edit_area = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        edit_area.setColumns(20);
        edit_area.setRows(5);
        edit_area.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                edit_areaCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(edit_area);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK)
        );
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK)
        );
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed

        try {
            JFileChooser jf = new JFileChooser();
            status_jfile = jf.showOpenDialog(rootPane);
            if (status_jfile == JFileChooser.APPROVE_OPTION) {
                filename = jf.getSelectedFile().getAbsolutePath();
                file_length=(int)jf.getSelectedFile().length();
                System.out.println("file length:"+file_length);
                this.setTitle(jf.getSelectedFile().getName());
                Scanner rs = new Scanner(jf.getSelectedFile());
                StringBuilder data = new StringBuilder();
                while (rs.hasNext()) {
                    data.append(rs.nextLine());
                    data.append("\n");
                }
                edit_area.setText(data.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed

        if (!edit_area.getText().isEmpty() & filename == null) {
            JFileChooser js = new JFileChooser();
            FileFilter f = new FileNameExtensionFilter("Text File", "(.txt)");
            js.addChoosableFileFilter(f);
            //This status is to check whether usr cancelled or not
           int status= js.showSaveDialog(rootPane);
            createFile(js,status);

        } else if (edit_area.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "There is nothing to save");
        } else if (update_counter>1){
            System.out.println("Called function update_counter");
            System.out.println("File name:" + filename);
            try {
                System.out.println("File length in savemmenu"+file_length);
                
                PrintWriter pw = new PrintWriter(new FileWriter(filename), true);
                String data = edit_area.getText();
                pw.append(data);
                pw.flush();
                pw.close();
                update_counter=0;
            } catch (IOException ex) {
                Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed
    public void createFile(JFileChooser chooser,int status) {
        
        if(status==JFileChooser.APPROVE_OPTION){
        try {
            
            PrintWriter pw = new PrintWriter(new FileWriter(chooser.getSelectedFile().getAbsolutePath(), true));
            pw.write(edit_area.getText());
            pw.flush();
            pw.flush();
            update_counter=0;
        } catch (IOException ex) {
            Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        if (!edit_area.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Text is Available \nWhat you want to  do?");
        } else {
            dispose();
        }

    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void edit_areaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_edit_areaCaretUpdate
        System.out.println("Update happed");
        System.out.println("Location of caret:" + evt.getDot());
        initial=evt.getDot();
        System.out.println("Selection:" + evt.getMark());
    }//GEN-LAST:event_edit_areaCaretUpdate

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!edit_area.getText().isEmpty()&&update_counter>1&&filename==null) {
            System.out.println("form option for save is called");
            int result = JOptionPane.showConfirmDialog(rootPane, "Do You Want To Save The File ?");
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea edit_area;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
}
