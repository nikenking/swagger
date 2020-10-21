package com.dell.swagger.entitie;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@ApiModel("User类")
public class User {
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @ApiModelProperty("姓名")
    public String name;
    @ApiModelProperty("密码")
    public String password;
}
