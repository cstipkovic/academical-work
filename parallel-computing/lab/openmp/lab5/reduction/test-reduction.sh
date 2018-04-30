#!/usr/bin/env bash
gcc-6 lab5-reduction.c -o lab5-reduction -fopenmp -lm

# 1 Thread
time ./lab5-reduction 1

# 2 Threads
time ./lab5-reduction 2

# 3 Threads
time ./lab5-reduction 3

# 4 Threads
time ./lab5-reduction 4

# 5 Threads
time ./lab5-reduction 5

# 6 Threads
time ./lab5-reduction 6
