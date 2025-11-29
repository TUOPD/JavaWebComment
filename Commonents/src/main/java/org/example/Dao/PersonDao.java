package org.example.Dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.Comment.pojo.Person;
import org.example.Comment.pojo.QueryDTO;
import org.example.Mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonDao {
    @Autowired
    private PersonMapper personMapper;

    public List<Person> getallPerson(){
        return personMapper.selectList(new QueryWrapper());
    }
    public Page<Person> getPage(int pageNum, int pageSize) {
        Page<Person> page = new Page<>(pageNum, pageSize);
        QueryWrapper query = new QueryWrapper();
        return personMapper.selectPage(page, query);
    }
    public Page<Person> findUsersByConditions(QueryDTO queryDTO) {
        Page<Person> pageRequest = new Page<>(queryDTO.getPageNum(), queryDTO.getPageSize());

        pageRequest.setRecords(  personMapper.selectByQueryDTO(pageRequest, queryDTO));
        return pageRequest;
    }
    public int insertPerson(Person person){
        return personMapper.insert(person);
    }
    public int deleteByids(List<Person> people){
        List<Integer> idList = people.stream()
                .map(Person::getId)
                .collect(Collectors.toList());
        return  personMapper.deleteBatchIds(idList);
    }
}
