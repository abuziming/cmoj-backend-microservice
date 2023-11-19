package com.cm.cmojbackendjudgeservice.judge.codesandbox;


import com.cm.model.cmojsandbox.ExecuteCodeRequest;
import com.cm.model.cmojsandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
