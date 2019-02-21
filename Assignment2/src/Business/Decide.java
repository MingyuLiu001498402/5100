/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Product;

import java.util.Scanner;

/**
 *
 * @author liumingyu
 */
public class Decide {
    
    
    public static void main(String[]args){
        
        Product product=new Product();
    while(true){
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to choose? ");
        System.out.println("press 1 to Create.");
        System.out.println("press 2 to view.");
        System.out.println("press 3 to update.");
        System.out.println("press 4 to exit the System.");
        System.out.println("********************************************");
        int decide= scanner.nextInt();
        
        switch(decide){
            case 1:
            System.out.println("Please input Product's Name");
            product.setName(scanner.next());
            System.out.println("Please input Product's Price");
            
            double price1;
            try{
                price1 = scanner.nextDouble();
                product.setPrice(price1);
                
            }catch(Exception e){
                System.out.println("********************************************");
                System.out.println("**************Wrong Price type!*************");
                System.out.println("********************************************");
                break;
            }
            
            
            System.out.println("Please input Product's Availible Number");
            long availiblenumber1;
            try{
                availiblenumber1 = scanner.nextLong();
                product.setAvailNum(availiblenumber1);
                
            }catch(Exception e){
                System.out.println("********************************************");
                System.out.println("********Wrong Availible Number type!********");
                System.out.println("********************************************");
                break;
            }
            System.out.println("Please input Product's Description");
            product.setDescription(scanner.next());
            System.out.println("Please input Product's Supplier's Name");
            product.getSupplier().setSupplierName(scanner.next());
            System.out.println("Please input Product's Supplier's Address");
            product.getSupplier().setSupplieraddress(scanner.next());
            System.out.println("********************************************");
           
            break;
                
            case 2:
            System.out.println("********************************************");
            System.out.println("The information of current product is:");
            System.out.println("product Name:  "+product.getName());
            System.out.println("product Price:  "+product.getPrice());
            System.out.println("product Avalible Number:  "+product.getAvailNum());
            System.out.println("product Description:  "+product.getDescription());
            System.out.println("product's Supplier Name:  "+product.getSupplier().getSupplierName());
            System.out.println("product's Supplier Address:  "+product.getSupplier().getSupplieraddress());
            System.out.println("********************************************");
           
            break;
            case 3:
            System.out.println("********************************************");
            System.out.println("The information of current product is:");
            System.out.println("product Name:  "+product.getName());
            System.out.println("product Price:  "+product.getPrice());
            System.out.println("product Avalible Number:  "+product.getAvailNum());
            System.out.println("product Description:  "+product.getDescription());
            System.out.println("product's Supplier Name:  "+product.getSupplier().getSupplierName());
            System.out.println("product's Supplier Address:  "+product.getSupplier().getSupplieraddress());   
            System.out.println("********************************************");
                        
            boolean flag = true;
            while(flag){
            System.out.println("********************************************");
            System.out.println("press 1 to update product Name");
            System.out.println("press 2 to update product Price");
            System.out.println("press 3 to update product Avalible Number");
            System.out.println("press 4 to update product Description");
            System.out.println("press 5 to update product's Supplier Name");
            System.out.println("press 6 to update product's Supplier Address");
            System.out.println("press 7 to end and save the update");
                    
            int decide2 = scanner.nextInt();
                   
            switch(decide2){
                    case 1:                
                    System.out.println("Please input Product's Name");
                    product.setName(scanner.next());
                    break;
                    case 2:
                    System.out.println("Please input Product's Price");
                    
                    double price2;
                    try{
                        price2 = scanner.nextDouble();
                        product.setPrice(price2);
                
                        }catch(Exception e){
                        System.out.println("********************************************");
                        System.out.println("**************Wrong Price type!*************");
                        System.out.println("********************************************");
                        flag = false;
                        }
                        
                    
                    break;
                    
                    
                    case 3:
                        System.out.println("Please input Product's Availible Number");
                        long availiblenumber2;
                        try{
                            availiblenumber2 = scanner.nextLong();
                            product.setAvailNum(availiblenumber2);

                            }catch(Exception e){
                                System.out.println("********************************************");
                                System.out.println("********Wrong Availible Number type!********");
                                System.out.println("********************************************");
                                flag = false;
                            }
                        break;
                    
                    case 4:
                        System.out.println("Please input Product's Description");
                        product.setDescription(scanner.next());
                        break;
                    case 5:
                        System.out.println("Please input Product's Supplier's Name");
                        product.getSupplier().setSupplierName(scanner.next());
                        break;
                    case 6:
                        System.out.println("Please input Product's Supplier's Address");
                        product.getSupplier().setSupplieraddress(scanner.next());
                        break;
                    case 7:
                        flag = false;
                        break;
                    default:
                        System.out.println("********************************************");
                        System.out.println("*************Not a correct action***********");
                        System.out.println("********************************************"); 
                        flag=false;
                    }
                    }
            break;
                    
            case 4:
            System.exit(0);
            break;
            default:
            System.out.println("*************Not a correct action***********");
            break;
                    }        
        }
    }
}
                        
       
    

            

