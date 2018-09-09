package com.example.rui.iterator

class Pokedex(): Aggregate {
    override fun iterator(): Iterator {
        return PokedexIterator(this)
    }

    private var pokemons = ArrayList<Pokemon>()

    fun add(pokemon: Pokemon) {
        this.pokemons.add(pokemon)
    }

    fun getPokemonAt(index: Int): Pokemon? {
        return pokemons[index]
    }

    fun getCount(): Int {
        return this.pokemons.count()
    }
}