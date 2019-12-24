package burip.student.demo.controller;

import burip.student.demo.bean.Student;
import burip.student.demo.util.Message;
import burip.student.demo.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.zip.DataFormatException;

@RestController
@Api(description = "学生控制器")
public class StudentController {


    @PostMapping("/add")
    @ApiOperation(value="添加学生")
    public Message add(Student student) {
/*      Message<String> message=new Message<>();
        Data data=new Date()
        message.setStatus(200);
        message.setMessage("success");
        message.setTime(data.get);*/

        return MessageUtil.success("添加学生成功");
    }



    @GetMapping("/detele")
    @ApiOperation(value="删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name="stuId",value="学号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value="姓名",paramType = "query",dataType = "String")


    })
    public Message detele(int stuId,String name ){


        return MessageUtil.success("删除学生成功");
    }





}
