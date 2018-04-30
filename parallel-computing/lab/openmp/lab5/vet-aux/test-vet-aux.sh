#!/usr/bin/env bash
gcc-6 lab5-vet-aux.c -o lab5-vet-aux -fopenmp -lm

# 1 Thread
time ./lab5-vet-aux 1

# 2 Threads
time ./lab5-vet-aux 2

# 3 Threads
time ./lab5-vet-aux 3

# 4 Threads
time ./lab5-vet-aux 4

# 5 Threads
time ./lab5-vet-aux 5

# 6 Threads
time ./lab5-vet-aux 6
