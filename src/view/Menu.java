
package view;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        itemFuncionario = new javax.swing.JMenuItem();
        itemVestido = new javax.swing.JMenuItem();
        menuReservas = new javax.swing.JMenu();
        itemReservaTraje = new javax.swing.JMenuItem();
        itemLocacao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/depositphotos_26163413-stock-photo-postcard-with-elegant-flowers.jpg"))); // NOI18N

        jMenuBar2.setBackground(new java.awt.Color(255, 204, 204));

        menuCadastro.setText("Cadastros");
        menuCadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        menuCliente.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        itemFuncionario.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itemFuncionario.setText("Funcionário");
        itemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(itemFuncionario);

        itemVestido.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itemVestido.setText("Vestidos");
        itemVestido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVestidoActionPerformed(evt);
            }
        });
        menuCadastro.add(itemVestido);

        jMenuBar2.add(menuCadastro);

        menuReservas.setText("Reservas");
        menuReservas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        itemReservaTraje.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itemReservaTraje.setText("Reserva de Trajes");
        itemReservaTraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReservaTrajeActionPerformed(evt);
            }
        });
        menuReservas.add(itemReservaTraje);

        itemLocacao.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        itemLocacao.setText("Locação");
        itemLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLocacaoActionPerformed(evt);
            }
        });
        menuReservas.add(itemLocacao);

        jMenuBar2.add(menuReservas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        
        new dialogCliente(this, true).setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void itemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFuncionarioActionPerformed
        
        new dialogFuncionario(this, true).setVisible(true);
    }//GEN-LAST:event_itemFuncionarioActionPerformed

    private void itemVestidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVestidoActionPerformed
       
        new dialogVestidos(this, true).setVisible(true);        
    }//GEN-LAST:event_itemVestidoActionPerformed

    private void itemReservaTrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReservaTrajeActionPerformed
       
       new dialogReservaTraje(this, true).setVisible(true);  
    }//GEN-LAST:event_itemReservaTrajeActionPerformed

    private void itemLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLocacaoActionPerformed
        
       new dialogLocacao(this, true).setVisible(true);
    }//GEN-LAST:event_itemLocacaoActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemFuncionario;
    private javax.swing.JMenuItem itemLocacao;
    private javax.swing.JMenuItem itemReservaTraje;
    private javax.swing.JMenuItem itemVestido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenu menuReservas;
    // End of variables declaration//GEN-END:variables
}
