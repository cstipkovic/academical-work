#!/usr/bin/env bash
gcc-6 lab5-serial.c -o lab5-serial -fopenmp -lm

# 1 Thread / Serial
time ./lab5-serial 1
