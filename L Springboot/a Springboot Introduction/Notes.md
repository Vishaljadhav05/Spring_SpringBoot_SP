# 🍃 Spring Boot Notes

> ⚠️ **Note:** Before learning Spring Boot, you should have knowledge of the Spring Framework.

---

## 🧠 Core Concepts to Know

### ❓ Why do we need Spring Framework?
- 🔗 **Dependency Injection** — loosely coupled code
- 🪶 Lightweight, simple, and easy to use
- 🤝 Can be integrated with other frameworks
- ➕ etc.

### 🫘 What is a Bean?
- A Bean is a simple Java object.
- Beans are the **backbone** of a Spring application, managed by the **Spring IOC container**.

### 🛠️ How Many Ways Can We Create Beans?
There are **3 ways** to create beans:
1. 📄 Using Spring XML configuration
2. 🏷️ Using `@Component` annotation *(used at class level)*
3. ⚙️ Using `@Bean` (with `@Configuration`) annotation *(used at method level)*

---

## 🚀 Spring Boot = Boots Up Your Spring Application

---

## 📦 What is Spring Boot?

- 🏢 An **open-source, Java-based framework** developed by the **Pivotal Team**.
- 🎯 Used to create **stand-alone**, **production-grade** Spring applications that you can *"just run"* — it makes starting a Spring Boot app much easier.
- 🏗️ Built **on top of** the core Spring Framework.

### ✅ Advantages of Spring Boot

| # | Advantage |
|---|-----------|
| 1️⃣ | Follows **"Opinionated Defaults Configuration"** to reduce developer effort |
| 2️⃣ | Avoids boilerplate code, annotations, and XML config → saves time & boosts productivity |
| 3️⃣ | Easily integrates with Spring Modules (Spring JDBC, Spring AOP, Spring Security, etc.) |
| 4️⃣ | Provides **embedded HTTP servers** (Tomcat, Jetty, etc.) 🌐 |
| 5️⃣ | Provides a **CLI tool** ⌨️ to develop & test apps quickly from the command prompt |
| 6️⃣ | Offers many **plugins** 🔌 for developing & testing apps |
| 7️⃣ | Offers plugins for **embedded/in-memory databases** 🗄️ |
| ➕ | etc. |

---

## 🧩 Key Components of Spring Boot Framework

1. 🌱 Spring Boot **Starters**
2. ⚙️ Spring Boot **AutoConfigurator**
3. ⌨️ Spring Boot **CLI**
4. 📊 Spring Boot **Actuators**

---

## 1️⃣ 🌱 Spring Boot Starters

- Starters are **"dependency descriptors."**
- Spring Boot provides many starters that let you add JAR files to the classpath automatically.
- 🏷️ **Naming pattern:** `spring-boot-starter-*`
  - Examples: `spring-boot-starter-web`, `spring-boot-starter-jdbc`

### 📂 Categories of Starters

**a. 🖥️ Application Starters**
- `spring-boot-starter`
- `spring-boot-starter-web`
- `spring-boot-starter-jdbc`
- `spring-boot-starter-aop`
- `spring-boot-starter-test`
- ➕ etc.

**b. 🔧 Technical Starters**
- `spring-boot-starter-tomcat`
- `spring-boot-starter-jetty`
- `spring-boot-starter-logging`
- `spring-boot-starter-log4j`
- ➕ etc.

**c. 🏭 Production Starters**
- `spring-boot-starter-actuators`

> 🚫 **Note:** The name `"spring-boot-starter"` is **reserved** for official Spring Boot artifacts.

### 📝 Syntax Example

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>4.1.0</version>
</dependency>
```

- 🌍 There are also many **third-party starters** available for use in your applications.
- 🏷️ **Third-party naming pattern:** `projectname-spring-boot-starter`

---

## 2️⃣ ⚙️ Spring Boot AutoConfigurator

- 🤖 Automatically configures Spring application settings based on the **JAR dependencies** you've added.
- 📦 All auto-configuration logic lives in **`spring-boot-autoconfigure.jar`**.
- 🏷️ Provides the key annotation: **`@SpringBootApplication`**

```
@SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration
```

---

✨ *End of notes — happy learning!* ✨