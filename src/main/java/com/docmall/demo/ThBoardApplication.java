package com.docmall.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@MapperScan(basePackages = {"com.docmall.demo.mapper"})
@SpringBootApplication
public class ThBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThBoardApplication.class, args);
	}
	
	@GetMapping("/")
	public String root() {
		log.info("root");
		return "redirect:/board/list";
	}

}
