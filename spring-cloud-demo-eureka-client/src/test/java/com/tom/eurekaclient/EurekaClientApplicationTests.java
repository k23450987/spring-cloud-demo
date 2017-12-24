package com.tom.eurekaclient;

import com.tom.eurekaclient.model.Wallet;
import com.tom.eurekaclient.service.WalletService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientApplicationTests {

    @Autowired
    private WalletService walletService;

	@Test
	public void contextLoads() {
	}

	@Test
    public void test1(){
        Wallet wallet = new Wallet();
        wallet.setUsername("wangwu");
        wallet.setBalance(1000.0);
        walletService.insert(wallet);
    }

}
