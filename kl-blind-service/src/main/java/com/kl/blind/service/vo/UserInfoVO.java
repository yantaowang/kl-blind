package com.kl.blind.service.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserInfoVO implements Serializable {

    /**
     * id
     */
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

    private List<String> urlList;
}
