package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfgharga generated by hbm2java
 */
public class Mblfgharga  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String gharga;
     private String ket;

    public Mblfgharga() {
    }

	
    public Mblfgharga(BigDecimal id) {
        this.id = id;
    }
    public Mblfgharga(BigDecimal id, Date mtgl, String mslsno, String gharga, String ket) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.gharga = gharga;
       this.ket = ket;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Date getMtgl() {
        return this.mtgl;
    }
    
    public void setMtgl(Date mtgl) {
        this.mtgl = mtgl;
    }
    public String getMslsno() {
        return this.mslsno;
    }
    
    public void setMslsno(String mslsno) {
        this.mslsno = mslsno;
    }
    public String getGharga() {
        return this.gharga;
    }
    
    public void setGharga(String gharga) {
        this.gharga = gharga;
    }
    public String getKet() {
        return this.ket;
    }
    
    public void setKet(String ket) {
        this.ket = ket;
    }




}


