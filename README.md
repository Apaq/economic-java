# E-conomic Java Bindings 

_This client is developed by [Apaq](https://apaq.dk)_

![Java CI with Maven](https://github.com/Apaq/economic-java/workflows/Java%20CI%20with%20Maven/badge.svg)

Requirements
============

Java 1.6 and later.

Installation
============

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.previsto</groupId>
  <artifactId>economic.java</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

_Currently this requires having it build locally as it is not available in Central Repository._


Usage in Spring Boot
=====

application.yml
```yml
economic:
  serviceUrl: https://restapi.e-conomic.com
  appSecretToken: YOUR_PRIVATE_TOKEN
  agreementGrantToken: YOUR_AGREEMENT_GRANT_TOKEN
```

EconomicExample.java

```java
import com.previsto.economic.model.Customer;

@SpringBootApplication
public class BillyExample {

    @AutoWired
    private EconomicClient client;
    
    @PostConstruct
    private void init() {
      List<Customer> customers = client.getCustomerResource().findAll();
        
      System.out.println("Count: " + customers.size());
      for(Customer customer : customers) {
        System.out.println("Customer: " + customer);
      }
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
}
```


See [Test.java](https://github.com/Previsto/economic-java/blob/master/src/test/java/com/previsto/economic/Test.java) for more examples.

Testing
=======

You must have Maven installed. To run the tests:

    mvn test


Deploy Artifact
=======
Artifacts are deployed to a secure S3 repository. 
In order to be able to deploy to it, the correct credentials are required in settings.xml. 
You set it up like this:

```
<settings>
  ...
  <servers>
    ...
    <server>
      <id>aws-release</id>
      <username>[ACCESS_KEY]</username>
      <password>[SECRET_KEY]</password>
    </server>
    <server>
      <id>aws-snapshot</id>
      <username>[ACCESS_KEY]</username>
      <password>[SECRET_KEY]</password>
    </server>
    ...
  </servers>
  ...
</settings>
```

