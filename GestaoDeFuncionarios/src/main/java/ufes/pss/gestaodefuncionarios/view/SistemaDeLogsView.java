/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ufes.pss.gestaodefuncionarios.view;

import javax.swing.JButton;

/**
 *
 * @author handaniels
 */
public class SistemaDeLogsView extends javax.swing.JInternalFrame {

    /**
     * Creates new form SistemaDeLogsVIew
     */
    public SistemaDeLogsView() {
        initComponents();
        gpSistemaLogs.add(rbtTXT);
        gpSistemaLogs.add(rbtXML);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpSistemaLogs = new javax.swing.ButtonGroup();
        rbtXML = new javax.swing.JRadioButton();
        rbtTXT = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Escolha um Sistema de Logs");

        rbtXML.setText("XML");

        rbtTXT.setText("TXT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(rbtXML)
                .addGap(83, 83, 83)
                .addComponent(rbtTXT)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtXML)
                    .addComponent(rbtTXT))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gpSistemaLogs;
    private javax.swing.JRadioButton rbtTXT;
    private javax.swing.JRadioButton rbtXML;
    // End of variables declaration//GEN-END:variables
}
