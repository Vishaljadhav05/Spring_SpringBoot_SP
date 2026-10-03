# 📦 Jackson Annotations Notes

Jackson annotations control how Java objects are converted to JSON (**serialization**) and how JSON is converted back into Java objects (**deserialization**).

---

## 1. 🏷️ @JsonProperty
- Used to indicate the mapping between a JSON property and a corresponding Java Object property during serialization and deserialization.
- Can be used with property, getter/setter methods, or constructor arguments.
- Useful when the JSON field name differs from the Java field name.

```java
public class User {
    @JsonProperty("user_name")
    private String userName;
}
```

---

## 2. 🔀 @JsonAlias
- Used to provide alternative names for a JSON property during deserialization.
- Can be used with property, getter/setter methods, or constructor arguments.
- Only affects **deserialization** (input), not output.

```java
public class User {
    @JsonAlias({"userName", "user_name", "uname"})
    private String name;
}
```

---

## 3. 🙈 @JsonIgnore
- Used to indicate that a specific property, getter, or setter should be ignored during both serialization and deserialization.
- Can be used with properties, getter/setter methods, or constructor arguments.

```java
public class User {
    @JsonIgnore
    private String password;
}
```

---

## 4. 🚫 @JsonIgnoreProperties
- Used to ignore certain properties when mapping to or from JSON during serialization and deserialization.
- Used at the **class level**.
- Commonly used with `ignoreUnknown = true` to avoid errors on unknown JSON fields.

```java
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String name;
    private int age;
}
```

---

## 5. 📅 @JsonFormat
- Used to customize the formatting of date/time values during serialization and deserialization.
- Can be used with property or getter/setter methods.

```java
public class Event {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eventDate;
}
```

---

## 6. ➕ @JsonAnyGetter
- Used to dynamically serialize properties of a class that do not have explicit mapping.
- Allows including additional (dynamic) properties in the serialized JSON that aren't explicitly defined as properties or getters.

```java
public class User {
    private Map<String, Object> extraProperties = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getExtraProperties() {
        return extraProperties;
    }
}
```

---

## 7. ➕ @JsonAnySetter
- Used to dynamically deserialize properties of a class that do not have explicit mapping.
- Allows including additional (unknown) properties from JSON into a class that doesn't have setters/fields defined for them.

```java
public class User {
    private Map<String, Object> extraProperties = new HashMap<>();

    @JsonAnySetter
    public void setExtraProperty(String key, Object value) {
        extraProperties.put(key, value);
    }
}
```

---

## ✨ Other Important Jackson Annotations

### 8. 🎯 @JsonInclude
- Used to specify when a property should be included in JSON output (e.g., only if non-null, non-empty, or non-default).

```java
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String middleName;
}
```

---

### 9. 🏗️ @JsonCreator
- Used on a constructor or factory method to indicate how Jackson should instantiate an object during deserialization, especially useful with immutable objects (final fields, no setters).

```java
public class User {
    private final String name;
    private final int age;

    @JsonCreator
    public User(@JsonProperty("name") String name, @JsonProperty("age") int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

### 10. 🔢 @JsonValue
- Used on a method to indicate that its return value should be used as the **entire** JSON representation of the object (instead of the default field-by-field serialization).

```java
public enum Status {
    ACTIVE("A"), INACTIVE("I");

    private String code;
    Status(String code) { this.code = code; }

    @JsonValue
    public String getCode() { return code; }
}
```

---

### 11. 📝 @JsonRawValue
- Used to indicate that a property's string value should be embedded into the JSON output **as-is**, without escaping or quoting.

```java
public class Response {
    @JsonRawValue
    private String rawJson; // e.g. {"key":"value"}
}
```

---

### 12. 🔃 @JsonPropertyOrder
- Used at the class level to specify the order in which properties appear in the serialized JSON.

```java
@JsonPropertyOrder({"id", "name", "age"})
public class User {
    private int age;
    private String name;
    private int id;
}
```

---

### 13. 🎁 @JsonUnwrapped
- Used to "flatten" the properties of a nested object into the parent object's JSON, instead of nesting it as a sub-object.

```java
public class User {
    private String name;

