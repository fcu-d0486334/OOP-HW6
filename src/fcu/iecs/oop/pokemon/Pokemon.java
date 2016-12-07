package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private final PokemonType type;
	private int cp;
	
	public Pokemon(String name,PokemonType type,int cp){
		this.name=name;
		this.type=type;
		this.cp=cp;
	}
	public String GetName(){
		return name;
	}
	public PokemonType GetType(){
		return type;
	}
	public int GetCp(){
		return cp;
	}
	public void setCp(){
		cp=cp+1;
	}
}
