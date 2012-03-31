CC=g++
# clear: doolpiedex
# 	rm -r *.gch

doolpiedex: classes
	$(CC) -Wall doolpiedex_start.cpp -o doolpiedex_start

classes:
	$(CC) -Wall class/client.cpp -c class/client.h
	$(CC) -Wall class/partner.cpp -c class/partner.h
	$(CC) -Wall class/product.cpp -c class/product.h