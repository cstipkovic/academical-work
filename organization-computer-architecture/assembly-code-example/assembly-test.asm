section .text
    global _main
_main:
    mov	    eax, 5
    mov	    ebx, 4

    imul    eax, ebx
    ret
