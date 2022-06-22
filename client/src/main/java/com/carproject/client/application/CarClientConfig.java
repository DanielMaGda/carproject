package com.carproject.client.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CarClientConfig {
    @Bean
    Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.carproject.client.generated");
        return marshaller;
    }
    @Bean CarClient carClient(Jaxb2Marshaller marshaller){
        CarClient client = new CarClient();
        client.setDefaultUri("http://localhost:8082/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
}
}
