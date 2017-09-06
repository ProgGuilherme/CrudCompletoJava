package model.bin;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {
    private int idCadUsuario;
    private String nome;
    private String email;
    private char sexo;
    private String login;
    private String senha;
    
    Criptografia objCriptografia = new Criptografia();

    public Usuario() {
        
    }

    public Usuario(int idCadUsuario, String nome, String email, char sexo, String login, String senha) {
        this.idCadUsuario = idCadUsuario;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.login = login;
        try {
            objCriptografia.setSenhaCriptografada(senha);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.senha = objCriptografia.getSenhaCriptografada();
    }  

    public int getIdCadUsuario() {
        return idCadUsuario;
    }

    public void setIdCadUsuario(int idCadUsuario) {
        this.idCadUsuario = idCadUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
