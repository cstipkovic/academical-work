-- Decodificador de 7 segmentos utilizando um display BCD

entity decoder7segmentos is
  port(display: IN BIT_VECTOR(3 DOWNTO 0);
      segmentos: OUT BIT_VECTOR(6 DOWNTO 0));
end decoder7segmentos;

architecture test_segmentos of decoder7segmentos is
begin
  WITH display SELECT
    segmentos <= "1111110" WHEN "0000",
                 "0110000" WHEN "0001",
                 "1101101" WHEN "0010",
                 "1111001" WHEN "0011",
                 "0110011" WHEN "0100",
                 "1011011" WHEN "0101",
                 "0011111" WHEN "0110",
                 "1110000" WHEN "0111",
                 "1111111" WHEN "1000",
                 "1110011" WHEN "1001",
                 "0001101" WHEN "1010",
                 "0011001" WHEN "1011",
                 "0100011" WHEN "1100",
                 "1001011" WHEN "1101",
                 "0001111" WHEN "1110",
                 "0000000" WHEN "1111";
end test_segmentos;

