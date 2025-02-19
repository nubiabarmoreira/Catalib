# 
# Documento de Requisitos para o Sistema CataLib
## Links:
- [Clique aqui](https://encurtador.com.br/nRFqV) para acessar a versão interativa.
- [Clique aqui](https://encurtador.com.br/bCACz) para acessar a versão em texto
## **Visão Geral do Projeto**
### **Descrição do Sistema**
O sistema CRUD de biblioteca é uma aplicação simples que permite gerenciar o acervo de uma biblioteca.
Ele possibilita a criação, leitura, atualização e exclusão de registros de livros, além de funcionalidades adicionais como busca, filtros e ordenação.
### **Objetivo Principal**
Gerenciar o acervo de livros.
### **Público-Alvo**
- Bibliotecários e administradores responsáveis pelo gerenciamento do acervo.
- Usuários finais que desejam consultar informações sobre os livros disponíveis.
---
## **Requisitos Funcionais**
### **Funcionalidades Principais**
1. **Criar Livro**: Permitir o cadastro de novos livros no sistema.
2. **Ler Livro**: Exibir a lista de livros cadastrados e detalhes de um livro específico.
3. **Atualizar Livro**: Permitir a edição das informações de um livro existente.
4. **Deletar Livro**: Permitir a exclusão de livros do sistema.
### **Campos Necessários para Cada Livro**
- Título (obrigatório)
- Autor (obrigatório)
- Gênero (obrigatório)
- Data de Publicação (obrigatório)
- Número de Exemplares (obrigatório)
- ISBN (opcional)
- Descrição (opcional)
### **Funcionalidades Adicionais**
1. **Busca**: Permitir a busca de livros por título ou autor.
2. **Filtros**: Filtrar livros por gênero. (Opicional)
---
## **Critérios de Aceitação**

1. O sistema deve permitir a criação de um novo livro com todos os campos obrigatórios preenchidos.
2. O sistema deve exibir uma mensagem de erro caso o usuário tente excluir um livro inexistente.
3. A busca deve retornar resultados relevantes com base no título ou autor.
4. O sistema deve impedir a exclusão de um livro caso o usuário não tenha permissão.
---
## **Cronograma e Priorização**
### **Estimativa de Tempo**
1. **MVP (Funcionalidades Básicas)**:
    - CRUD de livros: 1h30.
2. **Funcionalidades Adicionais**:
    - Busca e filtros: 1 semana.
### **Priorização**
1. MVP com funcionalidades básicas (CRUD e autenticação).
2. Funcionalidades adicionais (busca, filtros e ordenação).
---
Este documento serve como guia para o desenvolvimento do sistema CRUD de biblioteca, garantindo clareza e alinhamento entre a equipe de desenvolvimento.