# Structured Concurrency

## Overview

This package demonstrates the difference between traditional
task management and Structured Concurrency in Java 27.

## Before

`BeforeConcurrency` uses `ExecutorService` and `Future`
to coordinate concurrent operations.

## After

`StructuredConcurrencyDemo` uses `StructuredTaskScope` to
group related concurrent tasks under a common lifecycle.

## Java 27 Feature

**JEP 533 — Structured Concurrency**

Status in Java 27:

**Seventh Preview**

## Key Concepts

Structured concurrency provides a clearer relationship between:

- Parent task
- Child tasks
- Completion
- Failure
- Cancellation
- Resource lifecycle

## Conceptual Model

```text
Traditional

ExecutorService
 ├── Task A
 └── Task B


Structured Concurrency

StructuredTaskScope
 ├── Task A
 └── Task B
       │
       ▼
 Shared lifecycle
```

## Files

- `BeforeConcurrency.java`
- `StructuredConcurrencyDemo.java`

Tests live in `src/test/java/org/todtete/concurrency`.

---

Created by **Ricardo Vallejo Sanchez**  
September 2027
