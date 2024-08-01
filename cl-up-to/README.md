Command-Line Up To
=== 
Java CLI program to find the largest prime number up to the input number.

## Guideline

### Technical stack
Java 8+, Maven 3.x, JUnit 4.13.x

### Build
Required Maven 3 (or Maven wrapper), JDK 8+
```
#cd cl-up-to
mvn clean compile -DskipTests
mvn package install -Dmaven.test.skip
```

### Run

```sh
$ mvn compile exec:java -Dexec.mainClass=vn.ducquoc.upto.cl.ClUpTo
```
or
```sh
$ mvn package && java -jar target/cl*.jar
```

### Docker

```bash
#alias docker=podman
$ docker build -t ducquoc/cl-up-to:1.1 .
$ docker run -p 9980:80 -i -t ducquoc/cl-up-to:1.1
```
Higher versions (1.2, 1.3, etc...): https://hub.docker.com/r/ducquoc/cl-up-to

## References 

+ For a bespoke variant (Spring/SpringBoot) prime number up to, it's in:
https://bitbucket.org/ducquoc/dq-training

+ To count the lines of code, you can run 

`mvn net.ducquoc:linecount-maven-plugin:linecount`

(already added repositories and plugin: https://gitlab.com/ducquoc/linecount-maven-plugin )

+ Math utils: https://github.com/ducquoc/jutil-dq/blob/master/jutil/src/main/java/vn/ducquoc/jutil/MathUtil.java
+ Misc: https://github.com/ducquoc/euler-fun/blob/master/euler/src/main/java/vn/ducquoc/euler/Util.java#L31
+ https://github.com/ducquoc/dq-protected
