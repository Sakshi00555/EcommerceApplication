package com.masai.util;

import com.masai.model.CurrentUserSession;
import com.masai.model.Customer;

public interface GetCurrentLoginUserSessionInterface {

    public CurrentUserSession getCurrentUserSession(String key);
	
	public Integer getCurrentUserSessionId(String key);
	
	public Customer getCurrentCustomer(String key);
	
}
