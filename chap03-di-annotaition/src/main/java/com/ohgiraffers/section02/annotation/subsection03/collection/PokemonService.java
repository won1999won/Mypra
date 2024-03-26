package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {
////    List타입으로 주입
//    private List<Pokemon> pokemonList;
//
//    @Autowired
//    public void PokemonService(List<Pokemon> pokemonList){
//        this.pokemonList=pokemonList;
//    }
//    public  void pokemonAttak(){
//        pokemonList.forEach(Pokemon::attak);
//    }

//    Map타입으로 주입
private Map<String,Pokemon>pokemonMap;
public  PokemonService(Map<String,Pokemon>pokemonMap){
    this.pokemonMap=pokemonMap;
}
public  void pokemonAttak(){
    pokemonMap.forEach((k,v)->{
        System.out.println("key:"+k);
        System.out.println("공격:");
        v.attak();
    });
}

}
