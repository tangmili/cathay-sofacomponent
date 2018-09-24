package com.cathay.cathaydomain.entity;

import javax.naming.Name;
import java.io.Serializable;

/**
 * Created by jamestang on 2018/9/20.
 */
public abstract class Entity implements Serializable {

    public String entityName() {
        return this.getClass().getName();
    }
}
