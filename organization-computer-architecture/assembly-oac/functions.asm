section .data

section .text

global _exponencial ;trianguloret, maiorelem

_exponencial:
    push    ebp
    mov	    ebp, esp

    push    ebx
    push    ecx

    mov	    ebx, [ebp+8]
    mov	    ecx, [ebp+12]

    mov	    ecx, 0

    pop	    ebp
    pop	    eax	

    ret
