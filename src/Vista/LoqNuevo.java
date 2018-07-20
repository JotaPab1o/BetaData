package Vista;

import Modelo.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTACION 4
 */
public class LoqNuevo extends javax.swing.JFrame {
ResultSet result;
    /**
     * Creates new form LoqNuevo
     */
    public LoqNuevo() {
        initComponents();
        llenarClientes();
  //      llenarLaboratorio();
        llenarSeccion();
    //    llenarMatriz();
        llenarMetodologia();
        cmbDivision.setEnabled(false);
        AutoCompleteDecorator.decorate(cmbCliente);
        txtSota.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbCliente = new javax.swing.JComboBox<>();
        txtCampana = new javax.swing.JTextField();
        cmbLaboratorio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbSecciones = new javax.swing.JComboBox<>();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtInformeLOQ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fechaEstimada = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        cmbMatriz = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        fechaMuestreo = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        cmbMetodologia = new javax.swing.JComboBox<>();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbDivision = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAgregarAnalisis = new javax.swing.JButton();
        cmbAnalisis = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cmbCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClienteItemStateChanged(evt);
            }
        });

        cmbLaboratorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "LOQ", "Kummerlin", "Aqualaq", "CESMEC", "EULA", "ALS", "SGS", "Ecogestion", "LRR", "", "ANAM", "Algoritmos", "Biotecmar" }));
        cmbLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLaboratorioActionPerformed(evt);
            }
        });

        jLabel1.setText("CLIENTE");

        jLabel2.setText("CAMPAÑA");

        jLabel3.setText("Laboratorio Ejecutante");

        jLabel4.setText("N° SOTA");

        cmbSecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cmbSecciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSeccionesItemStateChanged(evt);
            }
        });

        jLabel5.setText("Secciones");

        jLabel6.setText("Fecha Ingreso");

        jLabel7.setText("N° Informe LOQ");

        jLabel8.setText("Fecha Estimada");

        jLabel9.setText("Matriz");

        cmbMatriz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cmbMatriz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMatrizItemStateChanged(evt);
            }
        });

        jLabel10.setText("Fecha Muestreo");

        jLabel11.setText("Identificacion");

        cmbMetodologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        jLabel12.setText("Metodologia");

        jLabel13.setText("Observaciones");

        jLabel15.setText("Division");

        cmbDivision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cmbDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDivisionActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnAgregarAnalisis.setText("Agregar Analisis");

        cmbAnalisis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        jLabel16.setText("Analisis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaMuestreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(fechaEstimada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(126, 126, 126)
                                        .addComponent(btnAgregarAnalisis))
                                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21)
                                .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCampana, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(61, 61, 61)
                                .addComponent(cmbMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(cmbLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSota, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(txtInformeLOQ, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCampana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15)
                    .addComponent(cmbDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtInformeLOQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(fechaEstimada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaMuestreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarAnalisis, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1172, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDivisionActionPerformed

    }//GEN-LAST:event_cmbDivisionActionPerformed

    private void cmbClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClienteItemStateChanged
        if(cmbCliente.getSelectedIndex()>-1){
            cmbDivision.removeAllItems();
            cargarDivisiones();
        }
    }//GEN-LAST:event_cmbClienteItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                       conectar cc= new conectar();
        Connection cn= cc.conexion();

         
        String ins="INSERT INTO muestras (fk_idcliente, campaña, laboratorioejecutante, nsota, secciones, fechaingresolaboratorio, ninformeloq, fechaentregaestimada, matriz, "
                + "fechamuestreo, identificacion, metodologias, observaciones) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(ins);
            
            pst.setInt(1, (int) cmbDivision.getSelectedIndex());
            pst.setString(2, txtCampana.getText());
            pst.setString(3, (String) cmbLaboratorio.getSelectedItem());
            pst.setString(4, txtSota.getText());
            pst.setString(5, (String) cmbSecciones.getSelectedItem());
            pst.setDate(6, new java.sql.Date(fechaIngreso.getDate().getTime()));
            pst.setString(7, txtInformeLOQ.getText());
            pst.setDate(8, new java.sql.Date(fechaEstimada.getDate().getTime()));
            pst.setString(9, (String) cmbMatriz.getSelectedItem());
            pst.setDate(10, new java.sql.Date(fechaMuestreo.getDate().getTime()));
            pst.setString(11, txtIdentificacion.getText());
            pst.setString(12, (String) cmbMetodologia.getSelectedItem());
            pst.setString(13, txtObservaciones.getText());

            int n= pst.executeUpdate();
            pst.close();

            if(n>0)
            {
                
                JOptionPane.showMessageDialog(this, "Se guardaron los datos");
         
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error");
            }

       } catch (SQLException ex) {
            Logger.getLogger(LoqNuevo.class.getName()).log(Level.SEVERE, null, ex);

        }            
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLaboratorioActionPerformed
        int p = cmbLaboratorio.getSelectedIndex();
        switch (p) {
            case 0:
                JOptionPane.showMessageDialog(this, "Seleccione Laboratorio");
                break;
            case 1:
               txtSota.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_cmbLaboratorioActionPerformed

    private void cmbSeccionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSeccionesItemStateChanged
        if(cmbSecciones.getSelectedIndex()>-1){
            cmbMatriz.removeAllItems();
            cargarMatriz();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSeccionesItemStateChanged

    private void cmbMatrizItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMatrizItemStateChanged
        if(cmbMatriz.getSelectedIndex()>-1){
            cmbAnalisis.removeAllItems();
            cargarMatriz();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cmbMatrizItemStateChanged

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
            java.util.logging.Logger.getLogger(LoqNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoqNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoqNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoqNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoqNuevo().setVisible(true);
            }
        });
    }
    
private void llenarClientes(){
            String cmb= "SELECT DISTINCT nombrecliente FROM clientes";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbCliente.addItem(set.getString("nombrecliente"));
            } // cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        }   
    }




