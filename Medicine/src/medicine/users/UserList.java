/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.users;

import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupC
 */
public class UserList {

    private ArrayList<User> accountList = new ArrayList();

    public UserList() {
    }

    public ArrayList<User> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<User> accountList) {
        this.accountList = accountList;
    }

    public void addItem(User acc) {
        accountList.add(acc);
    }

    @Override
    public String toString() {
        return accountList.toString();
    }

    public boolean isInstanceAdmin(User user) {
        return user instanceof Admin;
    }

    public void display() {
        for (User user : accountList) {
            System.out.println(isInstanceAdmin(user) ? user : "");
        }
    }

    public boolean isVerified(String acc, String pass) {
        boolean ans = false;
        for (User user : accountList) {
            if (acc.equals(user.getAccount().getAccName())) {
                if (pass.equals(user.getAccount().getPassword())) {
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }

    public boolean isInstanceOfAdmin(String acc) {
        boolean ans = false;
        for (User user : accountList) {
            if (acc.equals(user.getAccount().getAccName())) {
                if (isInstanceAdmin(user)) {
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }

}
