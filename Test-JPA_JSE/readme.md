# Test con jpa sin un contenedor

Cuando se tenga el error: "No Persistence provider for EntityManager named ..." validar primero si esta bien ubicado el persistence.xml, luego verificar si se tiene configurado el proveedor en el persistence.xml, por ejemplo usando hibernate:
<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>

Si se usa maven verificar si existen todas las refencias, por lo pronto he configurado las siguientes dependencias: 

		<dependency>
			<groupId>org.hibernate.javax.persistence</groupId>
			<artifactId>hibernate-jpa-2.1-api</artifactId>
			<version>1.0.0.Final</version>
		</dependency>
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-entitymanager</artifactId>
			<version>4.3.6.Final</version>
		</dependency>
