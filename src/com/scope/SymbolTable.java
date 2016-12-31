package com.scope;

import java.util.HashMap;

public class SymbolTable {
    public String name;
    public String type;
    public SymbolTable father;

    public HashMap<String, SymbolTable> children = new HashMap<String, SymbolTable>();

    public SymbolTable(String name, SymbolTable father, String type) {
        this.name = name;
        this.father = father;
        this.type = type;
    }

    public boolean defined(String Name) {
        return  (children.containsKey(Name));
    }

    public void add(SymbolTable ST) {
        children.put(ST.name, ST);
    }


}
