/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.org.gui;

import cl.XZeromarx.model.Curso;
import cl.XZeromarx.model.Matricula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XZeroMarx
 */
public class GuiFormulario extends javax.swing.JFrame {

    /**
     * Creates new form GuiFormulario
     */
    public GuiFormulario() {
        initComponents();
        pnlSec.setVisible(false);
        llenarCmbCursos();
        pnlConvenio.setVisible(false);

    }

    private final Curso cursoHSS = new Curso(80000, 40000, 6, "Hardstyle Shuffle");
    private final Curso cursoJS = new Curso(60000, 50000, 4, "Jumpstyle");
    private final Curso cursoTT = new Curso(90000, 60000, 3, "Tecktonik");
    private int totalCurso;

    private List<Matricula> estudiantes = new ArrayList<>();
    Matricula estudiante;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpSexo = new javax.swing.ButtonGroup();
        pnlPrimario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        pnlSec = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rdMasculino = new javax.swing.JRadioButton();
        rdFemenino = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        cmbCursos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtMensualidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        chkConvenio = new javax.swing.JCheckBox();
        pnlConvenio = new javax.swing.JPanel();
        cmbConvenio = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotalFinal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCuotas = new javax.swing.JTextField();
        txtTotalCuota = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnMatricular = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrimario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnlPrimario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel1.setText("Run:");

        btnBuscar.setText("...");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Sexo:");

        btngrpSexo.add(rdMasculino);
        rdMasculino.setSelected(true);
        rdMasculino.setText("Masculino");

        btngrpSexo.add(rdFemenino);
        rdFemenino.setText("Femenino");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Dirección:");

        cmbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursosActionPerformed(evt);
            }
        });

        jLabel5.setText("Curso:");

        jLabel6.setText("Matricula:");

        txtMatricula.setEditable(false);

        txtMensualidad.setEditable(false);

        jLabel7.setText("Mensualidad:");

        jLabel8.setText("Total:");

        txtTotal.setEditable(false);

        chkConvenio.setText("Convenio");
        chkConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConvenioActionPerformed(evt);
            }
        });

        pnlConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Convenio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cmbConvenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caja los andes --> 5%", "Caja los héroes --> 7%" }));
        cmbConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConvenioActionPerformed(evt);
            }
        });

        jLabel12.setText("Descuento:");

        txtDescuento.setEditable(false);

        javax.swing.GroupLayout pnlConvenioLayout = new javax.swing.GroupLayout(pnlConvenio);
        pnlConvenio.setLayout(pnlConvenioLayout);
        pnlConvenioLayout.setHorizontalGroup(
            pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConvenioLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescuento))
                    .addComponent(cmbConvenio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlConvenioLayout.setVerticalGroup(
            pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConvenioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel9.setText("Total FINAL:");

        txtTotalFinal.setEditable(false);

        jLabel10.setText("N° Cuotas:");

        txtCuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCuotasKeyReleased(evt);
            }
        });

        txtTotalCuota.setEditable(false);

        jLabel11.setText("Total cuota:");

        javax.swing.GroupLayout pnlSecLayout = new javax.swing.GroupLayout(pnlSec);
        pnlSec.setLayout(pnlSecLayout);
        pnlSecLayout.setHorizontalGroup(
            pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensualidad)
                    .addComponent(txtTotal)
                    .addComponent(txtMatricula)
                    .addComponent(txtDireccion)
                    .addComponent(txtNombre)
                    .addComponent(cmbCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalFinal)
                    .addComponent(txtCuotas)
                    .addComponent(txtTotalCuota)
                    .addGroup(pnlSecLayout.createSequentialGroup()
                        .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkConvenio)
                            .addGroup(pnlSecLayout.createSequentialGroup()
                                .addComponent(rdMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(rdFemenino))
                            .addComponent(pnlConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSecLayout.setVerticalGroup(
            pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMasculino)
                    .addComponent(rdFemenino)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkConvenio)
                .addGap(18, 18, 18)
                .addComponent(pnlConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSecLayout.createSequentialGroup()
                        .addComponent(txtTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPrimarioLayout = new javax.swing.GroupLayout(pnlPrimario);
        pnlPrimario.setLayout(pnlPrimarioLayout);
        pnlPrimarioLayout.setHorizontalGroup(
            pnlPrimarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrimarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(pnlSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPrimarioLayout.setVerticalGroup(
            pnlPrimarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrimarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrimarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnMatricular.setText("Matricular");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrimario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlPrimario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMatricular)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursosActionPerformed

        switch (cmbCursos.getSelectedIndex()) {
            case 0:
                txtMatricula.setText(String.valueOf(cursoHSS.getMatricula()));
                txtMensualidad.setText(String.valueOf(cursoHSS.getMensualidad()));
                totalCurso = cursoHSS.getMatricula() + (cursoHSS.getMensualidad() * cursoHSS.getDuracion());
                txtTotal.setText(String.valueOf(totalCurso));
                break;
            case 1:
                txtMatricula.setText(String.valueOf(cursoJS.getMatricula()));
                txtMensualidad.setText(String.valueOf(cursoJS.getMensualidad()));
                txtTotal.setText(String.valueOf(cursoJS.getMatricula() + (cursoJS.getMensualidad() * cursoJS.getDuracion())));
                totalCurso = cursoJS.getMatricula() + (cursoJS.getMensualidad() * cursoJS.getDuracion());
                txtTotal.setText(String.valueOf(totalCurso));
                break;
            default:
                txtMatricula.setText(String.valueOf(cursoTT.getMatricula()));
                txtMensualidad.setText(String.valueOf(cursoTT.getMensualidad()));
                txtTotal.setText(String.valueOf(cursoTT.getMatricula() + (cursoTT.getMensualidad() * cursoTT.getDuracion())));
                totalCurso = cursoTT.getMatricula() + (cursoTT.getMensualidad() * cursoTT.getDuracion());
                txtTotal.setText(String.valueOf(cursoTT.getMatricula() + (cursoTT.getMensualidad() * cursoTT.getDuracion())));
                txtTotal.setText(String.valueOf(totalCurso));
                break;
        }

    }//GEN-LAST:event_cmbCursosActionPerformed

    private void chkConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConvenioActionPerformed

        pnlConvenio.setVisible(chkConvenio.isSelected());


    }//GEN-LAST:event_chkConvenioActionPerformed

    private void cmbConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConvenioActionPerformed

        double tFinal;
        int totalFinal;

        double porcConvenio;
        if (cmbConvenio.getSelectedIndex() == 0) {
            porcConvenio = 0.05;
            System.out.println(porcConvenio);
        } else {
            porcConvenio = 0.07;
            System.out.println(porcConvenio);
        }

        switch (cmbCursos.getSelectedIndex()) {
            case 0:
                tFinal = totalCurso - (totalCurso * porcConvenio);
                totalFinal = (int) tFinal;
                txtTotalFinal.setText(String.valueOf(totalFinal));
                break;
            case 1:
                tFinal = totalCurso - (totalCurso * porcConvenio);
                totalFinal = (int) tFinal;
                txtTotalFinal.setText(String.valueOf(totalFinal));
                break;
            default:
                tFinal = totalCurso - (totalCurso * porcConvenio);
                totalFinal = (int) tFinal;
                txtTotalFinal.setText(String.valueOf(totalFinal));
                break;
        }

        txtDescuento.setText(String.valueOf(totalCurso - porcConvenio));
    }//GEN-LAST:event_cmbConvenioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String rutEstudiante = txtRut.getText();
        pnlSec.setVisible(true);
        for (Matricula estudiante : estudiantes) {

            if (rutEstudiante.equalsIgnoreCase(estudiante.getRut())) {
                setDatos(estudiante);
            } else {
                pnlSec.setVisible(true);

            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCuotasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuotasKeyReleased
        char c = evt.getKeyChar();

        if (Character.isWhitespace(c) || Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        } else {

            try {//revisar
                int calculo = Integer.parseInt(txtTotalFinal.getText()) / Integer.parseInt(txtCuotas.getText());
                txtTotalCuota.setText(String.valueOf(calculo));

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_txtCuotasKeyReleased

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        Matricula e = new Matricula();

        e.setRut(txtRut.getText());
        if (rdMasculino.isSelected()) {
            e.setSexo("Masculino");
        } else {
            e.setSexo("Femenino");
        }
        e.setNombre(txtNombre.getText());
        e.setDireccion(txtDireccion.getText());
        if (cmbCursos.getSelectedIndex() == 0) {
            e.setCurso("Hardstyle Shuffle");
        } else if (cmbCursos.getSelectedIndex() == 1) {
            e.setCurso("Jumpstyle");
        } else {
            e.setCurso("Tecktonik");
        }
        e.setValorMatricula(txtMatricula.getText());
        e.setMensualidad(txtMensualidad.getText());
        e.setTotalMatricula(txtTotal.getText());
        e.setConvenio(chkConvenio.isSelected());
        e.setDescuentoConvenio(txtDescuento.getText());

        if (cmbConvenio.getSelectedIndex() == 0) {
            e.setTipoConvenio("Caja los andes --> 5%");
        } else {

            e.setTipoConvenio("Caja los héroes --> 7%");
        }
        txtRut.setText("");
        rdMasculino.setText("");
        txtNombre.setText("");
        cmbCursos.setSelectedIndex(0);
        txtMatricula.setText("");
        txtMensualidad.setText("");
        txtTotal.setText("");
        chkConvenio.setText("");
        txtDescuento.setText("");
        cmbConvenio.setSelectedIndex(0);
        pnlSec.setVisible(false);
    }//GEN-LAST:event_btnMatricularActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMatricular;
    private javax.swing.ButtonGroup btngrpSexo;
    private javax.swing.JCheckBox chkConvenio;
    private javax.swing.JComboBox<String> cmbConvenio;
    private javax.swing.JComboBox<String> cmbCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel pnlConvenio;
    private javax.swing.JPanel pnlPrimario;
    private javax.swing.JPanel pnlSec;
    private javax.swing.JRadioButton rdFemenino;
    private javax.swing.JRadioButton rdMasculino;
    private javax.swing.JTextField txtCuotas;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMensualidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalCuota;
    private javax.swing.JTextField txtTotalFinal;
    // End of variables declaration//GEN-END:variables

    private void llenarCmbCursos() {

        cmbCursos.addItem(cursoHSS.getNombre());
        cmbCursos.addItem(cursoJS.getNombre());
        cmbCursos.addItem(cursoTT.getNombre());

    }

    private void setDatos(Matricula estudiante) {

        pnlSec.setVisible(true);
        if (estudiante.getSexo().equalsIgnoreCase(rdMasculino.getText())) {
            rdMasculino.setSelected(true);
        } else {
            rdFemenino.setSelected(true);
        }
        txtNombre.setText(estudiante.getNombre());
        txtDireccion.setText(estudiante.getDireccion());

        if (estudiante.getCurso().equalsIgnoreCase("Hardstyle Shuffle")) {
            cmbCursos.setSelectedIndex(0);
        } else if (estudiante.getCurso().equalsIgnoreCase("Jumpstyle")) {
            cmbCursos.setSelectedIndex(1);
        } else {
            cmbCursos.setSelectedIndex(2);
        }
        txtMatricula.setText(estudiante.getValorMatricula());
        txtMensualidad.setText(estudiante.getMensualidad());
        txtTotal.setText(estudiante.getTotalMatricula());

        chkConvenio.setSelected(estudiante.isConvenio());
        if (estudiante.getDescuentoConvenio().equalsIgnoreCase("Caja los andes --> 5%")) {
            txtDescuento.setText("Caja los andes --> 5%");
        } else {
            txtDescuento.setText("Caja los héroes --> 7%");
        }
        txtTotalFinal.setText(estudiante.getTotalFinal());
        txtCuotas.setText(estudiante.getCuotas());
        txtTotalCuota.setText(estudiante.getTotalCuotas());
    }

}
