package com.austinstudio.mobilerescue;

/**
 * Created by austi on 11/5/2018.
 */

public class UserInformation {

    public String name;
    public double latitude;
    public double longitude;

    public UserInformation(){

    }
    public UserInformation(String name,double latitude,double longitude){
        this.name=name;
        this.latitude=latitude;
        this.longitude=longitude;
    }
}
