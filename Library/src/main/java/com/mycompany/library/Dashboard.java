/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
/**
 *
 * @author dkkissling
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setDate();

    }

public void setDate() {
    LocalDate now = LocalDate.now();

    int day = now.getDayOfMonth();
    int month = now.getMonthValue();
    int year = now.getYear();

    String monthName = now.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

    System.out.println("Hoy es " + day + " " + monthName + " " + year);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        BtnPrincipal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnPrestamo = new javax.swing.JButton();
        BtnDevoluciones = new javax.swing.JButton();
        BtnUsuario = new javax.swing.JButton();
        BtnLibros = new javax.swing.JButton();
        BtnReportes = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(0, 102, 255));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        BtnPrincipal.setBackground(new java.awt.Color(51, 51, 255));
        BtnPrincipal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BtnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        BtnPrincipal.setText("Principal");
        BtnPrincipal.setBorder(null);
        BtnPrincipal.setBorderPainted(false);
        BtnPrincipal.setContentAreaFilled(false);
        BtnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPrincipal.setEnabled(false);
        BtnPrincipal.setFocusPainted(false);
        BtnPrincipal.setFocusTraversalPolicyProvider(true);
        BtnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPrincipalMouseEntered(evt);
            }
        });
        BtnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrincipalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel3.setText("IloveLib");

        BtnPrestamo.setBackground(new java.awt.Color(102, 0, 102));
        BtnPrestamo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BtnPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        BtnPrestamo.setText("Prestamos");
        BtnPrestamo.setBorder(null);
        BtnPrestamo.setBorderPainted(false);
        BtnPrestamo.setContentAreaFilled(false);
        BtnPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPrestamo.setFocusCycleRoot(true);
        BtnPrestamo.setFocusTraversalPolicyProvider(true);
        BtnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrestamoActionPerformed(evt);
            }
        });

        BtnDevoluciones.setBackground(new java.awt.Color(51, 51, 255));
        BtnDevoluciones.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BtnDevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        BtnDevoluciones.setText("Devoluciones");
        BtnDevoluciones.setBorder(null);
        BtnDevoluciones.setBorderPainted(false);
        BtnDevoluciones.setContentAreaFilled(false);
        BtnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDevoluciones.setFocusCycleRoot(true);
        BtnDevoluciones.setFocusTraversalPolicyProvider(true);
        BtnDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDevolucionesActionPerformed(evt);
            }
        });

        BtnUsuario.setBackground(new java.awt.Color(51, 51, 255));
        BtnUsuario.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BtnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnUsuario.setText("Usuario");
        BtnUsuario.setBorder(null);
        BtnUsuario.setBorderPainted(false);
        BtnUsuario.setContentAreaFilled(false);
        BtnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUsuario.setFocusCycleRoot(true);
        BtnUsuario.setFocusTraversalPolicyProvider(true);
        BtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioActionPerformed(evt);
            }
        });

        BtnLibros.setBackground(new java.awt.Color(51, 51, 255));
        BtnLibros.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BtnLibros.setForeground(new java.awt.Color(255, 255, 255));
        BtnLibros.setText("Libros");
        BtnLibros.setBorder(null);
        BtnLibros.setBorderPainted(false);
        BtnLibros.setContentAreaFilled(false);
        BtnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLibros.setFocusCycleRoot(true);
        BtnLibros.setFocusTraversalPolicyProvider(true);
        BtnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLibrosActionPerformed(evt);
            }
        });

        BtnReportes.setBackground(new java.awt.Color(51, 51, 255));
        BtnReportes.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BtnReportes.setForeground(new java.awt.Color(255, 255, 255));
        BtnReportes.setText("Reportes");
        BtnReportes.setBorder(null);
        BtnReportes.setBorderPainted(false);
        BtnReportes.setContentAreaFilled(false);
        BtnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnReportes.setFocusCycleRoot(true);
        BtnReportes.setFocusTraversalPolicyProvider(true);
        BtnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BtnPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnDevoluciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLibros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel3)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        header.setBackground(new java.awt.Color(0, 102, 255));
        header.setPreferredSize(new java.awt.Dimension(750, 150));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Administracion/Control/Biblioteca");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setText("Hoy es Domingo 21 de Enero");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        mensaje.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        mensaje.setText("Sistema de IloveLib");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPrincipalActionPerformed

    private void BtnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPrestamoActionPerformed

    private void BtnDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDevolucionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDevolucionesActionPerformed

    private void BtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUsuarioActionPerformed

    private void BtnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLibrosActionPerformed

    private void BtnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnReportesActionPerformed

    private void BtnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrincipalMouseEntered
        BtnPrincipal.setBackground(Color.YELLOW);
    }//GEN-LAST:event_BtnPrincipalMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMaterialLighterIJTheme.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnDevoluciones;
    private javax.swing.JButton BtnLibros;
    private javax.swing.JButton BtnPrestamo;
    private javax.swing.JButton BtnPrincipal;
    private javax.swing.JButton BtnReportes;
    private javax.swing.JButton BtnUsuario;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
