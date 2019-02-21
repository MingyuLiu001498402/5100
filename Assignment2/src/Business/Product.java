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
public class Product {
    private String name;
    private double price;
    private long availNum;
    private String description;
    private Supplier supplier;
    
    public Product(){
        supplier = new Supplier();
        name="Default Product Name";
        price=-1.0;
        availNum=-1;
        description="Default Product Description";
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getAvailNum() {
        return availNum;
    }

    public void setAvailNum(long availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
