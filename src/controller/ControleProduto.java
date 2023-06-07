/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloProduto;
import util.ConectaBanco;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class ControleProduto {
    
    ConectaBanco conecta = new ConectaBanco();
    ModeloProduto modelo = new ModeloProduto();
    
    public void SalvarProduto(ModeloProduto mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into tblProduto (descricaoProduto,unidadeProduto,codBarrasProduto,saldoMinimoProduto,marcaProduto,categoriaProduto,subCategoriaProduto,dataCadastroProduto,usuarioCadastroProduto,ativoProduto,tipoProduto,custoPraticadoProduto,margemProduto,vendaVendaProduto,fabricante,saldoProduto) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getDescricaoProduto());            
            pst.setString(2, mod.getUnidadeProduto());
            pst.setString(3, mod.getCodBarrasProduto());
            pst.setDouble(4, mod.getSaldoMinimoProduto());
            pst.setInt(5, mod.getMarcaProduto());
            pst.setInt(6, mod.getCategoriaProduto());
            pst.setInt(7, mod.getSubCategoriaProduto());
            pst.setString(8, mod.getDataCadastroProduto());
            pst.setString(9, mod.getUsuarioCadastroProduto());
            pst.setBoolean(10,mod.isAtivoProduto());
            pst.setString(11, mod.getTipoProduto());
            pst.setDouble(12, mod.getCustoPraticadoProduto());
            pst.setDouble(13, mod.getMargemProduto());
            pst.setDouble(14, mod.getValorVendaProduto());
            pst.setString(15, mod.getFabricante());
            pst.setDouble(16, mod.getSaldoProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto cadatrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarProduto(ModeloProduto mod){
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblProduto set descricaoProduto =?,unidadeProduto= ?,codBarrasProduto=?,saldoMinimoProduto=?,marcaProduto=?,categoriaProduto= ?,subCategoriaProduto= ?,dataAlteracaoProduto= ?,usuarioAlteracaoProduto= ?,ativoProduto= ?,tipoProduto= ?,custoPraticadoProduto= ?,margemProduto= ?,vendaVendaProduto= ? ,saldoProduto= ? where idProduto =?");
            pst.setString(1, mod.getDescricaoProduto());
            pst.setString(2, mod.getUnidadeProduto());
            pst.setString(3,mod.getCodBarrasProduto());
            pst.setDouble(4, mod.getSaldoMinimoProduto());
            pst.setInt(5, mod.getMarcaProduto());
            pst.setInt(6, mod.getCategoriaProduto());
            pst.setInt(7, mod.getSubCategoriaProduto());
            pst.setString(8, mod.getDataAlteracaoProduto());
            pst.setString(9, mod.getUsuarioAlteracaoProduto());
            pst.setBoolean(10, mod.isAtivoProduto());
            pst.setString(11, mod.getTipoProduto());
            pst.setDouble(12, mod.getCustoPraticadoProduto());
            pst.setDouble(13, mod.getMargemProduto());
            pst.setDouble(14, mod.getValorVendaProduto());
            pst.setDouble(15, mod.getSaldoProduto());
            pst.setInt(16, mod.getIdProduto());
            pst.execute();
            System.out.println(mod.getDescricaoProduto() 
                    + mod.getUnidadeProduto() 
                    + mod.getCodBarrasProduto() 
                    + mod.getSaldoMinimoProduto() 
                    + mod.getMarcaProduto() 
                    + mod.getCategoriaProduto() 
                    + mod.getSubCategoriaProduto() 
                    + mod.getDataAlteracaoProduto() 
                    + mod.getUsuarioAlteracaoProduto() 
                    + mod.isAtivoProduto() 
                    + mod.getTipoProduto()
                    + mod.getCustoPraticadoProduto() 
                    + mod.getMargemProduto() 
                    + mod.getValorVendaProduto() 
                    + mod.getIdProduto());
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!","Editar Produto",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "texto da caixa","titulo da caixa",JOptionPane.ERROR_MESSAGE,new ImageIcon("c:\minhafoto.png"));        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void EditarBalancoProduto(ModeloProduto mod){
        conecta.conexao();
        try{
            PreparedStatement pst = conecta.conn.prepareStatement("update tblProduto set saldoProduto=? where idProduto =?");
            pst.setDouble(1, mod.getSaldoProduto());
            pst.setInt(2, mod.getIdProduto());
            pst.execute();
            System.out.println(mod.getSaldoProduto());
            System.out.println(mod.getIdProduto());
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!","Editar Produto",JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "texto da caixa","titulo da caixa",JOptionPane.ERROR_MESSAGE,new ImageIcon("c:\minhafoto.png"));        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public void ExcluirProduto(ModeloProduto mod){
        conecta.conexao();
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from tblProduto where idProduto = ?");
            pst.setInt(1, mod.getIdProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto Excluido!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o produto!\nERRO:" + ex);
        }
        conecta.desconecta();
    }
    
    public ModeloProduto UltimaInsercao(ModeloProduto modBusca){
        conecta.conexao();        
        try { 
            conecta.executaSQL("SELECT max(idProduto) as idProduto FROM tblproduto where descricaoProduto='"+modBusca.getDescricaoProduto()+"'");
            conecta.rs.first();            
            modBusca.setIdProduto(conecta.rs.getInt("idProduto"));            
            return modBusca;            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto!\nERRO:"+ex);
        }        
        conecta.desconecta();
        return modBusca;
    }
    
}
