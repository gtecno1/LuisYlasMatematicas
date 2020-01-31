/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Seguridad.java
 *
 * Created on 03-dic-2017, 13:28:03
 */
package juegoluismat;

import Contector.Cbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author back
 */
public class Registro extends javax.swing.JFrame {
int Ac;
String glo;
Cbd cc= new Cbd();
Connection cn= cc.Conectar(); 
    /** Creates new form Seguridad */
    public Registro() {
        setUndecorated(true);
        initComponents();
         this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        bloqueo();
        borrar();
        
    }
   void desbloqueo(){
     txtcd.setEnabled(true);
     txtnom.setEnabled(true);
     txtap.setEnabled(true);
     txtusu.setEnabled(true);
     txtcontr.setEnabled(true);
    }
   void bloqueo(){
     txtcd.setEnabled(false);
     txtnom.setEnabled(false);
     txtap.setEnabled(false);
     txtusu.setEnabled(false);
     txtcontr.setEnabled(false);
    }
 void borrar(){
     txtcd.setText("");
     txtnom.setText("");
     txtap.setText("");
     txtusu.setText("");
     txtcontr.setText("");
    }
 void guardar(){
     String nomb,apelli,cedu,usua,contra;
   cedu=  txtcd.getText();  
  
   nomb=txtnom.getText();
 apelli= txtap.getText();
 usua= txtusu.getText();
 contra=txtcontr.getText();
  
        String SQL;
              
      
        PreparedStatement psd;
 if(cedu.isEmpty()||nomb.isEmpty()||apelli.isEmpty()||usua.isEmpty()||contra.isEmpty()){
     JOptionPane.showMessageDialog(this,"Verifique los Campos");
 } else{
      
        switch(Ac){
           
            case 1:

            try{

                SQL="INSERT INTO seguridad(cedula,nombre,apellido,Usuario,Contraseña)VALUES (?,?,?,?,?)";
                psd = cn.prepareStatement(SQL);
                psd.setString(1,cedu);
                psd.setString(2,nomb);
                psd.setString(3,apelli);
                 psd.setString(4,usua);
                psd.setString(5,contra);
               
    
                 int m= psd.executeUpdate();
             
                if((m>0)){
                   borrar();
                    bloqueo();
                    JOptionPane.showMessageDialog(null,"Guardo con exito");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"error");
            }
            

            break;
            case 2:
            
            try {

             
                SQL="UPDATE seguridad set cedula=?,nombre=?,apellido=?,Usuario=?,Contraseña=? WHERE cedula=? ";

                psd = cn.prepareStatement(SQL);
                 psd.setString(1,cedu);
                psd.setString(2,nomb);
                psd.setString(3,apelli);
                 psd.setString(4,usua);
                psd.setString(5,contra);
                  psd.setString(6,glo);
                int f=  psd.executeUpdate();
                
               
               
                 if((f>0)){
                   borrar();
                    bloqueo();
                    JOptionPane.showMessageDialog(null,"Guardo con exito");

                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"error");

            }

            break;

        }
        }
 }
 void editar(){
     Ac=2;
borrar();
desbloqueo();
   
  String cod = JOptionPane.showInputDialog("Introdusca CI:");
    try
    {
  String SQL1 = "SELECT * FROM seguridad WHERE cedula=" +cod;
   Statement  st = this.cn.createStatement();
      ResultSet rs = st.executeQuery(SQL1);
      rs.next();
              
      txtcd.setText(rs.getString("cedula"));
      glo=rs.getString("cedula");
     txtnom.setText(rs.getString("nombre"));
       txtap.setText(rs.getString("apellido"));
         txtusu.setText(rs.getString("Usuario"));
           txtcontr.setText(rs.getString("Contraseña"));
 
 
     
    }
    catch (SQLException ex) {}
 }
void eliminar(){
    
      Ac=2;
borrar();
desbloqueo();
   
  String cod = JOptionPane.showInputDialog("Introdusca CI:");
    try
    {
  String SQL1 = "SELECT * FROM seguridad WHERE cedula=" +cod;
   Statement  st = this.cn.createStatement();
      ResultSet rs = st.executeQuery(SQL1);
      rs.next();
              
      txtcd.setText(rs.getString("cedula"));
     txtnom.setText(rs.getString("nombre"));
       txtap.setText(rs.getString("apellido"));
         txtusu.setText(rs.getString("Usuario"));
           txtcontr.setText(rs.getString("Contraseña"));
 
  bloqueo();
      int resp = JOptionPane.showConfirmDialog(this, "Deseas Eliminarlo", "Eliminar Dato", 0);
      if (resp == 0) {
      
          PreparedStatement psd = null;
        String  SQL = " DELETE FROM seguridad WHERE cedula ='" + cod + "'";
          psd = this.cn.prepareStatement(SQL);
          psd.execute();
          psd.close();
          borrar();
         bloqueo();
          JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO");
        }
        
    }
    catch (SQLException ex) {}
    
 }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtap = new javax.swing.JTextField();
        txtcontr = new javax.swing.JTextField();
        txtcd = new javax.swing.JTextField();
        txtusu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-16777216,true));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(-16711681,true));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/Error.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 330, 50, 60);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel15.setText("Apellido");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(270, 80, 70, 20);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel14.setText("Nombre");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(80, 80, 70, 20);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel13.setText("Usuario");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(190, 140, 70, 20);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel12.setText("Contraseña");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(170, 190, 90, 20);

        jButton1.setBackground(new java.awt.Color(-16777216,true));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12));
        jButton1.setForeground(new java.awt.Color(-1,true));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/File_Edit.png"))); // NOI18N
        jButton1.setText("Edtiar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 270, 100, 60);

        jButton4.setBackground(new java.awt.Color(-16777216,true));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12));
        jButton4.setForeground(new java.awt.Color(-1,true));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/File_Delete.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(160, 330, 100, 60);

        jButton3.setBackground(new java.awt.Color(-16777216,true));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12));
        jButton3.setForeground(new java.awt.Color(-1,true));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/File_Add.png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(160, 260, 100, 60);

        jButton2.setBackground(new java.awt.Color(-16777216,true));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
        jButton2.setForeground(new java.awt.Color(-1,true));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/Add_Symbol.png"))); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 270, 100, 60);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel9.setForeground(new java.awt.Color(-1,true));
        jLabel9.setText("Cedula");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 30, 70, 20);

        txtnom.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnomMouseClicked(evt);
            }
        });
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomKeyPressed(evt);
            }
        });
        jPanel1.add(txtnom);
        txtnom.setBounds(20, 100, 187, 31);

        txtap.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapMouseClicked(evt);
            }
        });
        txtap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapActionPerformed(evt);
            }
        });
        txtap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapKeyPressed(evt);
            }
        });
        jPanel1.add(txtap);
        txtap.setBounds(220, 100, 187, 31);

        txtcontr.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtcontr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontrMouseClicked(evt);
            }
        });
        txtcontr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontrActionPerformed(evt);
            }
        });
        txtcontr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontrKeyPressed(evt);
            }
        });
        jPanel1.add(txtcontr);
        txtcontr.setBounds(120, 210, 187, 31);

        txtcd.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtcd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcdMouseClicked(evt);
            }
        });
        txtcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcdActionPerformed(evt);
            }
        });
        txtcd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcdKeyPressed(evt);
            }
        });
        jPanel1.add(txtcd);
        txtcd.setBounds(20, 50, 187, 31);

        txtusu.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuMouseClicked(evt);
            }
        });
        txtusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuActionPerformed(evt);
            }
        });
        txtusu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuKeyPressed(evt);
            }
        });
        jPanel1.add(txtusu);
        txtusu.setBounds(120, 160, 187, 31);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(-1,true));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registro");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(2, 1, 410, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pla2.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(4, 0, 410, 380);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel10.setText("Usuario");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 30, 70, 20);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel11.setText("Usuario");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 30, 70, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnomMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_txtnomMouseClicked

private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtnomActionPerformed

private void txtnomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_txtnomKeyPressed

private void txtapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_txtapMouseClicked

private void txtapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtapActionPerformed

private void txtapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapKeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_txtapKeyPressed

private void txtcontrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontrMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_txtcontrMouseClicked

private void txtcontrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontrActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtcontrActionPerformed

private void txtcontrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontrKeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_txtcontrKeyPressed

private void txtcdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcdMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_txtcdMouseClicked

private void txtcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcdActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtcdActionPerformed

private void txtcdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcdKeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_txtcdKeyPressed

private void txtusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_txtusuMouseClicked

private void txtusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtusuActionPerformed

private void txtusuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuKeyPressed
// TODO add your handling code here:
}//GEN-LAST:event_txtusuKeyPressed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
editar();// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
dispose();
}//GEN-LAST:event_jLabel1MouseClicked

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Ac=1;
    desbloqueo();
borrar();
// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
guardar();// TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
eliminar();// TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtap;
    private javax.swing.JTextField txtcd;
    private javax.swing.JTextField txtcontr;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
