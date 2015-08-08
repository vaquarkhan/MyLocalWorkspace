package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchExamTitle;
@Repository("schExamTitleRepository")
public interface SchExamTitleRepository extends CrudRepository< SchExamTitle,Integer> {

}