private void llenarLaboratorio(){
                String cmb= "SELECT DISTINCT laboratorio FROM ensayos";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbLaboratorio.addItem(set.getString("laboratorio"));
            } // cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        }  
}

private void llenarSeccion(){
        String cmb= "SELECT DISTINCT laboratorio FROM secciones WHERE idsecciones != 1";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbSecciones.addItem(set.getString("laboratorio"));
            } // cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        }  
    
}

private void llenarMatriz(){
        String cmb= "SELECT DISTINCT matriz FROM ensayos";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbMatriz.addItem(set.getString("matriz"));
            } // cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        }  
    
}

private void llenarMetodologia(){
        String cmb= "SELECT DISTINCT metodologia FROM ensayos";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbMetodologia.addItem(set.getString("metodologia"));
            } // cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        }  
    
}

private void cargarDivisiones(){
             conectar cc= new conectar();
         Connection cn= cc.conexion();
        
        if(this.cmbCliente.getSelectedIndex()>0)
            {
      
        String nombrecliente = (String) cmbCliente.getSelectedItem();
          System.out.println(nombrecliente);

        String query = "SELECT * FROM clientes WHERE nombrecliente LIKE'"+cmbCliente.getSelectedItem().toString()+"'";
    try {
        PreparedStatement pst = cn.prepareStatement(query);
        result=pst.executeQuery();
        while (result.next()){
            cmbDivision.addItem(result.getString("divisiones"));
           }
        cmbDivision.setEnabled(true);
        cn.close();
    } catch (SQLException ex) {
        Logger.getLogger(LoqNuevo.class.getName()).log(Level.SEVERE, null, ex);
    }
            }

}
private void cargarMatriz(){
             conectar cc= new conectar();
         Connection cn= cc.conexion();
        
        if(this.cmbSecciones.getSelectedIndex()>0)
            {
      
        String nombresecciones= (String) cmbSecciones.getSelectedItem();
          System.out.println(nombresecciones);

        String querys = "SELECT DISTINCT matriz FROM ensayos WHERE laboratorio LIKE'%"+cmbSecciones.getSelectedItem().toString()+"%'";
    try {
        PreparedStatement pste = cn.prepareStatement(querys);
            ResultSet results = pste.executeQuery();
        while (results.next()){
            cmbMatriz.addItem(results.getString("matriz"));
           }
    //    cmbDivision.setEnabled(true);
        cn.close();
    } catch (SQLException ex) {
        Logger.getLogger(LoqNuevo.class.getName()).log(Level.SEVERE, null, ex);
    }
            }else{
            System.out.println("No seleccionado");
        }

}

private void cargarAnalisis(){
             conectar cc= new conectar();
         Connection cn= cc.conexion();
        
        if(this.cmbMatriz.getSelectedIndex()>0)
            {
      
        String nombreanalisis= (String) cmbMatriz.getSelectedItem();
          System.out.println(nombreanalisis);

        String querys = "SELECT DISTINCT analisis FROM ensayos WHERE matriz LIKE'"+cmbMatriz.getSelectedItem().toString()+"'";
    try {
        PreparedStatement pste = cn.prepareStatement(querys);
            ResultSet results = pste.executeQuery();
        while (results.next()){
            cmbAnalisis.addItem(results.getString("matriz"));
           }
    //    cmbDivision.setEnabled(true);
        cn.close();
    } catch (SQLException ex) {
        Logger.getLogger(LoqNuevo.class.getName()).log(Level.SEVERE, null, ex);
    }
            }else{
            System.out.println("No seleccionado");
        }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAnalisis;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbAnalisis;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbDivision;
    private javax.swing.JComboBox<String> cmbLaboratorio;
    private javax.swing.JComboBox<String> cmbMatriz;
    private javax.swing.JComboBox<String> cmbMetodologia;
    private javax.swing.JComboBox<String> cmbSecciones;
    private com.toedter.calendar.JDateChooser fechaEstimada;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private com.toedter.calendar.JDateChooser fechaMuestreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCampana;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtInformeLOQ;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtSota;
    // End of variables declaration//GEN-END:variables
         conectar cc= new conectar();
         Connection cn= cc.conexion();


}
