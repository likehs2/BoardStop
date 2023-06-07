/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class CriarTabelas {
    
    ConectaBanco conecta = new ConectaBanco();
    
    public void OnCreateOnUpdateCategoria(){
         conecta.conexao();         
                 
         String sqlCategoria = "CREATE TABLE IF NOT EXISTS  `BoardStop`.`tblcategoria` (\n" +
                        "  `idCategoria` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" +
                        "  `nomeCategoria` varchar(20) DEFAULT NULL,\n" +
                        "  PRIMARY KEY (`idCategoria`)\n" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;";
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement(sqlCategoria);
            
            pst.execute();
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Banco de dados atualizado com sucesso!!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar banco de dados!\nERRO:" + ex);
        } 
     }
    
    public void OnCreateOnUpdateUsuario(){
         conecta.conexao();         
                 
         String sqlUsuario = "CREATE TABLE IF NOT EXISTS  `BoardStop`.`tblusuario` (\n" +
                        "  `idUsuario` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" +
                        "  `nomeUsuario` varchar(20) DEFAULT NULL,\n" +
                        "  `senhaUsuario` varchar(20) DEFAULT NULL,\n" +
                        "  `loginUsuario` varchar(20) DEFAULT NULL,\n" +
                        "  PRIMARY KEY (`idUsuario`)\n" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;";
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement(sqlUsuario);
            
            pst.execute();
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Banco de dados atualizado com sucesso!!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar banco de dados!\nERRO:" + ex);
        } 
     }
    
    public void OnCreateOnUpdateSubCategoria(){
         conecta.conexao();         
                 
         String sqlSubCategoria = "CREATE TABLE IF NOT EXISTS  `BoardStop`.`tblSubcategoria` (\n" +
                        "  `idSubCategoria` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" +
                        "  `nomeSubCategoria` varchar(20) DEFAULT NULL,\n" +
                        "  PRIMARY KEY (`idSubCategoria`)\n" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;";
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement(sqlSubCategoria);
            
            pst.execute();
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Banco de dados atualizado com sucesso!!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar banco de dados!\nERRO:" + ex);
        } 
     }
    
    public void OnCreateOnUpdateProduto(){
         conecta.conexao();         
                 
         String sqlProduto = "CREATE TABLE IF NOT EXISTS `BoardStop`.`tblProduto` (\n" +
         " `idProduto` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" + 
         "  `descricaoProduto` varchar(20) DEFAULT NULL,\n" +
         "  `unidadeProduto` varchar(20) DEFAULT NULL,\n" +
         "  `codBarrasProduto` varchar(20) DEFAULT NULL,\n" +
         "  `saldoMinimoProduto` double DEFAULT NULL,\n" +
         "  `saldoProduto` double DEFAULT NULL,\n" +
         "  `marcaProduto` int(10) unsigned DEFAULT NULL,\n" +
         "  `categoriaProduto` int(10) unsigned DEFAULT NULL,\n" +
         "  `subCategoriaProduto` int(10) unsigned DEFAULT NULL,\n" +
         "  `dataCadastroProduto` varchar(20) DEFAULT NULL,\n" +
         "  `usuarioCadastroProduto` varchar(20) DEFAULT NULL,\n" +
         "  `dataAlteracaoProduto` varchar(20) DEFAULT NULL,\n" +
         "  `usuarioAlteracaoProduto` varchar(20) DEFAULT NULL,\n" +
         "  `ativoProduto` tinyint(1) DEFAULT NULL,\n" +
         "  `tipoProduto` varchar(10) DEFAULT NULL,\n" +
         "  `custoPraticadoProduto` double DEFAULT NULL,\n" +
         "  `margemProduto` double DEFAULT NULL,\n" +
         "  `vendaVendaProduto` double DEFAULT NULL,\n" + 
         "  PRIMARY KEY (`idProduto`)\n" +
         ") ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;";         
               
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement(sqlProduto);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Banco de dados atualizado com sucesso!!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar banco de dados!\nERRO:" + ex);
        } 
     }
    
    public void OnCreateOnUpdateMarca(){
         conecta.conexao();         
                 
         String sqlMarca = "CREATE TABLE IF NOT EXISTS  `BoardStop`.`tblmarca` (\n" +
                        "  `idMarca` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" +
                        "  `nomeMarca` varchar(20) DEFAULT NULL,\n" +
                        "  PRIMARY KEY (`idMarca`)\n" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;";
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement(sqlMarca);
            
            pst.execute();
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Banco de dados atualizado com sucesso!!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar banco de dados!\nERRO:" + ex);
        } 
     }
    
    public void OnCreateOnUpdateParticipante(){
        conecta.conexao();
        
        String sqlParticipante = "CREATE TABLE IF NOT EXISTS `BoardStop`.`tblparticipante` (\n" +
                "  `idParticipante` int(10) unsigned NOT NULL AUTO_INCREMENT,\n" +
                "  `nomeParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `cpfCnpjParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `enderecoParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `numeroParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `bairroParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `cidadeParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `ufParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `ieRgParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `telefoneParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `celular1Participante` varchar(20) DEFAULT NULL,\n" +
                "  `celular2Participante` varchar(20) DEFAULT NULL,\n" +
                "  `emailParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `dataCadParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `dataAltParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `userCadParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `userAltParticipante` varchar(20) DEFAULT NULL,\n" +
                "  `ativoParticipante` tinyint(1) DEFAULT NULL,\n" +
                "  `clienteParticipante` tinyint(1) DEFAULT NULL,\n" +
                "  `vendedorParticipante` tinyint(1) DEFAULT NULL,\n" +
                "  `fornecedorParticipante` tinyint(1) DEFAULT NULL,\n" +
                "  `transportadoraParticipante` tinyint(1) DEFAULT NULL,\n" +                
                "  PRIMARY KEY (`idParticipante`)\n" +
                ") ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;";
        
        try{            
            PreparedStatement pst = conecta.conn.prepareStatement(sqlParticipante);
            
            pst.execute();
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Banco de dados atualizado com sucesso!!");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar banco de dados!\nERRO:" + ex);
        } 
                
    }
    
}
