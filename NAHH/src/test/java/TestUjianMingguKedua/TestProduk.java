package TestUjianMingguKedua;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import UjianMingguKedua.Produk;

public class TestProduk {
	Produk pr = new Produk();
	
	@Test
	public void tambahProduk() {
		assertEquals(pr.tambahStok(), 10000);
	}
	
	@Test
	public void tambahProdukDua() {
		assertEquals(pr.tambahStok(), 20000);
	}
	
	@Test
	public void cekStok() {
		assertEquals(pr.cekStok(), 2);
	}
	
	@Test
	public void hitungStok() {
		assertEquals(pr.kalkulasiDiskon(), 19000);
	}
}
