
package view;

import controller.daoFuncionario;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.Funcionario;

public class dialogFuncionario extends javax.swing.JDialog {

    private daoFuncionario dao = new daoFuncionario();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    
//////////////////////////////
    
    //Limpa componentes
    private void limpaComponentes(){
        
        textCodigo.setText("");
        textNome.setText("");
        textCPF.setText("");
        textTelefone.setText("");
        textEndereco.setText("");
        textData.setText(LocalDate.now().format(formato));
        textFuncao.setText("");
        
        textNome.requestFocus();
    }
    
//////////////////////////////
    
    //Popular componentes
    private void populaComponentes(Funcionario funcionario){ 
        
        textCodigo.setText(funcionario.getId() + "");
        textNome.setText(funcionario.getNome());
        textCPF.setText(funcionario.getCpf());
        textTelefone.setText(funcionario.getTelefone());
        textEndereco.setText(funcionario.getEndereco());
        textData.setText(funcionario.getDataContratacao().format(formato));
        textFuncao.setText(funcionario.getFuncao());
        
        textNome.requestFocus();        
    }    
  
/////
    
    //Criar objeto a partir dos componentes
    private Funcionario getObject(){
        
        return new Funcionario (
                            textCodigo.getText().isEmpty() ? 0 : Integer.parseInt(textCodigo.getText()),
                            textNome.getText(),
                            textCPF.getText(),
                            textTelefone.getText(),
                            textEndereco.getText(),
                            LocalDate.parse(textData.getText(), formato),
                            textFuncao.getText());
    }    
    
////////////////////////////// 
    
    private void atualizaTable(){
        
        tableDados.setModel(new MyTableModel(Funcionario.class, dao.read(), tableDados));
    }
    
    private void atualizaTable(String filtroNome){
        
        tableDados.setModel(new MyTableModel(Funcionario.class, dao.read(filtroNome), tableDados));
    }    
        
 //////////////////////////////    
      
    public dialogFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonNovo = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        textCPF = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        textFuncao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textData = new javax.swing.JFormattedTextField();
        buttonFiltrarFuncao = new javax.swing.JButton();
        buttonFiltrarNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(242, 219, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102), 2), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

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
                .addGap(175, 175, 175)
                .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(242, 219, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102), 2), "Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

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
        jLabel4.setText("Telefone:");

        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CPF:");

        try {
            textCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Função:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Data de Contratação:");

        try {
            textData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buttonFiltrarFuncao.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarFuncao.setText("Filtrar por Função");
        buttonFiltrarFuncao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFiltrarFuncaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFiltrarFuncaoMouseExited(evt);
            }
        });
        buttonFiltrarFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarFuncaoActionPerformed(evt);
            }
        });

        buttonFiltrarNome.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonFiltrarNome.setText("Filtrar por Nome");
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFiltrarFuncao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFiltrarNome)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFiltrarNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(textFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonFiltrarFuncao)))
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
        jScrollPane1.setViewportView(tableDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

        if (textFuncao.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "A função do funcionário é obrigatório");
            textNome.requestFocus();
            return;
        }

        Funcionario funcionario = this.getObject();
        
        try{
            
            if (textCodigo.getText().isEmpty()){
                
                dao.create(funcionario);
                
            }else{
                
                dao.update(funcionario);
            }
            
            this.limpaComponentes();
            this.atualizaTable();
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Erro ao gravar \n" + ex.getMessage());
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed

        if (textCodigo.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Para remover é necessário selecionar uma funcionário");
            return;
        }
        
    ///////

        if (JOptionPane.showConfirmDialog(null, "Você confirma a esclusão") !=0){
            return;
        }
        
    ///////  
  
        try{
            
            Funcionario funcionario = dao.read(Funcionario.class, Integer.parseInt(textCodigo.getText()));
            dao.delete(funcionario);
            this.limpaComponentes();
            this.atualizaTable();
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "ERRO: \n" + ex.getMessage());
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        if (evt.getClickCount() == 2){

            int codigo = Integer.parseInt(tableDados.getValueAt(tableDados.getSelectedRow(), 0) + ""); 
            Funcionario cliente = dao.read(Funcionario.class, codigo); 
            this.populaComponentes(cliente);
        }
    }//GEN-LAST:event_formMouseClicked

    private void buttonFiltrarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeActionPerformed
        
        this.atualizaTable(textNome.getText());
    }//GEN-LAST:event_buttonFiltrarNomeActionPerformed

    private void buttonFiltrarFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarFuncaoActionPerformed
       
        this.atualizaTable(textData.getText());
    }//GEN-LAST:event_buttonFiltrarFuncaoActionPerformed

    private void buttonFiltrarNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeMouseEntered
       
        buttonFiltrarNome.setBackground(new Color(235, 235, 235));
        buttonFiltrarNome.setForeground(new Color(255, 20, 147));           
    }//GEN-LAST:event_buttonFiltrarNomeMouseEntered

    private void buttonFiltrarNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarNomeMouseExited
        
        buttonFiltrarNome.setBackground(new Color(255, 250, 250));
        buttonFiltrarNome.setForeground(Color.BLACK);           
    }//GEN-LAST:event_buttonFiltrarNomeMouseExited

    private void buttonFiltrarFuncaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarFuncaoMouseEntered
        
        buttonFiltrarFuncao.setBackground(new Color(235, 235, 235));
        buttonFiltrarFuncao.setForeground(new Color(255, 20, 147));           
    }//GEN-LAST:event_buttonFiltrarFuncaoMouseEntered

    private void buttonFiltrarFuncaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiltrarFuncaoMouseExited
        
        buttonFiltrarFuncao.setBackground(new Color(255, 250, 250));
        buttonFiltrarFuncao.setForeground(Color.BLACK);                
    }//GEN-LAST:event_buttonFiltrarFuncaoMouseExited

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


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogFuncionario dialog = new dialogFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonFiltrarFuncao;
    private javax.swing.JButton buttonFiltrarNome;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDados;
    private javax.swing.JFormattedTextField textCPF;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JFormattedTextField textData;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textFuncao;
    private javax.swing.JTextField textNome;
    private javax.swing.JFormattedTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
