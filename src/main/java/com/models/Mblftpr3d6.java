package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblftpr3d6 generated by hbm2java
 */
public class Mblftpr3d6  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String kode;
     private String pcode;
     private BigDecimal minrp;
     private BigDecimal minqty;
     private String xminqty;
     private String flagada;

    public Mblftpr3d6() {
    }

	
    public Mblftpr3d6(BigDecimal id) {
        this.id = id;
    }
    public Mblftpr3d6(BigDecimal id, Date mtgl, String mslsno, String kode, String pcode, BigDecimal minrp, BigDecimal minqty, String xminqty, String flagada) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.kode = kode;
       this.pcode = pcode;
       this.minrp = minrp;
       this.minqty = minqty;
       this.xminqty = xminqty;
       this.flagada = flagada;
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
    public String getPcode() {
        return this.pcode;
    }
    
    public void setPcode(String pcode) {
        this.pcode = pcode;
    }
    public BigDecimal getMinrp() {
        return this.minrp;
    }
    
    public void setMinrp(BigDecimal minrp) {
        this.minrp = minrp;
    }
    public BigDecimal getMinqty() {
        return this.minqty;
    }
    
    public void setMinqty(BigDecimal minqty) {
        this.minqty = minqty;
    }
    public String getXminqty() {
        return this.xminqty;
    }
    
    public void setXminqty(String xminqty) {
        this.xminqty = xminqty;
    }
    public String getFlagada() {
        return this.flagada;
    }
    
    public void setFlagada(String flagada) {
        this.flagada = flagada;
    }




}


