package com.myself.mymaitypoultry.models;

public class User {
    String id;
    String name;
    String email;
    String mobile;
    String password;
    String Address;
    String PrimaryOrderAddress;
    String PrimaryOrderPincode;
    String Landmark;
    Boolean ReferStatus;
    public User() {
    }

    public User(String id, String name, String email, String mobile, String password,String Address,String PrimaryOrderAddress,String PrimaryOrderPincode,String Landmark,Boolean ReferStatus) {
        this.id = id;
        this.name = name;
        this.email = email;

        this.mobile = mobile;
        this.password = password;
        this.Address = Address;

        this.PrimaryOrderAddress = PrimaryOrderAddress;
        this.PrimaryOrderPincode = PrimaryOrderPincode;
        this.Landmark = Landmark;
        this.ReferStatus=ReferStatus;
    }


    public String getPrimaryOrderAddress() {
        return PrimaryOrderAddress;
    }
    public void setPrimaryOrderAddress(String PrimaryOrderAddress) {
        this.PrimaryOrderAddress = PrimaryOrderAddress;
    }
    public String getLandmark() {
        return Landmark;
    }
    public void setLandmark(String Landmark) {
        this.Landmark = Landmark;
    }

    public Boolean getReferStatus() {
        return ReferStatus;
    }
    public void setReferStatus(Boolean ReferStatus) {
        this.ReferStatus = ReferStatus;
    }


    public String getPrimaryOrderPincode() {
        return PrimaryOrderPincode;
    }

    public void setPrimaryOrderPincode(String PrimaryOrderPincode) {
        this.PrimaryOrderPincode = PrimaryOrderPincode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
