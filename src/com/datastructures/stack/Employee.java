package com.datastructures.stack;

class Employee 
{
    private String id;
    private String name;
    
    /**
     * Employee constructor
     */
    public Employee(String id, String name) { // constructor
           this.id = id;
           this.name = name;
    }
 
    @Override
    public String toString() 
    {
           return "Employee [id=" + id + ", name=" + name + "]   ";
    }
    
}
 