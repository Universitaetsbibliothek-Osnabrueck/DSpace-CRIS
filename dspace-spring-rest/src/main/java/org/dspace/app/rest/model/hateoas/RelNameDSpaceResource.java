package org.dspace.app.rest.model.hateoas;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation allows to set the name to use for REST collections
 * 
 * @author Andrea Bollini (andrea.bollini at 4science.it)
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RelNameDSpaceResource {
	String value();
}