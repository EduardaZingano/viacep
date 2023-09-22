Descrição:

Repositório criado no intuito de fazer os testes automatizados da API viacep passada no desafio de QA

Usado no projeto:

- Java (versão 17)
- Maven (versão 4.0.0)
- JUnit (versão 5.9.3)
- Rest Assured (versão 5.3.2)

Como Executar:

- Verifique se você tem o Java JDK instalado em sua máquina.
- Clone o repositório para que ele fique disponível localmente pra você.
- Abra o projeto em sua IDE de preferência.
- Verifique se as dependências do projeto foram baixadas.
- Navegue até a classe de teste, no caso deste projeto, a "Teste".
- Execute a classe de teste, podendo variar de acordo com sua IDE. (No intellij é pelo botão de play ao lado da classe ou clicando com o botão direito do mouse em cima do arquivo da classe e depois selecionar "Run 'NomeDaClasse'"

Cenários de Teste:

Cenário 1: Cep válido
Dado que estou testando o viacep
Quando eu testar um cep existente na url
Entao o teste deve me retorar o status 200
E ainda verificar se alguma palavra do corpo da requisição de acordo com as informações que este cep dará existe

Cenário 2: Cep inválido
Dado que estou testando o viacep
Quando eu testar um cep que não existe na url
Entao o teste deve me retorar o status 400
