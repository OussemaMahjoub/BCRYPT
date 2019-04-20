/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcrypt;

import hi.BCryptPasswordEncoder;


/**
 *
 * @author mahjoub
 */
public class BCRYPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
         
         String s=passwordEncoder.encode("hi");
         
         
         boolean b=passwordEncoder.matches("hi",s);
         boolean b1=passwordEncoder.matches("hii<<<<",s);
         System.out.println("hi ====>  "+s);
         System.out.println(b);
         System.out.println("hii<<<< ====>  "+s);
         System.out.println(b1);
    }
    
}
