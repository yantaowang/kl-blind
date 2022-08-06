package com.kl.blind.service.data.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 择偶条件
 * </p>
 *
 * @author wyt
 * @since 2022-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_condition")
public class UserConditionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 年龄范围
     */
    private String agerange;

    /**
     * 身高范围
     */
    private String heightrange;

    /**
     * 教育程度
     */
    private Integer education;

    /**
     * 婚姻状况
     */
    private Integer maritalStatus;

    /**
     * 其他
     */
    private String other;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建时间
     */
    private LocalDateTime updateTime;


}
