  
package my.contacteditor;

   
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.*;

 public class Kristysiomai extends javax.swing.JFrame {
     
     
     public Kristysiomai() {
         initComponents();
         
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
         jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
         
     }
     
     public void addtable(int Id, String ItemName, int Quantity, Double Price){
        DefaultTableModel DefaultTable = (DefaultTableModel) jTable1.getModel();
        DecimalFormat decimalF = new DecimalFormat("00.00");
        double sumPrice = Price * Double.valueOf(Quantity);
        String TotalPrice = decimalF.format(sumPrice);
         
         
         for (int row = 0; row < jTable1.getRowCount(); row++) {
             if (ItemName == jTable1.getValueAt (row, 1)) {
                 DefaultTable.removeRow(jTable1.convertRowIndexToModel(row));
                 
             }
             else {
         }
     }
         
         Vector v = new Vector();
         v.add(Id);
         v.add(ItemName);
         v.add(Quantity);
         v.add(TotalPrice);
         
         DefaultTable.addRow(v);
         
          
         
         
         
         
     }
     public void cal(){
         int numOfRow = jTable1.getRowCount();
         double totalvalue = 0.0;
         
         for (int i = 0; i < numOfRow; i++){
             double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
             totalvalue += value;
         }
         DecimalFormat decimalF = new DecimalFormat("00.00");
         total.setText(decimalF.format(totalvalue));
         
     }
         
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Item3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Item5 = new javax.swing.JLabel();
        Item1 = new javax.swing.JLabel();
        Item2 = new javax.swing.JLabel();
        Item7 = new javax.swing.JLabel();
        Item8 = new javax.swing.JLabel();
        Item6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Item4 = new javax.swing.JLabel();
        Payment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Change = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Receipt = new javax.swing.JTextArea();
        total = new javax.swing.JLabel();
        Item9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cream and Brown Retro Streetwear Logo(1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 40, 95, 91);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cream and Brown Retro Streetwear Logo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 40, 96, 91);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("Beef with Rice 40Php");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 150, 162, 22);

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("Change");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1270, 630, 80, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2.setText("Japanese with Rice 45Php");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 150, 195, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cream and Brown Retro Streetwear Logo(1).png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 40, 95, 91);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton3.setText("Pork with Rice 40Php");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(380, 150, 163, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2024-06-03 192329.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(560, 40, 101, 91);

        jButton7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton7.setText("Pork Siomai 25Php");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(470, 280, 146, 22);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2024-06-03 201454.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(260, 310, 66, 113);

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton6.setText("Japanese Siomai 30Php");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(280, 280, 174, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2024-06-03 195805.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(121, 191, 144, 63);

        Item3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item3.setForeground(new java.awt.Color(255, 255, 0));
        Item3.setText("00");
        jPanel1.add(Item3);
        Item3.setBounds(450, 130, 20, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2024-06-03 195805.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(291, 191, 144, 63);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price"
            }
        ));
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1090, 40, 440, 438);

        jButton10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton10.setText("New Order");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(1114, 507, 193, 28);

        jButton9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton9.setText("Chili Sauce 5Php");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(370, 440, 140, 22);

        jButton12.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton12.setText("Print Receipt");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(700, 500, 350, 40);

        jButton11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton11.setText("Remove Selection");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(1346, 507, 170, 28);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton5.setText("Beef Siomai 25Php");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(120, 280, 145, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("TOTAL:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1120, 480, 70, 17);

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton4.setText("Gulaman 10Php");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(550, 150, 126, 22);

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton8.setText("Toyo Sauce 5Php");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(220, 440, 140, 22);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2024-06-03 195805.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(466, 191, 144, 63);

        Item5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item5.setForeground(new java.awt.Color(255, 255, 0));
        Item5.setText("00");
        jPanel1.add(Item5);
        Item5.setBounds(180, 256, 43, 20);

        Item1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item1.setForeground(new java.awt.Color(255, 255, 0));
        Item1.setText("00");
        jPanel1.add(Item1);
        Item1.setBounds(80, 130, 43, 16);

        Item2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item2.setForeground(new java.awt.Color(255, 255, 0));
        Item2.setText("00");
        jPanel1.add(Item2);
        Item2.setBounds(270, 130, 20, 20);

        Item7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item7.setForeground(new java.awt.Color(255, 255, 0));
        Item7.setText("00");
        jPanel1.add(Item7);
        Item7.setBounds(530, 255, 20, 20);

        Item8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item8.setForeground(new java.awt.Color(255, 255, 0));
        Item8.setText("00");
        jPanel1.add(Item8);
        Item8.setBounds(280, 420, 20, 20);

        Item6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item6.setForeground(new java.awt.Color(255, 255, 0));
        Item6.setText("00");
        jPanel1.add(Item6);
        Item6.setBounds(350, 250, 20, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2024-06-03 201417.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(410, 310, 69, 113);

        Item4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item4.setForeground(new java.awt.Color(255, 255, 0));
        Item4.setText("00");
        jPanel1.add(Item4);
        Item4.setBounds(600, 130, 20, 20);

        Payment.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        jPanel1.add(Payment);
        Payment.setBounds(1180, 570, 300, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Payment:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1290, 550, 90, 17);

        Change.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Change.setForeground(new java.awt.Color(255, 255, 0));
        Change.setText("00");
        jPanel1.add(Change);
        Change.setBounds(1330, 630, 100, 20);

        jButton13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton13.setText("Release Payment");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(1180, 660, 300, 50);

        Receipt.setColumns(20);
        Receipt.setRows(5);
        jScrollPane2.setViewportView(Receipt);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(680, 40, 390, 440);

        total.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 0));
        total.setText("00");
        jPanel1.add(total);
        total.setBounds(1460, 480, 70, 16);

        Item9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item9.setForeground(new java.awt.Color(255, 255, 0));
        Item9.setText("00");
        jPanel1.add(Item9);
        Item9.setBounds(430, 420, 20, 16);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SIOMAI(1)_1.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 1570, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int i = Integer.valueOf(Item1.getText());
        ++i;
        Item1.setText(String.valueOf(i));
        addtable( 1, "Beef wth Rice", i, 40.00);
        
        
        
        cal();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int i = Integer.valueOf(Item3.getText());
        ++i;
        Item3.setText(String.valueOf(i));
        addtable( 3, "Pork with Rice", i, 40.00);
        
        
        cal();   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       int i = Integer.valueOf(Item7.getText());
        ++i;
        Item7.setText(String.valueOf(i));
        addtable( 7, "Pork Siomai", i, 25.00);
        
        
        cal();   
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int i = Integer.valueOf(Item4.getText());
        ++i;
        Item4.setText(String.valueOf(i));
        addtable( 4, "Gulaman", i, 10.00);
        
        
        cal();   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DefaultTableModel DefaultTable = (DefaultTableModel) jTable1.getModel();
        DefaultTable.setRowCount(0);
       Payment.setText("");
        total.setText("00");
       Change.setText("00");
        Receipt.setText("");
        Item1.setText("0");
        Item2.setText("0");
        Item3.setText("0");
        Item4.setText("0");
        Item5.setText("0");
        Item6.setText("0");
        Item7.setText("0");
        Item8.setText("0");
        Item9.setText("0");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       int i = Integer.valueOf(Item5.getText());
        ++i;
        Item5.setText(String.valueOf(i));
        addtable( 5, "Beef Siomai", i, 25.00);
        
        
        cal();   
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = Integer.valueOf(Item2.getText());
        ++i;
        Item2.setText(String.valueOf(i));
        addtable( 2, "Japanese with Rice", i, 45.00);
        
        
        cal();   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int i = Integer.valueOf(Item6.getText());
        ++i;
        Item6.setText(String.valueOf(i));
        addtable( 6, "Japanese Siomai", i, 30.00);
        
        
        cal();   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     int i = Integer.valueOf(Item8.getText());
        ++i;
        Item8.setText(String.valueOf(i));
        addtable( 8, "Toyo Sauce", i, 5.00);
        
        
        cal();   
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int i = Integer.valueOf(Item9.getText());
        ++i;
        Item9.setText(String.valueOf(i));
        addtable( 9, "Chili Sauce", i, 5.00);
        
        
        cal();   
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
            try {
            Receipt.setText("\tKristysiomai\n");
            Receipt.setText(Receipt.getText()+"\t12-B Alcalde Jose\n");
            Receipt.setText(Receipt.getText()+"\tKapasigan, Pasig City\n");
            Receipt.setText(Receipt.getText()+"\tMetro Manila\n");
            Receipt.setText(Receipt.getText()+"-------------------------------------------------------------------------------------------------\n");
            Receipt.setText(Receipt.getText()+"\tItem \tQuantity\tPrice"+"\n");
            Receipt.setText(Receipt.getText()+"-------------------------------------------------------------------------------------------------\n");

            DefaultTableModel DefaultTable = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < jTable1.getRowCount(); i++){
                String Name = DefaultTable.getValueAt(i , 1).toString();
                String Quantity = DefaultTable.getValueAt(i , 2).toString();
                String Price = DefaultTable.getValueAt(i , 3).toString();
                Receipt.setText(Receipt.getText()+"\t"+Name+"\t"+Quantity+"\t"+Price+"\n");
            }
                Receipt.setText(Receipt.getText()+"-------------------------------------------------------------------------------------------------\n");
                Receipt.setText(Receipt.getText()+"\tTotal Amount : " + total.getText()+ "\n" );
                Receipt.setText(Receipt.getText()+"\tPayment Recieved : " + Payment.getText()+ "\n" );
                Receipt.setText(Receipt.getText()+"\tRemaining Balance : " + Change.getText()+ "\n" );
                Receipt.setText(Receipt.getText()+"-------------------------------------------------------------------------------------------------\n");


        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      double tots = Double.valueOf(total.getText());
        double pay = Double.valueOf(Payment.getText());
        double chan = pay - tots;
        DecimalFormat decimalF = new DecimalFormat("00.00");
        Change.setText(String.valueOf(decimalF.format(chan)));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     DefaultTableModel DefaultTable = (DefaultTableModel) jTable1.getModel();
        String clear = DefaultTable.getValueAt(jTable1.getSelectedRow(), 0).toString();

        int row = jTable1.getSelectedRow();
        DefaultTable.removeRow(row);
        
        System.out.println(clear);
        switch(clear){
            case "1" -> Item1.setText("0");
            case "2" -> Item2.setText("0");
            case "3" -> Item3.setText("0");
            case "4" -> Item4.setText("0");
            case "5" -> Item5.setText("0");
            case "6" -> Item6.setText("0");
            case "7" -> Item7.setText("0");
            case "8" -> Item8.setText("0");
            case "9" -> Item9.setText("0");
            default -> System.out.println("Over");
             
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /*
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       /*
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kristysiomai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Change;
    private javax.swing.JLabel Item1;
    private javax.swing.JLabel Item2;
    private javax.swing.JLabel Item3;
    private javax.swing.JLabel Item4;
    private javax.swing.JLabel Item5;
    private javax.swing.JLabel Item6;
    private javax.swing.JLabel Item7;
    private javax.swing.JLabel Item8;
    private javax.swing.JLabel Item9;
    private javax.swing.JTextField Payment;
    private javax.swing.JTextArea Receipt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
