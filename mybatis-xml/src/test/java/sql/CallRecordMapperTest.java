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
 */
public class CallRecordMapperTest extends BaseTestMapper {

    @Test
    public void testUpdateData(){
        SqlSession session=this.sqlSessionFactory.openSession();
        CallRecordMapper callRecordMapper = session.getMapper(CallRecordMapper.class);
        System.out.println("第一次："+callRecordMapper.updateData());
        session.commit();
        session.close();
    }

    @Test
    public void testSelectnageAllWithCache() {
//
//        SqlSession session=this.sqlSessionFactory.openSession();
//        CallRecordMapper callRecordMapper = session.getMapper(CallRecordMapper.class);
//        System.out.println("第一次："+callRecordMapper.selectAll());
//        session.close();
//        SqlSession session2=this.sqlSessionFactory.openSession();
//        System.out.println("第二次："+session2.getMapper(CallRecordMapper.class).selectAll());
//        session2.close();
//
//        SqlSession session3=this.sqlSessionFactory.openSession();
//        System.out.println("第三次："+session3.getMapper(CallRecordMapper.class).selectAll());
//        session3.close();
    }


}
