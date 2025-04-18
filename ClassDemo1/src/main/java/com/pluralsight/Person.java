package com.pluralsight;

public class Person {

    private String fullname;
    private int age;
    private String profession;

    public Person(String fullname, int age, String profession) {

        this.fullname = fullname;
        this.age = age;
        this.profession = profession;
    }

    public void haveABirthday(){
        this.age++;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname (String fullname){
        this.fullname = fullname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    @Override
    public String toString() {

        return String.format("Person %s is a %s and is $d years old.\n",
                this.getFullname(),
                this.getProfession(),
                this.getAge());

    }
}