# Groovy eachWithIndex Bug
This repository demonstrates a subtle bug in Groovy related to the `eachWithIndex` iterator when removing elements from a list during iteration. The provided `bug.groovy` file shows how the index gets out of sync, resulting in an unexpected output.  The solution, `bugSolution.groovy`, offers an alternative approach to achieve the intended behavior. 

## Problem Description
The `eachWithIndex` method iterates through the elements of a list along with their indices. When an element is removed during the iteration, the indices of subsequent elements change, leading to incorrect index access and unintended behavior.

## Solution
The solution uses an iterator to safely remove items while avoiding index issues. This provides a more robust approach to list modification during iteration.
