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
public class Hospital {

    public Hospital(String hospital_name, String address, int ZipCode, String mobile) {
    }
    
    private int hos_id;
    private String hospital_name;
    private String address;
    private int ZipCode;
    private String mobile;
    

    public int getHos_id() {
        return hos_id;
    }

    public void setHos_id(int hos_id) {
        this.hos_id = hos_id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

     //int hos_id = generateRandomId();
     
        
     private int generateRandomId() {

        return new Random().nextInt(900000) + 100000;
    }    
    
    
    
    
}
