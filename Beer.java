package Zad1704;

import java.util.Objects;

public class Beer {
    private String name;
    private String type;
    private double alcoholAmount;
    private double volume;

    public Beer(String name, String type, double alcoholAmount, double volume) {
        this.name = name;
        this.type = type;
        this.alcoholAmount = alcoholAmount;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Beer)) {
            return false;
        }
        Beer another = (Beer) obj;
        if(!name.equals(another.name)) {
            return false;
        }
        if(!type.equals(another.type)) {
            return false;
        }
        if(alcoholAmount != another.alcoholAmount) {
            return false;
        }
        return volume == another.volume;
    }

    @Override
    public int hashCode() {
        return  name.charAt(0)+name.charAt(name.length()-1) + (int) (31*name.length()*type.length()+alcoholAmount*volume);
    }
}

