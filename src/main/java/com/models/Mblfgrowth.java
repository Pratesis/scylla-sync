package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfgrowth generated by hbm2java
 */
public class Mblfgrowth  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String typeout;
     private String class_;
     private String pcode;
     private BigDecimal growth;

    public Mblfgrowth() {
    }

	
    public Mblfgrowth(BigDecimal id) {
        this.id = id;
    }
    public Mblfgrowth(BigDecimal id, Date mtgl, String mslsno, String typeout, String class_, String pcode, BigDecimal growth) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.typeout = typeout;
       this.class_ = class_;
       this.pcode = pcode;
       this.growth = growth;
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
    public String getTypeout() {
        return this.typeout;
    }
    
    public void setTypeout(String typeout) {
        this.typeout = typeout;
    }
    public String getClass_() {
        return this.class_;
    }
    
    public void setClass_(String class_) {
        this.class_ = class_;
    }
    public String getPcode() {
        return this.pcode;
    }
    
    public void setPcode(String pcode) {
        this.pcode = pcode;
    }
    public BigDecimal getGrowth() {
        return this.growth;
    }
    
    public void setGrowth(BigDecimal growth) {
        this.growth = growth;
    }




}


