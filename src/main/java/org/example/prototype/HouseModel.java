package org.example.prototype;

public class HouseModel implements Model3DPrototype {

    private String taille = "House";
    private String texture = "Building";
    private String couleur = "White";

    public HouseModel(String name, String type, String color) {
        this.taille = taille;
        this.texture = texture;
        this.couleur = couleur;
    }

    @Override
    public Model3DPrototype clone() {
        return new HouseModel("House", "Building", "White");
    }
}
