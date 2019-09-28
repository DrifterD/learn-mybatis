/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CallRecord.java
 * Author:   bigmoon
 * Date:     19-9-20 上午1:19
 * Description: mybatis-learning
 */

package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 20191030
 */
public class CallRecord {

    private Integer id;
    private String collectionOperator;
    private BigDecimal callDuration;
    private Date date;
    private Integer callCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollectionOperator() {
        return collectionOperator;
    }

    public void setCollectionOperator(String collectionOperator) {
        this.collectionOperator = collectionOperator;
    }

    public BigDecimal getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(BigDecimal callDuration) {
        this.callDuration = callDuration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCallCount() {
        return callCount;
    }

    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallRecord{");
        sb.append("id=").append(id);
        sb.append(", collectionOperator='").append(collectionOperator).append('\'');
        sb.append(", callDuration=").append(callDuration);
        sb.append(", date=").append(date);
        sb.append(", callCount=").append(callCount);
        sb.append('}');
        return sb.toString();
    }
}
