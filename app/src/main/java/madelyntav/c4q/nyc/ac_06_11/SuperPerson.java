package madelyntav.c4q.nyc.ac_06_11;

import java.util.ArrayList;

/**
 * Created by c4q-madelyntavarez on 6/11/15.
 */
public abstract class SuperPerson{
    String name;
    String identity;
    ArrayList<String> superPowers;

    public SuperPerson(){
        this.name=null;
    }

    public SuperPerson(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public ArrayList<String> getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(ArrayList<String> superPowers) {
        this.superPowers = superPowers;
    }
}
