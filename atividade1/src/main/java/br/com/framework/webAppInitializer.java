package br.com.framework;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer
       extends
AbstractAnnotationConfigDispatcherServletInitializer {
    
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
        protected Class<?>[] getServLetConfigClasse() {
          return new Class<?> [] { WebConfig.class };

    }
    @Override
        protected String[] getServletMappings() {
            return new String[] { "/" };
    }
        
}
