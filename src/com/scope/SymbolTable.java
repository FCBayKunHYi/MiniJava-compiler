package com.scope;

import java.util.HashMap;

public class SymbolTable {
    String name;
    String STType;
    SymbolTable parent;

    HashMap<String, SymbolTable> children = new HashMap<String, SymbolTable>();

    public SymbolTable(String name, SymbolTable parent) {
        this.name = name;
        this.parent = parent;
    }

    public boolean defined(String Name) {
        return  (children.containsKey(Name));
    }

    public void add(SymbolTable ST) {
        children.put(ST.name, ST);
    }


}
