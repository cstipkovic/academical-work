#!/usr/bin/env bash
make
time for i in {0..1000}; do ./lab3-seq /dev/null; done