package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Main.class, args);
	}
}

// Output:-

/*


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.15)

2026-08-22T09:59:27.651+05:30  INFO 8048 --- [           main] in.main.Main                             : Starting Main using Java 21.0.10 with PID 8048 (E:\Spring Eclipse Workspace\L SpringBoot\bb_SpringBoot_Web_App\target\classes started by hp in E:\Spring Eclipse Workspace\L SpringBoot\bb_SpringBoot_Web_App)
2026-08-22T09:59:27.656+05:30  INFO 8048 --- [           main] in.main.Main                             : No active profile set, falling back to 1 default profile: "default"
2026-08-22T09:59:29.107+05:30  INFO 8048 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 9090 (http)
2026-08-22T09:59:29.138+05:30  INFO 8048 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-08-22T09:59:29.139+05:30  INFO 8048 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.55]
2026-08-22T09:59:29.469+05:30  INFO 8048 --- [           main] org.apache.jasper.servlet.TldScanner     : At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
2026-08-22T09:59:29.478+05:30  INFO 8048 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-08-22T09:59:29.480+05:30  INFO 8048 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1746 ms
2026-08-22T09:59:29.665+05:30  INFO 8048 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
2026-08-22T09:59:30.080+05:30  INFO 8048 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 9090 (http) with context path '/'
2026-08-22T09:59:30.095+05:30  INFO 8048 --- [           main] in.main.Main                             : Started Main in 3.298 seconds (process running for 3.941)


*/