package com.mck.designpattern.factory;

import java.util.List;

public class NotificationBySMS implements Notification {
	
	
	

	@Override
	public void notifyUser(List<String> users) {
		// TODO Auto-generated method stub
		
		System.out.println("All the user list have been notified by SMS ");
	}

}
