
package view;

import controller.daoCliente;
import enums.Sexo;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Cliente;
        
public class dialogCliente extends javax.swing.JDialog {

    private daoCliente dao = new daoCliente();

//////////////////////////////
    
    //Limpa componentes
    private void limpaComponentes(){
        
        textCodigo.setText("");
        textNome.setText("");
        textCPF.setText("");
        textTelefone.setText("");
        textEndereco.setText("");
        comboSexo.setSelectedIndex(0);
        
        textNome.requestFocus();
    }
    
//////////////////////////////
    
    //Popular componentes
    private void populaComponentes(Cliente cliente){ 
        
        textCodigo.setText(cliente.getId() + "");
        textNome.setText(cliente.getNome());
        textCPF.setText(cliente.getCpf());
        textTelefone.setText(cliente.getTelefone());
        textEndereco.setText(cliente.getEndereco());
        comboSexo.setSelectedItem(cliente.getSexo());
        
        textNome.requestFocus();        
    }    
  
/////
    
    //Criar objeto a partir dos componentes
    private Cliente getObject(){
        
        return new Cliente (
                            textCodigo.getText().isEmpty() ? 0 : Integer.parseInt(textCodigo.getText()),
                            textNome.getText(),
                            textCPF.getText(),
                            textTelefone.getText(),
                            textEndereco.getText(),
                            (Sexo)comboSexo.getSelectedItem());
    }    
    
////////////////////////////// 
    
    //Atualizar table(3)
    private void atualizaTable(){
        
        tableDados.setModel(new MyTableModel(Cliente.class, dao.read(), tableDados));
    }
    
    private void atualizaTable(String filtroNome){
        
        tableDados.setModel(new MyTableModel(Cliente.class, dao.read(filtroNome), tableDados));
    }    
 
    private void atualizaTable(Sexo sexo){
        
        tableDados.setModel(new MyTableModel(Cliente.class, dao.read(sexo), tableDados));
    }   
        
 //////////////////////////////
    
    //Carregar combos
    private void loadComboSexo(){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(Sexo.values());
        comboSexo.setModel(cbm);
    }
    
//////////////////////////////    
    
    public dialogCliente(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textCPF = new javax.swing.JFormattedTextField();
        comboSexo = new javax.swing.JComboBox<>();
        buttonFiltrarNome = new javax.swing.JButton();
        buttonFiltrarSexo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buttonNovo = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(242, 219, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102), 2), "Cadastrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        textCodigo.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefone:");

        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sexo:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CPF:");

        try {
            textCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        buttonFiltrarNome.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarNome.setText("Filtrar");
        buttonFiltrarNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltrarNomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltrarNomeMouseExited(evt);
            }
        });
        buttonFiltrarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarNomeActionPerformed(evt);
            }
        });

        buttonFiltrarSexo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarSexo.setText("Filtrar");
        buttonFiltrarSexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltrarSexoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltrarSexoMouseExited(evt);
            }
        });
        buttonFiltrarSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonFiltrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textEndereco)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(buttonFiltrarSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNome, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonFiltrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(textCPF)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonFiltrarSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(242, 219, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102), 2), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flor2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        tableDados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        jScrollPane3.setViewportView(tableDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane3)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed

    }//GEN-LAST:event_comboSexoActionPerformed

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed

        this.limpaComponentes();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (textNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Campo de Nome é Obrigatório");
            textNome.requestFocus();
            return;
        }

        if (textCPF.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Campo de CPF é Obrigatório");
            textCPF.requestFocus();
            return;
        }

        if (textTelefone.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Campo de Telefone é Obrigatório");
            textTelefone.requestFocus();
            return;
        }

        if (textEndereco.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O Campo de Endereço é Obrigatório");
            textEndereco.requestFocus();
            return;
        }

        Cliente cliente = this.getObject();
        
        try{
            
            if (textCodigo.getText().isEmpty()){
                
                dao.create(cliente);
                
            }else{
                
                dao.update(cliente);
            }
            
            this.limpaComponentes();
            this.atualizaTable();
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Erro ao gravar \n" + ex.getMessage());
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonFiltrarSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarSexoActionPerformed
        
        Sexo sexo = (Sexo)comboSexo.getSelectedItem();
        this.atualizaTable(sexo);        
    }//GEN-LAST:event_buttonFiltrarSexoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.loadComboSexo();
        this.atualizaTable();
        this.limpaComponentes();        
    }//GEN-LAST:event_formWindowOpened

    private void tableDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDadosMouseClicked

        if (evt.getClickCount() == 2){

            int codigo = Integer.parseInt(tableDados.getValueAt(tableDados.getSelectedRow(), 0) + "");
            Cliente cliente = dao.read(Cliente.class, codigo); 
            this.populaComponentes(cliente);
        }
    }//GEN-LAST:event_tableDadosMouseClicked

    private void buttonNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNovoMouseEntered
        
        buttonNovo.setBackground(new Color(235, 235, 235));
        buttonNovo.setForeground(new Color(255, 20, 147));                
    }//GEN-LAST:event_buttonNovoMouseEntered

    private void buttonNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNovoMouseExited

        buttonNovo.setBackground(new Color(255, 250, 250));
        buttonNovo.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonNovoMouseExited

    private void buttonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseEntered

        buttonSalvar.setBackground(new Color(235, 235, 235));
        buttonSalvar.setForeground(new Color(255, 20, 147));        
    }//GEN-LAST:event_buttonSalvarMouseEntered

    private void buttonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseExited

        buttonSalvar.setBackground(new Color(255, 250, 250));
        buttonSalvar.setForeground(Color.BLACK);       
    }//GEN-LAST:event_buttonSalvarMouseExited

    private void buttonFiltrarNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeMouseEntered
       
        buttonFiltrarNome.setBackground(new Color(235, 235, 235));
        buttonFiltrarNome.setForeground(new Color(255, 20, 147));            
    }//GEN-LAST:event_buttonFiltrarNomeMouseEntered

    private void buttonFiltrarNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeMouseExited
       
        buttonFiltrarNome.setBackground(new Color(255, 250, 250));
        buttonFiltrarNome.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonFiltrarNomeMouseExited

    private void buttonFiltrarSexoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarSexoMouseEntered
       
        buttonFiltrarSexo.setBackground(new Color(235, 235, 235));
        buttonFiltrarSexo.setForeground(new Color(255, 20, 147));            
    }//GEN-LAST:event_buttonFiltrarSexoMouseEntered

    private void buttonFiltrarSexoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarSexoMouseExited
        
        buttonFiltrarSexo.setBackground(new Color(255, 250, 250));
        buttonFiltrarSexo.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonFiltrarSexoMouseExited

    private void buttonFiltrarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFiltrarNomeActionPerformed


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogCliente dialog = new dialogCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonFiltrarNome;
    private javax.swing.JButton buttonFiltrarSexo;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableDados;
    private javax.swing.JFormattedTextField textCPF;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textNome;
    private javax.swing.JFormattedTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
