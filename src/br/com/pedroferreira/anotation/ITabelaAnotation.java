package br.com.pedroferreira.anotation;


import java.lang.annotation.*;

/**
 * @author Pedro Ferreira
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ITabelaAnotation {

  String value();
}
