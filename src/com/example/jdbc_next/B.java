package com.example.jdbc_next;

import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.connection.SimpleJDBCConnectionPool;
import com.vaadin.ui.Notification;

public class B {
	public B(){
	
	try{
		String driverClass = "com.mysql.jdbc.Driver";
		//String driverClass = "org.gjt.mm.mysql.Driver";
		//Class.forName(driverClass);
		String url = "jdbc:mysql://localhost:3306/feedback";
		//jdbc:mysql://<HOST>:<PORT>/<DB>
		String username = "admin";
		String password = "sameboy";
		
		JDBCConnectionPool pool = new SimpleJDBCConnectionPool(driverClass, url, username, password,2,5 );
		}catch(Exception e){
			Notification.show(e.getMessage());
			System.out.println(e.getMessage());
		}
	}

}
