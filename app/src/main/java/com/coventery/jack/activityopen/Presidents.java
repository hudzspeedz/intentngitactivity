package com.coventery.jack.activityopen;

/**
 * Created by user on 29/02/2016.
 */
public class Presidents {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;


    public Presidents(String firstName, String fullName){
        this.firstName = firstName;
        this.fullName = fullName;
    }
}
