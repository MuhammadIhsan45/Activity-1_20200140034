package com.example.dataktp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private data_ktpRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		
		  data_ktp data1 = new data_ktp(340001, "Jackson", "Sewon");
		  repo.save(data1);
		  
		  data_ktp data2 = new data_ktp(340002, "People", "Sleman");
		  repo.save(data2);
		  
		  data_ktp data3 = new data_ktp(340003, "Terry", "Bambanglipuro");
		  repo.save(data3);
		  
		  data_ktp data4 = new data_ktp(340004, "Fixy", "Gamping");
		  repo.save(data4);
		  
		  data_ktp data5 = new data_ktp(340005, "John", "Kasihan");
		  repo.save(data5);
		  
		  data_ktp data6 = new data_ktp(340006, "Tayson", "Tamansiswa");
		  repo.save(data6);
		  
		  data_ktp data7 = new data_ktp(340007, "Max", "Pandak");
		  repo.save(data7);
		  
		  data_ktp data8 = new data_ktp(340008, "Dave", "Manding");
		  repo.save(data8);
		  
		  data_ktp data9 = new data_ktp(340009, "Car", "Jambi");
		  repo.save(data9);
		  
		  data_ktp data10 = new data_ktp(340010, "Scar", "Gunung kidul");
		  repo.save(data10);
		  
		  data_ktp data11 = new data_ktp(340011, "Dasrt", "palembang");
		  repo.save(data11);
		  
		  data_ktp data12 = new data_ktp(340012, "Dart", "Aceh");
		  repo.save(data12);
		  
		  data_ktp data13 = new data_ktp(340013, "Raw", "Pontianak");
		  repo.save(data13);
		  
		  data_ktp data14 = new data_ktp(340014, "Sad", "Jakarta");
		  repo.save(data14);
		  
		  data_ktp data15 = new data_ktp(340015, "Deaf", "Bali");
		  repo.save(data15);
		  
		  data_ktp data16 = new data_ktp(340016, "Qwerty", "Depok");
		  repo.save(data16);
		  
		  data_ktp data17 = new data_ktp(340017, "Gerd", "Bekasi");
		  repo.save(data17);
		  
		  data_ktp data18 = new data_ktp(340018, "Gad", "Cilalap");
		  repo.save(data18);
		  
		  data_ktp data19 = new data_ktp(340019, "Fav", "Cilegon");
		  repo.save(data19);
		  
		  data_ktp data20 = new data_ktp(340020, "Chat", "Balong");
		  repo.save(data20);
		  
		  
		 

	}

}
