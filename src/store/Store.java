/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;


public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Purchase obj1 = new Purchase();
        
        String purchase = obj1.getPurchase();
        String message = obj1.getMessage();
        double price = obj1.getPrice();
        
        Customer obj2 = new Customer();
        
        String name = obj2.getName();
        String email = obj2.getEmail();
        
        System.out.println("Customer Information: ");
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        
        System.out.println("");
        System.out.println("Purchase Information: ");
        System.out.println("You  Have Purchased: "+purchase);
        System.out.println("Price: "+price);
        System.out.println(message);
    }
    
}
