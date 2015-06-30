/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pratesis.scyllasync;

import com.form.frmSync;
import com.google.gson.Gson;
import com.models.MblUpload;
import com.models.Mblfaktivitas;
import com.models.Mblfarcndn;
import com.models.Mblfarretur;
import com.models.Mblfbotol;
import com.models.Mblfbrand;
import com.models.Mblfcheq;
import com.models.Mblfcustmst;
import com.models.Mblfdiscd5;
import com.models.Mblfdiscd6;
import com.models.Mblfdisch;
import com.models.Mblfembtipe;
import com.models.Mblfgdisc;
import com.models.Mblfgharga;
import com.models.Mblfgrowth;
import com.models.Mblfgrupout;
import com.models.Mblfinfo;
import com.models.Mblfkompcust;
import com.models.Mblfkompetitor;
import com.models.Mblfkpl;
import com.models.Mblfmaster;
import com.models.Mblfnote;
import com.models.Mblfnotec;
import com.models.Mblfparam;
import com.models.Mblfpckdisc;
import com.models.Mblfpckompt;
import com.models.Mblfpiutang;
import com.models.Mblfprice;
import com.models.Mblfpriced;
import com.models.Mblfprlin;
import com.models.Mblfreasonb;
import com.models.Mblfrute;
import com.models.Mblfstcust;
import com.models.Mblftarget;
import com.models.Mblftpr3d1;
import com.models.Mblftpr3d3;
import com.models.Mblftpr3d6;
import com.models.Mblftpr3h;
import com.models.Mblftransfer;
import com.models.Mblftretur;
import com.models.Mblftypeout;
import com.models.Mblfvdisinvd;
import com.models.Mblfvdisinvh;
import com.models.Mbltbiaya;
import com.models.Person;
import com.services.RestClient;
import com.utils.HibernateUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import static javafx.scene.input.KeyCode.T;
import org.hibernate.Query;
import org.hibernate.Session;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 *
 * @author pratesis
 */
public class MainActivity {

    /**
     * @param args the command line arguments
     */
    
     public static ArrayList<Mblfaktivitas>  removeDuplicate(List <Mblfaktivitas> list) {
    HashSet <Mblfaktivitas> h = new HashSet<Mblfaktivitas>(list);
    list.clear();
    list.addAll(h);
    ArrayList<Mblfaktivitas> result = new ArrayList<>();
    result.addAll(list);
    return result;
  }
     
