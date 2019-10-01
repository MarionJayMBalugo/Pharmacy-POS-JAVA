/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupC
 */
public class Writers {

    public String WriteString(Scanner write, String string) {
        System.out.println("enter your " + string);
        String ans = write.next();
        return ans;
    }

    public int WriteInt(Scanner write, String string) {
        int ans = 0;
        try {
            System.out.println("enter your " + string);
            ans = write.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("please enter a digit");
        }
        return ans;
    }

    public double WriteDouble(Scanner write, String string) {
        double ans = 0;
        try {
            System.out.println("enter your " + string);
            ans = write.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("please enter a digit");
        }
        return ans;
    }
    public String WriteFname(Scanner write){
        String fname=WriteString(write,"firstname");
        return fname;
    }
    public String WriteLname(Scanner write){
        String lname=WriteString(write,"lastname");
        return lname;
    }
}
