🔹 Flow (Step by Step)

1. Counter counter = new Counter();

A single shared object is created.
Inside it, count = 0.

2. Thread t1 = new Thread(new CounterTask(counter));

A new CounterTask object is created with the shared counter.
A Thread object (t1) is created, and it is given this task to run.
At this point, nothing has executed yet.

3. Thread t2 = new Thread(new CounterTask(counter));

Same as above, another CounterTask is created (but both tasks share the same counter).
Another Thread object (t2) is created.
Still, no execution yet.

4. t1.start();

Tells the JVM to start a new thread.
JVM internally calls the run() method of CounterTask.
t1 begins looping 1000 times → calls counter.increment() each time.

5. t2.start();

Same as above, a new thread begins.
t2 also loops 1000 times and calls counter.increment() each time.
Now t1 and t2 run in parallel, both updating the same counter.

6. Thread Execution (race for the lock 🔑)

Both threads try to enter increment() at the same time.
Because it’s synchronized, only one thread at a time can enter.

For example:

If t1 is inside increment(), t2 must wait.
Once t1 finishes, t2 gets the lock and increments.
This continues until both threads finish their 1000 increments.

7. t1.join();

main thread pauses and waits until t1 finishes execution.

8. t2.join();

Same for t2.
Now the main thread waits for both worker threads to complete.

9. System.out.println("Final Count = " + counter.getCount());

At this point, both t1 and t2 have finished.
count has been incremented exactly 2000 times (1000 each).

Prints:
Final Count = 2000


✅ So the main method flow is:

Create counter (shared resource).
Create 2 tasks (CounterTask) → wrap inside 2 threads.
Start both threads (t1.start(), t2.start()).
Main thread waits (join()).
Print final consistent result.