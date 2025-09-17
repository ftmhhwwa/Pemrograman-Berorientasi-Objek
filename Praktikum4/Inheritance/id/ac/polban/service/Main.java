package Praktikum4.Inheritance.id.ac.polban.service;

import Praktikum4.Inheritance.id.ac.polban.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar Mahasiswa
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Fatimah Hawwa", "241511074", "Teknik Informatika"),
            new Mahasiswa("Edmund", "241511100", "Teknik Informatika"),
            new Mahasiswa("Peter", "241511101", "Bahasa Inggris")
        };

        // Daftar Ruangan (menggunakan konsep Polymorphism)
        Ruangan[] daftarRuang = {
            new RuangKelas("D-101", "Gedung JTK", "Kelas",40),
            new RuangKelas("D-112", "Gedung JTK", "Kelas",35),
            new RuangLab("D-116", "Gedung JTK", "Lab PjBL 2",30, 25),
            new RuangLab("D-107", "Gedung JTK", "Lab RPL",40, 25)
        };

        int pilihan;
        do {
            System.out.println("\n=== Daftar Mahasiswa ===");
            for (int i = 0; i < daftarMahasiswa.length; i++) {
                System.out.print((i + 1) + ". ");
                daftarMahasiswa[i].infoMahasiswa();
            }

            System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());

            System.out.println("\n=== Daftar Ruangan ===");
            for (int i = 0; i < daftarRuang.length; i++) {
                System.out.print((i + 1) + ". ");
                // Memanggil infoRuang() yang sesuai (polymorphism)
                daftarRuang[i].infoRuang();
            }

            // Menu utama
            System.out.println("\nMenu:");
            System.out.println("1. Pinjam Ruangan");
            System.out.println("2. Kosongkan Ruangan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Pilih mahasiswa (nomor): ");
                    int pilihMhs = input.nextInt() - 1;
                    System.out.print("Pilih ruangan yang ingin dipinjam (nomor): ");
                    int pilihRuang = input.nextInt() - 1;

                    if (pilihMhs >= 0 && pilihMhs < daftarMahasiswa.length &&
                        pilihRuang >= 0 && pilihRuang < daftarRuang.length) {

                        if (!daftarRuang[pilihRuang].isTerpakai()) {
                            daftarRuang[pilihRuang].pinjamRuang();
                            System.out.println("|Success|\n" + daftarMahasiswa[pilihMhs].getNama() +
                                               " berhasil meminjam ruangan " +
                                               daftarRuang[pilihRuang].getKodeRuang());
                        } else {
                            System.out.println("|Failed|\nRuangan " + daftarRuang[pilihRuang].getKodeRuang() + " sedang terpakai.");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                }
                case 2 -> {
                    System.out.print("Pilih ruangan yang ingin dikosongkan (nomor): ");
                    int pilihKosong = input.nextInt() - 1;

                    if (pilihKosong >= 0 && pilihKosong < daftarRuang.length) {
                        daftarRuang[pilihKosong].kosongkanRuang();
                        System.out.println("|Success|\nRuangan berhasil dikosongkan.");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                }
                case 0 -> System.out.println("Program selesai. Terima kasih!");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}