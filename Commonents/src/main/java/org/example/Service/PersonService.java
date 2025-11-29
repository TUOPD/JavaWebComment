package org.example.Service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.Comment.pojo.Person;
import org.example.Comment.pojo.QueryDTO;
import org.example.Dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.StyledEditorKit;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;
    public Page<Person> getpageall(int pageNum, int pageSize){
        return personDao.getPage(pageNum,pageSize);
    }
    public Page<Person> getpageselect(QueryDTO queryDTO){
        Page<Person> persons = personDao.findUsersByConditions(queryDTO);

        return  persons;
    }
    public Boolean insertpage(Person person){
        int check = personDao.insertPerson(person);
        if (check == 1){
            return true;
        }else {
            return false;
        }
    }
    @Transactional
    public Boolean deteledByids(List<Person> people){
        int length = people.size();
        int code = personDao.deleteByids(people);
        if (length == code){
            return true;
        }
        return false;
    }
}
