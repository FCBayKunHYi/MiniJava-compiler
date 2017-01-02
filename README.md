# MiniJava-compiler
MiniJava的编译器前端

使用了Antlr4工具。

​	整个project在Intellij下用Java编写，所以需要在正确安装了Java运行环境(JRE 1.7及以上)且能正确运行Java程序的环境下运行。

​	将需要编译的MiniJava语言写在在src/src/input/test.txt里



终端进入src目录，用下面的命令运行MiniJava-compiler.jar 

```
java -jar MiniJava-compiler.jar 
```

​	终端将会显示各类编译信息，并跳出一个显示AST的窗口。



词法分析和语法分析对应的文法文件分别在lexer.txt和parser.txt中