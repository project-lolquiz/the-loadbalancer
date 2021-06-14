# the-loadbalancer
Projeto balanceador de cargas para integração com as apis de backend

## Iniciando o ambiente
```
> mvn clean build spring-boot:run (necessário MAVEN)
```
## Considerações
O ambiente Heroku mantem as aplicações **desativadas após período de inatividade**. Por este motivo é provável
que, ao realizar as primeiras chamadas aos serviços, elas não responderão em conformidade.
Para isso, a aplicação cliente deverá tratar corretamente o *timeout* que irá ocorrer; uma vez os serviços ativos,
as aplicações se comportarão como esperado.

### Endereço no Heroku
```
https://lolquizlb.herokuapp.com/
https://lolquizlb.herokuapp.com/ping
https://lolquizlb.herokuapp.com/health
```
### Instâncias mapeadas API backend no Heroku
As seguintes instâncias estão ativas atualmente no Heroku
```
https://lolquizbe.herokuapp.com/
https://lolquizbe01.herokuapp.com/
```
