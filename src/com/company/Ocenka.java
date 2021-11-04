package com.company;

public class Ocenka {
    public String predmet;
    public int datum;
    private int ocenka;

    public String toString() {
        String u = "[" + predmet + "," + datum + "," + ocenka + "]";
        return u;
    }
    public Ocenka() {
    }
    public void SetOcenka(int ocenka)
    {
        this.ocenka=ocenka;

    }
    public int GetOcenka()
    {
        return ocenka;

    }
        public void SetPredmet (String predmet)
        {
            this.predmet = predmet;
        }
        public String GetPredmet () {
            return predmet;
        }

        public void SetDatum ( int datum)
        {
            this.datum = datum;

        }
        public int GetDatum () {
            return datum;
        }

    }
