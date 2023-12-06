package com.cm.model.dto.questionsubmit;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 题目提交请求
 *
 * @author <a href="https://github.com/abuziming">程序员鱼皮</a>
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {
    /**
     * 提交的编程语言
     */
    private String language;
    /**
     * 提交人userid
     */
    private Long userid;
    /**
     * 提交代码
     */
    private String code;
    /**
     * 问题id
     */
    private  Long questionId;

}