package restaurant.dao;

import java.util.List;

public interface SnacksDAO {
	void createSnacks(Snacks s);
	Snacks readSnacks(int id);
	List<Snacks> readSnacks();
	
	void udpateSnacks(Snacks s);
	void deleteSnacks(int s);
}
