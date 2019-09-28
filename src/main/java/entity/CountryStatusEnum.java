/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CountryStatusEnum.java
 * Author:   bigmoon
 * Date:     19-9-20 上午2:15
 * Description: mybatis-learning
 */

package entity;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 20191030
 */
public enum CountryStatusEnum {

    /**
     *
     * @since 20191030
     */
    ACTIVE(Byte.valueOf("1"),"生效"),
    /**
     *
     * @since 20191030
     */
    INACTIVE(Byte.valueOf("2"),"失效");
    private Byte code;
    private String desc;

    CountryStatusEnum(Byte code,String desc){
        this.code=code;
        this.desc=desc;
}

    public Byte getCode() {
        return code;
    }



    public String getDesc() {
        return desc;
    }


}
