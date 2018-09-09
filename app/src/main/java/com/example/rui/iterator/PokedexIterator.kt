package com.example.rui.iterator

class PokedexIterator(private val pokedex: Pokedex): Iterator {
    private var index: Int = 0

    override fun next(): Any {
        val pokemon: Pokemon? = pokedex.getPokemonAt(index)
        index++
        return pokemon ?: Pokemon("けつばん", "ノーマル", "無")
    }

    override fun hasNext(): Boolean {
        return pokedex.getCount() > index
    }
}