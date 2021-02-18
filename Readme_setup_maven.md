IntelliJ

more info see here: https://maven.apache.org/general.html#encoding-warning

and this was helpful https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-running-unit-tests-with-maven/

build Maven use no archetype or simple etc

///Remember to hot load when making change sin the POM///

Check the pom.xml includes correct compilation source for Java. Should read 11 not 1.7 & note added an element to property to encode files in UTF-8 and avoid platform dependency warning when running verify on Maven.

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    
Add dependencies for JUnit5 (note to self I changed version, make sure the engine version agrees).

<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.6.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.6.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>

//not sure I need this particular plug-in as 'native support' with jupiter, maybe only for older versions of JUnit. I deleted it and still works. See JUnit git for more info where it said not to use the surefire plug-in. 

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.1</version>
            </plugin>
        </plugins>
    </build>
