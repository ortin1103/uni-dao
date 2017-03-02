package nitro.com.DAO;

import nitro.com.Entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentsDao extends PagingAndSortingRepository<Student,Long> {


}
