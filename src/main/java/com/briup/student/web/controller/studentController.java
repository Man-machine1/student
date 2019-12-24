package com.briup.student.web.controller;

import com.briup.student.util.Message;
import com.briup.student.util.MessageUtil;
import com.briup.student.util.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")
public class studentController {
    @PostMapping("/add")
    @ApiOperation(value = "添加学生")
    public Message add(Student student){
//        Message<String> message = new Message<>();
//        Date data = new Date();
//        message.setTime(data.getTime());  //得到毫秒数
//        message.setStatus(200);
//        message.setMessage("success");
//        message.setData("添加学生成功");
//        return message;
        return MessageUtil.success("添加成功");

    }
//    @GetMapping("/delete")
//    pubilc Message delete(){
////        Message<String> message = new Message<>();
////        message.setStatus(200);
////        message.setMessage("success");
////        message.setTime(new Date().getTime());
////        message.setData("删除学生成功");
////        return message;
//
//    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuId",value = "学号", paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "name",value = "姓名", paramType = "query",dataType = "String")
    })

    public Message delete(int stuId,String name){
        return MessageUtil.success("删除成功");
    }
}
