/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloSubCategoria;
import util.ConectaBanco;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class ControleSubCategoria {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloSubCategoria modelo = new ModeloSubCategoria();
    
    public void SalvarSubCategoria(ModeloSubCategoria mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblsubcategoria (nomeSubCategoria) values (?)");
            pst.setString(1, mod.getNomeSubCategoria());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sub-categoria cadastrada com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir sub-categoria!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarSubCategoria(ModeloSubCategoria mod){
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblsubcategoria set nomeSubCategoria = ? where idSubCategoria =?");
            pst.setString(1, mod.getNomeSubCategoria());
            pst.setInt(2, mod.getIdSubCategoria());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sub-categoria atualizada com sucesso!","Editar Sub-categoria",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "texto da caixa","titulo da caixa",JOptionPane.ERROR_MESSAGE,new ImageIcon("c:\minhafoto.png"));        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar sub-categoria!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void ExcluirSubCategoria(ModeloSubCategoria mod){
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblsubcategoria where idSubCategoria = ?");
            pst.setInt(1, mod.getIdSubCategoria());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Sub-categoria Excluida!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a sub-categoria!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public ModeloSubCategoria UltimaInsercao(ModeloSubCategoria modBusca){
        conecta.conexao();
        
        try {    
            
            //conecta.executaSQL("SELECT max(idCategoria) as idCategoria FROM tblcategoria where nomeCategoria ="+modBusca.getNomeCategoria());
            //conecta.executaSQL("select *from tblcategoria where nomeCategoria='"+modBusca.getNomeCategoria()+"'");            
            conecta.executaSQL("SELECT max(idSubCategoria) as idSubCategoria FROM tblsubcategoria where nomeSubCategoria='"+modBusca.getNomeSubCategoria()+"'");
            conecta.rs.first();
            
            modBusca.setIdSubCategoria(conecta.rs.getInt("idSubCategoria"));
            
            return modBusca;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar idSubCategoria!\nERRO:"+ex);
        }
        
        conecta.desconecta();
        return modBusca;
    }
    
}
