package com.cathay.cathaydomain.convertor;

/**
 * Created by jamestang on 2018/9/21.
 */

/**
 * @param <O> DTO  param
 * @param <E> Entity
 * @param <D> DO  (data Object)
 */
public interface ConvertorI<O, E, D> {


    /**
     * DTo to  Entity
     *
     * @param o
     * @return
     */
    public E clientToEntity(O o);

    /**
     * Entity to dto
     *
     * @param e
     * @return
     */
    public O entityToClient(E e);

    /**
     * Do to dto
     *
     * @param d
     * @return
     */
    public O dataToClient(D d);

    /**
     * do to Entity
     *
     * @param d
     * @return
     */
    public E dataToEntity(D d);
}
