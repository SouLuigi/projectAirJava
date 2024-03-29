

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Yasmine.if
 */
public class cadastroFrame extends javax.swing.JFrame {
        public  String nome;
        public  String cpf;
        public  String rg;
        public  String dataNascimento;
        public  String sexo;
        public  String endereco;
        public  String numeroCasa;
        public  String complemento;
        public  String bairro;
        public  String cidade;
        public  String UF;
        public  String fone;
        public  String telefone;
        public static String email;
        public static String senha;
        public static String confirmSenha;
       
    /**
     * Creates new form cadastroFrame
     * @throws java.io.IOException
     */
    public cadastroFrame() throws IOException {
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

        jPanel1 = new javax.swing.JPanel();
        ComboBox_Uf = new javax.swing.JComboBox<>();
        JLabel_fone = new javax.swing.JLabel();
        JTextField_Fone = new javax.swing.JTextField();
        JLabel_email = new javax.swing.JLabel();
        JTextField_Email = new javax.swing.JTextField();
        JLabel_DataNascimento = new javax.swing.JLabel();
        JTextField_DataNascimento = new javax.swing.JTextField();
        JLabel_complemento = new javax.swing.JLabel();
        JTextField_Complemento = new javax.swing.JTextField();
        JButton_Voltar = new javax.swing.JButton();
        JButton_Cadastrar = new javax.swing.JButton();
        JLabel_Senha = new javax.swing.JLabel();
        JTextField_ComfirmSenha = new javax.swing.JTextField();
        JLabel_endereco = new javax.swing.JLabel();
        JLabel_confirmsenha = new javax.swing.JLabel();
        JTextField_Endereco = new javax.swing.JTextField();
        JLabel_Telefone = new javax.swing.JLabel();
        JLabel_numeroCasa = new javax.swing.JLabel();
        JTextField_Telefone = new javax.swing.JTextField();
        JTextField_NumeroCasa = new javax.swing.JTextField();
        JTextField_Senha = new javax.swing.JTextField();
        JLabel_bairro = new javax.swing.JLabel();
        JTextField_Bairro = new javax.swing.JTextField();
        JLabel_cidade = new javax.swing.JLabel();
        JLabel_CadastroUsuário = new javax.swing.JLabel();
        JLabel_NomeCompleto = new javax.swing.JLabel();
        JTextField_Nome = new javax.swing.JTextField();
        JLabel_CPF = new javax.swing.JLabel();
        JTextField_CPF = new javax.swing.JTextField();
        JLabel_RG = new javax.swing.JLabel();
        JTextField_RG = new javax.swing.JTextField();
        JLabel_Sexo = new javax.swing.JLabel();
        JTextField_Cidade = new javax.swing.JTextField();
        JLabel_UF = new javax.swing.JLabel();
        ComboBox_Sexo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AirJava");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        ComboBox_Uf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ComboBox_Uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        ComboBox_Uf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLabel_fone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_fone.setText("Fone:");

        JTextField_Fone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTextField_Fone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_FoneActionPerformed(evt);
            }
        });

        JLabel_email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_email.setText("Email:");

        JTextField_Email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JLabel_DataNascimento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_DataNascimento.setText("Data de nascimento:");

        JTextField_DataNascimento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JLabel_complemento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_complemento.setText("Complemento:");

        JTextField_Complemento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JButton_Voltar.setBackground(new java.awt.Color(0, 204, 204));
        JButton_Voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButton_Voltar.setText("Voltar");
        JButton_Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JButton_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_VoltarActionPerformed(evt);
            }
        });

        JButton_Cadastrar.setBackground(new java.awt.Color(0, 204, 204));
        JButton_Cadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButton_Cadastrar.setText("Cadastrar");
        JButton_Cadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JButton_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_CadastrarActionPerformed(evt);
            }
        });

        JLabel_Senha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_Senha.setText("Senha:");

        JTextField_ComfirmSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JLabel_endereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_endereco.setText("Endereço:");

        JLabel_confirmsenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_confirmsenha.setText("Confirmação de senha:");

        JTextField_Endereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTextField_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_EnderecoActionPerformed(evt);
            }
        });

        JLabel_Telefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_Telefone.setText("Telefone:");

        JLabel_numeroCasa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_numeroCasa.setText("N°:");

        JTextField_Telefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTextField_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_TelefoneActionPerformed(evt);
            }
        });

        JTextField_NumeroCasa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JTextField_Senha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JLabel_bairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_bairro.setText("Bairro:");

        JTextField_Bairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JLabel_cidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_cidade.setText("Cidade:");

        JLabel_CadastroUsuário.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        JLabel_CadastroUsuário.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_CadastroUsuário.setText("Cadastro AirJava");

        JLabel_NomeCompleto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_NomeCompleto.setText("Nome completo:");

        JTextField_Nome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTextField_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_NomeActionPerformed(evt);
            }
        });

        JLabel_CPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_CPF.setText("CPF:");

        JTextField_CPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTextField_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CPFActionPerformed(evt);
            }
        });

        JLabel_RG.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_RG.setText("RG:");

        JTextField_RG.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JLabel_Sexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_Sexo.setText("Sexo:");

        JTextField_Cidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JLabel_UF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_UF.setText("UF:");

        ComboBox_Sexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ComboBox_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Feminino", "Masculino", "Prefiro não informar" }));
        ComboBox_Sexo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JButton_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButton_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLabel_endereco)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(JLabel_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(JTextField_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JLabel_numeroCasa)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JTextField_NumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(JLabel_complemento)
                                            .addGap(4, 4, 4)
                                            .addComponent(JTextField_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JLabel_CPF)
                                .addComponent(JLabel_DataNascimento)
                                .addComponent(JLabel_NomeCompleto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTextField_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JTextField_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JLabel_RG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextField_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JLabel_Senha)
                                        .addComponent(JLabel_email)
                                        .addComponent(JLabel_confirmsenha))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JTextField_ComfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JTextField_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JLabel_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLabel_cidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(JLabel_UF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBox_Uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLabel_fone)
                                        .addGap(11, 11, 11)
                                        .addComponent(JTextField_Fone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLabel_Telefone)
                                        .addGap(9, 9, 9)
                                        .addComponent(JTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabel_CadastroUsuário)
                .addGap(277, 277, 277))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(JLabel_CadastroUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_NomeCompleto)
                    .addComponent(JTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_CPF)
                    .addComponent(JTextField_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel_RG)
                    .addComponent(JTextField_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel_DataNascimento)
                    .addComponent(JTextField_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Sexo)
                    .addComponent(ComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextField_Endereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLabel_endereco)
                        .addComponent(JTextField_NumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel_numeroCasa)
                        .addComponent(JLabel_complemento)
                        .addComponent(JTextField_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_Uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel_bairro)
                    .addComponent(JTextField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel_cidade)
                    .addComponent(JTextField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel_UF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLabel_Telefone)
                        .addComponent(JTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLabel_fone)
                        .addComponent(JTextField_Fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_email)
                    .addComponent(JTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Senha)
                    .addComponent(JTextField_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_confirmsenha)
                    .addComponent(JTextField_ComfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTextField_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CPFActionPerformed

    private void JTextField_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_TelefoneActionPerformed

    private void JTextField_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_EnderecoActionPerformed

    private void JButton_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_CadastrarActionPerformed
        FileWriter wr = null;
            try {
                // TODO add your handling code here:
                loginFrame lF = new loginFrame();
                lF.setVisible(true);
                dispose();
                nome = JTextField_Nome.getText();
                cpf = JTextField_CPF.getText();
                rg = JTextField_RG.getText();
                dataNascimento = JTextField_DataNascimento.getText();
                sexo = (String) ComboBox_Sexo.getSelectedItem();
                endereco = JTextField_Endereco.getText();
                numeroCasa = JTextField_NumeroCasa.getText();
                complemento = JTextField_Complemento.getText();
                bairro = JTextField_Bairro.getText();
                cidade = JTextField_Cidade.getText();
                UF = (String) ComboBox_Uf.getSelectedItem();
                fone = JTextField_Fone.getText();
                telefone = JTextField_Telefone.getText();
                email = JTextField_Email.getText();
              
                senha = JTextField_Senha.getText();
              
                confirmSenha = JTextField_ComfirmSenha.getText();
                
               
                String  usuario = "Usuario: " + nome + "\n"+ "CPF: " + cpf + "\n" 
                        + "RG: " + rg + "\n" + "Data de Nacimento: " + dataNascimento
                        + "\n" + "Sexo: " + sexo + "\n" + "Endereço: " + endereco 
                        + "\n" + "N°: " + numeroCasa + "\n" + "Complemento: " + 
                        complemento + "\n" + "Bairro: " + bairro  + "\n" + "Cidade: "
                        + cidade + "\n" + "UF: " + UF + "\n" + "Fone: " + fone + "\n" +
                        "Telefone: " + telefone + "\n" + "Email: " + email + "\n" +
                        "Senha: " + senha + "\n" + "Confirmação de senha: " + confirmSenha + "\n\n";
                String caminho = 
                "C:\\Users\\rafan\\OneDrive\\Documentos\\NetBeansProjects\\projectAirJava1\\projectAirJavaAtualizado2.0\\src\\BancoDadosCadastro";
                File bancoDados = new File(caminho);
                wr = new FileWriter(bancoDados,true);
                wr.write(usuario);
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(cadastroFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    wr.close();
                } catch (IOException ex) {
                    Logger.getLogger(cadastroFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

    }//GEN-LAST:event_JButton_CadastrarActionPerformed

    private void JButton_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_VoltarActionPerformed
        // TODO add your handling code here:
        loginFrame lF = new loginFrame();
        lF.setVisible(true);
        dispose();

    }//GEN-LAST:event_JButton_VoltarActionPerformed

    private void JTextField_FoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_FoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_FoneActionPerformed

    private void JTextField_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_NomeActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new cadastroFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(cadastroFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Sexo;
    private javax.swing.JComboBox<String> ComboBox_Uf;
    private javax.swing.JButton JButton_Cadastrar;
    private javax.swing.JButton JButton_Voltar;
    private javax.swing.JLabel JLabel_CPF;
    private javax.swing.JLabel JLabel_CadastroUsuário;
    private javax.swing.JLabel JLabel_DataNascimento;
    private javax.swing.JLabel JLabel_NomeCompleto;
    private javax.swing.JLabel JLabel_RG;
    private javax.swing.JLabel JLabel_Senha;
    private javax.swing.JLabel JLabel_Sexo;
    private javax.swing.JLabel JLabel_Telefone;
    private javax.swing.JLabel JLabel_UF;
    private javax.swing.JLabel JLabel_bairro;
    private javax.swing.JLabel JLabel_cidade;
    private javax.swing.JLabel JLabel_complemento;
    private javax.swing.JLabel JLabel_confirmsenha;
    private javax.swing.JLabel JLabel_email;
    private javax.swing.JLabel JLabel_endereco;
    private javax.swing.JLabel JLabel_fone;
    private javax.swing.JLabel JLabel_numeroCasa;
    private javax.swing.JTextField JTextField_Bairro;
    private javax.swing.JTextField JTextField_CPF;
    private javax.swing.JTextField JTextField_Cidade;
    private javax.swing.JTextField JTextField_ComfirmSenha;
    private javax.swing.JTextField JTextField_Complemento;
    private javax.swing.JTextField JTextField_DataNascimento;
    private javax.swing.JTextField JTextField_Email;
    private javax.swing.JTextField JTextField_Endereco;
    private javax.swing.JTextField JTextField_Fone;
    private javax.swing.JTextField JTextField_Nome;
    private javax.swing.JTextField JTextField_NumeroCasa;
    private javax.swing.JTextField JTextField_RG;
    private javax.swing.JTextField JTextField_Senha;
    private javax.swing.JTextField JTextField_Telefone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
