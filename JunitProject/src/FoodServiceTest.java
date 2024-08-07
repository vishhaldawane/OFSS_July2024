import org.junit.jupiter.api.Test;

import restaurant.dao.Snacks;
import restaurant.dao.SnacksDAO;
import restaurant.dao.SnacksDAOImpl;
import restaurant.dao.Tea;
import restaurant.dao.TeaDAO;
import restaurant.dao.TeaDAOImpl;
import restaurant.service.FoodService;

public class FoodServiceTest {
	@Test
	public void serveTest() {
		
		SnacksDAO snacksDAO = new SnacksDAOImpl();
		TeaDAO teaDAO = new TeaDAOImpl();
		
		Snacks snacks = new Snacks();
		snacks.setSnacksName("SAMOSA");
		snacksDAO.createSnacks(snacks); //insert query fired
		
		Tea tea = new Tea();
		tea.setTeaName("Ginger Tea");
		teaDAO.createTea(tea); //insert query fired
		
		FoodService foodService = new FoodService();
		foodService.serveTheFood(snacks.getSnacksName(), tea.getTeaName());
		
		
		
		
	}
}
