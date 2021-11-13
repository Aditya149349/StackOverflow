package com.paytmmoney.errordb.repository;


import org.springframework.stereotype.Component;

@Component
public class BeanWebClient {

    private int v1;
    private int v2;
    public BeanWebClient(int v1, int v2){

        this.v1=v1;
        this.v2=v2;
        System.out.println("Received from BeanTest "+v1+" "+v2);
    }

    public BeanWebClient(){

    }

    public int getV1() {
        return v1;
    }
    public int getV2() {
        return v2;
    }

    public void webClientMessage(){

        System.out.println("In BeanWebClient class, printing from autowired dependency "+v1+" "+v2);
    }

}
