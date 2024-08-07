package restaurant.dao;

import java.util.List;

public class TeaDAOImpl implements TeaDAO {
	@Override
	public void createTea(Tea s) {
		// TODO Auto-generated method stub
		System.out.println("created...Tea "+s.getTeaName());
	}

	@Override
	public Tea readTea(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tea> readTea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void udpateTea(Tea s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTea(int s) {
		// TODO Auto-generated method stub

	}

}
