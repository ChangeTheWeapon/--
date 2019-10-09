
package com.company;

public class AnimalCamp  extends TeamPokemon {
    private String  NameCamp;
    private int NrDetachments;

}
    AnimalCamp(String NameTeam,int NrPokemons,String SuperPower,int NrBadEnemies,String NameCamp,int NrDetachments){
        super (NameTeam,NrPokemons,SuperPower,NrBadEnemies);
        this.NrDetachments=NrDetachments;
        this.NameCamp=NameCamp;
    }
    public getNameCamp()
    {
        return this.NameCamp;
    }
    public getNrDetachments()
    {
        return this.NrDetachments;
    }

    public void setNameCamp(String NameCamp )
    {
        this.NameCamp=NameCamp;
    }
    public void setNrDetachments(int NrDetachments)
    {
        this.NrDetachments=NrDetachments;
    }