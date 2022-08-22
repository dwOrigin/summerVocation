package com.gk.springboot.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 讲师
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("edu_teacher")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教师ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 教师名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 教师资历,一句话说明老师
     */
    @TableField("EDUCATION")
    private String education;

    /**
     * 教师简介
     */
    @TableField("CAREER")
    private String career;

    /**
     * 头衔 1高级讲师2首席讲师
     */
    @TableField("IS_STAR")
    private Boolean isStar;

    /**
     * 图片路径
     */
    @TableField("PIC_PATH")
    private String picPath;

    /**
     * 状态:0正常1删除
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME",fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATE_TIME",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 专业ID
     */
    @TableField("SUBJECT_ID")
    private Integer subjectId;

    /**
     * 排序
     */
    @TableField("SORT")
    private Integer sort;


}
