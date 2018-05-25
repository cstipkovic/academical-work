#!/bin/bash
cd ~/Documents/Project/github/academical-work/distributed-computing/lab/clock-sync/ClockSync-Done/dist
java -jar ClockSync.jar -m 127.0.0.1:9876 3:05:00 10 ../clients.txt logfile.txt
