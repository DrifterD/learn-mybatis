/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: BaseTestMapper.java
 * Author:   bigmoon
 * Date:     19-9-20 上午1:08
 * Description: mybatis-learning
 */

package sql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 20191030
 */
public class BaseTestMapper {


    protected SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public void init()throws IOException{
        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        reader.close();
    }

}
