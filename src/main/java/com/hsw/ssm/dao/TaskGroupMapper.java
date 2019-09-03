package com.hsw.ssm.dao;

import com.hsw.ssm.model.TaskGroup;
import com.hsw.ssm.model.TaskGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    long countByExample(TaskGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    int deleteByExample(TaskGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    int insert(TaskGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    int insertSelective(TaskGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    List<TaskGroup> selectByExample(TaskGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    TaskGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    int updateByExampleSelective(@Param("record") TaskGroup record, @Param("example") TaskGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    int updateByExample(@Param("record") TaskGroup record, @Param("example") TaskGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    int updateByPrimaryKeySelective(TaskGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     */
    int updateByPrimaryKey(TaskGroup record);
}