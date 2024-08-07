
import org.junit.jupiter.api.Test;

import restaurant.dao.Tea;
import restaurant.dao.TeaDAO;
import restaurant.dao.TeaDAOImpl;

public class TeaDaoTest {

	@Test
	public void createTeaTest() {
		
		TeaDAO teaDAO = new TeaDAOImpl();
		Tea tea = new Tea();
		tea.setTeaName("GingerTea");
		teaDAO.createTea(tea);
	}
}
