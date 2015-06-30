/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author pratesis
 */
public class MblUpload implements Serializable{
    
        private List<Mblfaktivitas> aktifitas;
	private List<Mblfarcndn> cndn;
	private List<Mblfarretur> aretur;
	private List<Mblfbotol> botol;
	private List<Mblfbrand> brand;
	private List<Mblfcheq> cheq;
	private List<Mblfcustmst> custmst;
	private List<Mblfdiscd5> fdisc5;
	private List<Mblfdiscd6> fdisc6;
	private List<Mblfdisch> fdisch;
	private List<Mblfembtipe> fembtype;
	private List<Mblfgdisc> fgdisc;
	private List<Mblfgharga> gharga;
	private List<Mblfgrowth> fgrowth;
	private List<Mblfgrupout> groupout;
	private List<Mblfinfo> info;
	private List<Mblfkompcust> kompcust;
	private List<Mblfkompetitor> kompetitor;
	private List<Mblfkpl> kpl;
	private List<Mblfmaster> master;
	private List<Mblfnote> note;
	private List<Mblfnotec> notec;
	private List<Mblfpckdisc> pckdisc;
	private List<Mblfpckompt> pckompt;
	private List<Mblfpiutang> piutang;
	private List<Mblfprice> price;
	private List<Mblfpriced> priced;
	private List<Mblfprlin> prlin;
	private List<Mblfreasonb> reasonb;
	private List<Mblfrute> rute;
	private List<Mblfstcust> stcust;
	private List<Mblftarget> target;
	private List<Mblftpr3d1> tpr3d1;
	private List<Mblftpr3d2> tpr3d2;
	private List<Mblftpr3d3> tpr3d3;
	private List<Mblftpr3d6> tpr3d6;
	private List<Mblftpr3h> tpr3h;
	private List<Mblftransfer> transfer;
	private List<Mblftretur> retur;
	private List<Mblftypeout> typeout;
	private List<Mblfvdisinvd> vdisinvd;
	private List<Mblfvdisinvh> vdisinvh;
	private List<Mbltbiaya> tbiaya;

    /**
     * @return the aktifitas
     */
    public List<Mblfaktivitas> getAktifitas() {
        return aktifitas;
    }

    /**
     * @param aktifitas the aktifitas to set
     */
    public void setAktifitas(List<Mblfaktivitas> aktifitas) {
        this.aktifitas = aktifitas;
    }

    /**
     * @return the cndn
     */
    public List<Mblfarcndn> getCndn() {
        return cndn;
    }

    /**
     * @param cndn the cndn to set
     */
    public void setCndn(List<Mblfarcndn> cndn) {
        this.cndn = cndn;
    }

    /**
     * @return the aretur
     */
    public List<Mblfarretur> getAretur() {
        return aretur;
    }

    /**
     * @param aretur the aretur to set
     */
    public void setAretur(List<Mblfarretur> aretur) {
        this.aretur = aretur;
    }

    /**
     * @return the botol
     */
    public List<Mblfbotol> getBotol() {
        return botol;
    }

    /**
     * @param botol the botol to set
     */
    public void setBotol(List<Mblfbotol> botol) {
        this.botol = botol;
    }

    /**
     * @return the brand
     */
    public List<Mblfbrand> getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(List<Mblfbrand> brand) {
        this.brand = brand;
    }

    /**
     * @return the cheq
     */
    public List<Mblfcheq> getCheq() {
        return cheq;
    }

    /**
     * @param cheq the cheq to set
     */
    public void setCheq(List<Mblfcheq> cheq) {
        this.cheq = cheq;
    }

    /**
     * @return the custmst
     */
    public List<Mblfcustmst> getCustmst() {
        return custmst;
    }

    /**
     * @param custmst the custmst to set
     */
    public void setCustmst(List<Mblfcustmst> custmst) {
        this.custmst = custmst;
    }

    /**
     * @return the fdisc5
     */
    public List<Mblfdiscd5> getFdisc5() {
        return fdisc5;
    }

    /**
     * @param fdisc5 the fdisc5 to set
     */
    public void setFdisc5(List<Mblfdiscd5> fdisc5) {
        this.fdisc5 = fdisc5;
    }

    /**
     * @return the fdisc6
     */
    public List<Mblfdiscd6> getFdisc6() {
        return fdisc6;
    }

    /**
     * @param fdisc6 the fdisc6 to set
     */
    public void setFdisc6(List<Mblfdiscd6> fdisc6) {
        this.fdisc6 = fdisc6;
    }

    /**
     * @return the fdisch
     */
    public List<Mblfdisch> getFdisch() {
        return fdisch;
    }

