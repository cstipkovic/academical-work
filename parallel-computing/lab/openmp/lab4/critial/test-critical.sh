#!/usr/bin/env bash

# 2 Threads
gcc-6 lab4-critical.c -o lab4-critical -fopenmp -lm
time ./lab4-critical 2

# 4 Threads
gcc-6 lab4-critical.c -o lab4-critical -fopenmp -lm
time ./lab4-critical 4

# 6 Threads
gcc-6 lab4-critical.c -o lab4-critical -fopenmp -lm
time ./lab4-critical 6

# 8 Threads
gcc-6 lab4-critical.c -o lab4-critical -fopenmp -lm
time ./lab4-critical 8
