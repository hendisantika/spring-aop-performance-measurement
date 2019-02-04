package com.hendisantika.springaopperformancemeasurement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-aop-performance-measurement
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-04
 * Time: 17:29
 */

@Service
public class JuiceService {
    private static final Logger LOG = LoggerFactory.getLogger(JuiceService.class);

    @Measure(action = "drinking")
    public String drink() throws InterruptedException {
        String message = "Apple";
        LOG.info(message);

        Thread.sleep(new Random().longs(1, 2).findFirst().getAsLong());

        return message;
    }

    @Measure(action = "ordering")
    public String order() throws InterruptedException {
        String message = "2 Juices please.";
        LOG.info(message);

        Thread.sleep(new Random().longs(2, 4).findFirst().getAsLong());

        return message;
    }
}