    /**
     * @param fdisch the fdisch to set
     */
    public void setFdisch(List<Mblfdisch> fdisch) {
        this.fdisch = fdisch;
    }

    /**
     * @return the fembtype
     */
    public List<Mblfembtipe> getFembtype() {
        return fembtype;
    }

    /**
     * @param fembtype the fembtype to set
     */
    public void setFembtype(List<Mblfembtipe> fembtype) {
        this.fembtype = fembtype;
    }

    /**
     * @return the fgdisc
     */
    public List<Mblfgdisc> getFgdisc() {
        return fgdisc;
    }

    /**
     * @param fgdisc the fgdisc to set
     */
    public void setFgdisc(List<Mblfgdisc> fgdisc) {
        this.fgdisc = fgdisc;
    }

    /**
     * @return the gharga
     */
    public List<Mblfgharga> getGharga() {
        return gharga;
    }

    /**
     * @param gharga the gharga to set
     */
    public void setGharga(List<Mblfgharga> gharga) {
        this.gharga = gharga;
    }

    /**
     * @return the fgrowth
     */
    public List<Mblfgrowth> getFgrowth() {
        return fgrowth;
    }

    /**
     * @param fgrowth the fgrowth to set
     */
    public void setFgrowth(List<Mblfgrowth> fgrowth) {
        this.fgrowth = fgrowth;
    }

    /**
     * @return the groupout
     */
    public List<Mblfgrupout> getGroupout() {
        return groupout;
    }

    /**
     * @param groupout the groupout to set
     */
    public void setGroupout(List<Mblfgrupout> groupout) {
        this.groupout = groupout;
    }

    /**
     * @return the info
     */
    public List<Mblfinfo> getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(List<Mblfinfo> info) {
        this.info = info;
    }

    /**
     * @return the kompcust
     */
    public List<Mblfkompcust> getKompcust() {
        return kompcust;
    }

    /**
     * @param kompcust the kompcust to set
     */
    public void setKompcust(List<Mblfkompcust> kompcust) {
        this.kompcust = kompcust;
    }

    /**
     * @return the kompetitor
     */
    public List<Mblfkompetitor> getKompetitor() {
        return kompetitor;
    }

    /**
     * @param kompetitor the kompetitor to set
     */
    public void setKompetitor(List<Mblfkompetitor> kompetitor) {
        this.kompetitor = kompetitor;
    }

    /**
     * @return the kpl
     */
    public List<Mblfkpl> getKpl() {
        return kpl;
    }

    /**
     * @param kpl the kpl to set
     */
    public void setKpl(List<Mblfkpl> kpl) {
        this.kpl = kpl;
    }

    /**
     * @return the master
     */
    public List<Mblfmaster> getMaster() {
        return master;
    }

    /**
     * @param master the master to set
     */
    public void setMaster(List<Mblfmaster> master) {
        this.master = master;
    }

    /**
     * @return the note
     */
    public List<Mblfnote> getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(List<Mblfnote> note) {
        this.note = note;
    }

    /**
     * @return the notec
     */
    public List<Mblfnotec> getNotec() {
        return notec;
    }

    /**
     * @param notec the notec to set
     */
    public void setNotec(List<Mblfnotec> notec) {
        this.notec = notec;
    }

    /**
     * @return the pckdisc
     */
    public List<Mblfpckdisc> getPckdisc() {
        return pckdisc;
    }

    /**
     * @param pckdisc the pckdisc to set
     */
    public void setPckdisc(List<Mblfpckdisc> pckdisc) {
        this.pckdisc = pckdisc;
    }

    /**
     * @return the pckompt
     */
    public List<Mblfpckompt> getPckompt() {
        return pckompt;
    }

    /**
     * @param pckompt the pckompt to set
     */
    public void setPckompt(List<Mblfpckompt> pckompt) {
        this.pckompt = pckompt;
    }

    /**
     * @return the piutang
     */
    public List<Mblfpiutang> getPiutang() {
        return piutang;
    }

    /**
     * @param piutang the piutang to set
     */
    public void setPiutang(List<Mblfpiutang> piutang) {
        this.piutang = piutang;
    }

    /**
     * @return the price
     */
    public List<Mblfprice> getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(List<Mblfprice> price) {
        this.price = price;
    }

    /**
     * @return the priced
     */
    public List<Mblfpriced> getPriced() {
        return priced;
    }

    /**
     * @param priced the priced to set
     */
    public void setPriced(List<Mblfpriced> priced) {
        this.priced = priced;
    }

    /**
     * @return the prlin
     */
    public List<Mblfprlin> getPrlin() {
        return prlin;
    }

