package com.cathay.cathaydomain.repository;

import java.util.List;

/**
 * Created by jamestang on 2018/9/21.
 */
public interface DataTunnel<T> {

    /**
     * @param params
     * @return
     */
    public List<T> findByCriteria(String... params);


    /**
     * @param 入库
     * @return
     */
    public T create(T t);


    /**
     * 依据主关键入库
     *
     * @param id
     * @return
     */
    public T get(String id);


    /**
     * 更新对象
     *
     * @param t
     */

    public int update(T t);


}
