package com.paytmmoney.errordb.repository;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

@Component
public class BeanTest {

    private int v1;
    private int v2;

   BeanWebClient b1;

    public BeanTest(){}

    public BeanTest(int v1, int v2){
        this.v1=v1;
        this.v2=v2;
        beanWebClient();

    }
    public BeanWebClient beanWebClient() {
        //System.out.println("In BeanTest class beanWebClient() method execution v1 and v2: "+v1+v2);
        b1 = new BeanWebClient(v1,v2);
        System.out.println("In BeanTest class beanWebClient() method execution v1 and v2: "+b1.getV1()+" "+b1.getV2());
        return b1;
    }

    public void message()
    {
        b1.webClientMessage();
        //System.out.println("V1= "+v1+" V2= "+v2);
    }
}
