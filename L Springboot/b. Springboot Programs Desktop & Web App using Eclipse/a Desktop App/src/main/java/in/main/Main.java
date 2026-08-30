package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("---------- SpringBoot App Started ----------");
		
		SpringApplication.run(Main.class, args);
		
		
		System.out.println("---------- SpringBoot App Finished ----------");
	}
}

// Output:-

/* 

===> Run With Server

---------- SpringBoot App Started ----------

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.15)

2026-08-22T09:01:47.623+05:30  INFO 15704 --- [           main] in.main.Main                             : Starting Main using Java 21.0.10 with PID 15704 (E:\Spring Eclipse Workspace\L SpringBoot\ba_Desktop_App\target\classes started by hp in E:\Spring Eclipse Workspace\L SpringBoot\ba_Desktop_App)
2026-08-22T09:01:47.625+05:30  INFO 15704 --- [           main] in.main.Main                             : No active profile set, falling back to 1 default profile: "default"
2026-08-22T09:01:48.279+05:30  INFO 15704 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-08-22T09:01:48.292+05:30  INFO 15704 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-08-22T09:01:48.293+05:30  INFO 15704 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.55]
2026-08-22T09:01:48.464+05:30  INFO 15704 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-08-22T09:01:48.465+05:30  INFO 15704 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 804 ms
2026-08-22T09:01:48.752+05:30  INFO 15704 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2026-08-22T09:01:48.759+05:30  INFO 15704 --- [           main] in.main.Main                             : Started Main in 1.522 seconds (process running for 1.789)
---------- SpringBoot App Finished ----------




===> Run Without Server

---------- SpringBoot App Started ----------

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.15)

2026-08-22T09:12:08.109+05:30  INFO 13772 --- [           main] in.main.Main                             : Starting Main using Java 21.0.10 with PID 13772 (E:\Spring Eclipse Workspace\L SpringBoot\ba_Desktop_App\target\classes started by hp in E:\Spring Eclipse Workspace\L SpringBoot\ba_Desktop_App)
2026-08-22T09:12:08.111+05:30  INFO 13772 --- [           main] in.main.Main                             : No active profile set, falling back to 1 default profile: "default"
2026-08-22T09:12:08.630+05:30  INFO 13772 --- [           main] in.main.Main                             : Started Main in 0.893 seconds (process running for 1.16)
---------- SpringBoot App Finished ----------



*/