package cdi.qualifiers;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.FIELD;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, METHOD, PARAMETER, FIELD })

public @interface PrimaryGen {}
