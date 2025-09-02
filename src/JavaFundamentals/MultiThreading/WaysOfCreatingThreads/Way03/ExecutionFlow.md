🔹 Execution Flow (Step by Step)

1. Start of Program

JVM creates the main thread and executes main().

2. Create ExecutorService

Executors.newFixedThreadPool(50) → creates a thread pool with exactly 50 worker threads.
These threads are created lazily when tasks are submitted.

3. Submit Tasks

Loop runs from 1 to 100.
For each number:
A NumberPrinter task (Runnable) is created.
pool.execute(task) hands it to the thread pool’s internal task queue.

4. Workers pick tasks

The 50 threads in the pool are reused.
Each available worker picks up the next task in the queue and calls its run().

5. Execution (interleaved)

Tasks run concurrently on different threads.

Example output:

pool-1-thread-1 prints: 1
pool-1-thread-2 prints: 2
pool-1-thread-3 prints: 3
...
pool-1-thread-50 prints: 50
pool-1-thread-1 prints: 51
pool-1-thread-2 prints: 52
...

Notice: after the first 50 tasks, the same threads (thread-1 to thread-50) are reused for tasks 51–100.

6. Shutdown

After loop ends, pool.shutdown() is called.
Pool stops accepting new tasks, but finishes all submitted tasks.
Once all 100 tasks are done, pool threads die → JVM exits.