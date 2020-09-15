package com.kuang.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;

    //学生需要关联的老师
    private Teacher teacher;
}
