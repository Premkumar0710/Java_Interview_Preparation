🔹 Execution Flow (Step by Step)

1. JVM starts with main()

Main thread runs the for loop (i = 1..100).

2. Create a Runnable task

For each i, new NumberPrinter(i) is created.
Unlike the extends Thread version, this object is not a thread, it’s just a task (code to run later).

3. Wrap inside a Thread

new Thread(task) creates a Thread object.
This Thread knows:
👉 “When I start, I’ll call task.run().”

4. Call start()

t.start() tells the JVM scheduler to create a new OS thread.
That new thread will eventually invoke task.run().

5. Thread executes run()

The new thread calls your NumberPrinter.run():
System.out.println("Thread " + Thread.currentThread().getName() + " prints: " + number);

6. Threads interleave

Just like before, thread scheduling is up to the JVM + OS.
Numbers may not print in strict order.

7. Finish

Each thread ends after its run() finishes.
When all 100 threads + the main thread are done, JVM exits.


| Aspect            | `extends Thread`                                                    | `implements Runnable`                                            |
| ----------------- | ------------------------------------------------------------------- | ---------------------------------------------------------------- |
| Inheritance       | Can’t extend any other class (Java allows only single inheritance). | Can still extend another class (only implementing an interface). |
| Task vs Execution | Task & execution logic are tied together (your class is both).      | Task (`Runnable`) is separate from execution (`Thread`).         |
| Flexibility       | Less flexible                                                       | More flexible – preferred in real-world apps.                    |
| With Executors    | Not supported directly                                              | Works perfectly (`ExecutorService` takes Runnable/Callable).     |
