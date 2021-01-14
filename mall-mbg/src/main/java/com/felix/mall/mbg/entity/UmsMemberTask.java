package com.felix.mall.mbg.entity;

/**
 * 这是MyBatis Generator自动生成的Model Class.
 * 对应的数据表是 : ums_member_task
 * @author Felix
 * @date 2021-01-14 21:14:09
 */
public class UmsMemberTask {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 赠送成长值
     */
    private Integer growth;

    /**
     * 赠送积分
     */
    private Integer intergration;

    /**
     * 任务类型：0->新手任务；1->日常任务
     */
    private Integer type;

    public UmsMemberTask(Long id, String name, Integer growth, Integer intergration, Integer type) {
        this.id = id;
        this.name = name;
        this.growth = growth;
        this.intergration = intergration;
        this.type = type;
    }

    public UmsMemberTask() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getIntergration() {
        return intergration;
    }

    public void setIntergration(Integer intergration) {
        this.intergration = intergration;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}