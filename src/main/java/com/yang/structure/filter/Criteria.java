package com.yang.structure.filter;

import java.util.List;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年04月16日
 */
public interface Criteria {

    /**
     * 过滤返回
     *
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);
}
