package com.ferdev.belajarspringbootonetomany.entity;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class Kategori {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nama;

    @OneToMany(
            mappedBy = "kategori",
            cascade = CascadeType.ALL
    )
    private List<Produk> produks;

    public Kategori(String nama, Produk... produks) {
        this.nama = nama;
        this.produks = Stream.of(produks).collect(Collectors.toList());
        this.produks.forEach(produk -> produk.setKategori(this));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
