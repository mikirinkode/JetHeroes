package com.mikirinkode.jetheroes.data

import com.mikirinkode.jetheroes.model.Hero
import com.mikirinkode.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}