package com.myfirst.wsClient;

import javax.xml.ws.BindingProvider;

public class SayHelloClient {

    public static void main(String args[]) {
		
        SayHelloService shs = new SayHelloService();
		
        SayHello sh = (SayHello) shs.getSayHelloPort();
		
        ((BindingProvider)sh).getRequestContext().put(BindingProvider.
            ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/wsServerExample");

        System.out.println( ((BindingProvider)sh).toString() );

        System.out.println(sh.getGreeting("Deepika"));

    }
}
