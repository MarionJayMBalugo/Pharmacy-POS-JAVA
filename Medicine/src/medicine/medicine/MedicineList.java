/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.medicine;

import java.util.HashMap;

/**
 *
 * @author 2ndyrGroupC
 */
public class MedicineList {
    private HashMap<String,Medicine>medicineList=new HashMap();

    public MedicineList() {
    }

    public HashMap<String, Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(HashMap<String, Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    @Override
    public String toString() {
        return medicineList.toString();
    }
    
}
