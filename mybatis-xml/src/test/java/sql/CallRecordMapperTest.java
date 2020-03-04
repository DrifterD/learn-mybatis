/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CallRecordMapperTest.java
 * Author:   bigmoon
 * Date:     19-9-20 上午1:26
 * Description: mybatis-learning
 */

package sql;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 20191030
 */
public class CallRecordMapperTest extends BaseTestMapper {

    @Test
    public void testSelectAll() {

        SqlSession session=this.sqlSessionFactory.openSession();
        CallRecordMapper callRecordMapper = session.getMapper(CallRecordMapper.class);
        System.out.println("第一次："+callRecordMapper.selectAll());
    }

    @Test
    public void testSelectAllWithCache() {

        SqlSession session=this.sqlSessionFactory.openSession();
        CallRecordMapper callRecordMapper = session.getMapper(CallRecordMapper.class);
        System.out.println("第一次："+callRecordMapper.selectAll());
        session.close();
        SqlSession session2=this.sqlSessionFactory.openSession();
        System.out.println("第一次："+session2.getMapper(CallRecordMapper.class).selectAll());
    }
}
