package com.yang.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年04月16日
 */
public class CriteriaMale implements Criteria{

    private static final Integer MALE = 0;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(MALE.equals(person.getGender())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
