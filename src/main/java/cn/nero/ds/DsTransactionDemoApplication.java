package cn.nero.ds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {
        "cn.nero.ds.dao.mappers"
})
@SpringBootApplication
public class DsTransactionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsTransactionDemoApplication.class, args);
    }

}
