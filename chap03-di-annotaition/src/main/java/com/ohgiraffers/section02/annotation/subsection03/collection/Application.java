package com.ohgiraffers.section02.annotation.subsection03.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");
        String[] beanName = context.getBeanDefinitionNames();
        for (String be : beanName) {
            System.out.println(be);
        }
        PokemonService pokemonService = context.getBean("pokemonServiceCollection", PokemonService.class);
        pokemonService.pokemonAttak();
    }
}
