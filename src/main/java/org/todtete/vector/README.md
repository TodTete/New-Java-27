# 11. `vector/README.md`

```markdown
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