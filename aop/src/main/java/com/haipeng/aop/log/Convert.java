package com.haipeng.aop.log;

public interface Convert<PARAM> {

    OperateLog convert(PARAM param);
}
