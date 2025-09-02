🔹 Step 0: Start main()
Address address = new Address("Pondicherry");
Person p1 = new Person("Prem", 25, address);
p1.display();


new Address("Pondicherry") → JVM allocates Address object in heap.
address.city = "Pondicherry"
new Person("Prem", 25, address) → JVM allocates Person object in heap.

p1.name = "Prem"
p1.age = 25
p1.address = reference to Address object
p1.display() → prints "Prem lives in Pondicherry"

🔹 Step 1: Cloning (deep copy)

Person p2 = (Person) p1.clone();

What happens internally:

p1.clone() → calls Person’s overridden clone() method
Person cloned = (Person) super.clone();
super.clone() → Object.clone() (native JVM method)

JVM allocates a new Person object in heap
Copies all fields of p1 to cloned:

cloned.name = "Prem"
cloned.age = 25
cloned.address = reference to the same Address object (shallow copy part)

Next line:

cloned.address = new Address(this.address);
Calls Address copy constructor → allocates new Address object in heap
Copies city value from p1.address → "Pondicherry"
cloned.address now points to this new Address object
Deep copy complete → p2 has independent Person and Address objects

🔹 Step 2: Display cloned object

p2.display();

Prints "Prem lives in Pondicherry"
Both p1 and p2 have same field values, but different memory for Person and Address

🔹 Step 3: Modify cloned object

p2.getAddress().setCity("Chennai");
p2.setAge(27);
p2.setName("Prem Kumar");


p2.address.city → "Chennai" (does not affect p1.address.city)
p2.name → "Prem Kumar"
p2.age → 27

🔹 Step 4: Display original and cloned objects

p1.display(); // Prem lives in Pondicherry
p2.display(); // Prem Kumar lives in Chennai


p1 remains unchanged → confirms deep copy works
p2 is independent → changes do not affect original

🔹 Memory Diagram (simplified)
Heap Memory:
-------------
Address Obj 1: city = "Pondicherry"   <- p1.address
Person Obj 1: name="Prem", age=25, address -> Address Obj 1  <- p1

Address Obj 2: city = "Pondicherry"   <- p2.address
Person Obj 2: name="Prem", age=25, address -> Address Obj 2  <- p2


Different Person objects → p1 != p2

Different Address objects → p1.address != p2.address

🔹 Summary of Flow

p1 created → points to Address Obj 1
p1.clone() → super.clone() creates new Person (p2) → initially shares Address (shallow)
new Address(this.address) → creates independent Address object → deep copy complete
Modify p2 → only affects p2, p1 unchanged
display() shows separate results