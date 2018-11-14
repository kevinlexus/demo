package com.ric.some.demo;

import com.ric.some.demo.dao.StreetDAO;
import com.ric.some.demo.impl.AdrMngImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static ApplicationContext ctx = null;

	public static void main(String[] args) {
		System.out.println("Working...");
		SpringApplication app = new SpringApplication(DemoApplication.class);
		ctx = app.run(args);
		AdrMng adrMng = ctx.getBean(AdrMng.class);
		System.out.println("Started...");
		adrMng.printAllStreets();
		System.out.println("Ended...");
		// Завершить выполнение приложения
		SpringApplication.exit(ctx, () -> 0);
	}

	//access command line arguments
	@Override
	public void run(String... args) throws Exception {

	}

}
