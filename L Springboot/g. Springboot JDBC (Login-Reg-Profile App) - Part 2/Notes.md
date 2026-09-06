# Springboot Registration App — Notes

## Overview
A Spring Boot web application implementing **Login** and **Register** functionality with a JSP-based frontend, following a layered architecture (Controller → Service → DAO).

## Tech Stack
- Java (JRE 21)
- Spring Boot (Maven project)
- JSP (JavaServer Pages) for views
- Maven Dependencies (via `pom.xml`)

## Project Structure

```
ga_Springboot_Registration_App
└── src/main/java
    ├── in.main
    │   └── SpringbootRegistrationAppApplication.java   # Main class (entry point)
    ├── in.main.beans                                   # Model/Bean classes
    ├── in.main.controllers
    │   └── MyController.java                           # Handles HTTP requests
    ├── in.main.dao
    │   ├── LoginDao.java / LoginDaoImpl.java            # DB operations for login
    │   └── RegisterDao.java / RegisterDaoImpl.java      # DB operations for registration
    ├── in.main.mappers                                 # Object/DB mapping classes
    └── in.main.service
        ├── LoginService.java / LoginServiceImpl.java    # Business logic for login
        └── RegisterService.java / RegisterServiceImpl.java # Business logic for registration
```

## Frontend (webapp)
```
src/main/webapp
├── css/                  # Stylesheets
├── images/               # Image assets
└── views/                # JSP pages
    ├── home.jsp / home-page.jsp
    ├── login.jsp / login-page.jsp
    ├── register.jsp / register-page.jsp
    ├── profile.jsp / profile-page.jsp
    ├── aboutUs.jsp / about-us-page.jsp
    ├── contactUs.jsp / contact-us-page.jsp
    ├── success.jsp / success-page.jsp
    ├── error.jsp / error-page.jsp
    ├── header.jsp
    ├── footer.jsp
    └── menu.jsp
```

## Architecture Flow
```
JSP (View) → Controller → Service → DAO → Database
```
- **Controller**: receives requests from JSP pages, calls service layer.
- **Service**: contains business logic, calls DAO layer.
- **DAO (Impl)**: handles actual database interaction (CRUD for login/register).

## Key Files
| File | Purpose |
|------|---------|
| `MyController.java` | Central controller handling login/register requests |
| `RegisterDaoImpl.java` | Inserts new user data into DB |
| `pom.xml` | Maven build & dependency configuration |
| `HELP.md` | Default Spring Boot generated help file |

## Notes / TODO
- [ ] Add validation for login/register forms
- [ ] Add session management for logged-in users
- [ ] Connect DAO layer to actual database (JDBC)
- [ ] Test error handling via `error.jsp`