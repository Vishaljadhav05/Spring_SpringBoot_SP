package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootInitializerApplication {

	public static void main(String[] args) 
	{
		System.out.println("--------------- Project Started --------------");
		SpringApplication.run(SpringBootInitializerApplication.class, args);
		System.out.println("--------------- Project Finished --------------");
	}
}

// Output:-

/*

----------------- Project Started --------------

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v4.1.1)[0;39m

[2m2026-08-24T13:58:07.732+05:30[0;39m [32m INFO[0;39m [35m24300[0;39m [2m--- [da_SpringBoot_Initializer] [           main] [0;39m[36mi.main.SpringBootInitializerApplication [0;39m [2m:[0;39m Starting SpringBootInitializerApplication using Java 21.0.10 with PID 24300 (E:\Spring Eclipse Workspace\L SpringBoot\da_SpringBoot_Initializer\target\classes started by hp in E:\Spring Eclipse Workspace\L SpringBoot\da_SpringBoot_Initializer)
[2m2026-08-24T13:58:07.737+05:30[0;39m [32m INFO[0;39m [35m24300[0;39m [2m--- [da_SpringBoot_Initializer] [           main] [0;39m[36mi.main.SpringBootInitializerApplication [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2026-08-24T13:58:08.836+05:30[0;39m [32m INFO[0;39m [35m24300[0;39m [2m--- [da_SpringBoot_Initializer] [           main] [0;39m[36mo.s.boot.tomcat.TomcatWebServer         [0;39m [2m:[0;39m Tomcat initialized with port 9191 (http)
[2m2026-08-24T13:58:08.858+05:30[0;39m [32m INFO[0;39m [35m24300[0;39m [2m--- [da_SpringBoot_Initializer] [           main] [0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2026-08-24T13:58:08.858+05:30[0;39m [32m INFO[0;39m [35m24300[0;39m [2m--- [da_SpringBoot_Initializer] [           main] [0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/11.0.24]
[2m2026-08-24T13:58:08.936+05:30[0;39m [32m INFO[0;39m [35m24300[0;39m [2m--- [da_SpringBoot_Initializer] [           main] [0;39m[36mb.w.c.s.WebApplicationContextInitializer[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 1126 ms
[2m2026-08-24T13:58:09.458+05:30[0;39m [32m INFO[0;39m [35m24300[0;39m [2m--- [da_SpringBoot_Initializer] [           main] [0;39m[36mo.s.boot.tomcat.TomcatWebServer         [0;39m [2m:[0;39m Tomcat started on port 9191 (http) with context path '/'
[2m2026-08-24T13:58:09.466+05:30[0;39m [32m INFO[0;39m [35m24300[0;39m [2m--- [da_SpringBoot_Initializer] [           main] [0;39m[36mi.main.SpringBootInitializerApplication [0;39m [2m:[0;39m Started SpringBootInitializerApplication in 2.504 seconds (process running for 3.193)
--------------- Project Finished --------------



*/