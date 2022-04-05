package ru.gb.gbsbmarch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.gb.gbsbmarch.config.ProductProps;

@SpringBootApplication
@EnableConfigurationProperties(ProductProps.class)
public class GbSbMarchApplication {

    public static void main(String[] args) {
        SpringApplication.run(GbSbMarchApplication.class, args);
    }

}
