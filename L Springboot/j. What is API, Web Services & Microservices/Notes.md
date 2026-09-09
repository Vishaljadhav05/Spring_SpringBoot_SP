# 📘 API, Web Services & Microservices Notes

---

## 🔌 API (Application Programming Interface)

- 📝 **Full Form:** Application Programming Interface
- 🔗 API is an application component (or piece of code) used for **communication between different systems** over a network.
- 🌉 API acts as a **bridge** between different systems or devices.
- ⚙️ It defines a set of **rules/protocols** that allow one software application to talk to another — without either side needing to know the other's internal implementation.

### 💡 Examples
| Type | Example |
|------|---------|
| 🔐 Login APIs | Google Login, Facebook Login |
| 🗺️ Maps | Google Maps API |
| 💳 Payments | Payment Gateway APIs (Razorpay, Stripe, PayPal) |
| ✈️ Travel Booking | Airline, Bus, Train Booking APIs |
| 🎬 Entertainment | Movie Booking APIs (BookMyShow) |
| ☁️ Weather | Weather APIs |
| 📺 Others | YouTube, Amazon, Flipkart APIs |

### 🏷️ Types of APIs

1. 🌍 **Public / Open APIs**
   - Open to the public, anyone can use them.
   - Can be **paid** or **free**.
   - Example: OpenWeather API, Twitter API.

2. 🤝 **Partner APIs**
   - Meant for **business-to-business (B2B)** partnerships.
   - Shared only with specific authorized partners, usually requires a license/agreement.

3. 🔒 **Private / Internal APIs**
   - Used **internally** within a specific enterprise/company application.
   - Not exposed to outside developers.

4. 🧩 **Composite APIs**
   - Combine **two or more different APIs** into a single call for a system/project.
   - Useful when a task needs data from multiple sources — reduces number of separate calls, improves performance.

> ✨ **Extra Tip:** APIs are often categorized by architecture style too — REST, SOAP, GraphQL, gRPC — which describes *how* the API is built, not just *who* can access it.

---

### API Examples

![API 1](API%201.png)
![API 2](API%202.png)
![API 3](API%203.png)
![API 4](API%204.png)


---

## 🌐 Web Services

- 🔄 Web Services are a **type of API** used to exchange data (**XML** or **JSON**) between different systems over a network.
- 🖥️ Web services are **platform-independent** — e.g., a web service built in **Java** can communicate with a client built in **Python** or **PHP**.
- 📡 Web services use the **HTTP protocol** for communication.

### ⚠️ Important Note
- ✅ All web services are APIs.
- ❌ But **not all APIs are web services** (e.g., a library function/API doesn't need a network).
- 🧪 To test web services, we use the **Postman** tool.

### 🧬 Types of Web Services

| Type | Description |
|------|--------------|
| 🧼 **SOAP** (Simple Object Access Protocol) | XML-based protocol, strict standards, more secure, uses WSDL for contract definition |
| 🌿 **RESTful** (Representational State Transfer) | Lightweight, uses HTTP methods (GET, POST, PUT, DELETE), supports JSON/XML, most widely used today |

> ✨ **Extra Tip:** REST is preferred in modern development because it's **faster, lightweight, and easier to work with** compared to SOAP, which is heavier but offers built-in security (WS-Security) — often used in banking/enterprise systems.

---

###  Web Services Diagram

![ Web Services](Web%20Services.png)

---

## 🧱 Microservices

- 🏗️ Microservices is a **software architecture** used to design applications.
- 🎯 **Idea:** Create small, independent components (services) that each perform a **simple task**, then integrate them to build a large, complex application.
- 🔁 Microservices architecture **replaced** the traditional **Monolithic** approach.

### ⚖️ Monolithic vs Microservices (Extra Detail)

| Aspect | 🏢 Monolithic | 🧩 Microservices |
|--------|--------------|-------------------|
| Codebase | Single large codebase | Multiple small independent services |
| Deployment | Deploy entire app together | Deploy services independently |
| Scaling | Scale entire app | Scale individual services as needed |
| Failure Impact | One failure can crash whole app | Failure isolated to that service |
| Technology | Usually single tech stack | Can use different tech per service (polyglot) |

### 🚀 Advantages of Microservices
- 📈 Easy to **scale**
- ⚡ Fast to **develop**
- 🛠️ Easy to **maintain**
- 🧪 Easy to **test**
- 📦 Easy to **deploy**
- 🔄 Independent teams can work on different services in parallel
- 🧯 Fault isolation — one service failing doesn't bring down the whole system

### 🛠️ Technologies Used
- ☕ **Java** is mostly used, along with frameworks like:
  - 🍃 **Spring Boot**
  - ⚡ **Spark**
  - 🎯 **DropWizard**
  - 🌐 **Jersey**

> ✨ **Extra Tip:** Microservices usually communicate via **REST APIs** or **message brokers** (like Kafka, RabbitMQ). Tools like **Docker** (containerization) and **Kubernetes** (orchestration) are commonly used alongside microservices for deployment and scaling.

---

### Microservices Diagram

![Microservices 1](Microservices%201.png)
![Microservices 2](Microservices%202.png)

---

## 📡 HTTP (HyperText Transfer Protocol)

- 🌍 HTTP is the **protocol** used for communication between a **client** (browser/app) and a **server**.
- 📬 It follows a **request-response** model.

### 🔑 Common HTTP Methods
| Method | Purpose |
|--------|---------|
| 📥 GET | Retrieve data |
| 📤 POST | Create new data |
| ✏️ PUT | Update/replace existing data |
| 🔧 PATCH | Partially update data |
| ❌ DELETE | Remove data |

### 📊 Common HTTP Status Codes
| Code | Meaning |
|------|---------|
| ✅ 200 | OK — Success |
| 🆕 201 | Created |
| ⚠️ 400 | Bad Request |
| 🔐 401 | Unauthorized |
| 🚫 403 | Forbidden |
| ❓ 404 | Not Found |
| 💥 500 | Internal Server Error |

---

## 🧪 Postman

- 🛠️ **Postman** is a popular tool used to **test APIs and web services**.
- 📨 It allows sending requests (GET, POST, PUT, DELETE etc.) to an API endpoint and viewing the response.
- 🗂️ Features:
  - 📁 Organize requests into **Collections**
  - 🌱 Use **Environments** for different variables (dev, test, prod)
  - 🤖 Write **automated test scripts** in JavaScript
  - 🔄 Supports **Collection Runner** for running multiple requests together
  - 📜 Generates **API documentation** automatically
  - 🔗 Supports Mock Servers for testing without a live backend

> ✨ **Extra Tip:** Postman also supports **CI/CD integration** via Newman (Postman's command-line tool), which is useful for running automated API test suites in build pipelines.

---

## 📚 Resources

- 📖 Official REST API concepts: [restfulapi.net](https://restfulapi.net)
- 📖 Postman Learning Center: [learning.postman.com](https://learning.postman.com)
- 📖 Spring Boot Docs: [spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
- 📖 MDN HTTP Docs: [developer.mozilla.org/en-US/docs/Web/HTTP](https://developer.mozilla.org/en-US/docs/Web/HTTP)

---

### 📝 Summary
- **API** = communication bridge between systems 🌉
- **Web Service** = API that works over a network using XML/JSON via HTTP 🌐
- **Microservices** = architecture style using small independent services 🧱
- **Postman** = tool to test APIs/web services 🧪