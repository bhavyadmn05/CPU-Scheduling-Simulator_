# CPU Scheduling Simulator

A Java-based desktop application that simulates various **CPU Scheduling Algorithms** used in Operating Systems. The simulator provides a graphical visualization of process execution, allowing users to observe how different scheduling algorithms allocate CPU time and affect scheduling metrics such as waiting time and turnaround time.

---

## Features

- Interactive Java Swing GUI
- Supports multiple CPU Scheduling Algorithms:
  - First Come First Serve (FCFS)
  - Round Robin (RR)
  - Priority Scheduling
  - Shortest Job First (SJF)
- Real-time process execution visualization
- Dynamic progress bars for each process
- Ready Queue visualization
- Displays currently executing process
- Calculates:
  - Waiting Time
  - Turnaround Time
  - Total Execution Time
- Modular scheduling architecture using Strategy Design Pattern
- Multithreaded simulation for smooth execution

---

## Technologies Used

- Java
- Java Swing
- Multithreading
- Object-Oriented Programming (OOP)
- Maven
- NetBeans GUI Builder
- Linked List
- Queue
- Priority Queue
- Strategy Design Pattern

---

# Scheduling Algorithms Implemented

## 1. First Come First Serve (FCFS)

Processes are executed in the order they arrive.

**Characteristics**

- Non-preemptive
- FIFO Queue
- Simple implementation

---

## 2. Round Robin

Each process receives a fixed time quantum. If it is not completed within the allotted quantum, it is moved to the end of the queue.

**Characteristics**

- Preemptive
- Fair CPU allocation
- Suitable for time-sharing systems

---

## 3. Priority Scheduling

Processes with higher priority are executed before lower priority processes.

**Characteristics**

- Priority Queue based scheduling
- Higher priority jobs execute first

---

## 4. Shortest Job First (SJF)

Processes with the shortest burst time are executed first.

**Characteristics**

- Burst Time based scheduling
- Minimizes average waiting time

---

# Project Architecture

```
                 User

                   │

           SchedulingGUI

                   │

           CalcSimulation

                   │

            CPUScheduler

                   │

        Scheduler Interface
      ┌────────┼────────┬────────┐
      │        │        │        │
    FCFS      RR    Priority    SJF

                   │

         ComputationThread

                   │

        GUI Visualization Layer
```

---

# Project Workflow

```
User launches application
        │
        ▼
Select Scheduling Algorithm
        │
        ▼
Enter Process Information
        │
        ▼
Create Job Objects
        │
        ▼
Initialize Selected Scheduler
        │
        ▼
CPUScheduler starts scheduling
        │
        ▼
Jobs inserted into Ready Queue
        │
        ▼
ComputationThread simulates execution
        │
        ▼
GUI updates in real time
        │
        ▼
Display Scheduling Statistics
```

---

# Project Structure

```
src/main/java

│
├── SchedulingGUI.java          // Main user interface
├── CalcSimulation.java         // Simulation controller
├── CPUScheduler.java           // Core scheduling engine
├── ComputationThread.java      // Simulates CPU execution
│
├── Scheduler.java              // Scheduling interface
│
├── FCFSPolicy.java
├── RoundRobinPolicy.java
├── PriorityPolicy.java
├── Stack.java                  // Used for SJF
│
├── Job.java                    // Process model
├── Node.java                   // Linked List node
├── MaxPriorityQueue.java       // Priority Queue implementation
│
├── AbsoluteLayout.java
├── AbsoluteConstraints.java
│
└── Resources
      ├── planning.ico
      ├── dark-abstract2.jpg
      └── background images
```

---

# Object-Oriented Design

The project follows several Object-Oriented Programming principles.

### Encapsulation

The `Job` class encapsulates all process-related information.

- Process ID
- Arrival Time
- Burst Time
- Priority
- Waiting Time
- Turnaround Time

---

### Abstraction

The `Scheduler` interface abstracts scheduling behavior.

Every scheduling algorithm implements the same methods:

- enqueue()
- dequeue()
- peek()
- allocateCPU()
- isEmpty()

---

### Polymorphism

The scheduler is selected dynamically at runtime.

```java
Scheduler scheduler;

scheduler = new FCFSPolicy();

scheduler = new RoundRobinPolicy();

scheduler = new PriorityPolicy();
```

---

### Strategy Design Pattern

Each scheduling algorithm is implemented as an independent strategy.

This allows new scheduling algorithms to be added without modifying the scheduler engine.

---

# Data Structures Used

| Data Structure | Purpose             |
| -------------- | ------------------- |
| Linked List    | Ready Queue         |
| Queue          | FCFS & Round Robin  |
| Priority Queue | Priority Scheduling |
| Stack          | Shortest Job First  |
| Arrays         | Process Management  |
| Threads        | CPU Simulation      |

---

# Multithreading

Each process execution is simulated using Java Threads.

Responsibilities include:

- Simulating CPU execution
- Updating progress bars
- Updating remaining burst time
- Updating CPU status
- Refreshing ready queue

This keeps the GUI responsive while the simulation runs.

---

# Performance Metrics

The simulator computes:

- Waiting Time
- Turnaround Time
- Total Execution Time
- Remaining Burst Time
- Current CPU Process

---

# Screenshots

## Main Interface

> Add screenshot here

```
screenshots/home.png
```

---

## Running Simulation

> Add screenshot here

```
screenshots/simulation.png
```

---

# How to Run

## Clone Repository

```bash
git clone https://github.com/yourusername/cpu-scheduling-simulator.git
```

---

## Navigate to Project

```bash
cd cpu-scheduling-simulator
```

---

## Build

```bash
mvn clean install
```

---

## Run

```bash
mvn exec:java
```

or open the project in **NetBeans** or **IntelliJ IDEA** and run `SchedulingGUI.java`.

---

# Future Improvements

- Multilevel Queue Scheduling
- Multilevel Feedback Queue
- Shortest Remaining Time First (SRTF)
- Preemptive Priority Scheduling
- Gantt Chart Visualization
- CPU Utilization Graph
- Context Switching Animation
- Multi-core CPU Simulation
- Dynamic Process Creation
- Export Simulation Report

---

# Learning Outcomes

This project helped in understanding:

- CPU Scheduling Algorithms
- Operating System Concepts
- Java Swing GUI Development
- Multithreading
- Object-Oriented Design
- Strategy Design Pattern
- Queue and Priority Queue Implementations
- Real-time Process Visualization

---

# Author

**Bhavya**

B.Tech Computer Science Engineering

---

## License

This project is intended for educational purposes and learning Operating System scheduling concepts.
