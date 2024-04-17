# Framewords Usados
## Hibernate
O Hibernate é um framework de mapeamento objeto-relacional (ORM) para a linguagem de programação Java. Ele simplifica o desenvolvimento de aplicações que interagem com bancos de dados relacionais ao mapear objetos Java para tabelas de banco de dados e vice-versa.

Em outras palavras, o Hibernate permite que os desenvolvedores escrevam código Java sem se preocupar com detalhes de como os dados são armazenados no banco de dados. Ele abstrai as operações de acesso e manipulação de dados, eliminando a necessidade de escrever consultas SQL manualmente.

## Por que decidimos usar o Hibernate
Devido à ideia de implementar um banco de dados, achamos que seria a melhor forma de se implementar um banco seria usando o Hibernate para gerenciar.

## Trecho de código

## Vantagens e desvantagens
- **Vantagens** 
    - Produtividade: O Hibernate simplifica o desenvolvimento de aplicações Java ao eliminar a necessidade de escrever consultas SQL manualmente. Isso aumenta a produtividade dos desenvolvedores, permitindo que eles se concentrem mais na lógica de negócios da aplicação.
    ----
    - Mapeamento Objeto-Relacional(ORM): O Hibernate fornece uma camada de abstração entre objetos Java e tabelas de banco de dados, facilitando o mapeamento de classes Java para esquemas de banco de dados relacionais. Isso reduz a quantidade de código necessário para interagir com o banco de dados.
- **Desvantagens**
    - Curva de Aprendizado: O Hibernate tem uma curva de aprendizado íngreme para iniciantes, especialmente aqueles que não têm experiência prévia com mapeamento objeto-relacional (ORM) ou conceitos de persistência de dados.
    ----
    - Desempenho: Em certos casos, o Hibernate pode introduzir um overhead de desempenho devido ao processamento adicional necessário para mapear objetos para tabelas de banco de dados e vice-versa. Isso pode ser um problema em aplicações que exigem alto desempenho e escalabilidade.