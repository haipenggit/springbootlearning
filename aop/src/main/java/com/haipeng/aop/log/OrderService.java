package com.haipeng.aop.log;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @RecordOperate(desc = "保存订单", convert = SaveOrderConvert.class)
    public boolean saveOrder(SaveOrder saveOrder) {
        System.out.println("saveOrder.getId() = " + saveOrder.getId());
        return true;
    }

    @RecordOperate(desc = "更新订单", convert = UpdateOrderConvert.class)
    public boolean updateOrder(UpdateOrder updateOrder) {
        System.out.println("updateOrder.getOrderId() = " + updateOrder.getOrderId());
        return true;
    }
}
