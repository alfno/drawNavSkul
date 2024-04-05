package com.example.drawnavskul;

public class model {
    String name;
    String kelas;
    int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public model(String name, String kelas, int img) {
        this.name = name;
        this.kelas = kelas;
        this.img = img;
    }
}
