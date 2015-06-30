package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfinfo generated by hbm2java
 */
public class Mblfinfo  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String nourut;
     private String data;

    public Mblfinfo() {
    }

	
    public Mblfinfo(BigDecimal id) {
        this.id = id;
    }
    public Mblfinfo(BigDecimal id, Date mtgl, String mslsno, String nourut, String data) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.nourut = nourut;
       this.data = data;
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
    public String getNourut() {
        return this.nourut;
    }
    
    public void setNourut(String nourut) {
        this.nourut = nourut;
    }
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }




}


