/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.users;

import java.util.Scanner;
import medicine.exceptions.ExceptionHandler;
import medicine.interfaces.Writers;

import medicine.medicine.MedicineList;

/**
 *
 * @author 2ndyrGroupC
 */
public class AdminPrivilege {

    private Writers writers = new Writers();
    private MedicineList medList = new MedicineList();

    public void addMed(Scanner write) {
        System.out.println("you can add now");
        String writes = writers.WriteString(write, "medicine name to be added");
        try {
            ExceptionHandler.charShouldNotBeNumber(writes);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        if (!medList.isMedicinePresent(writes)) {
            System.out.println("fill up medicine information");
            //add medicine name
            String medicine = null;
            boolean end = true;
            while (end) {
                try {
                    medicine = writers.WriteString(write, "medicine name to be added");
                    ExceptionHandler.charShouldNotBeNumber(medicine);
                    end = false;
                } catch (ArithmeticException e) {
                    System.out.println(e);

                }
            }
            //add brandname
            String brandname = null;
            end = true;
            while (end) {
                try {
                    brandname = writers.WriteString(write, "medicine brand name to be added");
                    ExceptionHandler.charShouldNotBeNumber(brandname);
                    end = false;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            }
            //add genericname
            String generic = null;
            end = true;
            while (end) {

                try {
                    generic = writers.WriteString(write, "medicine generic name to be added");
                    ExceptionHandler.charShouldNotBeNumber(generic);
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            }
            //add price
            double price = 0;
            end = true;
            while (end) {
                try {
                    price = writers.WriteDouble(write, "medicine price to be added");
                    end = false;
                } catch (ArithmeticException e) {
                    System.out.println("we only accept valid numbers");
                }
            }
            //quantity
            int quantity = 0;
            end = true;
            while (end) {
                try {
                    quantity = writers.WriteInt(write, "medicine quantity to be added");
                    end = false;
                } catch (ArithmeticException e) {
                    System.out.println("we only accept valid numbers");
                }
            }

        } else {
            System.out.println("medicine already present.suggestion: choose update");
        }

    }

    public void removeMed(Scanner write) {

    }

    public void update(Scanner write) {

    }

    public void AdminPrivilege(Scanner write) {
        System.out.println("press:\n1 to add medicine supply\n2 to remove medicine\n3"
                + " to update medicine\n4 to view medicine list");
        addMed(write);
    }
}
