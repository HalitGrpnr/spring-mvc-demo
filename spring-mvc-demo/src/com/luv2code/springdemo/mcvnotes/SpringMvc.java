package com.luv2code.springdemo.mcvnotes;

public class SpringMvc {

	/*
	 Components of a Spring MVC Application:
	 - A set of web pages to layout UI components 
	 - A collecion of Spring beans: controller, services, etc...
	 - Spring configuration: XML, annotation or pure java
	 
	 Behind the scene:
	 - Spring MCV Front Controller:
	 	 İlk olarak istekler front controller'a gelir, yani dispatcher servlet'e
	 	 Bunu spring otomatik yapıyor, dispatcher servlet yazmaya gerek yok.
	 	 yazacağımız şey: Model, view ve controller 
	 	 
	 - Controller:
	 	business logic'in olduğu yer. temel olarak şunlar yapılır:
	 	- hadle request
	 	- read some form data
	 	- take, store, retrieve data
	 	- connect to database or web service
	 	
	 	 datayı al modele koy 
	 	 
	 - Model
	 	contains data. shipping data between various parts of MVC
	 	
	 - View Template 
	 	modeldeki datayı okuyup ekrana basar. 
	 	Jsp, jstl and etc...
	  
	  
	  Spring MVC Configuration Process:
	  	
	  	Part - 1
	  	
	  	Add configurations to file: WEB-INF/web.xml
	  	1. Configure Spring MVC dispatcher servlet
	  	2. Set up URL mappings to Spring MVC Dispatcher Servlet
	  	
	  	Part - 
	  	
	  	Add configurations to file: WEB-INF/spring-mvc-demo-servlet.xml
	  	3. Add support for Spring component scanning 
	  	4. Add support for conversion, formatting and validatio
	  	5. Configure Spring MCV View Resolver 
	  
	 * */
	
}















