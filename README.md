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