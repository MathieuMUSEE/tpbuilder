package org.example.prototype;

public abstract class Model3D {
    protected String taille;
    protected String couleur;
    protected String texture;

    public Model3D(String taille, String couleur, String texture) {
        this.taille = taille;
        this.couleur = couleur;
        this.texture = texture;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "Model3D{" +
                "taille='" + taille + '\'' +
                ", couleur='" + couleur + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }


}
