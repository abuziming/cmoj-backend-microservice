package com.cm.model.dto.questionsubmit;

import com.cm.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 题目id
     */
    private Long questionId;
    /**
     * 题目状态
     */
    private Integer status;
    /**
     * 用户id
     */
    private Long userId;


    public static final long serialVersionUID = 1L;
}
