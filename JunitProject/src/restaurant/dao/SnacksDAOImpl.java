package restaurant.dao;

import java.util.List;

public class SnacksDAOImpl implements SnacksDAO {

	@Override
	public void createSnacks(Snacks s) {
		// TODO Auto-generated method stub
		System.out.println("created...snacks "+s.getSnacksName());
	}

	@Override
	public Snacks readSnacks(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Snacks> readSnacks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void udpateSnacks(Snacks s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSnacks(int s) {
		// TODO Auto-generated method stub

	}

}
