/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CountryMapper.java
 * Author:   bigmoon
 * Date:     19-11-12 上午1:40
 * Description: mybatis-learning
 */

package sql;

import entity.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 20191030
 */
public interface CountryMapper {

    List<Country> selectAll(@Param("countryname") String countryname);

    int insertCountry(Country country);

    int insertCountry2(Country country);

    List<Country> select(@Param("country") Country country);
}
