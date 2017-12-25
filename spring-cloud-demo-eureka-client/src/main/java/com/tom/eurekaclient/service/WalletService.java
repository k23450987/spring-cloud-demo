package com.tom.eurekaclient.service;

import com.tom.eurekaclient.model.Wallet;

public interface WalletService {

    int insert(Wallet wallet);

    void update(Wallet wallet);

    /**
     * 存钱
     *
     * @param amount 金额
     * @param username 账户
     */
    void saveMoney(double amount, String username);

    /**
     * 取钱
     *
     * @param amount 金额
     * @param username 账户
     */
    void drawMoney(double amount, String username);

}
