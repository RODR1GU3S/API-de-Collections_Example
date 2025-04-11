# 📂 Leitor e Ordenador de Arquivo `.txt` em Java

Este projeto em Java demonstra a leitura de um arquivo de texto, o armazenamento de suas linhas em uma lista, a ordenação dessas linhas em ordem alfabética e a exibição no console.
É um exemplo prático do uso da **API de Collections** do Java.

---

## 📌 Objetivo

- Ler um arquivo `.txt` linha por linha
- Armazenar as linhas em uma lista dinâmica (`ArrayList`)
- Ordenar as linhas com `Collections.sort()`
- Exibir as linhas ordenadas no terminal

---

## 📚 Técnicas e Conceitos da API de Collections Utilizados

### ✅ 1. Uso da interface `List` e da implementação `ArrayList`
```java
List<String> list = new ArrayList<>();
```
- A interface `List` é usada para declarar a variável, promovendo **programação orientada à interface**.
- `ArrayList` fornece uma lista dinâmica de acesso rápido e eficiente.

---

### ✅ 2. Armazenamento de dados com `add()`
```java
list.add(name);
```
- O método `add()` permite adicionar dinamicamente os dados lidos do arquivo.

---

### ✅ 3. Ordenação com `Collections.sort()`
```java
Collections.sort(list);
```
- O método `sort()` da classe utilitária `Collections` ordena os elementos da lista conforme a ordem natural das strings (alfabética).
- Demonstra o uso eficiente de **métodos utilitários da API de Collections**.

---

### ✅ 4. Iteração com enhanced for
```java
for (String s : list) {
    System.out.println(s);
}
```
- Sintaxe moderna e legível para percorrer a lista.

---

## ⚙️ Requisitos

- Java 8 ou superior
- Um arquivo de texto no caminho `C:\Windows\Temp\in.txt`

---

## 📁 Exemplo de arquivo (`in.txt`)

```
Carlos
Ana
João
Maria
```

### ✅ Saída esperada
```
Ana
Carlos
João
Maria
```

---

## 💡 Boas Práticas Aplicadas

- **Try-with-resources**: garante o fechamento automático do arquivo.
- **Tratamento de exceções com `IOException`**: evita falhas inesperadas.
- **Separação de responsabilidades**: leitura, ordenação e exibição são realizadas de forma clara e organizada.

---
