package cn.dxm.mp.dxmmybatisspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.dxm.mp.mapper")
@SpringBootApplication
public class DxmMybatisSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxmMybatisSpringbootApplication.class, args);
	}

}
