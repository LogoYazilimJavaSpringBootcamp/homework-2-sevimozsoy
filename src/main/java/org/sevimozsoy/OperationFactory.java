package org.sevimozsoy;

public class OperationFactory {

    public OperationI getOperation(String operationType){
        if(operationType.equals("")){
            return null;
        } else if (operationType.equalsIgnoreCase("ORDER")) {
            return new OrderOperations();
        } else if (operationType.equalsIgnoreCase("CUSTOMER")) {
            return new CustomerOperations();
        }
        return null;
    }
}
