
package lab8p2_cesarnunez_12141019;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainFrame extends javax.swing.JFrame implements Serializable{

    private Color color = Color.red;
    private String path = "./listaAutos.auto";
    
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        tiposCarroCB();
        jb_color.setBackground(color);
        AdministrarAuto aa = new AdministrarAuto(path);
        aa.cargarArchivo();
        aniadirCarroAlCB();
    }
    
    private void tiposCarroCB(){
        DefaultComboBoxModel m = (DefaultComboBoxModel) jcb_tipoCarro.getModel();
        m.addElement("McQueen");
        m.addElement("Convertible");
        m.addElement("Nascar");
        jcb_tipoCarro.setModel(m);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_comenzar = new javax.swing.JButton();
        jb_pausar = new javax.swing.JButton();
        jl_largo = new javax.swing.JLabel();
        jl_pista = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_carrera = new javax.swing.JTable();
        jcb_carro = new javax.swing.JComboBox<>();
        jb_agregar = new javax.swing.JButton();
        jl_numeroIdentificador = new javax.swing.JLabel();
        jl_numeroIdentificador1 = new javax.swing.JLabel();
        jtf_numIdentificador = new javax.swing.JTextField();
        jtf_nombreCorredor = new javax.swing.JTextField();
        jcb_tipoCarro = new javax.swing.JComboBox<>();
        jb_color = new javax.swing.JButton();
        jb_guardarCarro = new javax.swing.JButton();
        jl_numeroIdentificador2 = new javax.swing.JLabel();
        jtf_largo = new javax.swing.JTextField();
        jl_numeroIdentificador3 = new javax.swing.JLabel();
        jb_usarPista = new javax.swing.JButton();
        jb_reiniciar = new javax.swing.JButton();
        jtf_nombrePista = new javax.swing.JTextField();
        jl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_comenzar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_comenzar.setText("Comenzar");
        jb_comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_comenzarMouseClicked(evt);
            }
        });
        getContentPane().add(jb_comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 40));

        jb_pausar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_pausar.setText("Pausar");
        getContentPane().add(jb_pausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 170, 40));

        jl_largo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_largo.setText("Largo: ______");
        getContentPane().add(jl_largo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jl_pista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_pista.setText("Pista: ______");
        getContentPane().add(jl_pista, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 880, 90));

        jt_carrera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jt_carrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(jt_carrera);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 880, 240));

        jcb_carro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jcb_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 230, 40));

        jb_agregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_agregar.setText("Agregar");
        jb_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMouseClicked(evt);
            }
        });
        getContentPane().add(jb_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 170, 40));

        jl_numeroIdentificador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_numeroIdentificador.setText("Nombre Corredor");
        getContentPane().add(jl_numeroIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jl_numeroIdentificador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_numeroIdentificador1.setText("Número Identificador");
        getContentPane().add(jl_numeroIdentificador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jtf_numIdentificador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jtf_numIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 230, 40));

        jtf_nombreCorredor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jtf_nombreCorredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 260, 40));

        jcb_tipoCarro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jcb_tipoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 180, 40));

        jb_color.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_color.setText("Color");
        jb_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_colorMouseClicked(evt);
            }
        });
        getContentPane().add(jb_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 630, 220, 40));

        jb_guardarCarro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_guardarCarro.setText("Guardar");
        jb_guardarCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarCarroMouseClicked(evt);
            }
        });
        getContentPane().add(jb_guardarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, 220, 40));

        jl_numeroIdentificador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_numeroIdentificador2.setText("Nombre Pista");
        getContentPane().add(jl_numeroIdentificador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        jtf_largo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jtf_largo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 230, 40));

        jl_numeroIdentificador3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_numeroIdentificador3.setText("Largo");
        getContentPane().add(jl_numeroIdentificador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));

        jb_usarPista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_usarPista.setText("Usar Pista");
        jb_usarPista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_usarPistaMouseClicked(evt);
            }
        });
        getContentPane().add(jb_usarPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 220, 40));

        jb_reiniciar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_reiniciar.setText("Reiniciar");
        getContentPane().add(jb_reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, 220, 40));

        jtf_nombrePista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jtf_nombrePista, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 230, 40));

        jl_background.setBackground(new java.awt.Color(204, 204, 204));
        jl_background.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_background.setOpaque(true);
        getContentPane().add(jl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_usarPistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_usarPistaMouseClicked
        int largo = 0;
        try{
            if(jtf_largo.getText().equals("") == false && jtf_nombrePista.getText().equals("") == false){                
                largo = Integer.parseInt(jtf_largo.getText());
                jl_largo.setText("Largo: " + largo);
                jl_pista.setText("Pista: " + jtf_nombrePista.getText());
                JOptionPane.showMessageDialog(null, "Se ha creado la pista exitósamente!");
            }else{
                JOptionPane.showMessageDialog(null, "Debe completar los campos!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, ingrese un largo válido!");
        }
        jtf_largo.setText("");
        jtf_nombrePista.setText("");
    }//GEN-LAST:event_jb_usarPistaMouseClicked

    private void jb_guardarCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarCarroMouseClicked
        try{
            if(jtf_numIdentificador.getText().equals("") == false && jtf_nombreCorredor.getText().equals("") == false && numeroRepetido(Integer.parseInt(jtf_numIdentificador.getText())) == false){
                int n = Integer.parseInt(jtf_numIdentificador.getText());
                Auto a = null;
                if( ((String) jcb_tipoCarro.getSelectedItem()).equals("McQueen") ){
                    a = new McQueen(n, jtf_nombreCorredor.getText(), color);                                       
                }else if( ((String) jcb_tipoCarro.getSelectedItem()).equals("Convertible") ){
                    a = new Convertible(n, jtf_nombreCorredor.getText(), color);   
                }else if( ((String) jcb_tipoCarro.getSelectedItem()).equals("Nascar") ){
                    a = new Nascar(n, jtf_nombreCorredor.getText(), color);   
                }               
                AdministrarAuto aa = new AdministrarAuto(path);
                aa.cargarArchivo();
                aa.setAuto(a);
                aa.escribirArchivo();
                JOptionPane.showMessageDialog(null, "Se ha creado el auto exitósamente!");
            }else if(jtf_numIdentificador.getText().equals("") == false && jtf_nombreCorredor.getText().equals("") == false && numeroRepetido(Integer.parseInt(jtf_numIdentificador.getText()))){
                JOptionPane.showMessageDialog(null, "El número identificador ya está asignado a otro carro.");
            }else{
                JOptionPane.showMessageDialog(null, "Debe completar los campos!");
            }            
            // se agregó con éxito
            aniadirCarroAlCB();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, ingrese un número identificador válido!");
        }       
        jtf_numIdentificador.setText("");
        jtf_nombreCorredor.setText("");
        jcb_tipoCarro.setSelectedIndex(0);
    }//GEN-LAST:event_jb_guardarCarroMouseClicked

    private void jb_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_colorMouseClicked
        Color c = JColorChooser.showDialog(this, "Ingrese un color:", color);
        color = c;
        jb_color.setBackground(c);
    }//GEN-LAST:event_jb_colorMouseClicked

    private void jb_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMouseClicked
        if(jcb_carro.getSelectedIndex() >= 0){
            Auto a = (Auto) jcb_carro.getSelectedItem();
            if(yaEstaAgregado(a) == false){
                DefaultTableModel m = (DefaultTableModel) jt_carrera.getModel();
                Object[] newRow = {
                    a.getNumIdentificador(), a.getNombreCorredor(), a.getDistanciaRecorrida()
                };
                m.addRow(newRow);
                jt_carrera.setModel(m);
            }else{
                JOptionPane.showMessageDialog(null, "El auto ya está agregado en la carrera.");
            }
        }                
    }//GEN-LAST:event_jb_agregarMouseClicked

    private boolean yaEstaAgregado(Auto a){
        DefaultTableModel m = (DefaultTableModel) jt_carrera.getModel();
        for (int i = 0; i < m.getRowCount(); i++) {
            int x = (Integer) m.getValueAt(i, 0);
            if(x == a.getNumIdentificador()){
                return true;
            }
        }
        return false;
    }
    
    private void jb_comenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_comenzarMouseClicked
        
    }//GEN-LAST:event_jb_comenzarMouseClicked

    private boolean numeroRepetido(int n){
        AdministrarAuto aa = new AdministrarAuto(path);
        aa.cargarArchivo();
        ArrayList<Auto> autos = aa.getAutos();
        boolean yaEsta = false;
        for (Auto auto : autos) {
            if(auto.getNumIdentificador() == n){
                yaEsta = true;
                break;
            }
        }
        return yaEsta;
    }
    
    private void aniadirCarroAlCB(){
        AdministrarAuto aa = new AdministrarAuto(path);
        aa.cargarArchivo();
        ArrayList<Auto> autos = aa.getAutos();
        DefaultComboBoxModel n = new DefaultComboBoxModel();
        for (Auto auto : autos) {
            n.addElement(auto);
        }
        jcb_carro.setModel(n);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_color;
    private javax.swing.JButton jb_comenzar;
    private javax.swing.JButton jb_guardarCarro;
    private javax.swing.JButton jb_pausar;
    private javax.swing.JButton jb_reiniciar;
    private javax.swing.JButton jb_usarPista;
    private javax.swing.JComboBox<String> jcb_carro;
    private javax.swing.JComboBox<String> jcb_tipoCarro;
    private javax.swing.JLabel jl_background;
    private javax.swing.JLabel jl_largo;
    private javax.swing.JLabel jl_numeroIdentificador;
    private javax.swing.JLabel jl_numeroIdentificador1;
    private javax.swing.JLabel jl_numeroIdentificador2;
    private javax.swing.JLabel jl_numeroIdentificador3;
    private javax.swing.JLabel jl_pista;
    private javax.swing.JTable jt_carrera;
    private javax.swing.JTextField jtf_largo;
    private javax.swing.JTextField jtf_nombreCorredor;
    private javax.swing.JTextField jtf_nombrePista;
    private javax.swing.JTextField jtf_numIdentificador;
    // End of variables declaration//GEN-END:variables
}
