package in.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanTwo 
{
	@Value("Samay")
	private String nameTwo;

	public String getNameTwo() {
		return nameTwo;
	}

	public void setNameTwo(String nameTwo) {
		this.nameTwo = nameTwo;
	}
	
	public void dispBeanNameTwo() 
	{
		System.out.println("Bean Name Two: "+ nameTwo);
	}
}
