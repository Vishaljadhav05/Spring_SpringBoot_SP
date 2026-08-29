package in.beans;

// This bean will be created using spring XML configuration

public class BeanOne 
{
	private String nameOne;

	public String getNameOne() {
		return nameOne;
	}

	public void setNameOne(String nameOne) {
		this.nameOne = nameOne;
	} 
	
	public void dispBeanNameOne() 
	{
		System.out.println("Bean Name One: "+ nameOne);
	}
}
