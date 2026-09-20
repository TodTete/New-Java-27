# 12. `performance/README.md`

```markdown
# Performance and Runtime

## Overview

This package demonstrates Java 27 improvements that primarily
affect the JVM runtime rather than application source code.

## Features

### JEP 523 — G1 as Default Garbage Collector

Java 27 makes G1 the default garbage collector across
all environments.

### JEP 534 — Compact Object Headers

Java 27 enables compact object headers by default in HotSpot.

Compact object headers reduce object-header size on supported
64-bit architectures and can reduce memory overhead.

## Important

These features are different from language features.

Developers generally do not need to rewrite application
source code to take advantage of them.

## Files

- `G1GarbageCollectorDemo.java`
- `CompactObjectHeadersDemo.java`

---

Created by **Ricardo Vallejo Sanchez**  
September 2027