package edu.spring.naverserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mybatis.EmpDAO;



@SpringBootApplication
@ComponentScan
@MapperScan(basePackageClasses = EmpDAO.class)
@ComponentScan(basePackageClasses = EmpDAO.class)
public class KdigitaljysStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KdigitaljysStsApplication.class, args);
		System.out.println("정상 실행");
	}

}
