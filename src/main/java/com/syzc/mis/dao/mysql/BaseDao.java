package com.syzc.mis.dao.mysql;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDao<T> {
    Boolean add(@Param("entity") T entity);

    Long addAll(@Param("entities") List<T> entities);

    Boolean remove(Long id);

    Boolean update(@Param("entity") T entity);

    T get(Long id);

    List<T> list(@Param("offset") Long offset, @Param("size") Integer size);

    Long count();

    List<T> listAll();

    Boolean exists(Long id);
}