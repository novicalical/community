package novicalical.community.mapper;

import novicalical.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * Created by novicalical on 2023/4/10
 */
@Mapper
@Service
public interface QuestionMapper {

    @Insert("insert into question (title,description_,gmt_create,gmt_modified,creator,tag) values (#{title},#{description_},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);
}
