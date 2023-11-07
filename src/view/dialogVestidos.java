
package view;

import controller.daoVestidos;
import enums.Categoria;
import enums.Cores;
import enums.Tamanho;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Vestidos;

public class dialogVestidos extends javax.swing.JDialog {

    private daoVestidos dao = new daoVestidos();
    
//////////////////////////////
    
    //Limpa componentes
    private void limpaComponentes(){
        
        textCodigo.setText("");
        comboCor.setSelectedIndex(0);
        comboCategoria.setSelectedIndex(0);
        comboTamanho.setSelectedIndex(0);
        textDescricao.setText("");
        
        textDescricao.requestFocus();
    }
    
//////////////////////////////
    
    //Popular componentes
    private void populaComponentes(Vestidos vestidos){ 
        
        textCodigo.setText(vestidos.getId() + "");
        comboCor.setSelectedItem(vestidos.getCores());
        comboCategoria.setSelectedItem(vestidos.getCategoria());
        comboTamanho.setSelectedItem(vestidos.getTamanho());
        textDescricao.setText(vestidos.getDescricao());
        
        textDescricao.requestFocus();        
    }    
  
/////
    
    //Criar objeto a partir dos componentes
    private Vestidos getObject(){
        
        return new Vestidos (
                            textCodigo.getText().isEmpty() ? 0 : Integer.parseInt(textCodigo.getText()),
                            (Cores)comboCor.getSelectedItem(),
                            (Tamanho)comboTamanho.getSelectedItem(),
                            (Categoria)comboCategoria.getSelectedItem(),
                            textDescricao.getText());
    }    
    
////////////////////////////// 
    
    //Atualizar table(3)
    
    private void atualizaTable(Cores cores){
        
        tableDados.setModel(new MyTableModel(Vestidos.class, dao.read(cores), tableDados));
    }   
  
    private void atualizaTable(Tamanho tamanho){
        
        tableDados.setModel(new MyTableModel(Vestidos.class, dao.read(tamanho), tableDados));
    }   

    private void atualizaTable(Categoria categoria){
        
        tableDados.setModel(new MyTableModel(Vestidos.class, dao.read(categoria), tableDados));
    }    
    
    private void atualizaTable(){
        
        tableDados.setModel(new MyTableModel(Vestidos.class, dao.read(), tableDados));
    }
    
 //////////////////////////////
    
    //Carregar combos
    private void loadComboCor(){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(Cores.values());
        comboCor.setModel(cbm);
    }
    
    private void loadComboTamanho(){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(Tamanho.values());
        comboTamanho.setModel(cbm);
    }

    private void loadComboCategoria(){
        
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(Categoria.values());
        comboCategoria.setModel(cbm);
    }    
    
//////////////////////////////      
    
