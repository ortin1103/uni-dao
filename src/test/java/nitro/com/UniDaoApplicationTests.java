package nitro.com;

import nitro.com.DAO.StudentsDao;
import nitro.com.Entity.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest

public class UniDaoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(UniDaoApplicationTests.class);

	@Autowired
	StudentsDao studentsDao;


	@Before
	@Rollback(false)

	public void setStudentsRepo() {
		Student evg = new Student("Evgen", "first");
		evg.addPassport(new String("KO 12003131132"));
		Student rom = new Student("Roman", "second");
//		rom.addPassport(new String("KO 6545614443"));
//		Student serg = new Student("Sergey", "Third");
//		serg.addPassport(new StudentDetail("KO 54544356444"));
//		Student al = new Student("Alex", "Fourth");
//		al.addPassport(new StudentDetail("KO 986564127+6"));
//		Student dev = new Student("David", "Fifth");
//		dev.addPassport(new StudentDetail("KO 741672167256"));
//		Student jer = new Student("Jereck", "Sixth");
//		jer.addPassport(new StudentDetail("KO 1755627127"));
//		Student mav = new Student("Maverick", "Seventh");
//		mav.addPassport("KO 51796712571976");
//		Student tay = new Student("Taylon", "Eighth");
//		tay.addPassport("KO 57517917549");
//		Student tays = new Student("Tayson", "Ninth");
//		tays.addPassport("KO 5196277");
//		Student sed = new Student("Sed", "Tenth");
//		sed.addPassport("KO 987549754975");
//		Student sey = new Student("Seymon", "eleventh");
//		sey.addPassport("KO 759517179");
//		Student art = new Student("Artur", "twelfth");
//		art.addPassport("KO 787563768");
//		Student and = new Student("Andry", "thirteenth");
//		and.addPassport("KO 786586757");
//		Student git = new Student("Git", "fourteenth");
//		git.addPassport("KO 867485656658");
//		Student lio = new Student("Lion", "fifteenth");
//		lio.addPassport("KO 768486846348");
//		Student pol = new Student("Poly", "sixteenth");
//		pol.addPassport("KO 87696836");
//		Student rmk = new Student("Romik", "seventeenth");
//		rmk.addPassport("KO 7897453675");
//		studentsDao.save(Arrays.asList(evg, rom, serg, al, dev, jer, mav, tay, tays, sed, sey, art, and, git, lio, pol, rmk));
//		studentsDao.save(Arrays.asList(evg, rom, serg, al, dev, jer));
		studentsDao.save(Arrays.asList(evg,rom));
	}

	@Test
	public void testCoint() {
		logger.info("**********Numbers student*********");
		logger.info("All number students: " + studentsDao.count());
	}


//
//	@Test
//	public void list(){
//		logger.info("**********Second name*****");
//		studentsDao.findBySecondName("Seventh");
//	}
	@Test
	public void testFingAll() {
		logger.info("**********Find All*****");
		Iterable<Student> studentss = studentsDao.findAll();

		for (Student students : studentss) {
			logger.info("Student: " + students.toString());

		}
	}
}
