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

# Features Covered

| JEP | Feature | Category | Status |
|-----|---------|----------|--------|
| 523 | Make G1 the Default Garbage Collector | Performance | Final |
| 527 | Post-Quantum Hybrid Key Exchange for TLS 1.3 | Security | Final |
| 531 | Lazy Constants | Libraries | Preview |
| 532 | Primitive Types in Patterns, instanceof, and switch | Language | Preview |
| 533 | Structured Concurrency | Concurrency | Preview |
| 534 | Compact Object Headers | JVM | Final |
| 536 | JFR In-Process Data Redaction | Monitoring | Final |
| 537 | Vector API | Performance | Incubator |
| 538 | PEM Encodings of Cryptographic Objects | Security | Preview |

---

# Before & After Methodology

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