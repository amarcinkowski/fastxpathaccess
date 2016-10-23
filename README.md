# fastXPathAccess [![Build Status](https://travis-ci.org/amarcinkowski/fastxpathaccess.svg?branch=master)](https://travis-ci.org/amarcinkowski/fastxpathaccess) [ ![Download](https://api.bintray.com/packages/amarcinkowski/amarcinkowski-repo/fastxpathaccess/images/download.svg) ](https://bintray.com/amarcinkowski/amarcinkowski-repo/fastxpathaccess/_latestVersion)

## Dependency
### Maven
```xml
<dependency>
  <groupId>io.github.amarcinkowski</groupId>
  <artifactId>fastxpathaccess</artifactId>
  <version>1.0.6</version>
  <type>pom</type>
</dependency>
```
### Gradle
compile 'io.github.amarcinkowski:fastxpathaccess:1.0.6'

## Usage example
Based on http://www.w3schools.com/xml/xml_xpath.asp bookstore XML example.
### Xpath Example
```java
Path filepath = Paths.get("bookstore.xml");
Xpath.find(filepath, "/bookstore/book[1]/title/@lang");
```
### Result
```Xpath.find()``` returns ```String[]``` with values

## License
```
The MIT License (MIT)
Copyright (c) <year> <copyright holders>

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
