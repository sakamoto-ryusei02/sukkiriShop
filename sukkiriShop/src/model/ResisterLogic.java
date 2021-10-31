package model;

import dao.AccountDAO;

public class ResisterLogic {
	public void execute(Account ac) {
	    AccountDAO dao1 = new AccountDAO();
	    dao1.create(ac);
	  }
}
