/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author liumingyu
 */
public class Supplier {
    private String SupplierName;
    private String Supplieraddress;

 public Supplier(){
    SupplierName ="Default Name";
    Supplieraddress="Default Address";
}

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getSupplieraddress() {
        return Supplieraddress;
    }

    public void setSupplieraddress(String Supplieraddress) {
        this.Supplieraddress = Supplieraddress;
    }


}
