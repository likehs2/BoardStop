/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloFornecedor;
import util.ConectaBanco;

/**
 *
 * @author sfcvi
 */
public class ControleBalanco {
    ConectaBanco conecta = new ConectaBanco();
    ModeloFornecedor modelo = new ModeloFornecedor();
    
    public void SalvarFornecedor(ModeloFornecedor mod){
             conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblproduto set saldoProduto =? where idProduto =?");
            pst.setString(1, mod.getNomeFornecedor());
            pst.setString(2, mod.getIdFornecedor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso!","Editar Fornecedor",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "texto da caixa","titulo da caixa",JOptionPane.ERROR_MESSAGE,new ImageIcon("c:\minhafoto.png"));        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarFornecedor(ModeloFornecedor mod){
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblFornecedor set nomeFormecedor =? where idFornecedor =?");
            pst.setString(1, mod.getNomeFornecedor());
            pst.setString(2, mod.getIdFornecedor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso!","Editar Fornecedor",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "texto da caixa","titulo da caixa",JOptionPane.ERROR_MESSAGE,new ImageIcon("c:\minhafoto.png"));        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void ExcluirFornecedor(ModeloFornecedor mod){
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblFornecedor where idFornecedor = ?");
            pst.setString(1, mod.getIdFornecedor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor Excluido!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o fornecedor!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public ModeloFornecedor UltimaInsercao(ModeloFornecedor modBusca){
        conecta.conexao();        
        try { 
            conecta.executaSQL("SELECT max(idFornecedor) as idFornecedor FROM tblFornecedor where nomeFormecedor='"+modBusca.getNomeFornecedor()+"'");
            conecta.rs.first();            
            modBusca.setIdFornecedor(conecta.rs.getString("idFornecedor"));            
            return modBusca;            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto!\nERRO:"+ex);
        }        
        conecta.desconecta();
        return modBusca;
    }
}
