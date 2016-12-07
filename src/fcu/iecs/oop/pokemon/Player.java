package fcu.iecs.oop.pokemon;

public class Player {
	private String playName;
	private String Pokemons[]=new String[5];
	int level;
	
	public Player(String name){
		playName=name;
	}
	public String GetplayName(){
		return playName;
	}
	public String GetPokemons(int i){
		return Pokemons[i];
	}
	public int GetLevel(){
		return level;
	}
	public void setplayName(String name){
		this.playName=name;
	}
	public void setpokemons(){
		
	}
	public void setLevel(int i){
		level=level+i;
	}
}
