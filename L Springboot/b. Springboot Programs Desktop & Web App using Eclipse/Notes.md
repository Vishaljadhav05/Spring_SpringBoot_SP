# 🌱 Spring Boot Notes

---

## 🛠️ Different Ways to Create Spring Boot Applications

1. 📁 Using **Maven Project** in Eclipse
2. ⬇️ Installing **STS Tool** in Eclipse
3. 💻 Using **STS (Spring Tool Suite)** IDE
4. 🌐 Using **Spring Boot Initializr**
5. ⌨️ Using **Spring Boot CLI** (Command Line Interface)  [Used for groovy]


---

## 🏷️ Spring Boot Annotations

### 📦 Annotations are present in the following packages:
- `org.springframework.boot.autoconfigure`
- `org.springframework.boot.autoconfigure.condition`

### ✅ Some Common Annotations Used:

- 🚀 `@SpringBootApplication`
- ⚙️ `@AutoConfiguration`
- 🔄 `@EnableAutoConfiguration`
- 📥 `@ImportAutoConfiguration`

#### 🎯 Conditional Annotations:
- ❓ `@Conditional`
- 🫘 `@ConditionalOnBean` and `@ConditionalOnMissingBean`
- 🧩 `@ConditionalOnClass` and `@ConditionalOnMissingClass`
- ➕ *etc.*

---

## ▶️ Tasks Performed by `run()` Method

- ⏱️ Calculate the duration of project started
- 🏗️ Creates `ApplicationContext` object
- 📡 Start the listeners
- 🌍 Prepares the environment i.e. production or dev or test environment
- 🎨 Print the banner
- 🏃 Trigger the Runners
- ➕ *etc.*

---