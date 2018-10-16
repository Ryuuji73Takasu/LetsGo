package com.mrhsourav54.letsgo.CurrencyConverter;

public class StudentInfo {

    String fullname, coyname, address,registrationid,phonenumber;

    public StudentInfo() {

    }

    public StudentInfo(String fullname, String coyname, String address, String registrationid, String phonenumber) {
        this.fullname = fullname;
        this.coyname = coyname;
        this.address = address;
        this.registrationid = registrationid;
        this.phonenumber = phonenumber;
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
}
