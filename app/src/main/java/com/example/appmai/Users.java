package com.example.appmai;

public class Users {
    String Name, Age,Email, Password, Hint,Gender,uid;

    public Users() {
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
       Gender= gender;
    }

    public Users(String name, String age, String email, String password, String hint, String gender, String uid) {
        Name = name;
        Email = email;
        Password = password;
        Hint = hint;
        Age = age;
        Gender = gender;
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getHint() {
        return Hint;
    }

    public String getAge() {
        return Age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setHint(String hint) {
        Hint = hint;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}






