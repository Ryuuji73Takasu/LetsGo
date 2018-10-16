package com.mrhsourav54.letsgo;

public class StudentInfo {

    String fullname, coyname, address,registrationid,phonenumber,radio;
    //RadioButton radio;

    public StudentInfo() {

    }

    public StudentInfo(String fullname, String coyname, String address, String registrationid, String phonenumber,String radio) {
        this.fullname = fullname;
        this.coyname = coyname;
        this.address = address;
        this.registrationid = registrationid;
        this.phonenumber = phonenumber;
        this.radio = radio;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCoyname() {
        return coyname;
    }

    public void setCoyname(String coyname) {
        this.coyname = coyname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationid() {
        return registrationid;
    }

    public void setRegistrationid(String registrationid) {
        this.registrationid = registrationid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }
}
