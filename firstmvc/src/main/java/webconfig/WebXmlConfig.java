package webconfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXmlConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class classArr[] = {SpringApplicationConfig.class};
		return classArr ;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String arrMapping[]= {"/"};
		return arrMapping;
	}

}
