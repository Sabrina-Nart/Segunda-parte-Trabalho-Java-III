
package view;

import abstratas.dao;
import controller.daoCliente;
import controller.daoReservaTraje;
import controller.daoVestidos;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ReservaTraje;
import model.Vestidos;

public class dialogReservaTraje extends javax.swing.JDialog {

    private daoReservaTraje dao = new daoReservaTraje();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    
//////////////////////////////
    
    //Limpa componentes
    private void limpaComponentes(){
        
        textCodigo.setText("");
        comboClientes.setSelectedIndex(0);
        comboVestido.setSelectedIndex(0);
        textData.setText(LocalDate.now().format(formato));
        
        textData.requestFocus();
    }
    
//////////////////////////////
    
    //Popular componentes
    private void populaComponentes(ReservaTraje reservaTraje){ 
        
        textCodigo.setText(reservaTraje.getId() + "");
        comboClientes.setSelectedItem(reservaTraje.getCliente());
        comboVestido.setSelectedItem(reservaTraje.getVestidos());
        textData.setText(reservaTraje.getDataLocacao().format(formato));
        
        textData.requestFocus();        
    }    
  
/////
    
    //Criar objeto a partir dos componentes
    private ReservaTraje getObject(){
        
        return new ReservaTraje (
                            textCodigo.getText().isEmpty() ? 0 : Integer.parseInt(textCodigo.getText()),
                            (Cliente)comboClientes.getSelectedItem(),
                            (Vestidos)comboVestido.getSelectedItem(),
                            LocalDate.parse(textData.getText(), formato));
    }    
    
////////////////////////////// 
    
    //Atualizar table(3)
    
    private void atualizaTable(){
        
        tableDados.setModel(new MyTableModel(ReservaTraje.class, dao.read(), tableDados));
        System.out.println(dao.read());
    }
    
    private void atualizaTable(Cliente cliente){
        
        tableDados.setModel(new MyTableModel(Cliente.class, dao.read(cliente), tableDados));
    }   
  
    private void atualizaTable(Vestidos vestidos){
        
        tableDados.setModel(new MyTableModel(ReservaTraje.class, dao.read(vestidos), tableDados));
    }   

 //////////////////////////////
    
    //Carregar combos
    private void loadComboCliente(){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(new daoCliente().read().toArray());
        comboClientes.setModel(cbm);
    }
    
    private void loadComboVestidos(){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(new daoVestidos().read().toArray());
        comboVestido.setModel(cbm);
    }
     
//////////////////////////////     
      
    public dialogReservaTraje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        textCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        comboVestido = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        buttonFiltroCliente = new javax.swing.JButton();
        buttonFiltroVestido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonNovo = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        textData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserva de Traje");
        setBackground(new java.awt.Color(242, 219, 238));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(242, 219, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102), 2), "Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        textCodigo.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cliente:");

        comboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboVestido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Vestido:");

        buttonFiltroCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltroCliente.setText("Filtrar");
        buttonFiltroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltroClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltroClienteMouseExited(evt);
            }
        });
        buttonFiltroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltroClienteActionPerformed(evt);
            }
        });

        buttonFiltroVestido.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltroVestido.setText("Filtrar");
        buttonFiltroVestido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltroVestidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltroVestidoMouseExited(evt);
            }
        });
        buttonFiltroVestido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltroVestidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboClientes, 0, 602, Short.MAX_VALUE)
                            .addComponent(comboVestido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonFiltroVestido)
                            .addComponent(buttonFiltroCliente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFiltroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboVestido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFiltroVestido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDados);

        jPanel5.setBackground(new java.awt.Color(242, 219, 238));

        jPanel2.setBackground(new java.awt.Color(242, 219, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        buttonNovo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonNovo.setText("Novo");
        buttonNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonNovoMouseExited(evt);
            }
        });
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });

        buttonSalvar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonSalvar.setText("Salvar");
        buttonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSalvarMouseExited(evt);
            }
        });
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonRemover.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonRemover.setText("Remover");
        buttonRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRemoverMouseExited(evt);
            }
        });
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(242, 219, 238));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2), "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Data da Reservada:");

        try {
            textData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textData)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/download (2).jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed

        this.limpaComponentes();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        ReservaTraje reservaTraje = this.getObject();

        try{

            if (textCodigo.getText().isEmpty()){
                dao.create(reservaTraje);
            }

            else{
                dao.update(reservaTraje);
            }

            this.limpaComponentes();
            this.atualizaTable();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                "ERRO ao Gravar\n"+ex.getMessage());
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed

        if (textCodigo.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Para remover é necessário selecionar uma reserva");
            return;
        }
        
    ///////

        if (JOptionPane.showConfirmDialog(null, "Você confirma a esclusão") !=0){
            return;
        }
        
    ///////  

        try{

            ReservaTraje reservaTraje = dao.read(ReservaTraje.class, Integer.parseInt(textCodigo.getText()));
            dao.delete(reservaTraje);
            this.limpaComponentes();
            this.atualizaTable();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERRO:\n"+ex.getMessage());
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        this.loadComboCliente();
        this.loadComboVestidos();
        
        this.atualizaTable();
        
        this.limpaComponentes();        
    }//GEN-LAST:event_formWindowOpened

