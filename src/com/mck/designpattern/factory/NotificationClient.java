package com.mck.designpattern.factory;

import java.util.List;

public class NotificationClient {
	
	public static void main(String args[]) {
		
		NotificationFactory fact = new NotificationFactory();
		
		Notification notification = fact.getNotifcationway("NotificationBySMS");
		notification.notifyUser(null);
		
	}
	

}
