/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CallRecordMapper.java
 * Author:   bigmoon
 * Date:     19-9-20 上午1:19
 * Description: mybatis-learning
 */

package sql;

import entity.CallRecord;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 */
public interface CallRecordMapper {

    List<CallRecord> selectAll();

    int updateData();
}
