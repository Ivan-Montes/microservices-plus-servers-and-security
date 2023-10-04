# microservices-plus-servers-and-security

Test project with microservices + eureka + config server + message broker + openfeign + vault + api-gateway + keycloak 

#### basic-microservice

List of controllers

	- MainController: authorization required through api-gateway
	- SecondaryController: free access
	
##### About Message-Broker RabbitMQ

You could use whatever [these methods](https://www.rabbitmq.com/download.html) for adding your own server


#### Api Gateway

Configured in port 8080


#### About Vault HashiCorp

Use [this installers](https://developer.hashicorp.com/vault/downloads). In this project It's used the Windows binaries

```
vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"


vault kv put secret/basic-microservice @basic-microservices.secret.json

```

#### About KeyCloak

   Tutorials
	
   - [KeyCloak](https://www.keycloak.org/getting-started/getting-started-zip)
   - [Wanna Code](https://www.youtube.com/playlist?list=PL145AyWAbMDhwUbBL74s1D2ZV9EqBaQ1t)
   - [Java Techie](https://www.youtube.com/watch?v=KpITcN7O53Y)
	

#### Maintainers

Just me, [Ivan](https://github.com/Ivan-Montes) :sweat_smile:


#### Contributing

Contributions are always welcome! 


#### License

[![GPLv3 license](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://choosealicense.com/licenses/gpl-3.0/)
[![Maven](https://badgen.net/badge/icon/maven?icon=maven&label)](https://https://maven.apache.org/)
[![Eclipse](https://badgen.net/badge/icon/eclipse?icon=eclipse&label)](https://https://eclipse.org/)
[![GitHub](https://badgen.net/badge/icon/github?icon=github&label)](https://github.com)
[![Spring](https://img.shields.io/badge/spring-blue?logo=Spring&logoColor=white)](https://spring.io)