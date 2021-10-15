package com.ferdev.belajarspringbootonetomany.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produk {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String kode;
    @Column(nullable = false)
    private String nama;
    @Column(nullable = false)
    private BigDecimal harga;

    @ManyToOne
    @JoinColumn
    private Kategori kategori;

    public Produk(String kode, String nama, BigDecimal harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
}
