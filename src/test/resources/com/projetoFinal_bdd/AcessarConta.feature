#language: pt

Funcionalidade: Acessar Conta
	como um cliente da loja virtual
	eu quero acessar minha conta
	para que eu possa realizar meus pedidos
	
Cenário: Acessar conta de cliente com sucesso
 Dado Acessar a página de autenticação do cliente
 E Informar o email de acesso "carlossp@gmail.com"
 E Informar a senha de acesso "admin123"
 Quando Solicitar a realização de acesso
 Então Sistema autentica o cliente com sucesso
