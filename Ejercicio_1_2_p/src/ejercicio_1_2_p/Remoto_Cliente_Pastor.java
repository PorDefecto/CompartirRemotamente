/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_2_p;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import Clases.JTreeFile;
/////
import transferencia.transferencia;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
/**
 *
 * @author PorDefecto
 */
public class Remoto_Cliente_Pastor extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio_2_remoto_pastor
     */
    public Remoto_Cliente_Pastor() {
        initComponents();
         txtnombre.setEditable(false);
           JTreeFile jTreeFiles = new JTreeFile();
        jTreeFiles.setJTree(jTree1);
         jTreeFiles.init();
         
         btnenviar.setVisible(false);
         txtnombre.setVisible(false);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnconnect = new javax.swing.JButton();
        btnenviar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtIp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstarchivos = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        lblenviar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnconnect.setText("Connect");
        btnconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconnectActionPerformed(evt);
            }
        });
        getContentPane().add(btnconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        btnenviar.setText("Enviar Archivo");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 179, -1));
        getContentPane().add(txtIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 127, -1));

        jLabel2.setText("IP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 32, -1));

        slider.setMajorTickSpacing(1);
        slider.setMaximum(10);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        getContentPane().add(slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));

        jPanel1.setBackground(new java.awt.Color(88, 172, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/teamwork (1).png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/transfer (1).png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(8, 95, 99));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(8, 95, 99));
        jLabel4.setText("Servicio Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        lstarchivos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstarchivos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 250, 190));

        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 290, 200));

        lblenviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next (1).png"))); // NOI18N
        lblenviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblenviarMouseClicked(evt);
            }
        });
        getContentPane().add(lblenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private Socket socket;
    private ObjectOutputStream out;
    String ruta="";
    String rutapath="";
    private void btnconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconnectActionPerformed
        
        try {
            String ippc=InetAddress.getLocalHost().getHostAddress();
        String nombrepc=InetAddress.getLocalHost().getHostName();
            socket = new Socket(txtIp.getText().trim(), 9999);
            out = new ObjectOutputStream(socket.getOutputStream());
            transferencia objtransferencia = new transferencia();
            objtransferencia.setNombre(nombrepc);
            objtransferencia.setIp(ippc);
            out.writeObject(objtransferencia);
            out.flush();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnconnectActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed

        try {
            JFileChooser ch = new JFileChooser();
            int choosertrue = ch.showOpenDialog(this);
            if (choosertrue == JFileChooser.APPROVE_OPTION) {
                File fichero = ch.getSelectedFile();
                txtnombre.setText(fichero.getName());
                FileInputStream entrada = new FileInputStream(fichero);
                System.out.println(slider.getValue()*1000);
                System.out.println(fichero.length()/1000);
                System.out.println(fichero.getPath());
                if ((slider.getValue()*1000>fichero.length()/1000)) {
                    byte contenedor[] = new byte[entrada.available()];
                    entrada.read(contenedor);
                    transferencia objtransferencia = new transferencia();
                    objtransferencia.setRuta(fichero.getPath());
                    objtransferencia.setPesofichero(String.valueOf(fichero.length()/1000));
                    objtransferencia.setNombrefichero(fichero.getName());
                    objtransferencia.setArchivo(contenedor);
                    out.writeObject(objtransferencia);
                    out.flush();

                }

                //
                // bytes Transferred / fileSize * 100

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnenviarActionPerformed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        try {
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode)jTree1.getSelectionPath().getLastPathComponent();
            //System.out.println(nodo.getParent()+nodo.getPath().toString());
            
            if(nodo == null){
                return;
            }
            if(nodo.getLevel() == 0){
                System.out.println("Nodo Raiz");
            }else{
                lstarchivos.clearSelection();

            }
            for(int i=0;i < nodo.getPath().length-1;i++){
                ruta=String.valueOf(nodo.getPath()[i+1]);
                System.out.println(ruta);
                rutapath=String.valueOf(nodo.getPath()[i+1]);
            }
            //  System.out.println(ruta);
//            File dir = new File(ruta);
//            //  System.out.println(nodo.getPath()[i+1]);
//            String[] ficheros = dir.list();
//
//            for (int x=0;x<ficheros.length;x++){
//                modelo.addElement(ficheros[x]);
//                jList2.setModel(modelo);
//            }
            //}
        } catch (Exception e) {
            System.out.println("Error");
            return;
        }
    }//GEN-LAST:event_jTree1ValueChanged

    private void lblenviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblenviarMouseClicked
      try {
            
           
          
                File fichero = new File(rutapath);
                txtnombre.setText(fichero.getName());
                FileInputStream entrada = new FileInputStream(fichero);
                System.out.println(slider.getValue()*1000);
                System.out.println(fichero.length()/1000);
                System.out.println(fichero.getPath());
                if ((slider.getValue()*1000>fichero.length()/1000)) {
                    byte contenedor[] = new byte[entrada.available()];
                    entrada.read(contenedor);
                    transferencia objtransferencia = new transferencia();
                    objtransferencia.setRuta(fichero.getPath());
                    objtransferencia.setPesofichero(String.valueOf(fichero.length()/1000));
                    objtransferencia.setNombrefichero(fichero.getName());
                    objtransferencia.setArchivo(contenedor);
                    out.writeObject(objtransferencia);
                    out.flush();
                //
                // bytes Transferred / fileSize * 100
            }
                DefaultListModel modelo = new DefaultListModel();
         lstarchivos.setModel(modelo);
         modelo.addElement(fichero.getName()+" "+(fichero.length()/1000)+" "+txtIp.getText());
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblenviarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Remoto_Cliente_Pastor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remoto_Cliente_Pastor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remoto_Cliente_Pastor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remoto_Cliente_Pastor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remoto_Cliente_Pastor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconnect;
    private javax.swing.JButton btnenviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblenviar;
    private javax.swing.JList<String> lstarchivos;
    private javax.swing.JSlider slider;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
