# Java 27 Feature Lab

> A hands-on Before & After laboratory exploring selected
> Java 27 features, JVM improvements, security capabilities,
> concurrency APIs and vector computing.

![Java](https://img.shields.io/badge/Java-27-orange)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![JUnit](https://img.shields.io/badge/JUnit-Testing-green)
![License](https://img.shields.io/badge/License-MIT-blue)

---

## Overview

Java continues to evolve through a combination of language
enhancements, library improvements, JVM optimizations,
security capabilities and performance-oriented APIs.

This repository provides a practical exploration of selected
Java 27 capabilities using a **Before & After** approach.

Instead of only presenting new syntax, each example explains
the problem, the traditional solution, the Java 27 approach
and the technical implications.

---

## Objectives

The main objectives of this laboratory are:

- Explore selected Java 27 features.
- Compare traditional Java approaches with modern alternatives.
- Understand the motivation behind each feature.
- Demonstrate Preview and Incubator APIs responsibly.
- Apply Maven for project management and reproducible builds.
- Use JUnit for automated testing.
- Document technical differences in a structured way.

---

## Java Version

This project targets:

**JDK 27**

Java 27 was released on **September 15, 2026**.

Java 27 is a non-LTS release and is supported until
March 2027 under Oracle's current Java SE roadmap.

> Note: The project documentation date is maintained as
> September 2027 according to the contribution metadata.

---

## Features Covered

| JEP | Feature | Category | Status |
|-----|---------|----------|--------|
| 523 | Make G1 the Default Garbage Collector in All Environments | Performance | Final |
| 527 | Post-Quantum Hybrid Key Exchange for TLS 1.3 | Security | Final |
| 531 | Lazy Constants | Libraries | Third Preview |
| 532 | Primitive Types in Patterns, instanceof, and switch | Language | Fifth Preview |
| 533 | Structured Concurrency | Concurrency | Seventh Preview |
| 534 | Compact Object Headers by Default | JVM | Final |
| 536 | JFR In-Process Data Redaction | Monitoring | Final |
| 537 | Vector API | Performance | Twelfth Incubator |
| 538 | PEM Encodings of Cryptographic Objects | Security | Third Preview |

---

## Before & After Methodology

The project follows a simple model:

```text
                 PROBLEM
                    │
                    ▼
             ┌─────────────┐
             │   BEFORE    │
             │ Traditional │
             │   approach  │
             └──────┬──────┘
                    │
                    ▼
             Java 27 Feature
                    │
                    ▼
             ┌─────────────┐
             │    AFTER    │
             │ Modern Java │
             │   approach  │
             └──────┬──────┘
                    │
                    ▼
              TEST + ANALYSIS
```

---

## Project Structure

```text
src/main/java/org/todtete
├── Main.java
├── concurrency        BeforeConcurrency / StructuredConcurrencyDemo
├── constants          BeforeConstants / LazyConstantsDemo
├── patternmatching    BeforePatternMatching / Java27PatternMatching
├── performance        G1GarbageCollectorDemo / CompactObjectHeadersDemo
├── security           PostQuantumTlsDemo
└── vector             VectorApiDemo

src/test/java/org/todtete
├── concurrency        StructuredConcurrencyTest
├── constants          LazyConstantsTest
├── patternmatching    PatternMatchingTest
├── performance        PerformanceDemoTest
├── security           PostQuantumTlsTest
└── vector             VectorApiTest
```

---

## Requirements

- JDK 27
- Maven 3.9 or later

Check that Maven is using JDK 27:

```bash
mvn -version
```

---

## Preview and Incubator Flags

Three of the demonstrated features are Preview APIs
(JEP 531, 532 and 533) and one is an incubating module
(JEP 537).

Both groups have to be enabled at compile time **and** at
run time:

```text
--enable-preview
--add-modules jdk.incubator.vector
```

The `pom.xml` declares these flags once and passes them to
the compiler, to Surefire and to the execution plugin, so no
manual configuration is required.

Preview APIs are tied to the exact release that compiled
them, which means the classes produced here run on JDK 27
only.

---

## Build and Run

Compile the project:

```bash
mvn clean compile
```

Run the full test suite:

```bash
mvn test
```

Run the laboratory:

```bash
mvn compile exec:exec
```

Build the executable JAR:

```bash
mvn clean package
```

Run the packaged JAR directly:

```bash
java --enable-preview --add-modules jdk.incubator.vector \
     -jar target/New-Java-27-1.0-SNAPSHOT.jar
```

---

## Tests

Each feature package has a matching test class. The suite
covers the behaviour of the new APIs and, where a Before
counterpart exists, verifies that both approaches produce the
same result.

```bash
mvn test
```

---

## Documentation

| Document | Content |
|----------|---------|
| [docs/java-27-overview.md](docs/java-27-overview.md) | High-level tour of the Java 27 features |
| [docs/feature-matrix.md](docs/feature-matrix.md) | Technical matrix by category and maturity |
| [docs/before-and-after.md](docs/before-and-after.md) | The Before &amp; After methodology in detail |

Each package under `src/main/java/org/todtete` also carries its
own `README.md` describing the feature it demonstrates.

---

## Notes on the Examples

- `LazyConstant` is declared in `java.lang`, so it needs no
  import.
- Guarded patterns do not contribute to the exhaustiveness of
  a `switch` expression, so the primitive pattern example ends
  with an unconditional pattern.
- `Security.getProviders()` returns an array, not a
  collection.
- The Vector API example processes the elements that do not
  fill a complete vector in a scalar tail loop.

---

Created by **Ricardo Vallejo Sanchez**  
September 2027
