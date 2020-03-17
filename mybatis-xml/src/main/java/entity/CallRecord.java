/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CallRecord.java
 * Author:   bigmoon
 * Date:     19-9-20 上午1:19
 * Description: mybatis-learning
 */

package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 */
@Table(name = "call_records")
public class CallRecord implements Serializable {
    private static final long serialVersionUID = 8388890212540425854L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "collectionOperator")
    private String collectionOperator;
    @Column(name = "callDuration")
    private BigDecimal callDuration;
    @Column(name = "date")
    private Date date;
    @Column(name = "callCount")
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
