/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOURCE;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rishikagurram
 */
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList ;
    
public HospitalDirectory(){
   hospitalList = new ArrayList();
    
}

public boolean ishos_idExist(int hos_id) {
        for (Hospital h : hospitalList) {
            if (h.getHos_id() == hos_id) {
                return true;
            }
        }
        return false;
    }
    
    public Hospital newHospital(String hospital_name, String address, int ZipCode,String mobile) {

        int hos_id = generateRandomId();
        while(ishos_idExist(hos_id)) {
            hos_id = generateRandomId();
        }
        
        
        Hospital h = new Hospital( hospital_name, address, ZipCode, mobile);
        hospitalList.add(h);
        return h;
    
    }
    private int generateRandomId() {
        return new Random().nextInt(900000) + 100000;
    }

    public ArrayList<Hospital> gethospitalList() {

        return hospitalList;
    }
}
