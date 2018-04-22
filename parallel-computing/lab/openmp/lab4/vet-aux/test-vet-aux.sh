#!/usr/bin/env bash

# 2 Threads
gcc-6 lab4-vet-aux.c -o lab4-vet-aux -fopenmp -lm
time ./lab4-vet-aux 2

# # 4 Threads
gcc-6 lab4-vet-aux.c -o lab4-vet-aux -fopenmp -lm
time ./lab4-vet-aux 4
#
# # 6 Threads
gcc-6 lab4-vet-aux.c -o lab4-vet-aux -fopenmp -lm
time ./lab4-vet-aux 6
#
# # 8 Threads
gcc-6 lab4-vet-aux.c -o lab4-vet-aux -fopenmp -lm
time ./lab4-vet-aux 8
