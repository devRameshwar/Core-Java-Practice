package com.objectClass;

public class CloneMethod {

    public static void main(String[] args) {

        Address  address = new Address("Varanasi", "Utter-Pradesh");

        Persons anujRavat = new Persons(101, "Anuj Ravat",address);
        System.out.println("Before cloning objects: " + anujRavat);

        try {

            Persons object = (Persons) anujRavat.clone();
            object.setPersonId(102);
            object.setPersonName("Anupam");
            System.out.println("Object After cloning" + object);
            System.out.println("Actual object: " + anujRavat);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}

class Persons implements Cloneable {
    private int personId;
    private String personName;
    private Address address;

    public Persons(int personId, String personName, Address address) {
        this.personId = personId;
        this.personName = personName;
        this.address = address;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Persons{" + "personId=" + personId + ", personName='" + personName + '\'' + ", address=" + address + '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}

class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + ", state='" + state + '\'' + '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Persons persons = (Persons) super.clone();
        return persons;
    }
}