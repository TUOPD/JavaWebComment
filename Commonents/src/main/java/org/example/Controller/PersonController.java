package org.example.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.Comment.Result;
import org.example.Comment.ResultCode;
import org.example.Comment.pojo.Person;
import org.example.Comment.pojo.QueryDTO;
import org.example.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "用户管理")
public class PersonController {
    @Autowired
    private PersonService personService;

    @Operation(summary = "获取第一页数据", description = "用户登录请求参数")
    @GetMapping("/getPage/first")
    public Result<Page<Person>> firstgetPerson(){
        return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),personService.getpageall(1,10));
    }
    @Operation(summary = "获取某一页数据",description = "获取某一页数据")
    @PostMapping("/getPage/getPageSelect")
    public Result<Page<Person>> getPageSelect(@RequestBody QueryDTO queryDTO){
        System.out.println(queryDTO.getPageNum()+"shuju"+queryDTO.getPageSize());
        return new Result<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),personService.getpageselect(queryDTO) );
    }
    @Operation(summary = "添加用户",description = "添加用户")
    @PostMapping("/insertPerson")
    public Result insertPerson(@RequestBody Person person){
        Boolean check = personService.insertpage(person);
        if (check){
            return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),null);
        }else {
            return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),
                    null);
        }
    }
    @Operation(summary = "删除用户",description = "删除用户")
    @PostMapping("/deletedByids")
    public Result deletedByids(@RequestBody List<Person> people){
        Boolean check = personService.deteledByids(people);
        if (check){
            return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), null);
        }else {
            return new Result(ResultCode.FAILURE.getCode(), ResultCode.FAILURE.getMessage(), null);
        }
    }
}
