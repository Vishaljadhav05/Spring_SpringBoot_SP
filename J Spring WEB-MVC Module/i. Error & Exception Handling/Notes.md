# 🌱 Error & Exception Handling in Spring WEB-MVC

## ⚠️ What are Errors & Exceptions?
- Errors and Exceptions are **unwanted / abnormal events** that occur during program execution.
- If not handled properly, they disrupt the normal flow of the application and can crash the request or expose ugly stack traces to the client.

---

## 🛠️ Ways to Handle Errors/Exceptions in Spring MVC

Spring WEB-MVC provides **3 main ways** to handle exceptions:

### 1️⃣ By `web.xml` file
- Old-school, XML-based configuration approach.
- You can define `<error-page>` tags mapping specific exception types or HTTP status codes to a custom error view/page.
- Example:
  ```xml
  <error-page>
      <exception-type>java.lang.Exception</exception-type>
      <location>/error.jsp</location>
  </error-page>
  ```
- 🚫 Drawback: Not very flexible, hard to customize response per exception type, mostly outdated in modern Spring apps.

### 2️⃣ By pre-defined class → `SimpleMappingExceptionResolver`
- A built-in Spring class used to map exception class names to specific view names.
- Configured usually via XML or Java Config as a bean.
- Example (XML config):
  ```xml
  <bean class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
      <property name="exceptionMappings">
          <props>
              <prop key="java.lang.Exception">error</prop>
          </props>
      </property>
  </bean>
  ```
- ✅ Centralized mapping of exceptions to views.
- 🚫 Drawback: Still view-centric, not ideal for REST APIs (JSON responses).

### 3️⃣ By Annotations → `@ExceptionHandler` ⭐ (Most Popular / Modern Approach)
- Used to define a **method** that handles exceptions thrown by controller methods.
- Provides a way to **centralize exception handling** and give a **consistent response** to the client whenever an error occurs.
- Can be placed:
  - Inside a specific `@Controller` (handles exceptions only for that controller)
  - Inside a `@ControllerAdvice` / `@RestControllerAdvice` class (handles exceptions **globally**, across all controllers) 🌍

---

## 🎯 `@ExceptionHandler` — Deep Dive

- ✅ Method-level annotation.
- ✅ Used to catch a specific exception type (or multiple types) thrown from controller/handler methods.
- ✅ Helps avoid try-catch blocks scattered everywhere in controller logic — keeps code clean.
- ✅ Can return:
  - A view name (for traditional MVC apps)
  - A `ResponseEntity<>` (for REST APIs) 📦
  - A `ModelAndView` object

### 📌 Example
```java
@Controller
public class UserController {

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid User ID");
        }
        return "userView";
    }

    // Handles exceptions thrown within THIS controller only
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleInvalidId(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
```

---

## 🌍 `@ControllerAdvice` / `@RestControllerAdvice` (Bonus Info) ✨

- `@ExceptionHandler` inside a normal controller only handles exceptions from **that** controller.
- To handle exceptions **globally** (across the whole application), combine it with `@ControllerAdvice` (returns views) or `@RestControllerAdvice` (returns JSON, `@ControllerAdvice` + `@ResponseBody`).

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        return new ResponseEntity<>("Something went wrong! " + ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
```

> 💡 This is the **industry-standard approach** in real-world Spring Boot REST APIs.

---

## 🧩 Extra Useful Annotations & Concepts

| Annotation / Class | Purpose |
|---|---|
| `@ExceptionHandler` 🎯 | Handles specific exception(s) in a controller or globally |
| `@ControllerAdvice` 🌍 | Makes exception handling global (MVC, returns view) |
| `@RestControllerAdvice` 🌍📦 | Global exception handling for REST APIs (returns JSON) |
| `@ResponseStatus` 🚦 | Sets a custom HTTP status code on an exception class |
| `HandlerExceptionResolver` 🧠 | Interface that all exception-resolving strategies implement internally |
| `DefaultHandlerExceptionResolver` ⚙️ | Handles standard Spring exceptions (like 404, 405) automatically |

### 🚦 `@ResponseStatus` Example
```java
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
```

---

## ✅ Order of Priority (Which resolver wins?)
Spring checks exception resolvers in a chain. Roughly:
1. `@ExceptionHandler` methods (local controller or `@ControllerAdvice`) 🥇
2. `@ResponseStatus` annotated exceptions
3. `SimpleMappingExceptionResolver` / custom `HandlerExceptionResolver`
4. Default Spring handling (falls back to error page / default error response)

---

## 🏆 Why `@ExceptionHandler` (+ `@ControllerAdvice`) is Preferred Today
- ✨ Clean separation of business logic and error-handling logic
- 🌍 Centralized — one place to manage all exceptions across the app
- 📦 Works seamlessly with REST APIs (JSON error responses)
- 🔧 Highly customizable per exception type
- 🧪 Easy to test and maintain

---

## 📝 Quick Summary
- Errors/Exceptions = unwanted events during execution 💥
- 3 ways to handle in Spring MVC: `web.xml` 📄, `SimpleMappingExceptionResolver` 🗺️, `@ExceptionHandler` 🎯
- `@ExceptionHandler` = modern, method-level, centralized exception handling
- Combine with `@ControllerAdvice` / `@RestControllerAdvice` for **global** exception handling 🌍
- Use `@ResponseStatus` for simple, declarative HTTP status mapping 🚦