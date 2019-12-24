package com.briup.student.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class Student implements Serializable {
    @ApiModelProperty(value = "学生ID",required = true)   //required必须输入
    private int id;
    @ApiModelProperty(value = "学生姓名")
    private String name;
    @ApiModelProperty(value = "学生成绩")
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
