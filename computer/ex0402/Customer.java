package kr.ac.ync.computer.ex0402;

import java.util.ArrayList;

public class Customer {
    private String name;
    private  String id;
    private String pass;

    private ArrayList<CustomerM> customerM;

    public Customer(String name,String id, String pass){
        this.name = name;
        this.id = id;
        this.pass = pass;
        customerM = new ArrayList<>();
    }




}