    public static void main(String[] args) {
       // new frmSync().setVisible(true);
        
      
            MblUpload upload = new MblUpload();
            Gson gson = new Gson();
            Session session = HibernateUtil.getSessionFactory().openSession();
            
		try {
			Query query = session.createQuery("from Mblfaktivitas");
			
                        if(query.list().size()>0){
                            upload.setAktifitas(removeDuplicate((ArrayList<Mblfaktivitas>) query.list()));
                        }
                        
                        query = session.createQuery("from Mblfarcndn");
			
                        if(query.list().size()>0){
                            upload.setCndn((List<Mblfarcndn>) query.list());
                        }
                        
//                        query = session.createQuery("from Mblfmaster");
//			
//                        if(query.list().size()>0){
//                            upload.setMaster((List<Mblfmaster>) query.list());
//                        }
//                        
//                        
//                        
//                        query = session.createQuery("from Mblfarretur");
//			
//                        if(query.list().size()>0){
//                            upload.setAretur((List<Mblfarretur>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfbotol");
//			
//                        if(query.list().size()>0){
//                            upload.setBotol((List<Mblfbotol>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfbrand");
//			
//                        if(query.list().size()>0){
//                            upload.setBrand((List<Mblfbrand>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfcheq");
//			
//                        if(query.list().size()>0){
//                            upload.setCheq((List<Mblfcheq>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfcustmst");
//			
//                        if(query.list().size()>0){
//                            upload.setCustmst((List<Mblfcustmst>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfdiscd5");
//			
//                        if(query.list().size()>0){
//                            upload.setFdisc5((List<Mblfdiscd5>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfdiscd6");
//			
//                        if(query.list().size()>0){
//                            upload.setFdisc6((List<Mblfdiscd6>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfdisch");
//			
//                        if(query.list().size()>0){
//                            upload.setFdisch((List<Mblfdisch>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfembtipe");
//			
//                        if(query.list().size()>0){
//                            upload.setFembtype((List<Mblfembtipe>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfgdisc");
//			
//                        if(query.list().size()>0){
//                            upload.setFgdisc((List<Mblfgdisc>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfgharga");
//			
//                        if(query.list().size()>0){
//                            upload.setGharga((List<Mblfgharga>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfgrowth");
//			
//                        if(query.list().size()>0){
//                            upload.setFgrowth((List<Mblfgrowth>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfgrupout");
//			
//                        if(query.list().size()>0){
//                            upload.setGroupout((List<Mblfgrupout>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfinfo");
//			
//                        if(query.list().size()>0){
//                            upload.setInfo((List<Mblfinfo>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfkompcust");
//			
//                        if(query.list().size()>0){
//                            upload.setKompcust((List<Mblfkompcust>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfkompetitor");
//			
//                        if(query.list().size()>0){
//                            upload.setKompetitor((List<Mblfkompetitor>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfkpl");
//			
//                        if(query.list().size()>0){
//                            upload.setKpl((List<Mblfkpl>) query.list());
//                        }
//                        
//                        
//                        query = session.createQuery("from Mblfmaster");
//			
//                        if(query.list().size()>0){
//                            upload.setMaster((List<Mblfmaster>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfnote");
//			
//                        if(query.list().size()>0){
//                            upload.setNote((List<Mblfnote>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfnotec");
//			
//                        if(query.list().size()>0){
//                            upload.setNotec((List<Mblfnotec>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfpckdisc");
//			
//                        if(query.list().size()>0){
//                            upload.setPckdisc((List<Mblfpckdisc>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfpckompt");
//			
//                        if(query.list().size()>0){
//                            upload.setPckompt((List<Mblfpckompt>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfpiutang");
//			
//                        if(query.list().size()>0){
//                            upload.setPiutang((List<Mblfpiutang>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfprice");
//			
//                        if(query.list().size()>0){
//                            upload.setPrice((List<Mblfprice>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfpriced");
//			
//                        if(query.list().size()>0){
//                            upload.setPriced((List<Mblfpriced>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfprlin");
//			
//                        if(query.list().size()>0){
//                            upload.setPrlin((List<Mblfprlin>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfreasonb");
//			
//                        if(query.list().size()>0){
//                            upload.setReasonb((List<Mblfreasonb>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfrute");
//			
//                        if(query.list().size()>0){
//                            upload.setRute((List<Mblfrute>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfstcust");
//			
//                        if(query.list().size()>0){
//                            upload.setStcust((List<Mblfstcust>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblftarget");
//			
//                        if(query.list().size()>0){
//                            upload.setTarget((List<Mblftarget>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblftpr3d1");
//			
//                        if(query.list().size()>0){
//                            upload.setTpr3d1((List<Mblftpr3d1>) query.list());
//                        }
//                        
//                       
//                        query = session.createQuery("from Mblftpr3d3");
//			
//                        if(query.list().size()>0){
//                            upload.setTpr3d3((List<Mblftpr3d3>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblftpr3d6");
//			
//                        if(query.list().size()>0){
//                            upload.setTpr3d6((List<Mblftpr3d6>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblftpr3h");
//			
//                        if(query.list().size()>0){
//                            upload.setTpr3h((List<Mblftpr3h>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblftransfer");
//			
//                        if(query.list().size()>0){
//                            upload.setTransfer((List<Mblftransfer>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblftretur");
//			
//                        if(query.list().size()>0){
//                            upload.setRetur((List<Mblftretur>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblftypeout");
//			
//                        if(query.list().size()>0){
//                            upload.setTypeout((List<Mblftypeout>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfvdisinvd");
//			
//                        if(query.list().size()>0){
//                            upload.setVdisinvd((List<Mblfvdisinvd>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mblfvdisinvh");
//			
//                        if(query.list().size()>0){
//                            upload.setVdisinvh((List<Mblfvdisinvh>) query.list());
//                        }
//                        
//                        query = session.createQuery("from Mbltbiaya");
//			
//                        if(query.list().size()>0){
//                            upload.setTbiaya((List<Mbltbiaya>) query.list());
//                        }
                        
		} catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
        session.close();
        
        String json = gson.toJson(upload);
        System.out.println("json "+json);
       
        
//      
//        RestClient.get().uploadData(upload, new Callback<String>() {
//
//           @Override
//           public void success(String t, Response rspns) {
//               System.out.println("sukses "+t);
//           }
//
//           @Override
//           public void failure(RetrofitError re) {
//                System.out.println("RetrofitError "+re.getMessage());
//           }
//       });
//            
        
    }

    static ArrayList<Mblfaktivitas> removeDuplicatesActivity(ArrayList<Mblfaktivitas> list) {

	// Store unique items in result.
	ArrayList<Mblfaktivitas> result = new ArrayList<>();

	// Record encountered Strings in HashSet.
	HashSet<Mblfaktivitas> set = new HashSet<>();

	// Loop over argument list.
	for (Mblfaktivitas item : list) {

	    // If String is not in set, add it to the list and the set.
	    if (!set.contains(item)) {
		result.add(item);
		set.add(item);
	    }
	}
	return result;
    }


    
}
