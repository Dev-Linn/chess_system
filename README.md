# Jogo de Xadrez em Java

Uma implementação de xadrez para linha de comando construída em Java com princípios de orientação a objetos.

## Sobre o Projeto

Esta aplicação de xadrez implementa um jogo de xadrez clássico com interface de linha de comando. Apresenta peças coloridas, validação de movimentos e um sistema completo de regras de xadrez construído do zero.

## Funcionalidades

- Representação completa do tabuleiro de xadrez
- Validação de movimento das peças com regras adequadas de xadrez
- Interface de linha de comando com peças coloridas (brancas e amarelas)
- Sistema de posição usando notação algébrica de xadrez (ex.: a2, h8)
- Destaque de movimentos mostrando destinos possíveis
- Tratamento de erros para movimentos e posições inválidas

## Como Começar

### Pré-requisitos

- Kit de Desenvolvimento Java (JDK) 22 ou mais recente
- Git (opcional, para clonar)

### Instalação

1. Clone este repositório ou baixe o código-fonte
   ```
   git clone https://github.com/seuusuario/chess.git
   ```

2. Navegue até o diretório do projeto
   ```
   cd chess
   ```

3. Compile o projeto
   ```
   javac -d bin src/application/*.java src/boardgame/*.java src/chess/*.java src/chess/pieces/*.java
   ```

4. Execute a aplicação
   ```
   java -cp bin application.Program
   ```

## Como Jogar

1. O jogo começa com uma configuração padrão de tabuleiro de xadrez
2. Digite a posição de origem em notação algébrica (ex.: `e2`)
3. Digite a posição de destino em notação algébrica (ex.: `e4`)
4. A aplicação valida seu movimento e atualiza o tabuleiro
5. Continue jogando até o xeque-mate ou empate

Exemplo de movimentos:
```
Print source:
e2
Target:
e4
```

## Melhorias Planejadas

- Detecção de xeque-mate e xeque
- Movimentos especiais (roque, en passant, promoção de peão)
- Peças de xadrez adicionais (Rainha, Bispo, Cavalo, Peão)
- Salvamento/carregamento do estado do jogo
- Histórico e notação de movimentos
- Temporizador de jogo

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para enviar um Pull Request.
