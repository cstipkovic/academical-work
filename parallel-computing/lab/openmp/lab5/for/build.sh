#!/usr/bin/env bash

# 1 Threads
echo "\nExecução utilizando 1 thread"
gcc-6 lab5-for.c -o lab5-for -fopenmp -lm
time ./lab5-for 1
echo "\n==========="

# 2 Threads
echo "\nExecução utilizando 2 thread"
gcc-6 lab5-for.c -o lab5-for -fopenmp -lm
time ./lab5-for 2
echo "\n==========="

# 3 Threads
echo "\nExecução utilizando 3 thread"
gcc-6 lab5-for.c -o lab5-for -fopenmp -lm
time ./lab5-for 3
echo "\n==========="

# 4 Threads
echo "\nExecução utilizando 4 thread"
gcc-6 lab5-for.c -o lab5-for -fopenmp -lm
time ./lab5-for 4
echo "\n==========="

# 5 Threads
echo "\nExecução utilizando 5 thread"
gcc-6 lab5-for.c -o lab5-for -fopenmp -lm
time ./lab5-for 5
echo "\n==========="

# 6 Threads
echo "\nExecução utilizando 6 thread"
gcc-6 lab5-for.c -o lab5-for -fopenmp -lm
time ./lab5-for 6
echo "\n==========="
