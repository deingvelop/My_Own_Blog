package com.innovation.myownblog.dto.responseDto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CheckResponse {
    private boolean success;
    private boolean data;
    private String message;
    private String error;

    public CheckResponse(boolean password_receive){
        this.success = true;
        this.data = password_receive;
        this.message = makeMessage(password_receive);
        this.error = null;
    }

    private String makeMessage(boolean password_receive) {
        return (password_receive) ? "올바른 비밀번호입니다." : "비밀번호가 틀렸습니다.";
    }
}
