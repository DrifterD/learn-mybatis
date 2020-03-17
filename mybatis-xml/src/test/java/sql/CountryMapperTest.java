/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CountryMapper.java
 * Author:   bigmoon
 * Date:     19-9-20 上午12:20
 * Description: mybatis-learning
 */

package sql;

import entity.Country;
import entity.CountryStatusEnum;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 */
public class CountryMapperTest extends BaseTestMapper {

    @Test
    public void testSelectAll() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        List<Country> countryList = countryMapper.selectAll("");

        countryList.forEach(item -> {

            if (item != null && item.getStatus() != null) {
                System.out.println("status 反向展示：" + item.getStatus().getDesc() + ",code=" + item.getStatus().getCode());
            }

        });

        System.out.println(countryList);
    }


    @Test
    public void testIInsertCountry() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        Country country = new Country();
        country.setCountrycode("JP");
        country.setCountryname("日本");
        int effectRows = countryMapper.insertCountry(country);
        System.out.println("insert rows:" + effectRows);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testIInsertCountry2() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        Country country = new Country();
        country.setCountrycode("JP");
        country.setCountryname("日本");
        country.setStatus2(false);
        country.setStatus(CountryStatusEnum.INACTIVE);
        int effectRows = countryMapper.insertCountry2(country);
        sqlSession.commit();
        Assert.assertTrue(effectRows == 1);
        System.out.println("insert rows:" + effectRows);
        System.out.println(country);

    }


    @Test
    public void testSelect() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
        Country country = new Country();
        country.setCountrycode("JP");
        country.setCountryname("日本");
        country.setStatus2(true);
        country.setStatus(CountryStatusEnum.INACTIVE);
        List<Country> list = countryMapper.select(country);
        sqlSession.commit();

        System.out.println(list);

    }

}
