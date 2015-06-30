package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfdisch generated by hbm2java
 */
public class Mblfdisch  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String kode;
     private String ket;
     private String begdate;
     private String enddate;
     private String flagrange;
     private String flagmult;
     private BigDecimal selllimit;
     private String multkode;
     private BigDecimal multpercent;
     private BigDecimal multvalue;

    public Mblfdisch() {
    }

	
    public Mblfdisch(BigDecimal id) {
        this.id = id;
    }
    public Mblfdisch(BigDecimal id, Date mtgl, String mslsno, String kode, String ket, String begdate, String enddate, String flagrange, String flagmult, BigDecimal selllimit, String multkode, BigDecimal multpercent, BigDecimal multvalue) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.kode = kode;
       this.ket = ket;
       this.begdate = begdate;
       this.enddate = enddate;
       this.flagrange = flagrange;
       this.flagmult = flagmult;
       this.selllimit = selllimit;
       this.multkode = multkode;
       this.multpercent = multpercent;
       this.multvalue = multvalue;
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
    public String getBegdate() {
        return this.begdate;
    }
    
    public void setBegdate(String begdate) {
        this.begdate = begdate;
    }
    public String getEnddate() {
        return this.enddate;
    }
    
    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
    public String getFlagrange() {
        return this.flagrange;
    }
    
    public void setFlagrange(String flagrange) {
        this.flagrange = flagrange;
    }
    public String getFlagmult() {
        return this.flagmult;
    }
    
    public void setFlagmult(String flagmult) {
        this.flagmult = flagmult;
    }
    public BigDecimal getSelllimit() {
        return this.selllimit;
    }
    
    public void setSelllimit(BigDecimal selllimit) {
        this.selllimit = selllimit;
    }
    public String getMultkode() {
        return this.multkode;
    }
    
    public void setMultkode(String multkode) {
        this.multkode = multkode;
    }
    public BigDecimal getMultpercent() {
        return this.multpercent;
    }
    
    public void setMultpercent(BigDecimal multpercent) {
        this.multpercent = multpercent;
    }
    public BigDecimal getMultvalue() {
        return this.multvalue;
    }
    
    public void setMultvalue(BigDecimal multvalue) {
        this.multvalue = multvalue;
    }




}

