package org.saitechshoppingcart.dao;

import org.saitechshoppingcart.entity.Account;

public interface AccountDAO {

	public Account findAccount(String userName);

}