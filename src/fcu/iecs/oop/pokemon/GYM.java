package fcu.iecs.oop.pokemon;
import java.util.Random;
public class GYM{
	public static Player fight(Player... players){
				if(players[1].GetPokemons(1).equals(players[2].GetPokemons(1))){
					return players[1];
					}else{
						return players[2];
					}
					
		}
	}