    @JsonUnwrapped
    private Address address;
}
```

---

### 14. 🔗 @JsonManagedReference & @JsonBackReference
- Used together to handle **bidirectional relationships** (parent-child) and avoid infinite recursion during serialization.
- `@JsonManagedReference` → forward part (serialized normally).
- `@JsonBackReference` → back part (omitted from serialization to break the cycle).

```java
public class Parent {
    @JsonManagedReference
    private List<Child> children;
}

public class Child {
    @JsonBackReference
    private Parent parent;
}
```

---

### 15. 🆔 @JsonIdentityInfo
- Used at the class level to handle circular references by assigning an identity (like an ID) to objects instead of infinitely nesting them.

```java
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee {
    private int id;
    private Employee manager;
}
```

---

### 16. 👀 @JsonView
- Used to serialize/deserialize only a subset of properties depending on the "view" being used — useful for exposing different data to different consumers (e.g., public vs internal API).

```java
public class User {
    @JsonView(Views.Public.class)
    private String name;

    @JsonView(Views.Internal.class)
    private String ssn;
}
```

---

### 17. 🧬 @JsonTypeInfo & @JsonSubTypes
- Used together for **polymorphic** serialization/deserialization — includes type metadata in JSON so Jackson knows which subclass to instantiate.

```java
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Dog.class, name = "dog"),
    @JsonSubTypes.Type(value = Cat.class, name = "cat")
})
public abstract class Animal { }
```

---

### 18. 🐫 @JsonNaming
- Used at the class level to apply a naming strategy (e.g., snake_case, kebab-case) to all properties instead of annotating each one individually.

```java
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class User {
    private String firstName; // serialized as "first_name"
}
```

---

### 19. ⚙️ @JsonSerialize & @JsonDeserialize
- Used to specify a **custom serializer/deserializer class** for a property or type, giving full control over the conversion logic.

```java
public class Product {
    @JsonSerialize(using = CustomPriceSerializer.class)
    private BigDecimal price;
}
```

---

### 20. 🔍 @JsonAutoDetect
- Used at the class level to configure the visibility rules Jackson uses to auto-detect fields/getters/setters (e.g., include private fields without needing getters).

```java
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class User {
    private String name; // detected even without a getter
}
```

---

### 21. 🌳 @JsonRootName
- Used at the class level to wrap the serialized JSON inside a root element name (requires `SerializationFeature.WRAP_ROOT_VALUE` to be enabled).

```java
@JsonRootName(value = "user")
public class User {
    private String name;
}
// Output: { "user": { "name": "..." } }
```

---

### 22. 🧹 @JsonFilter
- Used at the class level to define a named filter that dynamically decides (at runtime) which properties to include/exclude during serialization.

```java
@JsonFilter("userFilter")
public class User {
    private String name;
    private String password;
}
```

---

## 📌 Quick Summary Table

| Annotation | Purpose |
|---|---|
| 🏷️ @JsonProperty | Map JSON ↔ Java property name |
| 🔀 @JsonAlias | Alternate names for deserialization |
| 🙈 @JsonIgnore | Ignore a property entirely |
| 🚫 @JsonIgnoreProperties | Ignore properties at class level |
| 📅 @JsonFormat | Format dates/times |
| ➕ @JsonAnyGetter | Serialize dynamic/extra properties |
| ➕ @JsonAnySetter | Deserialize dynamic/extra properties |
| 🎯 @JsonInclude | Conditionally include properties |
| 🏗️ @JsonCreator | Custom constructor for deserialization |
| 🔢 @JsonValue | Use single value as whole JSON |
| 📝 @JsonRawValue | Embed raw JSON as-is |
| 🔃 @JsonPropertyOrder | Control property order |
| 🎁 @JsonUnwrapped | Flatten nested object |
| 🔗 @JsonManagedReference / @JsonBackReference | Handle bidirectional relations |
| 🆔 @JsonIdentityInfo | Handle circular references |
| 👀 @JsonView | Serialize subsets of data |
| 🧬 @JsonTypeInfo / @JsonSubTypes | Polymorphic (de)serialization |
| 🐫 @JsonNaming | Apply naming strategy |
| ⚙️ @JsonSerialize / @JsonDeserialize | Custom (de)serializer logic |
| 🔍 @JsonAutoDetect | Configure field/getter visibility |
| 🌳 @JsonRootName | Wrap JSON in a root element |
| 🧹 @JsonFilter | Dynamic runtime property filtering |