package org.example.builder;

public class Car {

    //Attributs obligatoires
    private String modele;
    private String moteur;
    private int nbSieges;
    private String couleur;

    //Attributs optionnels
    private boolean gps;
    private boolean toitOuvrant;

    public Car() {}

    public Car(CarBuilder builder) {
        this.modele = builder.modele;
        this.moteur = builder.moteur;
        this.nbSieges = builder.nbSieges;
        this.gps = builder.gps;
        this.toitOuvrant = builder.toitOuvrant;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public int getNbSieges() {
        return nbSieges;
    }

    public void setNbSieges(int nbSieges) {
        this.nbSieges = nbSieges;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isToitOuvrant() {
        return toitOuvrant;
    }

    public void setToitOuvrant(boolean toitOuvrant) {
        this.toitOuvrant = toitOuvrant;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modele='" + modele + '\'' +
                ", moteur='" + moteur + '\'' +
                ", nbSieges=" + nbSieges +
                ", couleur='" + couleur + '\'' +
                ", gps=" + gps +
                ", toitOuvrant=" + toitOuvrant +
                '}';
    }

    public static class CarBuilder {

        //Attributs obligatoires
        private String modele;
        private String moteur;
        private int nbSieges = 7;
        private String couleur = "bleu";

        //Attributs optionnels
        private boolean gps = true;
        private boolean toitOuvrant = true;

        public CarBuilder(String modele, String moteur, int nbSieges) {
            this.modele = modele;
            this.moteur = moteur;
            this.nbSieges = nbSieges;
        }

        public CarBuilder gps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public CarBuilder toitOuvrant(boolean toitOuvrant) {
            this.toitOuvrant = toitOuvrant;
            return this;
        }

        public CarBuilder couleur(String couleur) {
            this.couleur = couleur;
            return this;
        }

        public Car build() {
            return new Car(this);
        }


    }


}
