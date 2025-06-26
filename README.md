# mvn-junit
Tenho como objetivo avançar meus estudos em configurações com mvn juntamente com expandir para testes, para que assim possa realizar projetos grandes


## Comando usado para iniciar o projeto: 

> Esse comando criará um estrutura do projeto com os testes já pre configurados.

```
mvn archetype:generate \
  -DgroupId=com.exemplo \
  -DartifactId=meu-projeto \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false

```
---
As duas opções são validas, na primeira você tem mais organização.
---
```
mvn archetype:generate -DgroupId=com.exemplo -DartifactId=meu-projeto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

```

## Observações importantes

 - **Note:** É de grande importância ignorar arquivos desnecessario no build 



 ## Teste `(JUnit)`



### **2. Estrutura Básica de um Projeto com JUnit**  

#### **Diretórios (Maven padrão)**  
```
src/
├── main/
│   └── java/                  # Código-fonte
│       └── com/
│           └── exemplo/
│               └── Calculadora.java
└── test/
    └── java/                  # Testes
        └── com/
            └── exemplo/
                └── CalculadoraTest.java
```

#### **`pom.xml` (Dependência JUnit 5)**  
```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.9.3</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

### **3. Anotações Essenciais (JUnit 5)**  
| Anotação          | Descrição                                                                 |
|-------------------|---------------------------------------------------------------------------|
| `@Test`           | Marca um método como teste.                                               |
| `@BeforeEach`     | Executa antes de **cada** teste (ex: inicializar recursos).               |
| `@AfterEach`      | Executa após **cada** teste (ex: limpar recursos).                        |
| `@BeforeAll`      | Executa **uma vez** antes de todos os testes (método deve ser `static`).  |
| `@AfterAll`       | Executa **uma vez** após todos os testes (método deve ser `static`).      |
| `@DisplayName`    | Define um nome legível para o teste (ex: `"Soma de dois números"`).       |
| `@ParameterizedTest` | Permite testes com múltiplos inputs (ex: `@CsvSource`).               |

---


### **4. Como Executar os Testes?**  
- **Terminal (Maven)**:  
  ```bash
  mvn test
  ```  
  - Relatório em `target/surefire-reports/`.  

- **IDE (IntelliJ/Eclipse)**:  
  - Clique no botão ▶️ ao lado da classe ou método de teste.  

---

### **5. Boas Práticas**  
1. **Nomes Descritivos**:  
   - Use `@DisplayName` ou prefixos como `test[NomeDoCenario]`.  
   - Ex: `testDivisaoPorZero_DeveLancarExcecao`.  

2. **Testes Isolados**:  
   - Cada teste deve ser independente (evite compartilhar estado entre testes).  

3. **Cobertura de Código**:  
   - Use plugins como **JaCoCo** para medir cobertura:  
     ```xml
     <plugin>
         <groupId>org.jacoco</groupId>
         <artifactId>jacoco-maven-plugin</artifactId>
         <version>0.8.10</version>
         <executions>
             <execution>
                 <goals>
                     <goal>prepare-agent</goal>
                 </goals>
             </execution>
             <execution>
                 <id>report</id>
                 <phase>test</phase>
                 <goals>
                     <goal>report</goal>
                 </goals>
             </execution>
         </executions>
     </plugin>
     ```
     - Gera relatório em `target/site/jacoco/`.  

---

### **8. Extras Úteis**  
- **Mocking (Mockito)**:  
  ```java
  @Test
  void testServicoComMock() {
      UserRepository mockRepo = Mockito.mock(UserRepository.class);
      when(mockRepo.findById(1)).thenReturn(new User("Admin"));
      UserService service = new UserService(mockRepo);
      assertEquals("Admin", service.getUserName(1));
  }
  ```  
  - Adicione a dependência:  
    ```xml
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.4.0</version>
        <scope>test</scope>
    </dependency>
    ```

---
