# Java 27 Overview

## Introduction

Java 27 represents another step in the evolution of the Java
platform, introducing improvements across the language, concurrency,
security, performance, observability and JVM runtime.

Released on **September 15, 2026**, JDK 27 continues the six-month
Java release cadence.

This document provides a high-level overview of the features
explored in the **Java 27 Feature Lab**.

---

## Java 27 at a Glance

Java 27 includes nine JEPs covering different areas of the
Java platform.

```text
Java 27
│
├── Language
│   └── JEP 532  Primitive Types in Patterns        Preview
│
├── Concurrency
│   └── JEP 533  Structured Concurrency             Preview
│
├── Libraries
│   └── JEP 531  Lazy Constants                     Preview
│
├── JVM
│   ├── JEP 523  G1 as Default Garbage Collector    Final
│   └── JEP 534  Compact Object Headers by Default  Final
│
├── Performance
│   └── JEP 537  Vector API                         Incubator
│
├── Security
│   ├── JEP 527  Post-Quantum Hybrid Key Exchange   Final
│   └── JEP 538  PEM Encodings                      Preview
│
└── Observability
    └── JEP 536  JFR In-Process Data Redaction      Final
```

---

## Main Areas of Evolution

## 1. Language Evolution

Java continues to improve pattern matching and reduce unnecessary
boilerplate while preserving the strong type system that has
characterized the language.

### Primitive Types in Patterns

JEP 532 extends pattern matching to primitive types.

This allows developers to express conditions involving primitive
values using the same general pattern-matching model used with
reference types.

The feature is a **Preview** in Java 27.

---

## 2. Structured Concurrency

Modern applications frequently execute multiple operations
concurrently.

Traditional concurrency APIs can make it difficult to understand
the relationship between parent tasks and their child tasks.

Structured Concurrency addresses this by establishing a clear
lifecycle for related concurrent operations.

The model can be represented as:

```text
Parent Task
    │
    ├── Child Task A
    │
    └── Child Task B
           │
           ▼
      Common Scope
```

The feature is a **Preview** in Java 27.

---

## 3. Lazy Constants

Traditional static constants may be initialized when their
containing class is initialized.

Lazy Constants provide a mechanism for delaying initialization
until the value is actually required.

Conceptually:

```text
Traditional

Class initialization
        │
        ▼
Initialize value
        │
        ▼
Application continues


Lazy Constant

Class initialization
        │
        ▼
Value remains uninitialized
        │
        ▼
Value requested
        │
        ▼
Initialize value
```

Lazy Constants are a **Preview** feature in Java 27.

---

## 4. JVM and Runtime Improvements

Not every Java improvement requires new source-code syntax.

Java 27 also includes changes to the JVM itself.

### G1 Garbage Collector

JEP 523 makes G1 the default garbage collector.

The goal is to provide a modern and balanced garbage collection
strategy as the default runtime behavior.

---

### Compact Object Headers

JEP 534 enables compact object headers by default.

Object headers are part of the JVM's internal object representation.

Reducing their size can improve memory efficiency for Java
applications that manage large numbers of objects.

This is primarily a JVM-level optimization.

---

## 5. Vector API

The Vector API allows developers to express computations that
operate on multiple data elements simultaneously.

Traditional scalar computation:

```text
A0 + B0
A1 + B1
A2 + B2
A3 + B3
```

Vectorized computation:

```text
[A0 A1 A2 A3]
      +
[B0 B1 B2 B3]
      =
[C0 C1 C2 C3]
```

The Vector API remains an **Incubator** feature in Java 27.

Potential application areas include:

- Numerical processing
- Scientific computing
- Data analytics
- Image and signal processing
- Machine learning workloads

---

## 6. Security Evolution

Java 27 continues the evolution of the Java security platform.

### Post-Quantum Hybrid Key Exchange

JEP 527 introduces hybrid key exchange support for TLS 1.3.

The approach combines traditional cryptographic mechanisms with
post-quantum mechanisms.

The objective is to prepare secure communications for a future
in which quantum computing may pose new cryptographic threats.

---

### PEM Encodings

JEP 538 provides APIs for encoding and decoding cryptographic
objects using PEM formats.

This simplifies interoperability with systems and tools that
use PEM-encoded cryptographic material.

The feature is a **Preview** in Java 27.

---

## 7. Observability

Java Flight Recorder continues to evolve as an important
observability technology in the Java platform.

JEP 536 introduces in-process data redaction capabilities,
allowing sensitive information to be protected from appearing
in JFR events.

This is particularly relevant for applications where diagnostic
information and data protection must coexist.

---

## Feature Maturity

Java 27 contains features at different stages of maturity.

```text
Final
  │
  └── Stable platform capability


Preview
  │
  └── Available for evaluation
      and feedback


Incubator
  │
  └── Experimental API
      under active evolution
```

Understanding this distinction is essential when evaluating
Java 27 features in production environments.

---

## Why a Before & After Approach?

A feature is easier to understand when it is compared with the
problem it addresses.

For this reason, this repository does not simply provide isolated
Java 27 examples.

Each major demonstration attempts to answer:

1. How was this problem handled before?
2. What does Java 27 change?
3. What code becomes possible?
4. What trade-offs exist?
5. What is the maturity level of the feature?
6. In which scenarios could the feature be useful?

---

## Java 27 in the Evolution of Java

The Java platform continues to evolve incrementally.

The six-month release cycle allows new language features,
APIs and JVM improvements to be introduced progressively.

Preview and Incubator mechanisms provide a path for experimentation
and feedback before features potentially become permanent parts
of the platform.

This makes Java evolution an iterative process rather than a single
large platform transition.

---

## Official References

OpenJDK JDK 27 Project:

https://openjdk.org/projects/jdk/27/

Oracle Java 27 Release Notes:

https://www.oracle.com/java/technologies/javase/27all-relnotes.html

Java SE 27 Documentation:

https://docs.oracle.com/en/java/javase/27/

Java SE Specifications:

https://docs.oracle.com/javase/specs/

Oracle Java 27 Announcement:

https://www.oracle.com/news/announcement/oracle-releases-java-27-and-strengthens-post-quantum-cryptography-support-2026-09-15/

---

Created by **Ricardo Vallejo Sanchez**  
September 2027
