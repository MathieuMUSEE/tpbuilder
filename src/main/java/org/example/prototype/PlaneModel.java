package org.example.prototype;

public class PlaneModel implements Model3DPrototype {

    private String taille = "Plane";
    private String couleur = "Vehicle";
    private String texture = "White";

    public PlaneModel(String taille, String texture, String couleur) {
        this.taille = taille;
        this.texture = texture;
        this.couleur = couleur;
    }

    @Override
    public Model3DPrototype clone() {
        return new PlaneModel();
    }
}
