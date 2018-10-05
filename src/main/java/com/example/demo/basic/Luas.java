package com.example.demo.basic;

public class Luas {
    private Integer panjang;
    private  Integer lebar;

    public Luas(Integer panjang , Integer lebar){
        this.panjang = panjang;
        this.lebar = lebar;


    }

    public Luas (){

    }


    public  Integer hitungluas(){
        Integer luas = panjang * lebar;
        return luas;
    }

    public Integer getPanjang() {
        return panjang;
    }

    public void setPanjang(Integer panjang) {
        this.panjang = panjang;
    }

    public Integer getLebar() {
        return lebar;
    }

    public void setLebar(Integer lebar) {
        this.lebar = lebar;
    }
}