//////////////////////////////  
    
    private void buttonFiltroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltroClienteActionPerformed
       
        Cliente cliente = (Cliente)comboClientes.getSelectedItem();
        this.atualizaTable(cliente);        
    }//GEN-LAST:event_buttonFiltroClienteActionPerformed

    private void buttonFiltroVestidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltroVestidoActionPerformed
        
        Vestidos vestidos = (Vestidos)comboVestido.getSelectedItem();
        this.atualizaTable(vestidos);        
    }//GEN-LAST:event_buttonFiltroVestidoActionPerformed

//////////////////////////////  
    
    private void buttonNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNovoMouseEntered
        
        buttonNovo.setBackground(new Color(235, 235, 235));
        buttonNovo.setForeground(new Color(255, 20, 147));        
    }//GEN-LAST:event_buttonNovoMouseEntered

    private void buttonNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNovoMouseExited
       
        buttonNovo.setBackground(new Color(255, 250, 250));
        buttonNovo.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonNovoMouseExited

//////////////////////////////  
    
    private void buttonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseEntered

        buttonSalvar.setBackground(new Color(235, 235, 235));
        buttonSalvar.setForeground(new Color(255, 20, 147));                                                      
    }//GEN-LAST:event_buttonSalvarMouseEntered

    private void buttonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseExited

        buttonSalvar.setBackground(new Color(255, 250, 250));
        buttonSalvar.setForeground(Color.BLACK);               
    }//GEN-LAST:event_buttonSalvarMouseExited

//////////////////////////////  
    
    private void buttonRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoverMouseEntered
        
        buttonRemover.setBackground(new Color(235, 235, 235));
        buttonRemover.setForeground(new Color(255, 20, 147));                                                       
    }//GEN-LAST:event_buttonRemoverMouseEntered

    private void buttonRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoverMouseExited
       
        buttonRemover.setBackground(new Color(255, 250, 250));
        buttonRemover.setForeground(Color.BLACK);               
    }//GEN-LAST:event_buttonRemoverMouseExited

//////////////////////////////  
    
    private void buttonFiltroVestidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltroVestidoMouseEntered
    
        buttonFiltroVestido.setBackground(new Color(235, 235, 235));
        buttonFiltroVestido.setForeground(new Color(255, 20, 147));                                                      
    }//GEN-LAST:event_buttonFiltroVestidoMouseEntered

    private void buttonFiltroVestidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltroVestidoMouseExited
       
        buttonFiltroVestido.setBackground(new Color(255, 250, 250));
        buttonFiltroVestido.setForeground(Color.BLACK);               
    }//GEN-LAST:event_buttonFiltroVestidoMouseExited

//////////////////////////////  
    
    private void buttonFiltroClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltroClienteMouseEntered
      
        buttonFiltroCliente.setBackground(new Color(235, 235, 235));
        buttonFiltroCliente.setForeground(new Color(255, 20, 147));          
    }//GEN-LAST:event_buttonFiltroClienteMouseEntered

    private void buttonFiltroClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltroClienteMouseExited
       
        buttonFiltroCliente.setBackground(new Color(255, 250, 250));
        buttonFiltroCliente.setForeground(Color.BLACK);               
    }//GEN-LAST:event_buttonFiltroClienteMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void tableDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDadosMouseClicked
        
        if (evt.getClickCount() == 2){

            int codigo = Integer.parseInt(tableDados.getValueAt(tableDados.getSelectedRow(), 0) + ""); 
            ReservaTraje reservaTraje = dao.read(ReservaTraje.class, codigo); 
            this.populaComponentes(reservaTraje);
        }        
    }//GEN-LAST:event_tableDadosMouseClicked


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogReservaTraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogReservaTraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogReservaTraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogReservaTraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogReservaTraje dialog = new dialogReservaTraje(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFiltroCliente;
    private javax.swing.JButton buttonFiltroVestido;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JComboBox<String> comboVestido;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDados;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JFormattedTextField textData;
    // End of variables declaration//GEN-END:variables
}
