package JAVA.Java_Games.Pokemon.Pokemon;

class Pokemons{
    int id;
    String name;
    String type;
    int hp;
    int atk;
    int spatk;
    int def;
    int spdef;

    public Pokemons(int id, String name, String type, int hp, int atk, int spatk, int def, int spdef){
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.id = id;
        this.name = name;
        this.spatk = spatk;
        this.spdef = spdef;
        this.type = type;

    }
}