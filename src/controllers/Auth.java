package controllers;

import views.AuthView;

public class Auth {
	
	public AuthView vista;

	public Auth() {
		// TODO Auto-generated constructor stub
		vista = new AuthView();
	}
	
	public void login() 
	{
		vista.login();
	}
	
	public void register() {
		vista.register();
	}

}
