package com.mck.designpattern.factory;

public class NotificationFactory {
	
	
	public static Notification getNotifcationway( String type) {
		
		if (type.equalsIgnoreCase("NotificationBySMS")){
			
			return new NotificationBySMS();
		}
		else if (type.equalsIgnoreCase("NotificationByEmail")) {
			return new NotificationByEmail();
		}
		
		return null;
		
	}

}
