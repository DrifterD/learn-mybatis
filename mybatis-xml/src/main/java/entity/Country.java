/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: Country.java
 * Author:   bigmoon
 * Date:     19-9-20 上午12:11
 * Description: mybatis-learning
 */

package entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 */
public class Country implements Serializable {

    private static final long serialVersionUID = 5684150569837207784L;
    private Integer id;

    private String countryname;
    private String countrycode;
    private CountryStatusEnum status;
    private Boolean status2;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public CountryStatusEnum getStatus() {
        return status;
    }

    public void setStatus(CountryStatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("id=").append(id);
        sb.append(", countryname='").append(countryname).append('\'');
        sb.append(", countrycode='").append(countrycode).append('\'');
        sb.append(", status=").append(status);
        sb.append(", status2=").append(status2);
        sb.append('}');
        return sb.toString();
    }

    public Boolean getStatus2() {
        return status2;
    }

    public void setStatus2(Boolean status2) {
        this.status2 = status2;
    }

}
