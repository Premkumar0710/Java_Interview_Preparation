🔹 Execution Flow (Step by Step)

1. JVM starts your program

The JVM calls the main() method in the main thread (a thread created automatically by JVM).

2. Loop runs in main thread

For each number i from 1 to 100:
A new NumberPrinter object is created (constructor sets its number).
t.start() is called → this is very important.

3. What happens when you call t.start()?

start() is a method in the Thread class (already defined by Java).
It does not directly call your run() method. Instead:
It asks the OS + JVM thread scheduler to create a new separate thread of execution.
That new thread will eventually call your run() method.
Now, you have two threads active:

The main thread (still looping and creating more threads).
The newly created thread (waiting to execute your run()).

4. Scheduler decides execution order

The OS thread scheduler decides when each thread runs.
Some threads may run immediately, others later.
So output can be interleaved and in no fixed order.

5. Thread executes run()

When a thread gets CPU time, it runs its run() method:
System.out.println("Thread " + Thread.currentThread().getName() + " prints: " + number);
This prints the thread’s name (e.g., Thread-0, Thread-1, …) and the number it was assigned.

6. Thread finishes

Once run() finishes, that thread dies.
It will not restart again (threads in Java cannot be restarted).

7. End of program

When all 100 threads have finished execution, and the main thread has also finished creating them, the JVM shuts down.