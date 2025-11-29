package org.example.Comment.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import lombok.Data;
@Data
public class QueryDTO {
    private Integer pageNum;
    private Integer pageSize;
    private String username;
    private Integer telephone;
    private Boolean isCompany;
    private int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inCompanytimemin;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inCompanytimemax;
}
