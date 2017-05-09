package com.wipro.bank.assessment;

import com.wipro.bank.entity.Account;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static final List<Account> accounts = new ArrayList<Account>();
	private List<Account> emp2;

	public Account getAccountDetailsByID(int id) {
		Account emp1 = null;
		for (Account e : accounts) {
			if (e.getAccountID() == id) {
				emp1 = e;
			}

		}
		return emp1;

	}

	public List<Account> getAccountDetailsByBalance(double amount) {

		emp2 = new ArrayList<Account>();
		for (Account e : accounts) {
			if (e.getBalance() >= amount) {
				emp2.add(e);
			}
		}
		if (emp2.size() == 0) {
			emp2 = null;
		}
		return emp2;

	}

	public static void main(String[] args) {

		accounts.add(new Account(1, "Dhoni", 1001.11));
		accounts.add(new Account(2, "Raina", 2001.13));
		accounts.add(new Account(3, "Kohli", 3001.22));
		accounts.add(new Account(4, "Rohit", 4001.55));
		accounts.add(new Account(5, "Jaddu", 5001.77));
		accounts.add(new Account(6, "Ash", 6001.22));
		accounts.add(new Account(7, "Mojo", 7001.11));
		accounts.add(new Account(7, "Sachin", 8001.99));

		App temp = new App();
		System.out.println(temp.getAccountDetailsByID(1));
		System.out.println(temp.getAccountDetailsByBalance(5001.77));

	}
}
