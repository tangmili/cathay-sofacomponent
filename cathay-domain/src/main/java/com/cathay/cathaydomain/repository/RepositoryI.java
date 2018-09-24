package com.cathay.cathaydomain.repository;

/**
 * Created by jamestang on 2018/9/21.
 */
public interface RepositoryI<E> {


    public void persist(E e);

}
