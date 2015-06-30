package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mblfpiutang generated by hbm2java
 */
public class Mblfpiutang  implements java.io.Serializable {


     private BigDecimal id;
     private Date mtgl;
     private String mslsno;
     private String custno;
     private String invno;
     private String invdate;
     private String duedate;
     private BigDecimal invamount;
     private BigDecimal amountpaid;
     private String flag;
     private String slsno;
     private String slsname;
     private String notagihan;

    public Mblfpiutang() {
    }

	
    public Mblfpiutang(BigDecimal id) {
        this.id = id;
    }
    public Mblfpiutang(BigDecimal id, Date mtgl, String mslsno, String custno, String invno, String invdate, String duedate, BigDecimal invamount, BigDecimal amountpaid, String flag, String slsno, String slsname, String notagihan) {
       this.id = id;
       this.mtgl = mtgl;
       this.mslsno = mslsno;
       this.custno = custno;
       this.invno = invno;
       this.invdate = invdate;
       this.duedate = duedate;
       this.invamount = invamount;
       this.amountpaid = amountpaid;
       this.flag = flag;
       this.slsno = slsno;
       this.slsname = slsname;
       this.notagihan = notagihan;
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
    public String getInvno() {
        return this.invno;
    }
    
    public void setInvno(String invno) {
        this.invno = invno;
    }
    public String getInvdate() {
        return this.invdate;
    }
    
    public void setInvdate(String invdate) {
        this.invdate = invdate;
    }
    public String getDuedate() {
        return this.duedate;
    }
    
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
    public BigDecimal getInvamount() {
        return this.invamount;
    }
    
    public void setInvamount(BigDecimal invamount) {
        this.invamount = invamount;
    }
    public BigDecimal getAmountpaid() {
        return this.amountpaid;
    }
    
    public void setAmountpaid(BigDecimal amountpaid) {
        this.amountpaid = amountpaid;
    }
    public String getFlag() {
        return this.flag;
    }
    
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getSlsno() {
        return this.slsno;
    }
    
    public void setSlsno(String slsno) {
        this.slsno = slsno;
    }
    public String getSlsname() {
        return this.slsname;
    }
    
    public void setSlsname(String slsname) {
        this.slsname = slsname;
    }
    public String getNotagihan() {
        return this.notagihan;
    }
    
    public void setNotagihan(String notagihan) {
        this.notagihan = notagihan;
    }




}


