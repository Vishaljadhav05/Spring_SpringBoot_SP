package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemo1Application 
{

	public static void main(String[] args) 
	{
		System.out.println("--------------- Project Started --------------");
		SpringApplication.run(SpringbootDemo1Application.class, args);
		System.out.println("--------------- Project Finished --------------");
	}

}

// Output:-

/*

--------------- Project Started --------------

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v4.1.1)[0;39m

[2m2026-08-24T12:49:57.016+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36min.main.SpringbootDemo1Application      [0;39m [2m:[0;39m Starting SpringbootDemo1Application using Java 21.0.10 with PID 14784 (E:\Spring Eclipse Workspace\L SpringBoot\ca_Springboot_Demo1\target\classes started by hp in E:\Spring Eclipse Workspace\L SpringBoot\ca_Springboot_Demo1)
[2m2026-08-24T12:49:57.019+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36min.main.SpringbootDemo1Application      [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2026-08-24T12:49:57.511+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36mo.s.boot.tomcat.TomcatWebServer         [0;39m [2m:[0;39m Tomcat initialized with port 8080 (http)
[2m2026-08-24T12:49:57.520+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2026-08-24T12:49:57.520+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/11.0.24]
[2m2026-08-24T12:49:57.625+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36morg.apache.jasper.servlet.TldScanner    [0;39m [2m:[0;39m At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
[2m2026-08-24T12:49:57.629+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36mb.w.c.s.WebApplicationContextInitializer[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 571 ms
[2m2026-08-24T12:49:57.866+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36mo.s.boot.tomcat.TomcatWebServer         [0;39m [2m:[0;39m Tomcat started on port 8080 (http) with context path '/'
[2m2026-08-24T12:49:57.869+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [           main] [0;39m[36min.main.SpringbootDemo1Application      [0;39m [2m:[0;39m Started SpringbootDemo1Application in 1.187 seconds (process running for 1.467)
--------------- Project Finished --------------
[2m2026-08-24T12:50:06.912+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [nio-8080-exec-1] [0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring DispatcherServlet 'dispatcherServlet'
[2m2026-08-24T12:50:06.912+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [nio-8080-exec-1] [0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Initializing Servlet 'dispatcherServlet'
[2m2026-08-24T12:50:06.912+05:30[0;39m [32m INFO[0;39m [35m14784[0;39m [2m--- [ca_Springboot_Demo1] [nio-8080-exec-1] [0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Completed initialization in 0 ms


*/