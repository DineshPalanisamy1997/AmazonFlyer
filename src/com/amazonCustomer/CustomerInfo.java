package com.amazonCustomer;

public class CustomerInfo {

    private String CustomerName;
    private int age;
    private String DOB;
    private String proof;

    public CustomerInfo(String customerName, int age, String DOB, String proof) {
        CustomerName = customerName;
        this.age = age;
        this.DOB = DOB;
        this.proof = proof;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getProof() {
        return proof;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }
}
