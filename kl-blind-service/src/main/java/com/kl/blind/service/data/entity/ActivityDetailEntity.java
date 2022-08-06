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
 * 活动表
 * </p>
 *
 * @author wyt
 * @since 2022-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("activity_detail")
public class ActivityDetailEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * id
     */
    private Long activityId;

    /**
     * url
     */
    private String url;

    /**
     * 活动详情
     */
    private String detail;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建时间
     */
    private LocalDateTime updateTime;


}
