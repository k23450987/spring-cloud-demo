package com.tom.eurekaclient.service.impl;

import com.tom.eurekaclient.dao.WalletMapper;
import com.tom.eurekaclient.model.Wallet;
import com.tom.eurekaclient.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletMapper mapper;

    @Override
    public int insert(Wallet wallet) {
        mapper.insert(wallet);
        return wallet.getId();
    }

    @Override
    public void update(Wallet wallet) {
        mapper.updateByPrimaryKeySelective(wallet);
    }

    @Override
    public void saveMoney(double amount, String username) {
        Wallet wallet = mapper.selectByUsername(username);
        wallet.setBalance(wallet.getBalance() + amount);
        mapper.updateByPrimaryKeySelective(wallet);
    }

    @Override
    public void drawMoney(double amount, String username) {
        Wallet wallet = mapper.selectByUsername(username);
        wallet.setBalance(wallet.getBalance() - amount);
        mapper.updateByPrimaryKeySelective(wallet);
    }
}
