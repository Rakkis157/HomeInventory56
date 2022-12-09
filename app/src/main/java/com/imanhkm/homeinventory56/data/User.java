package com.imanhkm.homeinventory56.data;

public class User {
    private String username;
    private String password;

    public void createUser(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean changePassword(String currentPassword, String newPassword){
        if(this.password == currentPassword){
            this.password = newPassword;
            return true;
        }
        else{
            return false;
        }
    }
}




