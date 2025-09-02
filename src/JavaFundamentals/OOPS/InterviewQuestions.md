# OOPs Interview Questions (Java Backend Focus)

---

### Encapsulation
1. **Q:** What is encapsulation in Java?  
   **A:** Encapsulation is the process of bundling fields and methods into a single class while restricting direct access to fields. It is implemented using `private` variables and `public` getters/setters.

2. **Q:** Why do we use encapsulation?  
   **A:** To achieve data hiding, better control, and maintainability. It allows controlled access to variables.

3. **Q:** How is encapsulation different from abstraction?  
   **A:** Encapsulation is about *how data is hidden inside a class*, while abstraction is about *hiding implementation details from the user*. Encapsulation → "data hiding", Abstraction → "implementation hiding".

---

### Inheritance
1. **Q:** What are the types of inheritance in Java?  
   **A:**
    - Single
    - Multilevel
    - Hierarchical  
      (Java does not support multiple inheritance with classes, but it is possible with interfaces.)

2. **Q:** Why doesn’t Java support multiple inheritance with classes?  
   **A:** To avoid the "Diamond Problem" where ambiguity arises if two parent classes define the same method.

3. **Q:** What happens if a subclass has the same field as its parent?  
   **A:** The subclass field hides the parent’s field (field shadowing).

---

### Polymorphism
1. **Q:** What’s the difference between overloading and overriding?  
   **A:** Overloading → compile-time, same method name but different parameters.  
   Overriding → runtime, same method signature in subclass with a different implementation.

2. **Q:** Can we override a static method?  
   **A:** No. Static methods belong to the class, not the object. They can be re-declared (method hiding) but not overridden.

3. **Q:** Can a constructor be overloaded or overridden?  
   **A:** Constructors can be **overloaded** (different parameter lists), but cannot be **overridden** (not inherited).

---

### Abstraction
1. **Q:** What is the difference between abstract class and interface?  
   **A:**
    - Abstract class → can have both abstract and concrete methods, supports inheritance, can have constructors, single inheritance.
    - Interface → all methods are abstract (until Java 7), supports multiple inheritance, cannot have constructors.

2. **Q:** Can we create an object of an abstract class?  
   **A:** No. Abstract classes cannot be instantiated directly, but you can create references pointing to subclass objects.

3. **Q:** Which is better to use: abstract class or interface?  
   **A:** Depends on requirement:
    - Use abstract class when classes share a common base with partial implementation.
    - Use interface when you want to define a contract that multiple unrelated classes can implement.
