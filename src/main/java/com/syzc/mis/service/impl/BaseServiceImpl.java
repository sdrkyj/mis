package com.syzc.mis.service.impl;

import com.syzc.mis.dao.mysql.BaseDao;
import com.syzc.mis.service.BaseService;
import com.syzc.util.Page;
import com.syzc.util.PageUtil;

import java.util.List;

public abstract class BaseServiceImpl<T, Q extends BaseDao<T>> implements BaseService<T, Q> {
    abstract protected BaseDao<T> getDao();

    @Override
    public Boolean remove(Long id) {
        return getDao().remove(id);
    }

    @Override
    public Boolean update(T entity) {
        return getDao().update(entity);
    }

    @Override
    public T get(Long id) {
        return getDao().get(id);
    }

    @Override
    public Page<T> list(Integer pageNo, Integer size) {
        Long total = getDao().count();
        Page<T> page = PageUtil.make(pageNo, size, total);
        page.setList(getDao().list(page.getRowOffset(), page.getPageSize()));
        return page;
    }

    @Override
    public List<T> listAll() {
        return getDao().listAll();
    }
}