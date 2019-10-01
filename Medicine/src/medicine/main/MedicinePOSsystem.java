/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.main;

import java.util.Scanner;
import medicine.interfaces.Registration;

/**
 *
 * @author 2ndyrGroupC
 */
public class MedicinePOSsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner write=new Scanner(System.in);
        Registration a=new Registration();
        a.register(write);
       
    }

}