    /**
     * @param prlin the prlin to set
     */
    public void setPrlin(List<Mblfprlin> prlin) {
        this.prlin = prlin;
    }

    /**
     * @return the reasonb
     */
    public List<Mblfreasonb> getReasonb() {
        return reasonb;
    }

    /**
     * @param reasonb the reasonb to set
     */
    public void setReasonb(List<Mblfreasonb> reasonb) {
        this.reasonb = reasonb;
    }

    /**
     * @return the rute
     */
    public List<Mblfrute> getRute() {
        return rute;
    }

    /**
     * @param rute the rute to set
     */
    public void setRute(List<Mblfrute> rute) {
        this.rute = rute;
    }

    /**
     * @return the stcust
     */
    public List<Mblfstcust> getStcust() {
        return stcust;
    }

    /**
     * @param stcust the stcust to set
     */
    public void setStcust(List<Mblfstcust> stcust) {
        this.stcust = stcust;
    }

    /**
     * @return the target
     */
    public List<Mblftarget> getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(List<Mblftarget> target) {
        this.target = target;
    }

    /**
     * @return the tpr3d1
     */
    public List<Mblftpr3d1> getTpr3d1() {
        return tpr3d1;
    }

    /**
     * @param tpr3d1 the tpr3d1 to set
     */
    public void setTpr3d1(List<Mblftpr3d1> tpr3d1) {
        this.tpr3d1 = tpr3d1;
    }

    /**
     * @return the tpr3d2
     */
    public List<Mblftpr3d2> getTpr3d2() {
        return tpr3d2;
    }

    /**
     * @param tpr3d2 the tpr3d2 to set
     */
    public void setTpr3d2(List<Mblftpr3d2> tpr3d2) {
        this.tpr3d2 = tpr3d2;
    }

    /**
     * @return the tpr3d3
     */
    public List<Mblftpr3d3> getTpr3d3() {
        return tpr3d3;
    }

    /**
     * @param tpr3d3 the tpr3d3 to set
     */
    public void setTpr3d3(List<Mblftpr3d3> tpr3d3) {
        this.tpr3d3 = tpr3d3;
    }

    /**
     * @return the tpr3d6
     */
    public List<Mblftpr3d6> getTpr3d6() {
        return tpr3d6;
    }

    /**
     * @param tpr3d6 the tpr3d6 to set
     */
    public void setTpr3d6(List<Mblftpr3d6> tpr3d6) {
        this.tpr3d6 = tpr3d6;
    }

    /**
     * @return the tpr3h
     */
    public List<Mblftpr3h> getTpr3h() {
        return tpr3h;
    }

    /**
     * @param tpr3h the tpr3h to set
     */
    public void setTpr3h(List<Mblftpr3h> tpr3h) {
        this.tpr3h = tpr3h;
    }

    /**
     * @return the transfer
     */
    public List<Mblftransfer> getTransfer() {
        return transfer;
    }

    /**
     * @param transfer the transfer to set
     */
    public void setTransfer(List<Mblftransfer> transfer) {
        this.transfer = transfer;
    }

    /**
     * @return the retur
     */
    public List<Mblftretur> getRetur() {
        return retur;
    }

    /**
     * @param retur the retur to set
     */
    public void setRetur(List<Mblftretur> retur) {
        this.retur = retur;
    }

    /**
     * @return the typeout
     */
    public List<Mblftypeout> getTypeout() {
        return typeout;
    }

    /**
     * @param typeout the typeout to set
     */
    public void setTypeout(List<Mblftypeout> typeout) {
        this.typeout = typeout;
    }

    /**
     * @return the vdisinvd
     */
    public List<Mblfvdisinvd> getVdisinvd() {
        return vdisinvd;
    }

    /**
     * @param vdisinvd the vdisinvd to set
     */
    public void setVdisinvd(List<Mblfvdisinvd> vdisinvd) {
        this.vdisinvd = vdisinvd;
    }

    /**
     * @return the vdisinvh
     */
    public List<Mblfvdisinvh> getVdisinvh() {
        return vdisinvh;
    }

    /**
     * @param vdisinvh the vdisinvh to set
     */
    public void setVdisinvh(List<Mblfvdisinvh> vdisinvh) {
        this.vdisinvh = vdisinvh;
    }

    /**
     * @return the tbiaya
     */
    public List<Mbltbiaya> getTbiaya() {
        return tbiaya;
    }

    /**
     * @param tbiaya the tbiaya to set
     */
    public void setTbiaya(List<Mbltbiaya> tbiaya) {
        this.tbiaya = tbiaya;
    }

    
        
	
}
