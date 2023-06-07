/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class ModeloProduto {

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * @return the unidadeProduto
     */
    public String getUnidadeProduto() {
        return unidadeProduto;
    }

    /**
     * @param unidadeProduto the unidadeProduto to set
     */
    public void setUnidadeProduto(String unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    /**
     * @return the codBarrasProduto
     */
    public String getCodBarrasProduto() {
        return codBarrasProduto;
    }

    /**
     * @param codBarrasProduto the codBarrasProduto to set
     */
    public void setCodBarrasProduto(String codBarrasProduto) {
        this.codBarrasProduto = codBarrasProduto;
    }

    /**
     * @return the saldoMinimoProduto
     */
    public double getSaldoMinimoProduto() {
        return saldoMinimoProduto;
    }

    /**
     * @param saldoMinimoProduto the saldoMinimoProduto to set
     */
    public void setSaldoMinimoProduto(double saldoMinimoProduto) {
        this.saldoMinimoProduto = saldoMinimoProduto;
    }

    /**
     * @return the marcaProduto
     */
    public int getMarcaProduto() {
        return marcaProduto;
    }

    /**
     * @param marcaProduto the marcaProduto to set
     */
    public void setMarcaProduto(int marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    /**
     * @return the categoriaProduto
     */
    public int getCategoriaProduto() {
        return categoriaProduto;
    }

    /**
     * @param categoriaProduto the categoriaProduto to set
     */
    public void setCategoriaProduto(int categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    /**
     * @return the subCategoriaProduto
     */
    public int getSubCategoriaProduto() {
        return subCategoriaProduto;
    }

    /**
     * @param subCategoriaProduto the subCategoriaProduto to set
     */
    public void setSubCategoriaProduto(int subCategoriaProduto) {
        this.subCategoriaProduto = subCategoriaProduto;
    }

    /**
     * @return the dataCadastroProduto
     */
    public String getDataCadastroProduto() {
        return dataCadastroProduto;
    }

    /**
     * @param dataCadastroProduto the dataCadastroProduto to set
     */
    public void setDataCadastroProduto(String dataCadastroProduto) {
        this.dataCadastroProduto = dataCadastroProduto;
    }

    /**
     * @return the usuarioCadastroProduto
     */
    public String getUsuarioCadastroProduto() {
        return usuarioCadastroProduto;
    }

    /**
     * @param usuarioCadastroProduto the usuarioCadastroProduto to set
     */
    public void setUsuarioCadastroProduto(String usuarioCadastroProduto) {
        this.usuarioCadastroProduto = usuarioCadastroProduto;
    }

    /**
     * @return the dataAlteracaoProduto
     */
    public String getDataAlteracaoProduto() {
        return dataAlteracaoProduto;
    }

    /**
     * @param dataAlteracaoProduto the dataAlteracaoProduto to set
     */
    public void setDataAlteracaoProduto(String dataAlteracaoProduto) {
        this.dataAlteracaoProduto = dataAlteracaoProduto;
    }

    /**
     * @return the usuarioAlteracaoProduto
     */
    public String getUsuarioAlteracaoProduto() {
        return usuarioAlteracaoProduto;
    }

    /**
     * @param usuarioAlteracaoProduto the usuarioAlteracaoProduto to set
     */
    public void setUsuarioAlteracaoProduto(String usuarioAlteracaoProduto) {
        this.usuarioAlteracaoProduto = usuarioAlteracaoProduto;
    }

    /**
     * @return the ativoProduto
     */
    public boolean isAtivoProduto() {
        return ativoProduto;
    }

    /**
     * @param ativoProduto the ativoProduto to set
     */
    public void setAtivoProduto(boolean ativoProduto) {
        this.ativoProduto = ativoProduto;
    }

    /**
     * @return the tipoProduto
     */
    public String getTipoProduto() {
        return tipoProduto;
    }

    /**
     * @param tipoProduto the tipoProduto to set
     */
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    private int idProduto;
    private String descricaoProduto;
    private String unidadeProduto;
    private String codBarrasProduto;
    private double saldoMinimoProduto;
    private int marcaProduto;
    private int categoriaProduto;
    private int subCategoriaProduto;
    private String dataCadastroProduto;
    private String usuarioCadastroProduto;
    private String dataAlteracaoProduto;
    private String usuarioAlteracaoProduto;
    private boolean ativoProduto;
    private String tipoProduto;
    protected String Fabricante;
    
    private double custoPraticadoProduto;
    private double margemProduto;
    private double valorVendaProduto;
    protected double saldoProduto;

    /**
     * @return the custoPraticadoProduto
     */
    public double getCustoPraticadoProduto() {
        return custoPraticadoProduto;
    }

    /**
     * @param custoPraticadoProduto the custoPraticadoProduto to set
     */
    public void setCustoPraticadoProduto(double custoPraticadoProduto) {
        this.custoPraticadoProduto = custoPraticadoProduto;
    }

    /**
     * @return the margemProduto
     */
    public double getMargemProduto() {
        return margemProduto;
    }

    /**
     * @param margemProduto the margemProduto to set
     */
    public void setMargemProduto(double margemProduto) {
        this.margemProduto = margemProduto;
    }

    /**
     * @return the valorVendaProduto
     */
    public double getValorVendaProduto() {
        return valorVendaProduto;
    }

    /**
     * @param valorVendaProduto the valorVendaProduto to set
     */
    public void setValorVendaProduto(double valorVendaProduto) {
        this.valorVendaProduto = valorVendaProduto;
    }

    /**
     * @return the Fabricante
     */
    public String getFabricante() {
        return Fabricante;
    }

    /**
     * @param Fabricante the Fabricante to set
     */
    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    /**
     * @return the saldoProduto
     */
    public double getSaldoProduto() {
        return saldoProduto;
    }

    /**
     * @param saldoProduto the saldoProduto to set
     */
    public void setSaldoProduto(double saldoProduto) {
        this.saldoProduto = saldoProduto;
    }
    
    
    
    
}
