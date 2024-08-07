import org.junit.jupiter.api.Test;

import restaurant.dao.Snacks;
import restaurant.dao.SnacksDAO;
import restaurant.dao.SnacksDAOImpl;

public class SnacksDAOTest {

	@Test
	public void createSnacksTest() {
		SnacksDAO snacksDAO = new SnacksDAOImpl();
		Snacks snacks = new Snacks();
		snacks.setSnacksName("Samosa");
		snacksDAO.createSnacks(snacks);
		
	}
}
