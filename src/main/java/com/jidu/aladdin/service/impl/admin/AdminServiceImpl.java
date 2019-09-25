package com.jidu.aladdin.service.impl.admin;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jidu.aladdin.common.PageResult;
import com.jidu.aladdin.dao.admin.AdminMapper;
import com.jidu.aladdin.entity.admin.AdminDemo;
import com.jidu.aladdin.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public PageResult<AdminDemo> getAllAdminList(PageResult pageResult) {
        pageResult.setPage((pageResult.getPage()-1)*pageResult.getLimit());
        Page pa = PageHelper.startPage(pageResult.getPage(), pageResult.getLimit());
        List<AdminDemo> list = adminMapper.getAllAdminList(pageResult);
        return  PageResult.newInstance(pa.getPages(),list);
    }
}
