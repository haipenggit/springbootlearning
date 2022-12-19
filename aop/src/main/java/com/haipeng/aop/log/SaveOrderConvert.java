package com.haipeng.aop.log;

public class SaveOrderConvert implements Convert<SaveOrder>{

    @Override
    public OperateLog convert(SaveOrder saveOrder) {
        OperateLog operateLog = new OperateLog();
        operateLog.setOrderId(saveOrder.getId());
        return operateLog;
    }
}
