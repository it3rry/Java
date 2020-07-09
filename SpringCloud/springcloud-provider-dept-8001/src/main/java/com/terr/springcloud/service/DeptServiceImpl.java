package com.terr.springcloud.service;

import com.terr.springcloud.dao.DeptDao;
import com.terr.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    public DeptServiceImpl(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryall() {
        return deptDao.queryall();
    }
}
