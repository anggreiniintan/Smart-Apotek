/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotik;

import java.util.ArrayList;

/**
 *
 * @author Miracle
 */
public class DataBeanList {
   ArrayList<DataBean> dataBeanList = new ArrayList<DataBean>();
   public ArrayList<DataBean> getDataBeanList() {
      

      return dataBeanList;
   }

   /**
    * This method returns a DataBean object,
    * with name and country set in it.
    */
   private DataBean produce(String name, int harga) {
      DataBean dataBean = new DataBean();
      dataBean.setName(name);
      dataBean.setHarga(harga);
      
      return dataBean;
   }
   public void addBean(String name, int harga){
      DataBean dataBean = new DataBean();
      dataBean.setName(name);
      dataBean.setHarga(harga);
      dataBeanList.add(dataBean);
   }
}