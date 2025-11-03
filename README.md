## Comparação de Desempenho: Threads 1:1 vs N:M

| Modelos  | 10 Threads | 100 Threads | 500 Threads | 1000 Threads |
| :------- | ---------: | ----------: | ----------: | -----------: |
| 1 para 1 | 1098.44 ms | 1155.83 ms  | 1166.05 ms  | 1219.57 ms   |
| N : M    | 1099.08 ms | 1113.57 ms  | 1152.94 ms  | 1192.09 ms   |

### Cenário de Teste
* **Carga:** Cada thread executa 10 passos em loop
* **Trabalho:** Cada passo simula um trabalho com o  `Thread.sleep(100)`.
* **Tempo total por Thread:** 1000ms (1 segundo) de `sleep`.

### Quadro comparativo

<img width="561" height="347" alt="image" src="https://github.com/user-attachments/assets/86ddeb70-9972-463d-a73d-a985052b49da" />
