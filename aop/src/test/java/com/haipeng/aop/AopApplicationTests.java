package com.haipeng.aop;

import com.haipeng.aop.test.TestServcie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    TestServcie testServcie;

    @Test
    public void test6() throws Exception {
        testServcie.save("参数1字符串", 33);
    }

}
