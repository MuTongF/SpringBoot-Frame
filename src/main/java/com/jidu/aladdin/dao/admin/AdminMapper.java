package com.jidu.aladdin.dao.admin;

import com.jidu.aladdin.common.PageResult;
import com.jidu.aladdin.entity.admin.AdminDemo;

import java.util.List;

public interface AdminMapper {
    List<AdminDemo> getAllAdminList(PageResult<AdminDemo> pageResult);
}
