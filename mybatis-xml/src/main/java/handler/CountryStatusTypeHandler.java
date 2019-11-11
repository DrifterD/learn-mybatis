/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CountryStatusTypeHandler.java
 * Author:   bigmoon
 * Date:     19-11-12 上午1:40
 * Description: mybatis-learning
 */

package handler;

import entity.CountryStatusEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 20191030
 */
public class CountryStatusTypeHandler implements TypeHandler<CountryStatusEnum> {


    private Map<Byte,CountryStatusEnum> map=new HashMap<>();

    public CountryStatusTypeHandler(){

        for(CountryStatusEnum item:CountryStatusEnum.values()){
            map.put(item.getCode(),item);
        }

    }


    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, CountryStatusEnum countryStatusEnum, JdbcType jdbcType)
            throws SQLException {
        preparedStatement.setInt(i,countryStatusEnum.getCode());
    }

    @Override
    public CountryStatusEnum getResult(ResultSet resultSet, String s) throws SQLException {
        return map.get(resultSet.getByte(s));
    }

    @Override
    public CountryStatusEnum getResult(ResultSet resultSet, int i) throws SQLException {
        return map.get(resultSet.getByte(i));
    }

    @Override
    public CountryStatusEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
        return map.get(callableStatement.getByte(i));
    }
}
