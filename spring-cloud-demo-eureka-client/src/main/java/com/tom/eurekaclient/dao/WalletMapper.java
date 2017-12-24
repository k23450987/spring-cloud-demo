package com.tom.eurekaclient.dao;

import com.tom.eurekaclient.model.Wallet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WalletMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Wallet record);

    int insertSelective(Wallet record);

    Wallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wallet record);

    int updateByPrimaryKey(Wallet record);

    Wallet selectByUsername(String username);
}