-- VHDL somador de duas palabras de 8bits
--

-- Para a resolução do problemas, utilizei o recurso da tabela verdade.
-- Separando os bits de cada palavra e o bit de "vai um" para montar a tabela.
-- Algo assim:
-- A + B + bitVaiUm = D | bitVaiUm
-- 0   0      0       0      0
-- 1   0      1       0      1
-- 1   1      1       1      1

-- Aluno: Clauber Pereira Stipkovic Halic
-- TIA: 40625478
-- Algebra Booleana e Cirtuitos

library IEEE, std;

use IEEE.std_logic_1164.all;
use IEEE.numeric_std.all;
use std.standard.all;

entity somador8bits is
  port(
        palavra1: in bit_vector(7 downto 0);
        palavra2: in bit_vector(7 downto 0);
        palavra_out: out bit_vector(7 downto 0);
        vai_um_out: out bit
      );
end somador8bits;

architecture executa_soma of somador8bits is
begin
  process
    variable bit_tmp: bit := '0';
    variable result_tmp: bit_vector(2 DOWNTO 0) := "000";
  begin
    for i in 0 to 7 loop
      result_tmp := palavra1(i) & palavra2(i) & bit_tmp;
      case result_tmp is
        when "000" =>
          palavra_out(i) <= '0';
          bit_tmp := '0';
        when "001" =>
          palavra_out(i) <= '1';
          bit_tmp := '0';
        when "010" =>
          palavra_out(i) <= '1';
          bit_tmp := '0';
        when "011" =>
          palavra_out(i) <= '0';
          bit_tmp := '1';
        when "100" =>
          palavra_out(i) <= '1';
          bit_tmp := '0';
        when "101" =>
          palavra_out(i) <= '0';
          bit_tmp := '1';
        when "110" =>
          palavra_out(i) <= '0';
          bit_tmp := '1';
        when "111" =>
          palavra_out(i) <= '1';
          bit_tmp := '1';
      end case;
    end loop;
  end process;
end executa_soma;

-- Professor, segue a lista de algumas dificuldades encontradas e as fontes onde
-- consultei para obter a solução:

-- * Como declarar uma variabel que não seria nem de entrada e nem de saida.
-- solução: Encontrei alguns artigos mostrando como e onde declarar as variaveis locais, são eles:
--          - http://www.people.vcu.edu/~rhklenke/tutorials/vhdl/modules/m10_23/sld047.htm
--          - http://www.seas.upenn.edu/~ese171/vhdl/vhdl_primer.html#_Toc526061350
--          - http://pt.wikipedia.org/wiki/VHDL#Variaveis

-- * Concatenação de variáveis
-- solução: - http://www.gmvhdl.com/operator.htm
--          - http://www.seas.upenn.edu/~ese171/vhdl/vhdl_primer.html#_Toc526061361

-- * Tipos de variáveis possíveis
-- solução: - http://www.seas.upenn.edu/~ese171/vhdl/vhdl_primer.html#_Toc526061352
