package com.hendisantika.springaopperformancemeasurement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class SpringAopPerformanceMeasurementApplication {

    @Autowired
    private JuiceService beerService;

    @RequestMapping("/drink")
    public String drink() throws InterruptedException {
        return beerService.drink();
    }

    @RequestMapping("/order")
    public String order() throws InterruptedException {
        return beerService.order();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopPerformanceMeasurementApplication.class, args);
    }

}

