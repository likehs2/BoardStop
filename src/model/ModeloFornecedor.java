/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sfcvi
 */
public class ModeloFornecedor {
    protected String IdFornecedor;
    protected String NomeFornecedor;

    /**
     * @return the IdFornecedor
     */
    public String getIdFornecedor() {
        return IdFornecedor;
    }

    /**
     * @param IdFornecedor the IdFornecedor to set
     */
    public void setIdFornecedor(String IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
    }

    /**
     * @return the NomeFornecedor
     */
    public String getNomeFornecedor() {
        return NomeFornecedor;
    }

    /**
     * @param NomeFornecedor the NomeFornecedor to set
     */
    public void setNomeFornecedor(String NomeFornecedor) {
        this.NomeFornecedor = NomeFornecedor;
    }
}
