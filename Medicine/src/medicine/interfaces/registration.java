/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.interfaces;

import java.util.Scanner;
import medicine.exceptions.ExceptionHandler;

/**
 *
 * @author 2ndyrGroupC
 */
public class Registration {

    private Writers writer = new Writers();

    public void register(Scanner write) {
        ExceptionHandler.StringCheck(writer.WriteFname(write));
        ExceptionHandler.StringCheck(writer.WriteLname(write));
    }
}
