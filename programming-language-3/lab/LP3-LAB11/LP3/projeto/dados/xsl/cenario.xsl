<xsl:stylesheet
version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns="http://www.w3.org/2000/svg">
<xsl:output indent="yes" cdata-section-elements="style" />
<xsl:template match="/">
<svg>
<xsl:for-each select="/cenario/retangulos/retangulo">
<xsl:variable name="posicaox" select="posx"/>
<xsl:variable name="posicaoy" select="posy"/>
<xsl:variable name="largura_" select="largura"/>
<xsl:variable name="altura_" select="altura"/>
<xsl:variable name="padding" select="$posicaoy + 100 - $altura_"/>
<rect x="{$posicaox}"
y="{$padding}"
height="{$altura_}"
width="{$largura_}"
style="fill:blue;stroke:green;stroke-width:5;fill-opacity:0.1; stroke-opacity:0.9"/>
</xsl:for-each>
</svg>
</xsl:template>
</xsl:stylesheet>