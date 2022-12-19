package com.haipeng.aop;

import com.haipeng.aop.log.OrderService;
import com.haipeng.aop.log.SaveOrder;
import com.haipeng.aop.log.UpdateOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

    @Autowired
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SaveOrder saveOrder = new SaveOrder();
        saveOrder.setId(1L);
        orderService.saveOrder(saveOrder);
        UpdateOrder updateOrder = new UpdateOrder();
        updateOrder.setOrderId(23L);
        orderService.updateOrder(updateOrder);
    }
}
