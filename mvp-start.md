# 🚚 MVP – API de Entregas (Delivery as a Service)

Este README descreve um **MVP enxuto**, pensado para o **cenário brasileiro**, com **até 10 tabelas**, focado em **validar o negócio rapidamente**, evitando complexidade excessiva.

O objetivo é permitir:

* Criar entregas
* Calcular preço
* Alocar entregadores
* Usar API externa como fallback

---

## 🎯 Objetivo do MVP

Validar se:

* Estabelecimentos pagam por entrega
* Entregadores conseguem operar
* O fluxo básico funciona sem fricção

❌ Fora do escopo inicial:

* Precificação dinâmica avançada
* Machine learning
* Otimização de rotas
* App completo do entregador

---

## 🧱 Arquitetura Conceitual

* API REST
* Modelo monolítico (inicial)
* Integrações externas desacopladas

```text
Estabelecimento → API → Entregador
                    → API Externa (fallback)
```

---

## 🗂️ Modelo de Dados (10 tabelas)

### 1️⃣ Estabelecimentos

Representa quem consome a API.

| Campo     | Descrição        |
| --------- | ---------------- |
| id        | Identificador    |
| nome      | Nome fantasia    |
| cnpj      | Documento        |
| latitude  | Origem           |
| longitude | Origem           |
| status    | ATIVO / SUSPENSO |

---

### 2️⃣ Usuários do Estabelecimento

Usuários que operam o sistema.

| Campo              | Descrição        |
| ------------------ | ---------------- |
| id                 | Identificador    |
| estabelecimento_id | Vínculo          |
| nome               | Nome             |
| email              | Login            |
| perfil             | ADMIN / OPERADOR |

---

### 3️⃣ Entregadores

Motoboys / parceiros.

| Campo      | Descrição         |
| ---------- | ----------------- |
| id         | Identificador     |
| nome       | Nome              |
| telefone   | Contato           |
| disponivel | true/false        |
| latitude   | Atual             |
| longitude  | Atual             |
| status     | ATIVO / BLOQUEADO |

---

### 4️⃣ Veículos

Veículo do entregador.

| Campo         | Descrição           |
| ------------- | ------------------- |
| id            | Identificador       |
| entregador_id | Dono                |
| tipo          | MOTO / BIKE / CARRO |
| placa         | Identificação       |

---

### 5️⃣ Endereços

Usado para coleta e entrega.

| Campo      | Descrição     |
| ---------- | ------------- |
| id         | Identificador |
| logradouro | Rua           |
| numero     | Número        |
| cidade     | Cidade        |
| estado     | UF            |
| latitude   | Geo           |
| longitude  | Geo           |

---

### 6️⃣ Entregas (CORE do MVP)

Entidade central do sistema.

| Campo               | Descrição         |
| ------------------- | ----------------- |
| id                  | Identificador     |
| estabelecimento_id  | Origem            |
| entregador_id       | Alocado           |
| endereco_coleta_id  | Coleta            |
| endereco_entrega_id | Destino           |
| distancia_km        | Calculada         |
| valor               | Preço             |
| status              | Fluxo da entrega  |
| tipo                | PROPRIO / EXTERNO |

---

### 7️⃣ Histórico de Status

Auditoria do fluxo.

| Campo      | Descrição     |
| ---------- | ------------- |
| id         | Identificador |
| entrega_id | Referência    |
| status     | Novo status   |
| data_hora  | Timestamp     |

---

### 8️⃣ Regras de Preço

Modelo simples e fixo.

| Campo        | Descrição     |
| ------------ | ------------- |
| id           | Identificador |
| taxa_base    | Valor fixo    |
| valor_por_km | Preço/km      |
| tipo_veiculo | Aplicável     |

---

### 9️⃣ Integrações Externas

APIs de terceiros.

| Campo      | Descrição          |
| ---------- | ------------------ |
| id         | Identificador      |
| nome       | Uber Direct, Loggi |
| ativo      | true/false         |
| prioridade | Ordem de uso       |

---

### 🔟 Entregas Externas

Ligação entre entrega interna e externa.

| Campo          | Descrição     |
| -------------- | ------------- |
| id             | Identificador |
| entrega_id     | Interna       |
| integracao_id  | API usada     |
| external_id    | ID externo    |
| status_externo | Status        |

---

## 🔁 Fluxo do MVP (End-to-End)

1. Estabelecimento cria entrega
2. Sistema calcula distância
3. Sistema calcula preço
4. Busca entregador disponível
5. Se não houver → chama API externa
6. Entregador aceita
7. Coleta
8. Em rota
9. Entregue

---

## 📦 Status da Entrega (Enum)

```text
CRIADA
PRECIFICADA
BUSCANDO_ENTREGADOR
ACEITA
COLETADA
EM_ROTA
ENTREGUE
CANCELADA
```

---

## 🔌 Integrações Externas (Estratégia)

* Camada separada
* Nunca misturar regra interna com API externa

```text
DeliveryService → IntegrationService → API Externa
```

---

## 💰 Modelo de Monetização (MVP)

Opções simples:

* Valor por entrega
* Pacote mensal
* Margem sobre frete

---

## 🚀 Evolução Pós-MVP

* App do entregador
* Rastreamento em tempo real
* Precificação dinâmica
* Avaliações
* Multi-cidade

---

## 🧠 Regra de Ouro

> **Se não cabe no MVP, não entra agora.**

Esse modelo é suficiente para:

* Testar mercado
* Fechar primeiros clientes
* Evoluir com segurança