    public dialogVestidos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textDescricao = new javax.swing.JTextField();
        comboCor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboTamanho = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        buttonFiltrarCor = new javax.swing.JButton();
        buttonFiltrarTamanho = new javax.swing.JButton();
        buttonFiltrarCategoria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        buttonNovo = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vestidos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(242, 219, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2), "Cadastro de Vestidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código:");

        textCodigo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tamanho:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Descrição:");

        comboCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cor:");

        comboTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Categoria:");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonFiltrarCor.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarCor.setText("Filtrar por Cor");
        buttonFiltrarCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltrarCorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltrarCorMouseExited(evt);
            }
        });
        buttonFiltrarCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarCorActionPerformed(evt);
            }
        });

        buttonFiltrarTamanho.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarTamanho.setText("Filtrar por Tamanho");
        buttonFiltrarTamanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltrarTamanhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltrarTamanhoMouseExited(evt);
            }
        });
        buttonFiltrarTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarTamanhoActionPerformed(evt);
            }
        });

        buttonFiltrarCategoria.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarCategoria.setText("Filtrar por Categoria");
        buttonFiltrarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltrarCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltrarCategoriaMouseExited(evt);
            }
        });
        buttonFiltrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarCategoriaActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboCor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonFiltrarTamanho)
                                            .addComponent(buttonFiltrarCor)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(buttonFiltrarCategoria)
                                .addGap(0, 84, Short.MAX_VALUE))
                            .addComponent(textDescricao))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonFiltrarCor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonFiltrarTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonFiltrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jScrollPane2.setViewportView(tableDados);

        jPanel2.setBackground(new java.awt.Color(242, 219, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        buttonNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        buttonSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        buttonRemover.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed

        this.limpaComponentes();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        Vestidos vestidos = this.getObject();
        
        try{

            if (textCodigo.getText().isEmpty()){
                dao.create(vestidos);
            }
    
            else{
                dao.update(vestidos);
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
            JOptionPane.showMessageDialog(null, "Selecione");
            return;
        }

        if (JOptionPane.showConfirmDialog(null, "Você confirma a remoção?")!=0){
            return;
        }

        try{

            Vestidos vestidos = dao.read(Vestidos.class, Integer.parseInt(textCodigo.getText()));
            dao.delete(vestidos);
            this.limpaComponentes();
            this.atualizaTable();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERRO:\n"+ex.getMessage());
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        this.loadComboCor();
        this.loadComboTamanho();
        this.loadComboCategoria();
        this.atualizaTable();
        this.limpaComponentes();        
    }//GEN-LAST:event_formWindowOpened

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

    private void buttonRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoverMouseEntered
       
        buttonRemover.setBackground(new Color(235, 235, 235));
        buttonRemover.setForeground(new Color(255, 20, 147));         
    }//GEN-LAST:event_buttonRemoverMouseEntered

    private void buttonRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRemoverMouseExited
        
        buttonRemover.setBackground(new Color(255, 250, 250));
        buttonRemover.setForeground(Color.BLACK);            
    }//GEN-LAST:event_buttonRemoverMouseExited

    private void buttonFiltrarCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarCorActionPerformed
       
        Cores cores = (Cores)comboCor.getSelectedItem();
        this.atualizaTable(cores);        
    }//GEN-LAST:event_buttonFiltrarCorActionPerformed

    private void buttonFiltrarTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarTamanhoActionPerformed
        
        Tamanho tamanho = (Tamanho)comboTamanho.getSelectedItem();
        this.atualizaTable(tamanho);        
    }//GEN-LAST:event_buttonFiltrarTamanhoActionPerformed

    private void buttonFiltrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarCategoriaActionPerformed
        
        Categoria categoria = (Categoria)comboCategoria.getSelectedItem();
        this.atualizaTable(categoria);        
    }//GEN-LAST:event_buttonFiltrarCategoriaActionPerformed

    private void buttonFiltrarCorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarCorMouseEntered
        
        buttonFiltrarCor.setBackground(new Color(235, 235, 235));
        buttonFiltrarCor.setForeground(new Color(255, 20, 147));           
    }//GEN-LAST:event_buttonFiltrarCorMouseEntered

    private void buttonFiltrarCorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarCorMouseExited
        
        buttonFiltrarCor.setBackground(new Color(255, 250, 250));
        buttonFiltrarCor.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonFiltrarCorMouseExited

    private void buttonFiltrarTamanhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarTamanhoMouseEntered
      
        buttonFiltrarTamanho.setBackground(new Color(235, 235, 235));
        buttonFiltrarTamanho.setForeground(new Color(255, 20, 147));          
    }//GEN-LAST:event_buttonFiltrarTamanhoMouseEntered

    private void buttonFiltrarTamanhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarTamanhoMouseExited
        
        buttonFiltrarTamanho.setBackground(new Color(255, 250, 250));
        buttonFiltrarTamanho.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonFiltrarTamanhoMouseExited

    private void buttonFiltrarCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarCategoriaMouseEntered
        
        buttonFiltrarCategoria.setBackground(new Color(235, 235, 235));                                                       
        buttonFiltrarCategoria.setForeground(new Color(255, 20, 147));           
    }//GEN-LAST:event_buttonFiltrarCategoriaMouseEntered

    private void buttonFiltrarCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarCategoriaMouseExited
        
        buttonFiltrarCategoria.setBackground(new Color(255, 250, 250));     
        buttonFiltrarCategoria.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonFiltrarCategoriaMouseExited

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogVestidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogVestidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogVestidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogVestidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogVestidos dialog = new dialogVestidos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonFiltrarCategoria;
    private javax.swing.JButton buttonFiltrarCor;
    private javax.swing.JButton buttonFiltrarTamanho;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboCor;
    private javax.swing.JComboBox<String> comboTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDados;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDescricao;
    // End of variables declaration//GEN-END:variables
}
