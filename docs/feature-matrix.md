# Java 27 Feature Matrix

This document provides a technical matrix of the Java 27 features explored in this repository.

The purpose is to distinguish between language features, APIs, JVM improvements, security enhancements and performance-related capabilities.

---

## Feature Matrix

| JEP | Feature | Category | Maturity | Demonstrated in Project |
|-----|---------|----------|----------|-------------------------|
| JEP 523 | Make G1 the Default Garbage Collector in All Environments | JVM / Performance | Final | Yes |
| JEP 527 | Post-Quantum Hybrid Key Exchange for TLS 1.3 | Security | Final | Yes |
| JEP 531 | Lazy Constants | Libraries | Third Preview | Yes |
| JEP 532 | Primitive Types in Patterns, instanceof, and switch | Language | Fifth Preview | Yes |
| JEP 533 | Structured Concurrency | Concurrency | Seventh Preview | Yes |
| JEP 534 | Compact Object Headers by Default | JVM / Performance | Final | Yes |
| JEP 536 | JFR In-Process Data Redaction | Observability | Final | Documentation |
| JEP 537 | Vector API | Performance | Twelfth Incubator | Yes |
| JEP 538 | PEM Encodings of Cryptographic Objects | Security API | Third Preview | Documentation |

---

## Feature Categories

### Language Features

These features primarily affect the Java programming language
and how developers express application logic.

#### Primitive Types in Patterns

JEP 532 extends pattern matching to support primitive types
in pattern contexts, including `instanceof` and `switch`.

**Status:** Preview (Fifth Preview)

**Project example:**

```text
patternmatching/
├── BeforePatternMatching.java
└── Java27PatternMatching.java
```

---

### Concurrency

#### Structured Concurrency

JEP 533 provides a structured approach to managing related
concurrent tasks.

**Status:** Preview (Seventh Preview)

**Project example:**

```text
concurrency/
├── BeforeConcurrency.java
└── StructuredConcurrencyDemo.java
```

---

### Initialization and Constants

#### Lazy Constants

JEP 531 introduces `LazyConstant`, allowing values to be
initialized lazily while providing constant-like semantics.

**Status:** Preview (Third Preview)

**Project example:**

```text
constants/
├── BeforeConstants.java
└── LazyConstantsDemo.java
```

---

### Performance

Java 27 includes several improvements that operate primarily
at the JVM or API level.

#### G1 as Default Garbage Collector

JEP 523 makes G1 the default garbage collector.

**Status:** Final

#### Compact Object Headers

JEP 534 enables compact object headers by default.

**Status:** Final

#### Vector API

JEP 537 continues the Vector API as an incubating API for
expressing vector computations.

**Status:** Incubator (Twelfth Incubator)

**Project example:**

```text
vector/
└── VectorApiDemo.java
```

---

### Security

#### Post-Quantum Hybrid Key Exchange

JEP 527 introduces support for hybrid key exchange mechanisms
for TLS 1.3.

**Status:** Final

#### PEM Encodings

JEP 538 introduces APIs for encoding and decoding cryptographic
objects using the Privacy-Enhanced Mail format.

**Status:** Preview (Third Preview)

---

### Observability

#### JFR In-Process Data Redaction

JEP 536 provides mechanisms for redacting sensitive information
from Java Flight Recorder events.

**Status:** Final

This feature is primarily documented in this repository rather
than represented by a standalone application class.

---

## Maturity Definitions

### Final

A finalized feature is part of the Java SE platform specification
and can be used as a standard Java platform capability.

### Preview

A Preview feature is available for evaluation and feedback before
potential finalization.

Preview features require explicit enablement during compilation
and execution.

### Incubator

An Incubator feature is an experimental API intended to collect
developer experience and feedback before potentially evolving
toward a standard API.

---

## Repository Mapping

```text
Java 27
│
├── Language
│   └── Primitive Types in Patterns
│
├── Concurrency
│   └── Structured Concurrency
│
├── Initialization
│   └── Lazy Constants
│
├── Performance
│   ├── G1 Default
│   ├── Compact Object Headers
│   └── Vector API
│
├── Security
│   ├── Post-Quantum TLS
│   └── PEM Encodings
│
└── Observability
    └── JFR In-Process Data Redaction
```

---

## References

- OpenJDK JDK 27 Project (authoritative JEP list):
  https://openjdk.org/projects/jdk/27/

- Oracle Java 27 Release Notes:
  https://www.oracle.com/java/technologies/javase/27all-relnotes.html

- Java SE 27 Documentation:
  https://docs.oracle.com/en/java/javase/27/

- Java SE 27 Specifications:
  https://docs.oracle.com/javase/specs/

---

Created by **Ricardo Vallejo Sanchez**  
September 2027
