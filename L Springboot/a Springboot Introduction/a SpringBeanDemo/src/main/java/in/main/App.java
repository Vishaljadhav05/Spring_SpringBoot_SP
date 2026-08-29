package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.BeanOne;
import in.beans.BeanThree;
import in.beans.BeanTwo;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/resources/applicationContext.xml");
        
        
        // ------------------ Getting all created beans id and class name --------------------------
        String[] beanNames = context.getBeanDefinitionNames();
        
        for (String beanDef : beanNames) 
        {
			System.out.println("Bean Id: "+beanDef);
			System.out.println("Bean Class: "+context.getBean(beanDef).getClass().toString());
			System.out.println("---------------------------------------");
		}
        
        BeanOne beanOne =  (BeanOne) context.getBean("beanOneId");
        beanOne.dispBeanNameOne();
        
        
        BeanTwo beanTwo = (BeanTwo) context.getBean("beanTwo");
        beanTwo.dispBeanNameTwo();
       
        
        BeanThree beanThree= (BeanThree) context.getBean("createBeanThree");
        beanThree.dispBeanThreeName();
    }
}

// Output:-

/*

Bean Id: beanTwo
Bean Class: class in.beans.BeanTwo
---------------------------------------
Bean Id: beanThreeConfig
Bean Class: class in.main.BeanThreeConfig$$SpringCGLIB$$0
---------------------------------------
Bean Id: org.springframework.context.annotation.internalConfigurationAnnotationProcessor
Bean Class: class org.springframework.context.annotation.ConfigurationClassPostProcessor
---------------------------------------
Bean Id: org.springframework.context.annotation.internalAutowiredAnnotationProcessor
Bean Class: class org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor
---------------------------------------
Bean Id: org.springframework.context.event.internalEventListenerProcessor
Bean Class: class org.springframework.context.event.EventListenerMethodProcessor
---------------------------------------
Bean Id: org.springframework.context.event.internalEventListenerFactory
Bean Class: class org.springframework.context.event.DefaultEventListenerFactory
---------------------------------------
Bean Id: beanOneId
Bean Class: class in.beans.BeanOne
---------------------------------------
Bean Id: createBeanThree
Bean Class: class in.beans.BeanThree
---------------------------------------
Bean Name One: Vishal
Bean Name Two: Samay
Bean Name Three: Komal


*/