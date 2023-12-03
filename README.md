O projeto Meru é um sistema CRUD simples construído com o framework Quarkus, proporcionando uma aplicação Java eficiente e escalável. O foco principal é a gestão de produtos, utilizando operações CRUD e interagindo de forma otimizada com um banco de dados PostgreSQL.

A estrutura do projeto é composta por uma entidade chamada ProductEntity, responsável por representar os dados dos produtos. Além disso, há um serviço chamado ProductService, que contém a lógica de negócios relacionada aos produtos, e um controlador REST denominado ProductController para gerenciar as requisições HTTP.

Para facilitar a implantação e garantir a portabilidade, a aplicação é containerizada com Docker. Isso possibilita uma configuração simples e rápida em diferentes ambientes. As variáveis de ambiente são utilizadas para configurar a conexão com o banco de dados, proporcionando flexibilidade e segurança.

O grande destaque deste projeto reside na simplicidade e na eficácia do framework Quarkus. Aproveitando conceitos modernos como injeção de dependência e persistência Panache, o desenvolvimento de aplicações Java na nuvem torna-se ágil e eficiente. Este projeto é uma demonstração do potencial do Quarkus para criar soluções robustas de forma descomplicada.
