package com.tom.eurekaclient.model;

public class Wallet {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 余额
     */
    private Double balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}