# Produtos

Este projeto usa Quarkus, o Supersonic Subatomic Java Framework.

Se você quiser saber mais sobre o Quarkus, visite seu site: https://quarkus.io/.

## Executando o aplicativo em modo dev

Você pode executar seu aplicativo no modo de desenvolvimento que permite codificação ao vivo usando:
```script de shell
./mvnw compila quarkus:dev
```

> **_NOTA:_** O Quarkus agora vem com uma Dev UI, que está disponível no modo dev apenas em http://localhost:8080/q/dev/.

## Empacotando e executando o aplicativo

O aplicativo pode ser empacotado usando:
```script de shell
pacote ./mvnw
```
Ele produz o arquivo `quarkus-run.jar` no diretório `target/quarkus-app/`.
Esteja ciente de que não é um _über-jar_ pois as dependências são copiadas para o diretório `target/quarkus-app/lib/`.

O aplicativo agora pode ser executado usando `java -jar target/quarkus-app/quarkus-run.jar`.

Se você deseja construir um _über-jar_, execute o seguinte comando:
```script de shell
./mvnw pacote -Dquarkus.package.type=uber-jar
```

O aplicativo, empacotado como um _über-jar_, agora pode ser executado usando `java -jar target/*-runner.jar`.

## Criando um executável nativo

Você pode criar um executável nativo usando:
```script de shell
./mvnw pacote -Dnative
```

Ou, se você não tiver o GraalVM instalado, você pode executar a compilação executável nativa em um contêiner usando:
```script de shell
./mvnw pacote -Dnative -Dquarkus.native.container-build=true
```

Você pode então executar seu executável nativo com: `./target/product-1.0.0-SNAPSHOT-runner`

Se você quiser saber mais sobre como construir executáveis nativos, consulte https://quarkus.io/guides/maven-tooling.

## Guias relacionados

- Hibernate ORM com Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplifique seu código de persistência para Hibernate ORM por meio do registro ativo ou do padrão de repositório
- Driver JDBC - PostgreSQL ([guide](https://quarkus.io/guides/datasource)): Conecte-se ao banco de dados PostgreSQL via JDBC

## Código fornecido

### Hibernar ORM

Crie sua primeira entidade JPA

[Seção do guia relacionado...](https://quarkus.io/guides/hibernate-orm)

[Seção relacionada ao Hibernate com Panache...](https://quarkus.io/guides/hibernate-orm-panache)


### RESTEasy reativo

Inicie facilmente seus serviços Web RESTful reativos

[Seção do guia relacionado...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
