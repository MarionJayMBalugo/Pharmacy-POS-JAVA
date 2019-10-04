/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import medicine.interfaces.LogIn;
import medicine.interfaces.Register;
import medicine.medicine.MedicineList;
import medicine.users.UserList;
import medicine.users.Admin;
import medicine.users.AdminPrivilege;
import medicine.users.Customer;
import medicine.users.User;

/**
 *
 * @author 2ndyrGroupC
 */
public class Interface {

    private Register regis = new Register();
    private Admin admin = new Admin();
    private Customer custom = new Customer();
    private Scanner write = new Scanner(System.in);
    private UserList useList = new UserList();
    private LogIn log = new LogIn();
    private AdminPrivilege adminAccess = new AdminPrivilege();
    private MedicineList medList = new MedicineList();

    public void Interface() {
        //instantiates the accountlist for admin and medicinelist
        adminAccess.setMedList(medList);
        boolean end = true;
//all transaction
        while (end) {
            int select = 0;
            System.out.println("press 1 to register\npress 2 to log in\npress 3 to exit application");
            try {
                select = write.nextInt();
            } catch (InputMismatchException e) {
                write.next();
                System.out.println("we only accept numbers");
                continue;
            }
            switch (select) {
                //register
                case 1:
                    System.out.println("register");

                    boolean endRegis = true;
                    int selectRegister = 0;
                    while (endRegis) {
                        System.out.println("press 1 to register as admin\tpress any number to register as a customer");
                        try {
                            selectRegister = write.nextInt();
                            endRegis = false;
                        } catch (InputMismatchException e) {
                            System.out.println("we only accept numbers");
                            write.next();

                        }
                    }

                    //register as admin or customer
                    regis.register(write);
                    if (selectRegister == 1) {
                        System.out.println("registering as admin");
                        admin = new Admin(regis.getFirstname(), regis.getLastname(), regis.getAge(), regis.getAccname(), regis.getPassword());
                        useList.addItem(admin);
                        System.out.println(useList);

                        adminAccess.AdminPrivilege(write);
                        medList.setMedicineList(adminAccess.getMedList().getMedicineList());
                        System.out.println(medList.getMedicineList());
                    } else {
                        System.out.println("registering as cutomer");
                        custom = new Customer(regis.getFirstname(), regis.getLastname(), regis.getAge(), regis.getAccname(), regis.getPassword());
                        useList.addItem(custom);
                    }
                    break;
                case 2:
                    //log In
                    System.out.println("log in");
                    log.logIn(write);
                    String acc = log.getAccname();
                    String pass = log.getPassword();
                    if (useList.isVerified(acc, pass)) {
                        if (useList.isInstanceOfAdmin(acc)) {
                            System.out.println("Admin Account");
                            adminAccess.AdminPrivilege(write);
                            System.out.println(medList.getMedicineList());
                        } else {
                            System.out.println("Customer Account");

                        }
                    } else {
                        System.out.println("incorrect logIn");
                    }
                    break;
                case 3:
                    System.out.println("exiting app");
                    end = false;
                    break;
                default:
                    System.out.println("input not in the choices");
                    break;
            }

        }

    }

}
