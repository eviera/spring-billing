#Angular - Spring MVC


- Login
  - Spring security
- Nextbill
  - tablas paginables: http://www.baeldung.com/pagination-with-a-spring-rest-api-and-an-angularjs-table
    - Angular UI grid: http://ui-grid.info/
  - derecho para acceder
  - colorear vencidos
  - totalizer
- ~~Sett edit y confirm~~ **no tiene sentido porque REST no es para esto**
- ~~PagosConsulta~~ **no tiene sentido porque REST no es para esto**
- Update de docs via file con Spring Batch
- Tareas

##Fase 1
-  ~~Armar el proyecto~~
- ~~Crear companies de prueba cuando se inicializa~~
- ~~Crear documentos de prueba cuando se inicializa~~
- ~~Usar webjars para levantar Angular~~
- Usar AngularUI
- ~~REST de Company~~
- ~~Mostrar las companies~~
  - Paginar las Companies
- ~~REST de Document~~
- ~~Mostrar los documentos y paginarlos~~
  - Area de filtros con combo de seleccion de payer
    - El finder debe traer los documentos por payer ordenados por type, issue-date

##Fase 2
- Login
- Seguridad en las paginas (Spring security)

## **no** ~~Fase 3~~
- **no** ~~Armado del pago~~ 
- **no** ~~Pagos/Consulta~~

##Fase 4
- Update de docs via file con Spring Batch
- Tareas


##Links
- webjar: https://examples.javacodegeeks.com/enterprise-java/spring/boot/spring-boot-and-angularjs-integration-tutorial/
- general: https://spring.io/blog/2015/08/19/migrating-a-spring-web-mvc-application-from-jsp-to-angularjs
- general: http://blog.angular-university.io/developing-a-modern-java-8-web-app-with-spring-mvc-and-angularjs/
- ui-grid doc: https://github.com/angular-ui/ui-grid/wiki/Defining-columns
- reload de paginas: http://stackoverflow.com/questions/24762657/refreshing-static-content-with-spring-mvc-and-boot
- spring security: https://spring.io/guides/tutorials/spring-security-and-angular-js/
- spring security: https://spring.io/blog/2015/01/12/spring-and-angular-js-a-secure-single-page-application
- spring security: http://www.baeldung.com/spring-security-session
- spring boot reference: https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
- la consola del H2 vive en: http://localhost:8080/h2-console  (gracias a spring-boot-devtools)
- general REST, ejemplos API: https://gist.github.com/hjr3/2289546
- general Restbucks (shopping cart): https://github.com/olivergierke/spring-restbucks

##Tips
- Para refrescar en Debug, Ctrl+F9
- REST debe invocar recursos 'sustantivos' (/document, /transaction), donde los verbos son las acciones (POST, GET)
  - deben ser idempotentes
- El usuario se puede guardar directamente en la http session (ver getShoppingCartInSession: https://github.com/bijukunjummen/shopping-cart-cf-app/blob/master/src/main/java/pso/shop/service/ShoppingCartService.java)
