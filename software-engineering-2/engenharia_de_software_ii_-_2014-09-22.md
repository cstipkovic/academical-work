<!-- 
	p1 - 27/10
	procomp - 20/10
-->

# Engenharia de Software II - 2014-09-22

## Revisão
- Qualidade de SW
  - CMM/CMMI
  - Normas

- Gerencia de configuração
  - Versionar software (Git/Mercurial)
  - Gerar Pacote (Build) - Travis
  
- Teste de Software
  - Conceitos
  - Tipos
  
- Def de Teste de Software
  - Atividades realizadas ao longo do desenvolvimento de software, que verificam se o software e seus componentes atendem as suas especificações.
  - Def de testes garantem que o sistema possui qualidade
  - Testes de SW são:
    - Atividades controladas que identificam problemas
    - Envolvem ações que vão do levantamento de requisitos até a execução dos testes propriamente ditos.
    - Verifica "resultados encontrados" X "resultados esperados"
    - Prevenir, localizar e documentar defeitos
    - Minimizar impacto potencial de defeitos, detectando-os antes da entrega do produto ao cliente
    
Custo do reparo de 1 problema é 200 vezes maior que se for reparado depois que o software estiver pronto.

<!-- Piramide -->
2 - requisitos

5 - projeto

10 - codificação

20 - teste unitário

50 - teste de aceitação

100 - manutenção
<!-- // Piramide -->

## Tipos de testes
- Teste:
  - Unitários
  - de integração
  - de regressão
  - de sistema 
  - de aceitação (homologação)
  - de integridade de dados de BD
  - funcional
  - de interface com o usuário
  <!-- Rede -->
  - de desempenho
  - de carga
  - de stress
  - de segurança
  <!-- // Rede -->
  - de tolerância a falhas
  - de recuperação (resp. a indisponibilidade )
  - de configuração

## Boas práticas
- Os testes devem ser repetitivos
- os testes não devem ser feitos pelo desenvolvedor do SW, mas por outra equipe preparada
- Fazer plano de teste
- deve existir um ambiente isolado de teste
- implementar teste automatizado
- focar o teste na parte critica do sistema e nos dados mais sensíveis que não podem ser perdidos
- caixa branca X caixa preta