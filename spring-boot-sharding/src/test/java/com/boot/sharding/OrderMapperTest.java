package com.boot.sharding;

import com.boot.sharding.domain.Order;
import com.boot.sharding.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Random;

/**
 * OrderMapper
 *
 * @author lizhifu
 * @date 2020/12/29
 */
@SpringBootTest
public class OrderMapperTest {
    @Resource
    private OrderMapper orderMapper;
    @Test
    public void test(){
        int userId = 4;
        System.out.println(userId % 2);
        Order orderParam = new Order();
        orderParam.setUserId(userId);
        orderParam.setOrderId(1);
        orderMapper.insert(orderParam);
    }

}
