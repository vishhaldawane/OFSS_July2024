package restaurant.dao;

import java.util.List;

public interface TeaDAO {
	void createTea(Tea s);
	Tea readTea(int id);
	List<Tea> readTea();
	
	void udpateTea(Tea s);
	void deleteTea(int s);
}
