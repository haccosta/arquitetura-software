**Repositório com o projeto de conclusão de curso da Especialização em Arquitetura de Software Distribuído - Pontifícia Universidade Católica de Minas Gerais**

Este repositório disponibiliza o projeto de trabalho de conclusão de curso da Especialização em Arquitetura de Software Distribuído, da Pontifícia Universidade Católica de Minas Gerais.

O projeto é constituído de uma prova de conceito de uma aplicação de loja virtual baseada no conceito de negócio de dropshipping. 
Dropshipping é uma modalidade de negócio onde a loja, sendo ela virtual ou física, não possui estoque dos produtos comercializados.

Foram implementados as seguintes funcionalidades de uma loja virtual:

* Listagem de Produtos;
* Registrar Compras;
* Processamento de Itens de Pedidos relacionados a um fornecedor

Foram atendidos os seguintes requisitos não funcionais do projeto:

* Segurança;
* Desempenho;
* Interoperabilidade

---

## Premissas do Projeto

Para a implantação do projeto, esta sendo considerado o funcionamento em máquina local, com as seguintes premissas:

1. Possuir o sistema operacional Linux Instalado;
2. Possuir o Docker Container Instalado;

---

## Setup do Projeto

Serão necessários os seguintes passos para a execução da prova de conceito

1. Abrir o terminal linux, e executar o comando **docker-compose up**;
2. Acessar o endereço **http://localhost:15991/seguranca/swagger-ui.html** e informar o usuário handerson e senha 123456, previamente cadastrados no banco de dados, para a geração do token;
3. Acessar o endereço **http://localhost:15991/lojavirtual/swagger-ui.html#/registrar-venda-controller** , informar o token gerado, e preencher os dados do cliente e produtos desejados, e efetivar a compra;
