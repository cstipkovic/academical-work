#!/usr/bin/env bash
gcc-6 lab5-critical.c -o lab5-critical -fopenmp -lm

# 1 Thread
time ./lab5-critical 1

# 2 Threads
time ./lab5-critical 2

# 3 Threads
time ./lab5-critical 3

# 4 Threads
time ./lab5-critical 4

# 5 Threads
time ./lab5-critical 5

# 6 Threads
time ./lab5-critical 6
