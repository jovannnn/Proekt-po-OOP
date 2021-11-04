package com.company;

public class Student extends Covek {

    public int indeks = 755;
    public int ocenka;

    int[] oceni = {9,8,10,9,7,10,7,6,8,6};
    String[] predmet ={"OOP","ASP","SF","PKM","IZB","MAT","SP","DS","AS","NP"};
    int[] datum ={21,7,13,31,9,12,8,23,30,2};

    public String toString() {
        String u = "[" + ime + "," + prezime + "," + godini + "," + indeks + "]";
            return u;
        }
    public Student() {
        }

        public int GetIndeks () {
            return indeks;
        }

        public void SetIndeks ( int indeks){
            this.indeks = indeks;
        }

        public void SetOcenka () {
            this.oceni=oceni;
        }

        public int GetProsek () {
            ocenka = (oceni[0]+oceni[1]+oceni[2]+oceni[3]+oceni[4]+oceni[5]+oceni[6]+oceni[7]+oceni[8]+oceni[9])/10;
            return ocenka;
        }

            void Display(){
            System.out.println("Ime:" + GetIme());
            System.out.println("Prezime:" + GetPrezime());
            System.out.println("Godini:" + GetGodini());
            System.out.println("Indeks:" + GetIndeks());

            Student n = new Student();
            System.out.println("Predmet-" + n.predmet[0] + "    " + "Datum na ispit-" + n.datum[0] + "    " + "Ocenka-" + n.oceni[0]);
            System.out.println("Predmet-" + n.predmet[1] + "    " + "Datum na ispit-" + n.datum[1] + "    " + "Ocenka-" + n.oceni[1]);
            System.out.println("Predmet-" + n.predmet[2] + "    " + "Datum na ispit-" + n.datum[2] + "    " + "Ocenka-" + n.oceni[2]);
            System.out.println("Predmet-" + n.predmet[3] + "    " + "Datum na ispit-" + n.datum[3] + "    " + "Ocenka-" + n.oceni[3]);
            System.out.println("Predmet-" + n.predmet[4] + "    " + "Datum na ispit-" + n.datum[4] + "    " + "Ocenka-" + n.oceni[4]);
            System.out.println("Predmet-" + n.predmet[5] + "    " + "Datum na ispit-" + n.datum[5] + "    " + "Ocenka-" + n.oceni[5]);
            System.out.println("Predmet-" + n.predmet[6] + "    " + "Datum na ispit-" + n.datum[6] + "    " + "Ocenka-" + n.oceni[6]);
            System.out.println("Predmet-" + n.predmet[7] + "    " + "Datum na ispit-" + n.datum[7] + "    " + "Ocenka-" + n.oceni[7]);
            System.out.println("Predmet-" + n.predmet[8] + "    " + "Datum na ispit-" + n.datum[8] + "    " + "Ocenka-" + n.oceni[8]);
            System.out.println("Predmet-" + n.predmet[9] + "    " + "Datum na ispit-" + n.datum[9] + "    " + "Ocenka-" + n.oceni[9]);

                n.SetOcenka();
                System.out.println("PROSEK NA OCENI:"+" "+n.GetProsek());
        }
    }