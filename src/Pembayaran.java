/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hb1 = new javax.swing.JTextField();
        hb2 = new javax.swing.JTextField();
        hb3 = new javax.swing.JTextField();
        hb4 = new javax.swing.JTextField();
        diskon = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 20, 90, 20);

        jLabel2.setText("Harga Barang 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 130, 20);

        jLabel3.setText("Harga  Barang 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 115, 20);

        jLabel4.setText("Harga Barang 3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 110, 20);

        jLabel5.setText("Harga Barang 4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(31, 250, 110, 20);

        jLabel6.setText("Diskon");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 320, 51, 20);

        hb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb1ActionPerformed(evt);
            }
        });
        getContentPane().add(hb1);
        hb1.setBounds(210, 70, 250, 26);
        getContentPane().add(hb2);
        hb2.setBounds(210, 130, 250, 26);
        getContentPane().add(hb3);
        hb3.setBounds(210, 190, 250, 26);
        getContentPane().add(hb4);
        hb4.setBounds(210, 250, 250, 26);
        getContentPane().add(diskon);
        diskon.setBounds(210, 320, 250, 26);

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 380, 79, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 380, 77, 29);

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 380, 77, 29);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 420, 460, 200);

        setBounds(0, 0, 504, 684);
    }// </editor-fold>//GEN-END:initComponents

    private void hb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
double HargaBarang1 = Double.parseDouble(hb1.getText());
double HargaBarang2 = Double.parseDouble(hb2.getText());
double HargaBarang3 = Double.parseDouble(hb3.getText());
double HargaBarang4 = Double.parseDouble(hb4.getText());
double Diskon = Double.parseDouble(diskon.getText());
double TotalHarga = HargaBarang1 + HargaBarang2 + HargaBarang3 + HargaBarang4;

Diskon = TotalHarga*(Diskon/100);      
        double TotalBayar = TotalHarga - Diskon;
               TA.setText("HargaBarang1 :"+HargaBarang1+"\n"+"HargaBarang2 : "+HargaBarang2+"\n"+"HargaBbarang3:"+HargaBarang3+"\n"+"HargaBarang4 : "+HargaBarang4+"\n"+"Diskon : "+Diskon+"\n"+"Total Harga : "+ TotalHarga+"\n"+"Total Bayar : "+ TotalBayar);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
TA.setText("");
hb1.setText("");
hb2.setText("");
hb3.setText("");
hb4.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA;
    private javax.swing.JTextField diskon;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JTextField hb4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}