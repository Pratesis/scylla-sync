package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Mblfscyllah generated by hbm2java
 */
public class Mblfscyllah  implements java.io.Serializable {


     private BigDecimal id;
     private String kode;
     private String tgl;
     private String slsno;
     private String distri;
     private String status;
     private String stprs;

    public Mblfscyllah() {
    }

	
    public Mblfscyllah(BigDecimal id) {
        this.id = id;
    }
    public Mblfscyllah(BigDecimal id, String kode, String tgl, String slsno, String distri, String status, String stprs) {
       this.id = id;
       this.kode = kode;
       this.tgl = tgl;
       this.slsno = slsno;
       this.distri = distri;
       this.status = status;
       this.stprs = stprs;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getKode() {
        return this.kode;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getTgl() {
        return this.tgl;
    }
    
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
    public String getSlsno() {
        return this.slsno;
    }
    
    public void setSlsno(String slsno) {
        this.slsno = slsno;
    }
    public String getDistri() {
        return this.distri;
    }
    
    public void setDistri(String distri) {
        this.distri = distri;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStprs() {
        return this.stprs;
    }
    
    public void setStprs(String stprs) {
        this.stprs = stprs;
    }




}

