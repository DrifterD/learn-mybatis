/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: StringUtils.java
 * Author:   bigmoon
 * Date:     19-9-20 下午3:43
 * Description: mybatis-learning
 */

package utils;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 20191030
 */
public class StringUtils {


    public static final Boolean isEmpty(String str){

        return null==str||str.trim().length()==0;
    }
}
