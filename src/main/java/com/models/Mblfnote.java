package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfnote generated by hbm2java
 */
public class Mblfnote  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String custno;
     private String xnote;

    public Mblfnote() {
    }

	
    public Mblfnote(BigDecimal id) {
        this.id = id;
    }
    public Mblfnote(BigDecimal id, Date mtgl, String mslsno, String custno, String xnote) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.custno = custno;
       this.xnote = xnote;
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
    public String getCustno() {
        return this.custno;
    }
    
    public void setCustno(String custno) {
        this.custno = custno;
    }
    public String getXnote() {
        return this.xnote;
    }
    
    public void setXnote(String xnote) {
        this.xnote = xnote;
    }




}


