package com.company;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import com.scope.SymbolTable;

public class CheckListener extends MinijavaBaseListener{

    static ParseTreeProperty<SymbolTable> STs = new ParseTreeProperty<SymbolTable>();

}
