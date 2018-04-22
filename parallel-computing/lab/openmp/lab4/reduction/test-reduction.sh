#!/usr/bin/env bash

# 2 Threads
gcc-6 lab4-reduction.c -o lab4-reduction -fopenmp -lm
time ./lab4-reduction 2

# 4 Threads
gcc-6 lab4-reduction.c -o lab4-reduction -fopenmp -lm
time ./lab4-reduction 4

# 6 Threads
gcc-6 lab4-reduction.c -o lab4-reduction -fopenmp -lm
time ./lab4-reduction 6

# 8 Threads
gcc-6 lab4-reduction.c -o lab4-reduction -fopenmp -lm
time ./lab4-reduction 8
