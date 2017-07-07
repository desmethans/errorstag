package org.example;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// enkele imports
@Configuration
@EnableWebMvc
@ComponentScan
class ControllersConfig extends WebMvcConfigurerAdapter {
	@Bean
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/JSP/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	@Bean
	MessageSource messageSource() {
	ReloadableResourceBundleMessageSource source 
	= new ReloadableResourceBundleMessageSource();
	source.setBasename("classpath:messages"); 
	source.setFallbackToSystemLocale(false); 
	return source;
	}
}