package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemo2Application 
{

	public static void main(String[] args) 
	{
		System.out.println("--------------- Project Started --------------");
		SpringApplication.run(SpringbootDemo2Application.class, args);
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

[2m2026-08-24T13:14:19.765+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36min.main.SpringbootDemo2Application      [0;39m [2m:[0;39m Starting SpringbootDemo2Application using Java 21.0.10 with PID 1448 (E:\Spring Eclipse Workspace\L SpringBoot\cb_Springboot_Demo2\target\classes started by hp in E:\Spring Eclipse Workspace\L SpringBoot\cb_Springboot_Demo2)
[2m2026-08-24T13:14:19.768+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36min.main.SpringbootDemo2Application      [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2026-08-24T13:14:20.284+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36mo.s.boot.tomcat.TomcatWebServer         [0;39m [2m:[0;39m Tomcat initialized with port 8080 (http)
[2m2026-08-24T13:14:20.294+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2026-08-24T13:14:20.295+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/11.0.24]
[2m2026-08-24T13:14:20.393+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36morg.apache.jasper.servlet.TldScanner    [0;39m [2m:[0;39m At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
[2m2026-08-24T13:14:20.396+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36mb.w.c.s.WebApplicationContextInitializer[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 596 ms
[2m2026-08-24T13:14:20.637+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36mo.s.boot.tomcat.TomcatWebServer         [0;39m [2m:[0;39m Tomcat started on port 8080 (http) with context path '/'
[2m2026-08-24T13:14:20.641+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [           main] [0;39m[36min.main.SpringbootDemo2Application      [0;39m [2m:[0;39m Started SpringbootDemo2Application in 1.203 seconds (process running for 1.478)
--------------- Project Finished --------------
[2m2026-08-24T13:14:33.631+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [nio-8080-exec-1] [0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring DispatcherServlet 'dispatcherServlet'
[2m2026-08-24T13:14:33.631+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [nio-8080-exec-1] [0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Initializing Servlet 'dispatcherServlet'
[2m2026-08-24T13:14:33.633+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [nio-8080-exec-1] [0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Completed initialization in 2 ms
[2m2026-08-24T13:14:48.003+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [)-10.147.12.154] [0;39m[36minMXBeanRegistrar$SpringApplicationAdmin[0;39m [2m:[0;39m Application shutdown requested.
[2m2026-08-24T13:14:48.006+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [)-10.147.12.154] [0;39m[36mo.s.boot.tomcat.GracefulShutdown        [0;39m [2m:[0;39m Commencing graceful shutdown. Waiting for active requests to complete
[2m2026-08-24T13:14:48.020+05:30[0;39m [32m INFO[0;39m [35m1448[0;39m [2m--- [cb_Springboot_Demo2] [tomcat-shutdown] [0;39m[36mo.s.boot.tomcat.GracefulShutdown        [0;39m [2m:[0;39m Graceful shutdown complete


*/