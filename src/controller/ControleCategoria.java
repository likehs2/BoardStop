/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloCategoria;
import util.ConectaBanco;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class ControleCategoria {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloCategoria modelo = new ModeloCategoria();
    
    public void SalvarCategoria(ModeloCategoria mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblcategoria (nomeCategoria) values (?)");
            pst.setString(1, mod.getNomeCategoria());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir categoria!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarCategoria(ModeloCategoria mod){
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblcategoria set nomeCategoria = ? where idCategoria =?");
            pst.setString(1, mod.getNomeCategoria());
            pst.setInt(2, mod.getIdCategoria());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Categoria atualizada com sucesso!","Editar Categoria",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "texto da caixa","titulo da caixa",JOptionPane.ERROR_MESSAGE,new ImageIcon("c:\minhafoto.png"));        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar categoria!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void ExcluirCategoria(ModeloCategoria mod){
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblcategoria where idCategoria = ?");
            pst.setInt(1, mod.getIdCategoria());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Categoria Excluida!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a categoria!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public ModeloCategoria UltimaInsercao(ModeloCategoria modBusca){
        conecta.conexao();
        
        try {    
            
            //conecta.executaSQL("SELECT max(idCategoria) as idCategoria FROM tblcategoria where nomeCategoria ="+modBusca.getNomeCategoria());
            //conecta.executaSQL("select *from tblcategoria where nomeCategoria='"+modBusca.getNomeCategoria()+"'");            
            conecta.executaSQL("SELECT max(idCategoria) as idCategoria FROM tblcategoria where nomeCategoria='"+modBusca.getNomeCategoria()+"'");
            conecta.rs.first();
            
            modBusca.setIdCategoria(conecta.rs.getInt("idCategoria"));
            
            return modBusca;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar unidade!\nERRO:"+ex);
        }
        
        conecta.desconecta();
        return modBusca;
    }
    
}
