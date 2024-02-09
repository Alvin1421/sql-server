package uji.sistem.sqlserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import uji.sistem.sqlserver.model.ProsesLogLine;
import uji.sistem.sqlserver.service.SqlServerService;

import javax.sql.DataSource;

@SpringBootApplication
//@ComponentScan(basePackages = "uji.sistem.sqlserver.DatabaseConfig.java")
public class SqlserverServiceApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SqlserverServiceApplication.class, args);

		ProsesLogLine m = context.getBean(ProsesLogLine.class);

		SqlServerService service = context.getBean(SqlServerService.class);
		service.saveProsesLogLine(m);
	}
}
