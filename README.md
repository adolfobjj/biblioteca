## Sistema de Gerenciamento de Biblioteca
Este é um projeto Java para um Sistema de Gerenciamento de Biblioteca, desenvolvido como parte de um estudo sobre desenvolvimento de aplicativos web utilizando tecnologias como Spring Boot, Thymeleaf, e banco de dados H2.

# Descrição
O Sistema de Gerenciamento de Biblioteca permite que usuários cadastrem livros, realizem empréstimos e devoluções, e consultem o catálogo de livros disponíveis. A aplicação é construída usando Java com Spring Boot para o backend, e Thymeleaf para a camada de visualização.

# Funcionalidades
Cadastro de livros: Adicione novos livros ao catálogo da biblioteca, incluindo título, autor e ISBN.
Cadastro de usuários: Registre novos usuários da biblioteca com nome, email e senha.
Empréstimo e devolução de livros: Permita que usuários emprestem e devolvam livros da biblioteca.
Consulta de disponibilidade: Verifique a disponibilidade de um livro para empréstimo.
Histórico de empréstimos: Mantenha um registro de todos os empréstimos realizados na biblioteca.
# Tecnologias Utilizadas
Java
Spring Boot
Thymeleaf
H2 Database (para facilitar o desenvolvimento e testes)
Hibernate (para mapeamento objeto-relacional)
# Estrutura do Projeto
O projeto está estruturado da seguinte forma:

src/main/java: Contém o código-fonte Java da aplicação.
controller: Controladores responsáveis por lidar com as requisições HTTP.
model: Entidades JPA que representam os objetos do domínio.
repository: Interfaces de repositório JPA para acesso ao banco de dados.
service: Serviços responsáveis pela lógica de negócios.
src/main/resources: Recursos estáticos, como arquivos de configuração e templates Thymeleaf.
src/test: Testes unitários e de integração.
Configuração e Execução
Clone o repositório para sua máquina local.
Importe o projeto em sua IDE preferida como um projeto Maven.
Configure o ambiente e as dependências conforme necessário (Java, Maven).
Execute o projeto através da classe principal Application.java.
Acesse a aplicação em um navegador web através do endereço http://localhost:8080.
Contribuindo
Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, por favor, abra uma nova issue ou envie um pull request.



