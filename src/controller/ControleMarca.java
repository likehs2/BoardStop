/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloMarca;
import util.ConectaBanco;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class ControleMarca {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloMarca modelo = new ModeloMarca();
    
    public void SalvarMarca(ModeloMarca mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblmarca (nomeMarca) values (?)");
            pst.setString(1, mod.getNomeMarca());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Marca cadastrada com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir marca!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarMarca(ModeloMarca mod){
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblmarca set nomeMarca = ? where idMarca =?");
            pst.setString(1, mod.getNomeMarca());
            pst.setInt(2, mod.getIdMarca());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Marca atualizada com sucesso!","Editar Marca",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "texto da caixa","titulo da caixa",JOptionPane.ERROR_MESSAGE,new ImageIcon("c:\minhafoto.png"));        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar marca!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void ExcluirMarca(ModeloMarca mod){
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblmarca where idMarca = ?");
            pst.setInt(1, mod.getIdMarca());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Marca Excluida!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a marca!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public ModeloMarca UltimaInsercao(ModeloMarca modBusca){
        conecta.conexao();
        
        try {    
            
            //conecta.executaSQL("SELECT max(idCategoria) as idCategoria FROM tblcategoria where nomeCategoria ="+modBusca.getNomeCategoria());
            //conecta.executaSQL("select *from tblcategoria where nomeCategoria='"+modBusca.getNomeCategoria()+"'");            
            conecta.executaSQL("SELECT max(idMarca) as idMarca FROM tblmarca where nomeMarca='"+modBusca.getNomeMarca()+"'");
            conecta.rs.first();
            
            modBusca.setIdMarca(conecta.rs.getInt("idMarca"));
            
            return modBusca;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar marca!\nERRO:"+ex);
        }
        
        conecta.desconecta();
        return modBusca;
    }
    
}
