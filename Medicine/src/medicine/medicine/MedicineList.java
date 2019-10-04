/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.medicine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author 2ndyrGroupC
 */
public class MedicineList {

    private ArrayList<Medicine> medicineList = new ArrayList();

    public MedicineList() {
    }

    public ArrayList< Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList< Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    @Override
    public String toString() {
        return medicineList.toString();
    }

    public void addMedicineList(Medicine medicine) {
        this.medicineList.add(medicine);
    }

    public boolean isMedicinePresent(String med) {
        boolean ans = false;
        for (Medicine elem : medicineList) {
            if (med.equals(elem.getProduct().getName())) {
                ans = true;
                System.out.println("medicine in List");
                break;
            }
        }
        return ans;
    }

    public void removeMed(String string) {
        for (Medicine med : medicineList) {
            if (string.equals(med.getProduct().getName())) {
                medicineList.remove(med);
                break;
            }
        }
    }
    public void updateName(String med,String name) {
      
        for (Medicine elem : medicineList) {
            if (med.equals(elem.getProduct().getName())) {
                elem.getProduct().setName(name);
                System.out.println("medicine in List");
                break;
            }
        }
        
    }
    public void updateBrand(String med,String name) {
      
        for (Medicine elem : medicineList) {
            if (med.equals(elem.getProduct().getName())) {
                elem.setBrandName(name);
                System.out.println("medicine in List");
                break;
            }
        }
        
    }
    public void updateGeneric(String med,String name) {
      
        for (Medicine elem : medicineList) {
            if (med.equals(elem.getProduct().getName())) {
                elem.setGenericName(name);
                System.out.println("medicine in List");
                break;
            }
        }
        
    }
    public void updatePrice(String med,double price) {
      
        for (Medicine elem : medicineList) {
            if (med.equals(elem.getProduct().getName())) {
                elem.getProduct().setPrice(price);
                System.out.println("medicine in List");
                break;
            }
        }
        
    }
    public void updateQuantity(String med,int quan) {
      
        for (Medicine elem : medicineList) {
            if (med.equals(elem.getProduct().getName())) {
                elem.getProduct().setQuantity(quan);
                System.out.println("medicine in List");
                break;
            }
        }
        
    }
    
    
}
