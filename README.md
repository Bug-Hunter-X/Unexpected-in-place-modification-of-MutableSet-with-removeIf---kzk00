# Kotlin MutableSet removeIf() In-Place Modification

This example demonstrates the potential for unexpected behavior when using the `removeIf()` function with Kotlin's `MutableSet`.  Unlike other collection functions which might create a new collection, `removeIf` modifies the original `MutableSet` directly.

The `bug.kt` file shows the unexpected behavior, while `bugSolution.kt` suggests alternatives to avoid this side effect.