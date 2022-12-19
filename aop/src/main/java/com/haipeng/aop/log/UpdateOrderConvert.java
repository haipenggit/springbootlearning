package com.haipeng.aop.log;

public class UpdateOrderConvert implements Convert<UpdateOrder>{

    @Override
    public OperateLog convert(UpdateOrder updateOrder) {
        OperateLog operateLog = new OperateLog();
        operateLog.setOrderId(updateOrder.getOrderId());
        return operateLog;
    }
}
