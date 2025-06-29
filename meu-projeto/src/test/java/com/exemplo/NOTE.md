# Introdução ao JUnit para Testes de API

JUnit é o framework de testes mais popular para Java, e é essencial para testar suas APIs antes mesmo de mergulhar no Spring. Vou te explicar os conceitos básicos que você precisa para começar.

## O Básico do JUnit

### 1. Configuração inicial
Se você estiver usando Maven, adicione esta dependência no seu `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.8.2</version>
    <scope>test</scope>
</dependency>
```

### 2. Estrutura de um teste simples

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinhaClasseTest {
    
    @Test
    void quandoDoisMaisDois_entaoRetornaQuatro() {
        // Arrange (preparação)
        int a = 2;
        int b = 2;
        
        // Act (ação)
        int resultado = a + b;
        
        // Assert (verificação)
        assertEquals(4, resultado);
    }
}
```

## Testando APIs (antes mesmo do Spring)

Mesmo sem Spring, você pode testar a lógica central da sua API:

### 1. Testando métodos de serviço

```java
@Test
void quandoUsuarioValido_entaoLoginComSucesso() {
    // Arrange
    Autenticador autenticador = new Autenticador();
    String usuario = "admin";
    String senha = "1234";
    
    // Act
    boolean resultado = autenticador.autenticar(usuario, senha);
    
    // Assert
    assertTrue(resultado);
}
```

### 2. Testando exceções

```java
@Test
void quandoUsuarioInvalido_entaoLancaExcecao() {
    // Arrange
    Autenticador autenticador = new Autenticador();
    String usuario = "invalido";
    String senha = "0000";
    
    // Act & Assert
    assertThrows(UsuarioInvalidoException.class, () -> {
        autenticador.autenticar(usuario, senha);
    });
}
```

## Anotações úteis

- `@BeforeEach`: Executa antes de cada teste
- `@AfterEach`: Executa depois de cada teste
- `@BeforeAll`: Executa uma vez antes de todos os testes (método deve ser estático)
- `@AfterAll`: Executa uma vez depois de todos os testes (método deve ser estático)

```java
class TestesComSetup {
    
    private Autenticador autenticador;
    
    @BeforeEach
    void setUp() {
        autenticador = new Autenticador();
    }
    
    @Test
    void teste1() {
        // Já tem o autenticador instanciado
    }
}
```

## Quando você aprender Spring...

Depois que você aprender Spring, poderá usar:
- `@SpringBootTest` para testes de integração
- `@WebMvcTest` para testar controllers
- `MockMvc` para simular requisições HTTP
- `@MockBean` para mockar dependências