; Para montar (linux): nasm -f elf busca.asm
; O processo de montagem gera o arquivo busca.o
; Para integrar com o código C: gcc busca.c busca.o
; O gcc ir� compilar o c�digo e chamar o linker (ld) para integrar os dois arquivos

; Se��o com dados est�ticos (contantes)
section .data
	; N�o ser� utilizada nenhuma constante nesta rotina

; Se��o com dados din�micos (vari�veis)
section .bss
	tamanho resd 1          ; reservando uma posi��o de mem�ria de 4 bytes para armazenar o tamanho do vetor

; Se��o com o c�digo-fonte da rotina
section .text

global busca              ; labels definidos que ser�o vistos em outros arquivos

; A rotina funciona da seguinte forma:
;  S�o recebidos 3 valores do programa C: um ponteiro para o vetor (armazenado em ebx), o valor a ser buscado (armazenado em eax) e o tamanho do vetor (armazenado na posi��o de mem�ria de label "tamanho"). O registrador ecx � utilizado como �ndice para acesso ao vetor. A execu��o come�a com a inicializa��o dos valores. Ap�s esta fase, no loop representado pelo label "pecorre" o vetor � percorrido de uma em uma posi��o, e o valor desta posi��o � comparado com o valor buscado. Na primeira compara��o positiva, o fluxo de execu��o � desviado para o label "igual", onde o valor de retorno ser� definido como o �ndice atual. Caso o vetor seja percorrido at� o fim e nenhuma compara��o resulte positiva, o fluxo de execu��o � desviado para o label "fim_vetor", onde o valor de retorno ser� definido como -1. Ap�s a defini��o do valor de retorno, o fluxo de execu��o � desviado para o label "final", onde s�o realizados os procedimentos para o t�rmino da rotina e retorno para o programa que a chamou.

; In�cio da rotina
busca:
	push ebp
	mov ebp, esp            ; procedimento padr�o para salvar o contexto

	push ebx
	push ecx                ; salvando os registradores que ser�o utilizados na rotina

	mov ebx, [ebp+8]        ; par�metro: vetor
	mov eax, [ebp+12]       ; par�metro: valor
	mov ecx, [ebp+16]       ; par�metro: tamanho

	mov [tamanho], ecx      ; guardando o par�metro tamanho na posi��o de mem�ria reservada para ele
	mov ecx, 0              ; inicializando �ndice do vetor com zero

percorre:
	cmp [ebx+ecx*4], eax    ; compara vetor[ecx] com o valor buscado. O valor de ecx � multiplicado por 4 pois cada posi��o do vetor possui 4 bytes (vetor de inteiros).
	je igual                ; caso seja igual, desvia para o label "igual"
	inc ecx                 ; incremento de ecx em 1
	cmp ecx, [tamanho]      ; compara ecx com o tamanho do vetor
	je fim_vetor            ; se forem iguais, o fim do vetor foi atingido. Desvia para o label "fim_vetor"
	jmp percorre            ; se forem diferentes, desvia para o label "percorre", de forma a continuar o loop

igual:
	mov eax, ecx            ; eax recebe o �ndice onde foi encontrado o valor
	jmp final               ; desvio para o label "final" para terminar a rotina

fim_vetor:
	mov eax, -1             ; eax recebe -1 para indicar que o valor n�o foi encontrado
	jmp final               ; desvio para o label "final" para terminar a rotina

final:
	pop ecx
	pop ebx                 ; restaura o antigo conte�do dos registradores. O desempilhamento deve ser feita na ordem inversa do empilhamento

	pop ebp                 ; desempilha o antigo ebp, para restaurar o contexto
	ret			                ; sai da fun��o (valor de retorno fica em eax)
