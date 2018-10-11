package com.data.main.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class EMPLOYEE_INFORMATIONS_E {

   
    @Id
    private Number EMPLOYEE_ID;
    private String EMPLOYEE_NAME;
    private String EMPLOYEE_ID_CARD;
    private String EMPLOYEE_SEX;
    private Date EMPLOYEE_BIRTHDAY;
    private String EMPLOYEE_BUMBER;
    private String EMPLOYEE_NATIVE_PLACE;
    private String EMPLOYEE_PERMANENT_ADDRESS;
    private Number EMPLOYEE_PHONE_NUMBER;
    private String EMPLOYEE_CONTACT_INFORMATION;
    private String EMPLOYEE_EMERGENCY_CONTACT;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "EMPLOYEE_NAME : " + EMPLOYEE_NAME + " ," +
               "EMPLOYEE_ID_CARD : " + EMPLOYEE_ID_CARD + " ," +
               "EMPLOYEE_SEX : " + EMPLOYEE_SEX + " ," +
               "EMPLOYEE_BIRTHDAY : " + EMPLOYEE_BIRTHDAY + " ," +
               "EMPLOYEE_BUMBER : " + EMPLOYEE_BUMBER + " ," +
               "EMPLOYEE_NATIVE_PLACE : " + EMPLOYEE_NATIVE_PLACE + " ," +
               "EMPLOYEE_PERMANENT_ADDRESS : " + EMPLOYEE_PERMANENT_ADDRESS + " ," +
               "EMPLOYEE_PHONE_NUMBER : " + EMPLOYEE_PHONE_NUMBER + " ," +
               "EMPLOYEE_CONTACT_INFORMATION : " + EMPLOYEE_CONTACT_INFORMATION + " ," +
               "EMPLOYEE_EMERGENCY_CONTACT : " + EMPLOYEE_EMERGENCY_CONTACT + " ,";
    }
    
    
    
    public Number getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }



    public void setEMPLOYEE_ID(Number eMPLOYEE_ID) {
        EMPLOYEE_ID = eMPLOYEE_ID;
    }



    public String getEMPLOYEE_NAME() {
        return EMPLOYEE_NAME;
    }

    public void setEMPLOYEE_NAME(String eMPLOYEE_NAME) {
        EMPLOYEE_NAME = eMPLOYEE_NAME;
    }

    public String getEMPLOYEE_ID_CARD() {
        return EMPLOYEE_ID_CARD;
    }

    public void setEMPLOYEE_ID_CARD(String eMPLOYEE_ID_CARD) {
        EMPLOYEE_ID_CARD = eMPLOYEE_ID_CARD;
    }

    public String getEMPLOYEE_SEX() {
        return EMPLOYEE_SEX;
    }

    public void setEMPLOYEE_SEX(String eMPLOYEE_SEX) {
        EMPLOYEE_SEX = eMPLOYEE_SEX;
    }

    public Date getEMPLOYEE_BIRTHDAY() {
        return EMPLOYEE_BIRTHDAY;
    }

    public void setEMPLOYEE_BIRTHDAY(Date eMPLOYEE_BIRTHDAY) {
        EMPLOYEE_BIRTHDAY = eMPLOYEE_BIRTHDAY;
    }

    public String getEMPLOYEE_BUMBER() {
        return EMPLOYEE_BUMBER;
    }

    public void setEMPLOYEE_BUMBER(String eMPLOYEE_BUMBER) {
        EMPLOYEE_BUMBER = eMPLOYEE_BUMBER;
    }

    public String getEMPLOYEE_NATIVE_PLACE() {
        return EMPLOYEE_NATIVE_PLACE;
    }

    public void setEMPLOYEE_NATIVE_PLACE(String eMPLOYEE_NATIVE_PLACE) {
        EMPLOYEE_NATIVE_PLACE = eMPLOYEE_NATIVE_PLACE;
    }

    public String getEMPLOYEE_PERMANENT_ADDRESS() {
        return EMPLOYEE_PERMANENT_ADDRESS;
    }

    public void setEMPLOYEE_PERMANENT_ADDRESS(String eMPLOYEE_PERMANENT_ADDRESS) {
        EMPLOYEE_PERMANENT_ADDRESS = eMPLOYEE_PERMANENT_ADDRESS;
    }

    public Number getEMPLOYEE_PHONE_NUMBER() {
        return EMPLOYEE_PHONE_NUMBER;
    }

    public void setEMPLOYEE_PHONE_NUMBER(Number eMPLOYEE_PHONE_NUMBER) {
        EMPLOYEE_PHONE_NUMBER = eMPLOYEE_PHONE_NUMBER;
    }

    public String getEMPLOYEE_CONTACT_INFORMATION() {
        return EMPLOYEE_CONTACT_INFORMATION;
    }

    public void setEMPLOYEE_CONTACT_INFORMATION(String eMPLOYEE_CONTACT_INFORMATION) {
        EMPLOYEE_CONTACT_INFORMATION = eMPLOYEE_CONTACT_INFORMATION;
    }

    public String getEMPLOYEE_EMERGENCY_CONTACT() {
        return EMPLOYEE_EMERGENCY_CONTACT;
    }

    public void setEMPLOYEE_EMERGENCY_CONTACT(String eMPLOYEE_EMERGENCY_CONTACT) {
        EMPLOYEE_EMERGENCY_CONTACT = eMPLOYEE_EMERGENCY_CONTACT;
    }

}
