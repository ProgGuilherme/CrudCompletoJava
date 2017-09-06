package model.dao;

import connection.Conecxao;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bin.Usuario;

public class UsuarioDao {
    public  boolean create(Usuario objUsuario){
        Connection con = Conecxao.getConnection();
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement("INSERT INTO `tbCadUsuario`(`Nome`, `Email`, `Sexo`, `Login`, `Senha`) VALUES (?,?,?,?,?)");
            stmt.setString(1, objUsuario.getNome());
            stmt.setString(2, objUsuario.getEmail());
            stmt.setString(3, Character.toString(objUsuario.getSexo()));
            stmt.setString(4, objUsuario.getLogin());
            stmt.setString(5, objUsuario.getSenha());
            stmt.executeUpdate(); 
            return true;
        } catch (SQLException ex) {
            return false;
        }finally{
            Conecxao.closeConnection(con, stmt);
        }
    }   
    
    public void update(Usuario objUsuario){
        Connection con = Conecxao.getConnection();
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement("UPDATE `tbCadUsuario` SET `Nome`=?,`Email`=?,`Sexo`=?,`Login`=? WHERE `IdCadUsuario`=?");
            stmt.setString(1, objUsuario.getNome());
            stmt.setString(2, objUsuario.getEmail());
            stmt.setString(3, Character.toString(objUsuario.getSexo()));
            stmt.setString(4, objUsuario.getLogin());
            stmt.setInt(5, objUsuario.getIdCadUsuario());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("erro ao editar usuário.. " , ex);
        }finally{
            Conecxao.closeConnection(con, stmt);
        }
    }
    
    public void delete(int idUsuario){
        Connection con = Conecxao.getConnection();
        PreparedStatement stmt = null;        
        try {
            stmt = con.prepareStatement("DELETE FROM `tbCadUsuario` WHERE `IdCadUsuario` = ?");
            stmt.setInt(1, idUsuario);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conecxao.closeConnection(con, stmt);
        }
        
    }  
    
    public ArrayList<Usuario> readUsuario(){
        Connection con = Conecxao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> listUsuario = new ArrayList();        
        Usuario objUsuario = null;        
        String a;
        try {
            stmt = con.prepareStatement("SELECT `IdCadUsuario`, `Nome`, `Email`, `Sexo`, `Login` FROM `tbCadUsuario` ORDER BY `IdCadUsuario`");
            rs = stmt.executeQuery();            
            while (rs.next()) {  
                objUsuario = new Usuario();
                objUsuario.setIdCadUsuario(rs.getInt("IdCadUsuario"));
                objUsuario.setNome(rs.getString("Nome"));
                objUsuario.setEmail(rs.getString("Email"));
                a = rs.getString("Sexo");
                objUsuario.setSexo(a.charAt(0));
                objUsuario.setLogin(rs.getString("Login"));
                listUsuario.add(objUsuario);
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar dados do usuário." , ex);
        }finally{
            Conecxao.closeConnection(con, stmt, rs);
        }
        return listUsuario;
    }
    
    public Usuario readUsuarioUn(int idUsuario){
        Connection con = Conecxao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        Usuario objUsuario = null;
        try {            
            stmt = con.prepareStatement("SELECT `IdCadUsuario`, `Nome`, `Email`, `Sexo`, `Login` FROM `tbCadUsuario` WHERE `IdCadUsuario` = ?");
            stmt.setInt(1, idUsuario);
            rs = stmt.executeQuery();
            String a;
            if(rs.next()){
                objUsuario = new Usuario();
                objUsuario.setIdCadUsuario(rs.getInt("IdCadUsuario"));
                objUsuario.setNome(rs.getString("Nome"));
                objUsuario.setEmail(rs.getString("Email"));
                a = rs.getString("Sexo");
                objUsuario.setSexo(a.charAt(0));
                objUsuario.setLogin(rs.getString("Login"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objUsuario;
    }
    
    public Usuario getUsuario(String nome){
        Connection con = Conecxao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario objUsuario = null;
        try {
            stmt = con.prepareStatement("SELECT `IdCadUsuario`, `Nome`, `Email`, `Sexo`, `Login`, `Senha` FROM `tbCadUsuario` WHERE `Nome` LIKE ?");
            stmt.setString(1,"%"+nome+"%");
            rs = stmt.executeQuery();
            String a;
            if(rs.next()){
                objUsuario = new Usuario();
                objUsuario.setIdCadUsuario(rs.getInt("IdCadUsuario"));
                objUsuario.setNome(rs.getString("Nome"));
                objUsuario.setEmail(rs.getString("Email"));
                a = rs.getString("Sexo");
                objUsuario.setSexo(a.charAt(0));
                objUsuario.setLogin(rs.getString("Login"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objUsuario;
    }
}
