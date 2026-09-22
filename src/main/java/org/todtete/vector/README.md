# Vector API

## Overview

This package demonstrates the Vector API available in Java 27.

The example performs an array addition using vector operations.

## Java 27 Feature

**JEP 537 — Vector API**

Status:

**Twelfth Incubator**

## Why It Matters

The Vector API allows developers to express vector computations
that can be translated at runtime into appropriate vector
instructions supported by the underlying CPU.

This can be useful for workloads such as:

- Data analytics
- Scientific computing
- Numerical processing
- AI inference
- Media processing

## Before

A traditional scalar implementation processes one value
at a time.

```text
A0 + B0
A1 + B1
A2 + B2
A3 + B3
```

## After

The vectorized implementation processes several lanes per
iteration, using the vector width preferred by the platform.

```text
[A0 A1 A2 A3] + [B0 B1 B2 B3] = [C0 C1 C2 C3]
```

Array lengths are rarely an exact multiple of the vector
width, so the remaining elements are handled by a scalar
tail loop.

## Incubator Module

The Vector API still lives in an incubator module, so it has
to be requested explicitly at compile time and at run time:

```text
--add-modules jdk.incubator.vector
```

The build already declares this flag for the compiler, the
tests and the execution plugin.

## Files

- `VectorApiDemo.java`

Tests live in `src/test/java/org/todtete/vector`.

---

Created by **Ricardo Vallejo Sanchez**  
September 2027
