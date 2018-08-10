package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Customer implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(generator = "CUSTOMER_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "CUSTOMER_ID_GENERATOR", sequenceName = "CUSTOMER_ID_SEQ")
    private java.lang.Long id;

    public Customer() {
    }
    
    public Customer(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}