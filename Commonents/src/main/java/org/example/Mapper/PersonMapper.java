package org.example.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.Comment.pojo.Person;
import org.example.Comment.pojo.QueryDTO;

import java.util.List;

@Mapper
public interface PersonMapper extends BaseMapper<Person> {
    List<Person> selectByQueryDTO(Page<Person> page, @Param("query") QueryDTO queryDTO);
}
