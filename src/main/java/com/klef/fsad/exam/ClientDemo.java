package com.klef.fsad.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientDemo {

    @Bean
    CommandLineRunner run(ShipmentRepository repo) {
        return args -> {

            Shipment s = new Shipment();
            s.setName("Electronics");
            s.setStatus("Shipped");

            repo.save(s);
            System.out.println("Inserted Successfully");

            int rows = repo.deleteByIdHQL(1);
            System.out.println("Deleted Rows: " + rows);
        };
    }
}
