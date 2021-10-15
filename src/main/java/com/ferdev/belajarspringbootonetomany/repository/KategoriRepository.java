package com.ferdev.belajarspringbootonetomany.repository;

import com.ferdev.belajarspringbootonetomany.entity.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategoriRepository extends JpaRepository<Kategori, Long> {
}
