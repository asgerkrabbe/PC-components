package com.kea;

public class Types implements MyInterface {

    Cars cars = new Cars();

    public void showFuel() {
        cars.listFuelTypesGetter();
    }

    @Override
    public void carBlueprint() {

    }

}
