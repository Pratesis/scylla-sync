package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfpckompt generated by hbm2java
 */
public class Mblfpckompt  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String kode;
     private String pcode;
     private String pcodename;

    public Mblfpckompt() {
    }

	
    public Mblfpckompt(BigDecimal id) {
        this.id = id;
    }
    public Mblfpckompt(BigDecimal id, Date mtgl, String mslsno, String kode, String pcode, String pcodename) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.kode = kode;
       this.pcode = pcode;
       this.pcodename = pcodename;
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
    public String getPcodename() {
        return this.pcodename;
    }
    
    public void setPcodename(String pcodename) {
        this.pcodename = pcodename;
    }




}


