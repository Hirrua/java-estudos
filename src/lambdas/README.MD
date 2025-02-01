# Interfaces Funcionais (Functional Interfaces)

> Essas são algumas das mais diversas Functional Interfaces

| Assinatura | Nome       |
| ---------- |:-----------|
| nada -> T | Supplier   | 
| T -> nada | Consumer   |
|T -> T | UnaryOperator |
|T, T -> T| Binary Operator |
| T -> boolean | Predicate  |
| S -> T | Function   |
| T, U, R | BiFunction |

****

**Supplier:** Não recebe nenhum parametro e retorna algum tipo T

**Consumer:** Aceita um unico parametro e não retorna nada

**UnaryOperator:** Recebe parametro de algum tipo (wrapper) e retorna o mesmo

**BinaryOperator:** Recebe dois parametros do mesmo tipo e reotorna o mesmo

**Predicate:** Recebe um parametro e retorna true ou false

**Function:** Recebe parametro de um tipo e pode retornar outro ex: recebe Integer e retorna String

**BiFunction:** Recebe dois tipos de parametros (T, U) e o tipo de retorno (R)