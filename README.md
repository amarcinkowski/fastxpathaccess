# fastXPathAccess

## Usage example
```
Path filepath = Paths.get("bookstore.xml");
Xpath.find(filepath, "/bookstore/book[1]/title/@lang");
```
returns ```String[]```
