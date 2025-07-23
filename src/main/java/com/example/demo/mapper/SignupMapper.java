package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.entity.UserInfo;
import com.example.demo.form.SignupForm;

@Mapper(componentModel = "spring")
public interface SignupMapper {

    @Mapping(target = "password", ignore = true)
    UserInfo signupFormToUserInfo(SignupForm form);
}
