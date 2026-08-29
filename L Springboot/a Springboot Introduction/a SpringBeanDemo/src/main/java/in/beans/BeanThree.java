package in.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanThree 
{
	@Value("Komal")
	private String nameThree;

	public String getNameThree() {
		return nameThree;
	}

	public void setNameThree(String nameThree) {
		this.nameThree = nameThree;
	}
	
	public void dispBeanThreeName() 
	{
		System.out.println("Bean Name Three: "+ nameThree);
	}
}
