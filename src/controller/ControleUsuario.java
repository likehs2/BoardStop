/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloUsuario;
import util.ConectaBanco;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class ControleUsuario {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloUsuario modelo = new ModeloUsuario();
    
    public void SalvarUsuario(ModeloUsuario mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblusuario (nomeUsuario, senhaUsuario, loginUsuario) values (?,?,?)");
            pst.setString(1, mod.getUsuario());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuário!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
}
