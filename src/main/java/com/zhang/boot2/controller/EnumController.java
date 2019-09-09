package com.zhang.boot2.controller;

import com.zhang.boot2.entity.ResponseVO;
import com.zhang.boot2.entity.ResultEnum;
import com.zhang.boot2.entity.Role;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@Validated
public class EnumController {

    @GetMapping("/getEnum")
    public ResultEnum getEnum() {
        return ResultEnum.MIDDLE_SCHOOL;
    }

    @GetMapping("/aa")
    public ResponseVO getAa() {
        Role role = new Role(1, ResultEnum.PRIMARY_SCHOOL);

        return ResponseVO.success(role);
    }

    @GetMapping("/bb")
    public ResponseVO getBb(@RequestParam("school") @NotNull(message = "school不能为空") ResultEnum school) {
        Role role = new Role(1, school);

        return ResponseVO.success(role);
    }

}
