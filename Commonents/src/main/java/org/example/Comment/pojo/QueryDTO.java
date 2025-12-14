package org.example.Comment.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import lombok.Data;
@Data
@Schema(name = "查找类" ,description = "查找参数")
public class QueryDTO {
    @Schema(name = "页码")
    private Integer pageNum;
    @Schema(name = "每一页大小")
    private Integer pageSize;
    @Schema(name = "用户名称")
    private String username;
    @Schema(name = "电话")
    private Integer telephone;
    @Schema(name = "是否离职")
    private Boolean isCompany;
    @Schema(name = "年龄")
    private int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Schema(name = "入职时间")
    private LocalDate inCompanytimemin;
    @Schema(name = "离职时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inCompanytimemax;
}
