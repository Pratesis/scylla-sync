package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfpckdisc generated by hbm2java
 */
public class Mblfpckdisc  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String gdisc;
     private String pcode;
     private String discpc;
     private String disc1;
     private String disc2;

    public Mblfpckdisc() {
    }

	
    public Mblfpckdisc(BigDecimal id) {
        this.id = id;
    }
    public Mblfpckdisc(BigDecimal id, Date mtgl, String mslsno, String gdisc, String pcode, String discpc, String disc1, String disc2) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.gdisc = gdisc;
       this.pcode = pcode;
       this.discpc = discpc;
       this.disc1 = disc1;
       this.disc2 = disc2;
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
    public String getGdisc() {
        return this.gdisc;
    }
    
    public void setGdisc(String gdisc) {
        this.gdisc = gdisc;
    }
    public String getPcode() {
        return this.pcode;
    }
    
    public void setPcode(String pcode) {
        this.pcode = pcode;
    }
    public String getDiscpc() {
        return this.discpc;
    }
    
    public void setDiscpc(String discpc) {
        this.discpc = discpc;
    }
    public String getDisc1() {
        return this.disc1;
    }
    
    public void setDisc1(String disc1) {
        this.disc1 = disc1;
    }
    public String getDisc2() {
        return this.disc2;
    }
    
    public void setDisc2(String disc2) {
        this.disc2 = disc2;
    }




}


