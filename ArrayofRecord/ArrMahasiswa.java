package ArrayofRecord;

import java.util.Scanner;

public class ArrMahasiswa {
	int N = 2;
	Mahasiswa [] a = new Mahasiswa[N];
	Scanner sc = new Scanner(System.in);
	
	void InitArray() {
		for (int i = 0; i < N; i++) {
			Mahasiswa R = new Mahasiswa();
			R.nrp = "";
			R.nama = "";
			R.IPK = 0;
			a[i] = R;
			System.out.println("Elemen ke " + i + ": " 
					+ a[i].nrp + ", " 
					+ a[i].nama + ", " 
					+ a[i].IPK);
		}
	}
	
	void IsiArray() {
		for (int i = 0; i < N; i++) {
			System.out.println("---Elemen " + (i + 1)); 
			a[i].BacaMahasiswa();
		}
	}
	
	void TampilArray() {
		for (int i = 0; i < N; i++) {
			a[i].TulisMahasiswa();
		}
		System.out.println();
	}
	
	Mahasiswa getElement(int i) {
		Mahasiswa R = new Mahasiswa();
		System.out.println("===Mengambil Data===");
		R = a[i];
		return R;
	}
	
	// Prosedur mengubah record tertentu dari input
	void setElement(int i) {
		System.out.println("===Mengubah Data===");
		a[i].BacaMahasiswa();
	}
	
	int InputIndeks() {
		System.out.print("---Masukan index (Batas index adalah " + (N -1) + "): ");
		int indeks = sc.nextInt();
		return indeks;
	}
	
	int MencariX(String NRP) {
		int ix = -1;
		int i;
		for (i = 0; i < N; i++) {
			if (a[i].nrp.equals(NRP)) {
				ix = i;
			}
		}
		System.out.println("i keluar dari loop: " + i);
		return ix;
	}
	
	public static void main(String[] args) {
		ArrMahasiswa A = new ArrMahasiswa();
		Mahasiswa T = new Mahasiswa();
		Mahasiswa U = new Mahasiswa();
		
		System.out.println("===Inisialisasi Array===");
		A.InitArray();
		System.out.println("===Isi Array===");
		A.IsiArray();
		System.out.println("===Tampil Array===");
		A.TampilArray();
		
//		System.out.println("===Manipulasi Array===");
//		System.out.println("1. Mengambil Data");
//		int inputAmbil = A.InputIndeks();
//		T = A.getElement(inputAmbil);
//		T.TulisMahasiswa();
	
//		System.out.println("2. Mengubah Data");
//		int inputUbah = A.InputIndeks();
//		A.setElement(inputUbah);
		//U.TulisMahasiswa();
		
		System.out.println("\n===Tampil Array (Diperbarui)===");
		A.TampilArray();
		
		System.out.println("Mencari nilai tertentu dalam array");
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan nilai ");
		String x = sc.next();
		int k = A.MencariX(x);
		if (k != -1) {
			System.out.println("Nilai yang dicari yaitu " + x + " ada di indeks " + k);
			T = A.getElement(k);
			T.TulisMahasiswa();
		} else {
			System.out.println("Nilai tidak ditemukan");
		}
	}
}