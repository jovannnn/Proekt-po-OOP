package com.company;

public class Covek {
        public String ime = "Jovan";
        public String prezime = "Belkoski";
        public int godini = 21;

        public String toString(){
            String u="["+ime+","+prezime+","+godini+"]";
            return u;
        }
    public Covek() {

        }

        public String GetIme () {
            return ime;
        }

        public String GetPrezime () {
            return prezime;
        }

        public int GetGodini () {
            return godini;
        }

        public void SetIme (String ime){
            this.ime = ime;

        }

        public void SetPrezime (String prezime){
            this.prezime = prezime;
        }

        public void SetGodini ( int godini){
            this.godini = godini;
        }

        void Display () {
            System.out.println("Ime:" + GetIme());
            System.out.println("Prezime:" + GetPrezime());
            System.out.println("Godini:" + GetGodini());
        }
    }