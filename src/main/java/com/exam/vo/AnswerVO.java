package com.exam.vo;

import lombok.Data;

@Data
public class AnswerVO {
    private String question; //问题
    private String subject; //学科
    private String score;  //分数
    private String section; //章节
    private String level;  //难度
    private String type;   //类型
}
