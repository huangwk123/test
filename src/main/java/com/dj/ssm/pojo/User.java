package com.dj.ssm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {

    String aa = "aaa";
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("user_name")
    private String userName;

    private String userPwd;

    private Integer isDel;

}
