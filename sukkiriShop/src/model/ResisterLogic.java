package model;

import dao.AccountDAO;

public class ResisterLogic {
	public boolean execute(Account ac) {
	    AccountDAO dao = new AccountDAO();
	    int account = dao.create(ac);
	    return account != 0;
	  }
}
