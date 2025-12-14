package org.example.Comment.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@Schema(name = "Person", description = "用户信息实体类")
@AllArgsConstructor
public class Person {
    @Schema(name = "用户id")
    private int id;
    @Schema(name = "用户姓名")
    private String username;
    @Schema(name = "地址")
    private String address;
    @Schema(name = "年龄")
    private int Age;
    @Schema(name = "生日")
    private LocalDate Birthday;
    @Schema(name = "入职时间" ,description = "格式：yy-mm-dd")
    private LocalDate inCompanytime;
    @Schema(name = "电话")
    private int telephone;
    @Schema(name = "是否在职")
    private Boolean isCompany;
}
