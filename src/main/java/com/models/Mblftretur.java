package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblftretur generated by hbm2java
 */
public class Mblftretur  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String kode;
     private String ket;

    public Mblftretur() {
    }

	
    public Mblftretur(BigDecimal id) {
        this.id = id;
    }
    public Mblftretur(BigDecimal id, Date mtgl, String mslsno, String kode, String ket) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.kode = kode;
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
    public String getKode() {
        return this.kode;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKet() {
        return this.ket;
    }
    
    public void setKet(String ket) {
        this.ket = ket;
    }




}


