# Compile the generated asm and main.c
main: assembly-code-example.o
	gcc main.c assembly-code-example.o

# Compile the assembly code
assembly-code-example.o:
	nasm -f elf assembly-code-example.asm
