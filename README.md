# fastXPathAccess [![Build Status](https://travis-ci.org/amarcinkowski/fastxpathaccess.svg?branch=master)](https://travis-ci.org/amarcinkowski/fastxpathaccess) [![Coverage Status](https://coveralls.io/repos/github/amarcinkowski/fastxpathaccess/badge.svg)](https://coveralls.io/github/amarcinkowski/fastxpathaccess) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.amarcinkowski/fastxpathaccess/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.amarcinkowski/fastxpathaccess) [ ![Download](https://api.bintray.com/packages/amarcinkowski/amarcinkowski-repo/fastxpathaccess/images/download.svg) ](https://bintray.com/amarcinkowski/amarcinkowski-repo/fastxpathaccess/_latestVersion)
Fast and easy xpath query tool.
## Dependency
Available in Maven Central and Bintray's jcenter repositories.
### Maven
```xml
<dependency>
  <groupId>io.github.amarcinkowski</groupId>
  <artifactId>fastxpathaccess</artifactId>
  <version>1.0.17</version>
</dependency>
```
### Gradle
```
compile 'io.github.amarcinkowski:fastxpathaccess:1.0.17'
```

## Usage
Based on http://www.w3schools.com/xml/xml_xpath.asp bookstore XML example.
### Xpath Example
```java
Path filepath = Paths.get("bookstore.xml");
Xpath.find(filepath, "/bookstore/book[1]/title/@lang");
```
### Result
```Xpath.find()``` returns ```String[]``` with values

## License

Licensed under [MIT License](https://opensource.org/licenses/MIT)

