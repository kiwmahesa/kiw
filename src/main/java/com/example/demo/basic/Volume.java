package com.example.demo.basic;

public class Volume extends Luas{
    private Integer tinggi;
    private Luas luas = new Luas();


    public Volume(Integer panjang, Integer lebar, Integer tinggi) {
        super(panjang, lebar);
        this.tinggi=tinggi;
    }


    public Integer hitungvolume(){
        Integer hasil = hitungluas()*tinggi;
                return hasil;

    }

    public Volume (){

    }


    public Integer getTinggi() {
        return tinggi;
    }

    public void setTinggi(Integer tinggi) {
        this.tinggi = tinggi;
    }

    public Integer getPanjang() {
        return luas.getPanjang();
    }

    public void setPanjang(Integer panjang) {
        luas.setPanjang(panjang);
    }

    public Integer getLebar() {
        return luas.getLebar();
    }

    public void setLebar(Integer lebar) {
        luas.setLebar(lebar);
    }


}
