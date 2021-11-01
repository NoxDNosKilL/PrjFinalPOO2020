/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import BEAN.Alumno;
import BEAN.CabMatricula;
import BEAN.Ciclo;
import BEAN.Curso;
import BEAN.DetMatricula;
import Persistencia.DAO.CabMatriculaDAO;
import Persistencia.DAO.CicloDAO;
import Persistencia.DAO.CursoDAO;
import Persistencia.DAO.DetMatriculaDAO;
import Persistencia.Impl.CabMatriculaDAOImpl;
import Persistencia.Impl.CicloDAOImpl;
import Persistencia.Impl.CursoDAOImpl;
import Persistencia.Impl.DetMatriculaDAOImpl;
import java.awt.Button;
import java.util.ArrayList;

import java.util.List;
import java.util.Vector;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FrmMatricula extends javax.swing.JFrame {
    Alumno alumno;
    DefaultTableModel dtm;
    int idAlumno;
    List <Integer> idCiclos;//
    List <Integer> idCursos;//
    JButton  btn = new JButton ("Eliminar");
    
    public FrmMatricula() {
        initComponents();
        this.rellenarCursos();
        this.rellenarCiclos();
        
    }
    
    private void rellenarCursos(){
        try {
             CursoDAO cDAO = new CursoDAOImpl();

             //List<String> cursos = cDAO.cursos();
             List<Curso> cursos = cDAO.cursos2();
            idCursos = new ArrayList();
            System.out.println("###Cursos###");
             for (Curso curso : cursos) {
                 this.cmbCursos.addItem(curso.getNombre());
                 idCursos.add(curso.getIdCurso());
                 System.out.println(curso.getIdCurso());
             }
             
             

         } catch (Exception e) {
             System.out.println(e.getMessage());
        }
        finally{
            //idCursos.forEach(System.out::println);
        }
    }
    private void rellenarCiclos(){
        try {
             CicloDAO cDAO = new CicloDAOImpl();

             List<Ciclo> ciclos = cDAO.ciclos();
             
             idCiclos= new ArrayList();
             
             ciclos.forEach(p->{
                 this.cmbCiclo.addItem(p.getDescrip());
                 idCiclos.add(p.getIdCiclo());
             });
         } catch (Exception e) {
             System.out.println(e.getMessage());
        } finally{
            System.out.println("###Ciclos");
            idCiclos.forEach(System.out::println);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        BtnSelAlu = new javax.swing.JButton();
        cmbCursos = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCurso = new javax.swing.JTable();
        btnGrabar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIdMatricula = new javax.swing.JTextField();
        cmbCiclo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alumno");

        jLabel2.setText("Curso");

        jLabel3.setText("Ciclo");

        BtnSelAlu.setText("Sel Alumno");
        BtnSelAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelAluActionPerformed(evt);
            }
        });

        cmbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursosActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Curso", "Nombre", "Eliminar"
            }
        ));
        jScrollPane1.setViewportView(tblCurso);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jLabel4.setText("IdMatricula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btnAgregar))
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnGrabar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(BtnSelAlu))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSelAlu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(btnGrabar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCursosActionPerformed

    private void BtnSelAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelAluActionPerformed
        // TODO add your handling code here:
        SelAlumno dialog = new SelAlumno(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        alumno = dialog.getAlumno(); //Extrayendo Alumno del diálogo     
        idAlumno= alumno.getIdAlumno();//Almacenamos el id para el insert
        this.txtNombre.setText(alumno.getNombre());//Escribir en el textfield
    }//GEN-LAST:event_BtnSelAluActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
      /*  
        int i =0;
        Vector v = new Vector();
        //v.addElement(i= this.cmbCursos.getSelectedIndex()+1001);//OBSOLETO
        v.addElement(idCursos.get(this.cmbCursos.getSelectedIndex()));//MEJORADO
        v.addElement(this.cmbCursos.getSelectedItem().toString());
        dtm=(DefaultTableModel) this.tblCurso.getModel();
        dtm.addRow(v);
        */
        JTable tabla = new JTable();
        tabla.setDefaultRenderer(Object.class, new Render());
        int i =0;
        Vector v = new Vector();
        v.addElement(idCursos.get(this.cmbCursos.getSelectedIndex()));
        v.addElement(this.cmbCursos.getSelectedItem().toString());
        v.addElement(this.btn);
        dtm=(DefaultTableModel) this.tblCurso.getModel();
        dtm.addRow(v);
        
        tabla.setModel(dtm);
        tabla.setVisible(true);
       
       
      
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void grabarCabMatricula(){
        try {
             CabMatriculaDAO cmDAO = new CabMatriculaDAOImpl();
            CabMatricula cm = new CabMatricula();
            cm.setIdMatricula(Integer.valueOf(this.txtIdMatricula.getText()));
            cm.setIdAlumno(this.getIdAlum());
            //cm.setIdCiclo(this.cmbCiclo.getSelectedIndex()+1001); //OBSOLETO 
            cm.setIdCiclo(idCiclos.get(this.cmbCiclo.getSelectedIndex())); //MEJORADO
             if (cmDAO.insertar(cm)) {
                JOptionPane.showMessageDialog(rootPane, "Exito de registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
               JOptionPane.showMessageDialog(rootPane, "Error de registro", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
             
        } catch (Exception e) {
            System.err.println("Error de grabar"+e.getMessage());
        }
    }
    
    private void grabarDetMatricula(){
        try {
            DetMatriculaDAO dmDAO = new DetMatriculaDAOImpl();
            DetMatricula dm = new DetMatricula();
            dm.setIdMatricula(Integer.valueOf(this.txtIdMatricula.getText()));
            
            dtm = (DefaultTableModel) this.tblCurso.getModel();
            for (int i = 0; i < dtm.getRowCount(); i++){
                dm.setIdCurso(Integer.valueOf(dtm.getValueAt(i, 0).toString()));
                System.out.println(dm.toString());
                
                if(dmDAO.insertar(dm)){
                    System.out.println("Exito de registro detMatricula [" +i+"]");
                }else{
                    System.out.println("Error de registro");
                }
            }            

             
        } catch (Exception e) {
            System.err.println("Error de grabar"+e.getMessage());
        }
    }
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
         this.grabarCabMatricula();
         this.grabarDetMatricula();
        this.eliminar();
        this.txtIdMatricula.setText("");
        this.txtNombre.setText("");
    }//GEN-LAST:event_btnGrabarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMatricula().setVisible(true);
            }
        });
    }
    
    public void eliminar(){
        dtm = (DefaultTableModel) this.tblCurso.getModel();
        /*
        int a = dtm.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
         dtm.removeRow(dtm.getRowCount()-1);
        }
        */
        dtm.setRowCount(0);
 
    }
    
    public int getIdAlum(){
        return this.idAlumno;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSelAlu;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox<String> cmbCiclo;
    private javax.swing.JComboBox<String> cmbCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCurso;
    private javax.swing.JTextField txtIdMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
