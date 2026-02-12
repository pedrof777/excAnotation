package br.com.pedroferreira.reflection;

import br.com.pedroferreira.anotation.Bicicleta;
import br.com.pedroferreira.anotation.Caminhao;
import br.com.pedroferreira.anotation.ITabelaAnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/**
 * @author Pedro Ferreira
 */

public class App {
  public static void main(String args[]){
    String nameTable = getValueAnotation(Caminhao.class);
    System.out.println("Nome Tabela: " + nameTable);

    String nameTable1 = getValueAnotation(Bicicleta.class);
    System.out.println("Nome Tabela: " + nameTable1);
  }

  private static String getValueAnotation(Class<?> clazz){
    if (clazz.isAnnotationPresent(ITabelaAnotation.class)){
        ITabelaAnotation anotacao = clazz.getAnnotation(ITabelaAnotation.class);
        return anotacao.value();
    }
    return null;
  }
}
