/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: MapperTest.java
 * Author:   bigmoon
 * Date:     19-11-1 下午4:32
 * Description: mybatis-learning
 */

package sql.common.mapper;

import entity.CallRecord;
import org.testng.annotations.Test;
import sql.CallRecordMapper;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 20191028
 */
public class MapperTest extends BaseTestMapper {


    @Test
    public void testSelectAll() {

        CallRecordMapper callRecordMapper=session.getMapper(CallRecordMapper.class);
        CallRecord query=new CallRecord();
        query.setId(1);
       CallRecord result= callRecordMapper.selectByPrimaryKey(1);
        System.out.println(result);
//        Assert.assertEquals(result);
    }

}
