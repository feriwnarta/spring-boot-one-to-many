package com.ferdev.belajarspringbootonetomany;

import com.ferdev.belajarspringbootonetomany.entity.Kategori;
import com.ferdev.belajarspringbootonetomany.entity.Produk;
import com.ferdev.belajarspringbootonetomany.repository.KategoriRepository;
import com.ferdev.belajarspringbootonetomany.repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BelajarSpringBootOneToManyApplication implements CommandLineRunner {

	@Autowired
	KategoriRepository kategoriRepository;

	@Autowired
	ProdukRepository produkRepository;

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringBootOneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		kategoriRepository.save(new Kategori("Makanan",
				new Produk("P0001", "Sukro", new BigDecimal(15000)),
				new Produk("P0002", "Dua Kelinci", new BigDecimal(13500)),
				new Produk("P0003", "Indomie Goreng", new BigDecimal(2500)),
				new Produk("P0004", "Indomie Rendang", new BigDecimal(3200)),
				new Produk("P0005", "Taro", new BigDecimal(7500))
				));

	}
}
