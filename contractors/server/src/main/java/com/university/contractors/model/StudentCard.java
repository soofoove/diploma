package com.university.contractors.model;

import java.util.List;

public class StudentCard {

    private Student student;
    private Contract currentContract;
    private List<Order> orders;
    private List<Contract> contracts;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Contract getCurrentContract() {
        return currentContract;
    }

    public void setCurrentContract(Contract currentContract) {
        this.currentContract = currentContract;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
