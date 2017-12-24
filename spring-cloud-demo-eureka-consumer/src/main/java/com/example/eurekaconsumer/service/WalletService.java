package com.example.eurekaconsumer.service;

import java.util.Map;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-bank-client")
public interface WalletService {

    /**
     * 消费存钱服务
     * @param amount 金额
     * @param username 用户名
     * @return 结果
     */
    @GetMapping("/wallet/save")
    String save(@RequestParam("amount") double amount, @RequestParam("username") String username);

    /**
     * 消费取钱服务 （这里只是为了测试 Feign 的两种传参方式）
     * @param map {"amount":金额,"username":用户名}
     * @return 结果
     */
    @GetMapping("/wallet/draw")
    String draw(@RequestParam Map<String, Object> map);

}
