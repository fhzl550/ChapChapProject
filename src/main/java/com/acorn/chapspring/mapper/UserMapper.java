package com.acorn.chapspring.mapper;

import com.acorn.chapspring.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int updateStatusByUidAndEmailCheckCode(UserDto user); //이메일 인증 코드
    UserDto findByUserId(String userId);//유저 정보
    UserDto findByUserIdAndPw(UserDto user);//로그인 정보 비교
    String findByUserIdByEmailAndName(UserDto user);//아이디 찾기

    int updateOne(UserDto user);//유저정보 수정
    int insertOne(UserDto user);//유저 등록
    int deleteByUserIdAndPw(UserDto user);//유저 삭제
    int setLoginUserId(String userId);
    int setLoginUserIdIsNull();
    //아이디 중복 검사
    int idCheck(String userId);
    //닉네임 중복 검사
    int nickName_Check(String nickname);
    //이메일 중복 검사
    int email_Check(String email);
}
