package com.mck.designpattern.factory;

import java.util.List;

public class NotificationByEmail implements Notification {

	@Override
	public void notifyUser(List<String> users) {
		// TODO Auto-generated method stub
		System.out.println("All the users have been notified by Email");
	}

}
