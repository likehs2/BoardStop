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
public class ModeloUsuario {
    
    private int idUsuario;
    private String usuario;
    private String senha;

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nomeUsuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
