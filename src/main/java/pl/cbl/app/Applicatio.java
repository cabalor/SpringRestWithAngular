package pl.cbl.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import pl.cbl.config.AppConfig;

public class Applicatio implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext cont) throws ServletException {
		AnnotationConfigWebApplicationContext contex = new AnnotationConfigWebApplicationContext();

		contex.register(AppConfig.class);
		contex.setServletContext(cont);

		ServletRegistration.Dynamic srv = cont.addServlet("dispatcher", new DispatcherServlet(contex));

		srv.setLoadOnStartup(1);
		srv.addMapping("/");

	}

}
