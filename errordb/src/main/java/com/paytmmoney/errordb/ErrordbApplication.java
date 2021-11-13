package com.paytmmoney.errordb;

/*import com.paytmmoney.equities.bo.commonuser.annotation.EnableBOUserCommon;
import com.paytmmoney.equities.bo.commonutils.annotations.EnableBOCommon;*/
import com.paytmmoney.errordb.repository.BeanTest;
import com.paytmmoney.errordb.repository.User;
import com.paytmmoney.errordb.service.SystemErrorInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@EnableBOUserCommon
@EnableBOCommon*/
public class ErrordbApplication {

	/*@Autowired
	private static ApplicationContext applicationContext;*/



	public static void main(String[] args) {

		SpringApplication.run(ErrordbApplication.class, args);

	}

	/*private static String[] printBeans() {
		AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
		if (autowireCapableBeanFactory instanceof SingletonBeanRegistry) {
			String[] singletonNames = ((SingletonBeanRegistry) autowireCapableBeanFactory).getSingletonNames();
			for (String singleton : singletonNames) {
				System.out.println(singleton);
			}
			return singletonNames;
		}
		return null;
	}

	public static void displayAllBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames) {
			System.out.println(beanName);
		}
	}*/





}


