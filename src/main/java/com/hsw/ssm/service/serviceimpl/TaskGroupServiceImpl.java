package com.hsw.ssm.service.serviceimpl;

import com.hsw.ssm.dao.TaskGroupMapper;
import com.hsw.ssm.model.TaskGroup;
import com.hsw.ssm.model.TaskGroupExample;
import com.hsw.ssm.service.TaskGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TaskGroupServiceImpl implements TaskGroupService {

    @Resource
    TaskGroupMapper mapper;

    /**
     * 通过id 获取对象
     *
     * @param id
     * @return
     */
    @Override
    public TaskGroup getItemById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertItem(TaskGroup taskGroup) {
        return mapper.insertSelective(taskGroup);
    }
}
