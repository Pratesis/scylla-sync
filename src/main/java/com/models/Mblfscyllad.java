package com.models;
// Generated Jun 17, 2015 12:29:59 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Mblfscyllad generated by hbm2java
 */
public class Mblfscyllad  implements java.io.Serializable {


     private BigDecimal id;
     private String kode;
     private String tgl;
     private String slsno;
     private String distri;
     private String data1;
     private String data2;
     private String data3;

    public Mblfscyllad() {
    }

	
    public Mblfscyllad(BigDecimal id) {
        this.id = id;
    }
    public Mblfscyllad(BigDecimal id, String kode, String tgl, String slsno, String distri, String data1, String data2, String data3) {
       this.id = id;
       this.kode = kode;
       this.tgl = tgl;
       this.slsno = slsno;
       this.distri = distri;
       this.data1 = data1;
       this.data2 = data2;
       this.data3 = data3;
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
    public String getData1() {
        return this.data1;
    }
    
    public void setData1(String data1) {
        this.data1 = data1;
    }
    public String getData2() {
        return this.data2;
    }
    
    public void setData2(String data2) {
        this.data2 = data2;
    }
    public String getData3() {
        return this.data3;
    }
    
    public void setData3(String data3) {
        this.data3 = data3;
    }




}


