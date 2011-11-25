-- VHDL multiplexador de 8 palavras com 8 bits cada

-- O desenvolvimento desse programa, foi pensado utilizando a tabela verdade.
-- Como eram 8 palavras e um enable, utilizei 3 selects para controlar o envio de cada palavra.
-- Por tanto, cada palavra ficou referenciada como um numero (de 0 até 7), e isso foi utilizado tendo em vista que não há uma função booleana especifica para o multiplexador solicitado.
library IEEE, std;

use IEEE.std_logic_1164.all;
use IEEE.numeric_std.all;
use std.standard.all;

entity mux8bits is
  port(
        p0, p1, p2, p3, p4, p5, p6, p7: in bit_vector(7 downto 0);
        a, b, c, enable: in bit;
        p_out: out bit_vector(7 downto 0)
      );
end mux8bits;

architecture executa_mux of mux8bits is
begin
  process
    variable bit_select: bit_vector(2 downto 0);
  begin
    if (enable = '1') then
      bit_select := a & b & c;
      case bit_select is
        when "000" =>
          p_out <= p0;
        when "001" =>
          p_out <= p1;
        when "010" =>
          p_out <= p2;
        when "011" =>
          p_out <= p3;
        when "100" =>
          p_out <= p4;
        when "101" =>
          p_out <= p5;
        when "110" =>
          p_out <= p6;
        when "111" =>
          p_out <= p7;
      end case;
    end if;
  end process;
end executa_mux;

-- Alguns links que eu utilizei como referencia nesse programa foram:
-- - http://www.seas.upenn.edu/~ese171/vhdl/vhdl_primer.html#_Toc526061362
-- - http://pt.wikipedia.org/wiki/Multiplexador
