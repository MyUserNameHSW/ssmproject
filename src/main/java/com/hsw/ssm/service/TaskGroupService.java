package com.hsw.ssm.service;

import com.hsw.ssm.model.TaskGroup;

public interface TaskGroupService {
    /**
     * 通过id 获取对象
     * @param id
     * @return
     */
    TaskGroup getItemById(int id);
}
