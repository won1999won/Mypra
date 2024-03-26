package com.ohgiraffers.section02.annotation.subsection01.primaty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
    ApplicationContext context=new AnnotationConfigApplicationContext("com.ohgiraffers.section02");
    String[] beanName= context.getBeanDefinitionNames();
    for (String bean:beanName){
        System.out.println(bean);
    }
    PokemonService pokemonService=context.getBean("pokemonServicePrimary", PokemonService.class);
    pokemonService.pokemonAttack();

    }

}
