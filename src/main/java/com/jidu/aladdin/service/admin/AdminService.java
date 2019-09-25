package com.jidu.aladdin.service.admin;

import com.jidu.aladdin.common.PageResult;
import com.jidu.aladdin.entity.admin.AdminDemo;

import java.util.List;

public interface AdminService {
    PageResult<AdminDemo> getAllAdminList(PageResult<AdminDemo> pageResult);
}
