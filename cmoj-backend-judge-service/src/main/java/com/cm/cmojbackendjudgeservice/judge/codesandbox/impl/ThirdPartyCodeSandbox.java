package com.cm.cmojbackendjudgeservice.judge.codesandbox.impl;


import com.cm.cmojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.cm.model.cmojsandbox.ExecuteCodeRequest;
import com.cm.model.cmojsandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
