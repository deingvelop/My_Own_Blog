package com.innovation.myownblog.dto.responseDto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreatePostResponseDto {
    private boolean success;
    private String message;
    private String error;

    public CreatePostResponseDto(Long id){
        this.success = true;
        this.message = "글 작성이 완료되었습니다.";
        this.error = null;
    }
}