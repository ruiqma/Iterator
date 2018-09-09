package com.example.rui.iterator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pokedex = Pokedex()
        pokedex.add(Pokemon("フシギダネ", "くさ", "どく"))
        pokedex.add(Pokemon("ヒトカゲ", "ほのお", "無"))
        pokedex.add(Pokemon("ゼニガメ", "みず", "無"))
        pokedex.add(Pokemon("ピカチュウ", "でんき", "無"))

        val pokemonSelect: Iterator = pokedex.iterator()
        while (pokemonSelect.hasNext()) {
            val pokemon: Pokemon = pokemonSelect.next() as Pokemon
            if (pokemon.type2 != "無"){
                println("名前:" + pokemon.name + ", タイプ:" + pokemon.type1 + ", " + pokemon.type2)
            } else {
                println("名前:" + pokemon.name + ", タイプ:" + pokemon.type1)
            }
        }
    }
}
