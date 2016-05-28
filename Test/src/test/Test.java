/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author PC_
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Holanda");
        String msg = p.greet("Alemania");
        System.out.println(msg);
    }
   
}
