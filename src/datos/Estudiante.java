/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author juan_est.fernandez
 */
public class Estudiante extends Base {
    
        private String codigoE;

    public Estudiante() {
    }

    public Estudiante(String codigoE) {
        this.codigoE = codigoE;
    }

    /**
     * Get the value of codigoE
     *
     * @return the value of codigoE
     */
    public String getCodigoE() {
        return codigoE;
    }

    /**
     * Set the value of codigoE
     *
     * @param codigoE new value of codigoE
     */
    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    @Override
    public Base copy() {
        return new Estudiante(codigoE);
    }

    
}
