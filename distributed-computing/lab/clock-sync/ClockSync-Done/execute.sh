#!/bin/bash
echo "Compilando as classes"
ant
chmod +x slave.sh
open -a Terminal ./slave.sh
chmod +x slave1.sh
open -a Terminal ./slave1.sh
chmod +x slave2.sh
open -a Terminal ./slave2.sh
sleep 5 
chmod +x master.sh
open -a Terminal ./master.sh
