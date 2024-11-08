package org.example.prototype;

public class CarModel implements Model3DPrototype{

        private String taille = "Car";
        private String texture = "Vehicle";
        private String couleur = "Red";

        public CarModel(String name, String type, String color) {
            this.taille = taille;
            this.couleur = couleur;
            this.texture = texture;
        }

        @Override
        public Model3DPrototype clone() {
            return new CarModel("Car", "Vehicle", "Red");
        }
}
