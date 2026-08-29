package in.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.beans.BeanThree;

@Configuration
public class BeanThreeConfig 
{
	@Bean
	public BeanThree createBeanThree()
	{
		return new BeanThree();
	}
}
