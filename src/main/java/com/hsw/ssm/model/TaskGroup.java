package com.hsw.ssm.model;

/**
 * 
 * task_group
 *
 */
public class TaskGroup {
    /**
     *
     * task_group.id
     *
     */
    private Integer id;

    /**
     *
     * task_group.groupName
     *
     */
    private String groupname;

    /**
     *
     * task_group.userId
     *
     */
    private Integer userid;

    /**
     */
    public Integer getId() {
        return id;
    }

    /**
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    /**
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}