package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfkpl generated by hbm2java
 */
public class Mblfkpl  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String custno;
     private String pcode;
     private String flag;
     private BigDecimal data5;
     private BigDecimal data6;
     private BigDecimal data7;
     private BigDecimal lastcall1;
     private BigDecimal lastcall2;
     private BigDecimal lastcall3;
     private BigDecimal lastcall4;
     private BigDecimal lastsls1;
     private BigDecimal lastsls2;
     private BigDecimal lastsls3;
     private BigDecimal lastsls4;
     private BigDecimal beli;

    public Mblfkpl() {
    }

	
    public Mblfkpl(BigDecimal id) {
        this.id = id;
    }
    public Mblfkpl(BigDecimal id, Date mtgl, String mslsno, String custno, String pcode, String flag, BigDecimal data5, BigDecimal data6, BigDecimal data7, BigDecimal lastcall1, BigDecimal lastcall2, BigDecimal lastcall3, BigDecimal lastcall4, BigDecimal lastsls1, BigDecimal lastsls2, BigDecimal lastsls3, BigDecimal lastsls4, BigDecimal beli) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.custno = custno;
       this.pcode = pcode;
       this.flag = flag;
       this.data5 = data5;
       this.data6 = data6;
       this.data7 = data7;
       this.lastcall1 = lastcall1;
       this.lastcall2 = lastcall2;
       this.lastcall3 = lastcall3;
       this.lastcall4 = lastcall4;
       this.lastsls1 = lastsls1;
       this.lastsls2 = lastsls2;
       this.lastsls3 = lastsls3;
       this.lastsls4 = lastsls4;
       this.beli = beli;
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
    public String getPcode() {
        return this.pcode;
    }
    
    public void setPcode(String pcode) {
        this.pcode = pcode;
    }
    public String getFlag() {
        return this.flag;
    }
    
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public BigDecimal getData5() {
        return this.data5;
    }
    
    public void setData5(BigDecimal data5) {
        this.data5 = data5;
    }
    public BigDecimal getData6() {
        return this.data6;
    }
    
    public void setData6(BigDecimal data6) {
        this.data6 = data6;
    }
    public BigDecimal getData7() {
        return this.data7;
    }
    
    public void setData7(BigDecimal data7) {
        this.data7 = data7;
    }
    public BigDecimal getLastcall1() {
        return this.lastcall1;
    }
    
    public void setLastcall1(BigDecimal lastcall1) {
        this.lastcall1 = lastcall1;
    }
    public BigDecimal getLastcall2() {
        return this.lastcall2;
    }
    
    public void setLastcall2(BigDecimal lastcall2) {
        this.lastcall2 = lastcall2;
    }
    public BigDecimal getLastcall3() {
        return this.lastcall3;
    }
    
    public void setLastcall3(BigDecimal lastcall3) {
        this.lastcall3 = lastcall3;
    }
    public BigDecimal getLastcall4() {
        return this.lastcall4;
    }
    
    public void setLastcall4(BigDecimal lastcall4) {
        this.lastcall4 = lastcall4;
    }
    public BigDecimal getLastsls1() {
        return this.lastsls1;
    }
    
    public void setLastsls1(BigDecimal lastsls1) {
        this.lastsls1 = lastsls1;
    }
    public BigDecimal getLastsls2() {
        return this.lastsls2;
    }
    
    public void setLastsls2(BigDecimal lastsls2) {
        this.lastsls2 = lastsls2;
    }
    public BigDecimal getLastsls3() {
        return this.lastsls3;
    }
    
    public void setLastsls3(BigDecimal lastsls3) {
        this.lastsls3 = lastsls3;
    }
    public BigDecimal getLastsls4() {
        return this.lastsls4;
    }
    
    public void setLastsls4(BigDecimal lastsls4) {
        this.lastsls4 = lastsls4;
    }
    public BigDecimal getBeli() {
        return this.beli;
    }
    
    public void setBeli(BigDecimal beli) {
        this.beli = beli;
    }




}


