package ru.gb.gbsbmarch;


import homework.repository.ProdRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(ProdRepository.class)
public class GbSbMarchApplication {

    public static void main(String[] args) {
        SpringApplication.run(GbSbMarchApplication.class, args);
    }

}
