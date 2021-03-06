package kantinsekolah;

public class FrmMain extends javax.swing.JFrame {
    String food = "";
    int harga = 0;
    
    int total = 0;

    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMinum = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMakan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblRincian = new javax.swing.JLabel();
        tbJumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblNama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        tblMinum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Es Teler", "5000"},
                {"Teh Hangat", "6000"},
                {"Jus Buah", "3000"},
                {"Kopi", "1500"},
                {"Susu Anget", "4000"},
                {"Marimas", "1000"}
            },
            new String [] {
                "Minuman", "Harga"
            }
        ));
        tblMinum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMinumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMinum);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 100, 240, 110);

        tblMakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sate Usus", "1500"},
                {"Nasi Goreng", "8000"},
                {"Tahu Telur", "6500"},
                {"Nasi Kuning", "9000"},
                {"Gado Gado", "5000"},
                {"Koloke Oke", "4000"}
            },
            new String [] {
                "Makanan", "Harga"
            }
        ));
        tblMakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMakanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblMakanMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tblMakan);
        if (tblMakan.getColumnModel().getColumnCount() > 0) {
            tblMakan.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 100, 240, 110);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kantin Sekolah");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 520, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 640, 90);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 350, 650, 60);

        lblRincian.setBackground(new java.awt.Color(102, 102, 255));
        lblRincian.setForeground(new java.awt.Color(255, 51, 51));
        lblRincian.setText("-");
        getContentPane().add(lblRincian);
        lblRincian.setBounds(290, 250, 250, 30);
        getContentPane().add(tbJumlah);
        tbJumlah.setBounds(100, 250, 160, 24);

        jButton1.setText("Input");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 280, 70, 30);

        lblNama.setText("Pilih Makanan / Minuman");
        getContentPane().add(lblNama);
        lblNama.setBounds(30, 230, 230, 16);

        jLabel3.setText("Jumlah");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 250, 60, 30);

        jLabel4.setBackground(new java.awt.Color(102, 102, 255));
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("_________________");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 270, 170, 30);

        lblTotal.setBackground(new java.awt.Color(102, 102, 255));
        lblTotal.setForeground(new java.awt.Color(255, 51, 51));
        lblTotal.setText("Rp. 0");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(480, 300, 80, 30);

        jLabel6.setBackground(new java.awt.Color(102, 102, 255));
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Rincian");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 220, 140, 30);

        jLabel7.setBackground(new java.awt.Color(102, 102, 255));
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Total");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 300, 80, 30);

        setBounds(0, 0, 552, 445);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void tblMakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMakanMouseClicked
        // TODO add your handling code here:
        int baris = tblMakan.getSelectedRow();
        if(baris != -1){
            harga = Integer.valueOf(tblMakan.getValueAt(baris,1).toString());
            lblNama.setText(tblMakan.getValueAt(baris,0).toString() + " " + "("+String.valueOf(harga)+")");
        }   
    }//GEN-LAST:event_tblMakanMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int val = Integer.valueOf(tbJumlah.getText());
        
        int tunggal = val*harga;
        food += lblNama.getText() + " ("+String.valueOf(val)+" - "+String.valueOf(tunggal)+")" + " | ";
        lblRincian.setText(food);
        
        int lokal = val*harga;
        System.out.println(lokal);
        lblTotal.setText(String.valueOf(lokal+total));
        total = lokal;
        System.out.println(total);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblMakanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMakanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMakanMouseEntered

    private void tblMinumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMinumMouseClicked
        // TODO add your handling code here:
        int baris = tblMinum.getSelectedRow();
        if(baris != -1){
            harga = Integer.valueOf(tblMinum.getValueAt(baris,1).toString());
            lblNama.setText(tblMinum.getValueAt(baris,0).toString() + " " + "("+String.valueOf(harga)+")");
        }   
    }//GEN-LAST:event_tblMinumMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblRincian;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField tbJumlah;
    private javax.swing.JTable tblMakan;
    private javax.swing.JTable tblMinum;
    // End of variables declaration//GEN-END:variables
}
