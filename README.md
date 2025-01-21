# Desafio - Empréstimos Pessoais

Este projeto implementa um sistema de concessão de empréstimos pessoais, com base em critérios específicos de idade, localização e renda do cliente. Ele foi desenvolvido utilizando Spring Boot no backend e foi projetado para processar dados de clientes e determinar quais tipos de empréstimos podem ser concedidos com base nas regras fornecidas.

## Tecnologias Utilizadas

- **Java** 17
- **Spring Boot** 
- **Spring Web** (REST API)
- **Maven** 
- **Postman / cURL** (para testar a API)

## Regras de Negócio

O sistema segue as seguintes regras para concessão de empréstimos:

1. **Empréstimo Pessoal**:
   - Conceder se o salário do cliente for igual ou inferior a R$ 3000.
   - Conceder se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).

2. **Empréstimo Consignado**:
   - Conceder se o salário do cliente for igual ou superior a R$ 5000.

3. **Empréstimo com Garantia**:
   - Conceder se o salário do cliente for igual ou inferior a R$ 3000.
   - Conceder se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).

## Endpoint
POST /customer-loans

Recebe as informações de um cliente e retorna os tipos de empréstimos que ele pode obter.

Exemplo de solicitação:
```
{
  "age": 26,
  "cpf": "275.484.389-23",
  "name": "Vuxaywua Zukiagou",
  "income": 7000.00,
  "location": "SP"
}
```
Exemplo de resposta:
```
{
  "customer": "Vuxaywua Zukiagou",
  "loans": [
    {
      "type": "PERSONAL",
      "interest_rate": 4
    },
    {
      "type": "GUARANTEED",
      "interest_rate": 3
    },
    {
      "type": "CONSIGNMENT",
      "interest_rate": 2
    }
  ]
}
```

## Origem do Desafio

 Este desafio foi retirado do repositório desafios do Backend BR(https://github.com/backend-br/desafios?tab=readme-ov-file).


