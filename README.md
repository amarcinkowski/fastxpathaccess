# fastXPathAccess [![Build Status](https://travis-ci.org/amarcinkowski/fastxpathaccess.svg?branch=master)](https://travis-ci.org/amarcinkowski/fastxpathaccess)

## Usage example

### Path
```
Path filepath = Paths.get("bookstore.xml");
Xpath.find(filepath, "/bookstore/book[1]/title/@lang");
```
### XML contents
```
Xpath.find(xmlString, "/bookstore/book[1]/title/@lang");
```
### Result
```Xpath.find()``` returns ```String[]``` with values
