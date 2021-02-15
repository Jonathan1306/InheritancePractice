//this is grandchild class

package com.company;

public class HondaCivic extends Car {
    public String colour;

    public HondaCivic(String colour) {
        super(true, 5, true);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
