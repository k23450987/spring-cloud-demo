package com.tom.eurekaclient.controller;

import com.tom.eurekaclient.service.WalletService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping("/{type}")
    public Map<String, String> solveMoney(@PathVariable String type, double amount, String username) {
        Map<String, String> map = new HashMap<>();
        try {
            switch (type) {
                case "save":
                    walletService.saveMoney(amount, username);
                    map.put("success", "true");
                    return map;
                case "draw":
                    walletService.drawMoney(amount, username);
                    map.put("success", "true");
                    return map;
                default:
                    map.put("success", "false");
                    map.put("msg", "wrong parameter");
                    return map;
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", "false");
            map.put("msg", e.getMessage());
            return map;
        }
    }

}
