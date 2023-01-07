#language: pt

Funcionalidade: Cadastrar o atendimento
	para atender o pedido do cliente.

Cenário: Acessar a página de atendimento com sucesso
 Dado Acessar a página de cadastro atendimento
 E Informar a data "07/01/2023"
 E Informar a hora "17:52"
 E Informar o assunto "Problema na rede"
 E Informar observacoes "Estamos sem rede no bloco 14 - ape 103"
 E Informar o email "isab@gmail.com"
 Quando Solicitar a realização cadastro
 Então Sistema cadastrar o cliente