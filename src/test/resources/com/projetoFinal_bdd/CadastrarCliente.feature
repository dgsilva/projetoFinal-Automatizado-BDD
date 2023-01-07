#language: pt

Funcionalidade: Cadastrar o
cliente para poder acessar o login

Cenário: Cadastrar o cliente
 Dado Acessar a página de cadastro
 E Informar nome do cliente "Patricia Pimentel"
 E Informar telefone do cliente "222224062"
 E Informar email do cliente "patricia@gmail.com"
 E Informar a senha do cliente "admin123"
 Quando Solicitar a realização cadastro
 Então Sistema cadastrar o cliente