/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;
import model.bin.Email;
import model.bin.Usuario;
import model.dao.UsuarioDao;

/**
 *
 * @author guilh
 */
public class TelaCadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaCadastroUsuario() {
        initComponents();
        lblMensErroNome.setVisible(false);
        lblMensErroEmail.setVisible(false);
        lblMensErroSexo.setVisible(false);
        lblMensErroLogin.setVisible(false);
        lblMensErroSenha.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdMesc = new javax.swing.JRadioButton();
        rdFemi = new javax.swing.JRadioButton();
        txtLogin = new javax.swing.JTextField();
        btnCadastra = new javax.swing.JButton();
        lblMensErroNome = new javax.swing.JLabel();
        lblMensErroEmail = new javax.swing.JLabel();
        lblMensErroSexo = new javax.swing.JLabel();
        lblMensErroLogin = new javax.swing.JLabel();
        lblMensErroSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro do usuário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Email :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sexo :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Login :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Senha :");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        groupSexo.add(rdMesc);
        rdMesc.setText("Mascolino");

        groupSexo.add(rdFemi);
        rdFemi.setText("Feminino");

        btnCadastra.setText("Cadastra");
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });

        lblMensErroNome.setForeground(new java.awt.Color(255, 0, 0));
        lblMensErroNome.setText("Campo obrigatório");

        lblMensErroEmail.setForeground(new java.awt.Color(255, 0, 0));
        lblMensErroEmail.setText("Campo obrigatório");

        lblMensErroSexo.setForeground(new java.awt.Color(255, 0, 0));
        lblMensErroSexo.setText("Campo obrigatório");

        lblMensErroLogin.setForeground(new java.awt.Color(255, 0, 0));
        lblMensErroLogin.setText("Campo obrigatório");

        lblMensErroSenha.setForeground(new java.awt.Color(255, 0, 0));
        lblMensErroSenha.setText("Campo obrigatório");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastra)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome)
                                .addComponent(txtEmail)
                                .addComponent(txtLogin)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rdMesc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdFemi)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtSenha)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensErroNome)
                    .addComponent(lblMensErroEmail)
                    .addComponent(lblMensErroSexo)
                    .addComponent(lblMensErroLogin)
                    .addComponent(lblMensErroSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensErroNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensErroEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdMesc)
                    .addComponent(rdFemi)
                    .addComponent(lblMensErroSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensErroLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblMensErroSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastra)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
        
        String campos = "";
        
        if(txtNome.getText().equals("")){
            campos = campos + "Nome, ";
            lblMensErroNome.setVisible(true);
        }else{
            lblMensErroNome.setVisible(false);
        }
        
        if(txtEmail.getText().equals("")){
            campos = campos + "Email, ";
            lblMensErroEmail.setVisible(true);
        }else{
            lblMensErroEmail.setVisible(false);
        }        
        
        if(!rdMesc.isSelected() && !rdFemi.isSelected()){
            campos = campos + "Sexo, ";
            lblMensErroSexo.setVisible(true);
        }else{
            lblMensErroSexo.setVisible(false);
        }        
        
        if(txtLogin.getText().equals("")){
            campos = campos + "Login, ";
            lblMensErroLogin.setVisible(true);
        }else{
            lblMensErroLogin.setVisible(false);
        }        
        
        if(txtSenha.getPassword().equals("")){
            campos = campos + "Senha";
            lblMensErroSenha.setVisible(true);
        }else{
            lblMensErroSenha.setVisible(false);
        }        
        
        if(!campos.equals("")){
            campos = "Os campos " + campos + " são obrigatórios.";
            JOptionPane.showMessageDialog(null, campos, "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            char opcao;
            boolean resultado;
            
            if(rdMesc.isSelected()){
                opcao = 'M';
            }else{
                opcao = 'F';
            }
            
            Usuario objUsuario = new Usuario(0, txtNome.getText(), txtEmail.getText(), opcao,txtLogin.getText() ,String.valueOf(txtSenha.getPassword()));
            UsuarioDao objUsuarioDao = new UsuarioDao();
            resultado = objUsuarioDao.create(objUsuario);
            if(resultado){
                JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso !");
            }else{
                JOptionPane.showMessageDialog(this, "Usuário não cadastrado !");
            }
        }
        
        
    }//GEN-LAST:event_btnCadastraActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        Email objEmail = new Email();
        if(!objEmail.setEmail(txtEmail.getText())){
            JOptionPane.showMessageDialog(this,"E-mail inválido.");
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastra;
    private javax.swing.ButtonGroup groupSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensErroEmail;
    private javax.swing.JLabel lblMensErroLogin;
    private javax.swing.JLabel lblMensErroNome;
    private javax.swing.JLabel lblMensErroSenha;
    private javax.swing.JLabel lblMensErroSexo;
    private javax.swing.JRadioButton rdFemi;
    private javax.swing.JRadioButton rdMesc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    
}
