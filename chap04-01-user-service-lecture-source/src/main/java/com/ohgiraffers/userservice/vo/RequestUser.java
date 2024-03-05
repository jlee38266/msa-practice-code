package com.ohgiraffers.userservice.vo;

import lombok.Data;

/* 설명. 회원가입을 위해 넘어온 사용자 정보를 받아줄 command 객체용 Vo 생성*/
@Data
public class RequestUser {
    private String name;
    private String email;
    private String pwd;
}
