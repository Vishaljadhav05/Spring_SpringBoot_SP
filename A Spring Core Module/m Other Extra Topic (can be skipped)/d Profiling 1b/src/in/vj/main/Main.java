package in.vj.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import in.vj.beans.Student;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		
		System.setProperty("spring.profiles.active", "production");
		
		String[] resourceLocation = {
				"/in/vj/resources/applicationContext-development.xml",
				"/in/vj/resources/applicationContext-production.xml",
				"/in/vj/resources/applicationContext-testing.xml"
				
		};
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load(resourceLocation);
	
		context.refresh();	
		Student std = (Student) context.getBean("stdId");
		std.disp();
		
		
	}
}

// Output:-

/*

Name : Rakesh : Productiion team

*/