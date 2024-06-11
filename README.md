#Sistema de Adoção de Animais
#Introdução
Este documento descreve a API para gerenciamento de um sistema de adoção de animais. A API foi desenvolvida utilizando o Spring Boot e armazena os dados no banco de dados H2. O objetivo é facilitar a conexão entre usuários que desejam adotar um animal e empresas que cadastram os animais disponíveis para adoção.

#Descrição do Projeto
A API permite realizar operações CRUD (Create, Read, Update, Delete) para gerenciar as informações dos animais e dos usuários. Através desta API, empresas podem cadastrar novos animais, e usuários podem visualizar, adotar e gerenciar os animais que adotaram.

#Tecnologias Utilizadas

Java: Linguagem de programação utilizada para o desenvolvimento do projeto.
Spring Boot: Framework utilizado para facilitar a criação de aplicações Java.
H2 Database: Banco de dados em memória utilizado para armazenar as informações da aplicação.
Maven: Ferramenta de gerenciamento de dependências e build.

#Arquitetura da API
A API segue a arquitetura RESTful e está organizada da seguinte maneira:

Controllers: Definem os endpoints da API e manipulam as requisições HTTP.
Entities: Classes que representam as entidades do sistema.
Repositories: Interface com o banco de dados.

#Endpoints e Funcionalidades

Endpoints de Animais
GET /animals: Retorna a lista de todos os animais cadastrados.
GET /animals/{id}: Retorna as informações de um animal específico.
POST /animals: Cadastra um novo animal.
PUT /animals/{id}: Atualiza as informações de um animal existente.
DELETE /animals/{id}: Remove um animal do sistema.

#Responsáveis pelo Projeto
Bruno Marcel:

Responsável pelo desenvolvimento da estrutura do projeto.
Definição de como os animais se comportam em relação aos usuários cadastrados.
Ajustes de validações de requisições e desenvolvimento do backend.
Priscila Oliveira:

Responsável pelo desenvolvimento dos controllers, endpoints e lógica das requisições Create, Read, Update, Delete.
Wendel Reis, Nathan, Pedro:

Documentação do projeto e proposta comercial para as empresas.

#Proposta Comercial
A proposta comercial visa fornecer uma solução completa para empresas interessadas em gerenciar adoções de animais. Com esta API, as empresas podem:

Cadastrar e gerenciar informações de animais.
Facilitar o processo de adoção conectando usuários interessados.
Monitorar adoções e manter um histórico detalhado.
Nossa solução é altamente escalável, segura e fácil de usar, oferecendo uma interface amigável e uma API robusta para integração com outros sistemas.
