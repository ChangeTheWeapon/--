package com.company;
class TeamPokemon {
    private String  NameTeam;
    private int NrPokemons;
    private String SuperPower;
    private int  NrBadEnemies ;
}
    Pokemon(String NameTeam,int NrPokemons,String SuperPower,int NrBadEnemies){
        this.NameTeam=NameTeam;
        this.NrPokemons=NrPokemons;
        this.SuperPower=SuperPower;
        this.NrBadEnemies=NrBadEnemies;
    }
    public getNameTeam()
    {
        return this.NameTeam;
    }
    public getNrPokemon()
    {
        return this.NrPokemons;
    }
    public getSuperPower()
    {
        return this.SuperPower;
    }
    public getNrBadEnemies()
    {
        return this.NrBadEnemies;
    }
    public void setNameTeam(String NameTeam )
    {
        this.NameTeam=NameTeam;
    }
    public void setNrPokemons(int NrPokemons)
    {
        this.NrPokemons=NrPokemons;
    }
    public setAssignments(String Assignments)
    {
        this.SuperPower=SuperPower;
    }
    public void setNrBadEnemies(int NrBadEnemies)
    {
        this.NrBadEnemies=NrBadEnemies;
    }
