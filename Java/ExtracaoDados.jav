Extracao de dados de um texto
// Este código extrai o ano de um texto usando uma expressão regular.
var match = texto.match(/(19|20)\d{2}/);
var ano_extraido = match ? match[0] : null;

