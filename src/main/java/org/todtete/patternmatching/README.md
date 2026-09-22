# Primitive Types in Patterns

## Overview

This package demonstrates the evolution of Java pattern
matching and the ability to work with primitive types in
pattern contexts.

## Before

The traditional approach requires explicit type checks,
casts or conversions.

## After

Java 27 extends pattern matching so primitive types can
participate in pattern contexts, `instanceof`, and `switch`.

## Java 27 Feature

**JEP 532 — Primitive Types in Patterns, instanceof, and switch**

Status:

**Fifth Preview**

## Why It Matters

The feature aims to make pattern matching more uniform and
expressive when applications work with both primitive and
reference types.

## Comparison

```text
BEFORE

Check type
   ↓
Cast
   ↓
Extract value
   ↓
Apply logic


AFTER

Pattern
   ↓
Match
   ↓
Apply logic
```

## Exhaustiveness

A `switch` expression must cover every possible input value.

Guarded patterns such as `case int number when number > 0`
never count towards exhaustiveness, because the compiler
cannot evaluate the guard.

For that reason the switch closes with an unconditional
primitive pattern:

```java
return switch (value) {
    case 0 -> "Zero";
    case int number when number > 0 -> "Positive integer";
    case int number -> "Negative integer";
};
```

## Files

- `BeforePatternMatching.java`
- `Java27PatternMatching.java`

Tests live in `src/test/java/org/todtete/patternmatching`.

---

Created by **Ricardo Vallejo Sanchez**  
September 2027
