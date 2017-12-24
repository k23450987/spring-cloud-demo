package com.example.eurekaconsumer.controller;

import com.example.eurekaconsumer.service.WalletService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping("/transMoney")
    public String transMoney(double amount) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", "zhangsan");
        map.put("amount", amount);
        String drawResult = walletService.draw(map);
        if (drawResult.contains("true")) {
            return walletService.save(amount, "lisi");
        }
        return "";
    }

}
