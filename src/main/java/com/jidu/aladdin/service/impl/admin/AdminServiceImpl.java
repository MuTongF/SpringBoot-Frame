package com.jidu.aladdin.service.impl.admin;

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
    public List<AdminDemo> getAllAdminList() {
        return adminMapper.getAllAdminList();
    }
}
