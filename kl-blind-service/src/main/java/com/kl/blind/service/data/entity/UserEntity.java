package com.kl.blind.service.data.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wyt
 * @since 2022-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 微信OPENID
     */
    private String openId;

    /**
     * unionId
     */
    private String unionId;

    /**
     * 微信头像
     */
    private String wxAvatar;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 名字
     */
    private String nickname;

    /**
     * 体重
     */
    private Integer weight;

    /**
     * 身高
     */
    private Integer height;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 户籍省
     */
    private String registerProvince;

    /**
     * 户籍市
     */
    private String registerCity;

    /**
     * 户籍区
     */
    private String registerArea;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 有无子女
     */
    private Integer hasChildren;

    /**
     * 受教育程度
     */
    private Integer education;

    /**
     * 学校
     */
    private String university;

    /**
     * 工作
     */
    private String work;

    /**
     * 出生日期
     */
    private String birth;

    /**
     * 平均月薪
     */
    private Integer income;

    /**
     * 婚姻状况
     */
    private Integer marry;

    /**
     * 京房
     */
    private Integer bjHouse;

    /**
     * 非京房
     */
    private Integer noBjHouse;

    /**
     * 爱好
     */
    private String hobby;

    /**
     * 自我介绍
     */
    private String introduction;

    /**
     * 账号状态
     */
    private Boolean status;

    /**
     * 最近登录时间
     */
    private LocalDate loginTime;

    /**
     * 是否删除标致（0未删除， 1已删除）
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建时间
     */
    private LocalDateTime updateTime;


}
