# Lazy Constants

## Overview

This package demonstrates the evolution from traditional eager
constant initialization to the Lazy Constants API introduced
in Java 27.

## Before

`BeforeConstants` demonstrates a traditional `static final`
field whose value is initialized during class initialization.

## After

`LazyConstantsDemo` demonstrates the `LazyConstant` API,
which allows initialization to occur when the value is actually
requested.

## Java 27 Feature

**JEP 531 — Lazy Constants**

Status in Java 27:

**Third Preview**

## Why It Matters

Lazy initialization can be useful when creating a value is
expensive and the value may not be required during every
execution path.

## Comparison

```text
Traditional constant
        │
        ▼
Class initialization
        │
        ▼
Value created


Lazy constant
        │
        ▼
Value requested?
    │       │
   No      Yes
    │       │
    │       ▼
    │   Value created
    │
    └── No initialization
```

## API Location

`LazyConstant` is declared in `java.lang`, so no import is
required to use it.

## Files

- `BeforeConstants.java`
- `LazyConstantsDemo.java`

Tests live in `src/test/java/org/todtete/constants`.

---

Created by **Ricardo Vallejo Sanchez**  
September 2027