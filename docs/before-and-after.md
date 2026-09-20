# Before & After

## Introduction

The **Java 27 Feature Lab** uses a Before & After methodology
to demonstrate the evolution of the Java platform.

The purpose is not to suggest that previous Java versions were
incorrect or obsolete.

Instead, the comparison illustrates how the platform can reduce
complexity, improve expressiveness or introduce new capabilities
for specific use cases.

---

# Methodology

Each demonstration follows five steps:

```text
1. Identify the problem
          │
          ▼
2. Implement the traditional approach
          │
          ▼
3. Introduce the Java 27 capability
          │
          ▼
4. Compare the implementations
          │
          ▼
5. Evaluate the practical implications
```

---

# BEFORE

The **Before** implementation represents an approach that could
reasonably be used with previous Java releases.

It is not necessarily the only possible implementation.

Its purpose is to establish a baseline for comparison.

Example:

```java
if (value instanceof Integer) {

    int number = value.intValue();

    // Business logic...
}
```

The important point is to understand:

- What code is required?
- What responsibilities does the developer have?
- What boilerplate exists?
- What limitations does the approach have?

---

# AFTER

The **After** implementation demonstrates how a Java 27 feature
can address the same problem.

Example:

```text
Traditional approach
        │
        ▼
Type check
        │
        ▼
Conversion
        │
        ▼
Business logic


Modern approach
        │
        ▼
Pattern
        │
        ▼
Business logic
```

The goal is not simply to produce shorter code.

The comparison should explain the semantic and architectural
differences introduced by the newer capability.

---

# Comparison Criteria

Each Before & After example should be analyzed using the
following criteria.

## Readability

Does the newer approach make the intent easier to understand?

## Boilerplate

Does the feature eliminate repetitive code?

## Safety

Does the feature provide stronger compile-time or runtime
guarantees?

## Maintainability

Does the new approach make future changes easier?

## Performance

Does the feature introduce potential performance benefits?

Performance claims should be supported by appropriate
measurements rather than assumptions.

## Complexity

Does the feature reduce the conceptual complexity of the
implementation?

---

# Example 1 — Lazy Constants

## Before

A traditional `static final` value can be initialized during
class initialization.

```text
Class initialization
        │
        ▼
Initialize value
        │
        ▼
Application execution
```

## After

A Lazy Constant delays initialization until the value is requested.

```text
Class initialization
        │
        ▼
Value not initialized
        │
        ▼
Value requested
        │
        ▼
Initialize value
```

### Key Difference

The main difference is the timing of initialization.

The feature can be useful when initialization is expensive and
the value may not always be required.

---

# Example 2 — Structured Concurrency

## Before

A traditional approach may use an executor and individual
`Future` objects.

```text
ExecutorService
    │
    ├── Future A
    │
    └── Future B
```

The developer is responsible for coordinating the lifecycle
of these tasks.

## After

Structured Concurrency groups related tasks into a structured
scope.

```text
StructuredTaskScope
    │
    ├── Task A
    │
    └── Task B
```

The relationship between the parent operation and its child
tasks becomes explicit.

### Key Difference

The primary change is the structure and lifecycle management
of concurrent work.

---

# Example 3 — Primitive Types in Patterns

## Before

Traditional code may require explicit type checks and
conversions.

```text
Check
  ↓
Cast / convert
  ↓
Extract value
  ↓
Process value
```

## After

Java 27 extends pattern matching to primitive types.

```text
Pattern
   ↓
Match
   ↓
Process value
```

### Key Difference

The feature makes primitive handling more consistent with
the pattern-matching model already used for reference types.

---

# Example 4 — Vector API

## Before

A scalar implementation processes one element at a time.

```text
A0 + B0
A1 + B1
A2 + B2
A3 + B3
```

## After

The Vector API allows multiple values to be represented and
processed as vector lanes.

```text
[A0 A1 A2 A3]
      +
[B0 B1 B2 B3]
      =
[C0 C1 C2 C3]
```

### Key Difference

The programming model expresses data-parallel computation
rather than individual scalar operations.

The actual performance benefit depends on the hardware,
JIT compilation and workload and should be validated through
benchmarking.

---

# Example 5 — JVM-Level Improvements

Not every Before & After comparison requires different
application source code.

For features such as:

- G1 as the default garbage collector
- Compact Object Headers

the change primarily occurs inside the JVM.

Therefore, the comparison becomes:

```text
Previous JVM behavior
        │
        ▼
Java 27 JVM behavior
        │
        ▼
Potential runtime improvement
```

This distinction is important because developers should not
artificially create application code merely to demonstrate
a JVM optimization.

---

# Feature Maturity Matters

Before adopting a Java 27 feature, its maturity should be
considered.

```text
FINAL
  │
  └── Standard platform feature


PREVIEW
  │
  ├── Requires explicit enablement
  ├── Subject to evolution
  └── Intended for evaluation


INCUBATOR
  │
  ├── Experimental API
  ├── Subject to significant changes
  └── Intended for developer feedback
```

The repository explicitly identifies the maturity level of
each feature so that examples are not interpreted as equivalent
production recommendations.

---

# What the Comparison Does Not Mean

The Before & After approach does not mean:

```text
Old Java = bad
New Java = good
```

Instead:

```text
Previous solution
       +
New platform capability
       +
Specific use case
       =
Different implementation possibilities
```

A newer feature may be useful in one context and unnecessary
in another.

The appropriate implementation should depend on requirements,
compatibility, maturity, maintainability and operational
constraints.

---

# Practical Evaluation

For each Java 27 feature, developers should consider:

### 1. Is the feature Final, Preview or Incubator?

### 2. Does the project require the feature?

### 3. Does the target runtime support it?

### 4. Does the team understand the new programming model?

### 5. Does it improve the specific implementation?

### 6. Are there compatibility considerations?

### 7. Has performance been measured where performance is relevant?

---

# Final Perspective

The most valuable aspect of Java evolution is not simply the
addition of new syntax.

The platform continuously attempts to improve several dimensions
of software development:

```text
                    Java Evolution
                         │
        ┌────────────────┼────────────────┐
        │                │                │
   Developer         Runtime          Platform
 Experience        Efficiency        Capabilities
        │                │                │
        ▼                ▼                ▼
   Readability       Memory          Security
   Concurrency       Performance     APIs
   Expressiveness    GC              Observability
```

The Before & After methodology provides a practical way to
understand these changes while preserving the context of the
problems they are intended to address.

---

Created by **Ricardo Vallejo Sanchez**  
September 2027