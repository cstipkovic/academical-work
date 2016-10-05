package mack.controllers;

public class ControllerFactory {

    public static final Controller getControllerByClass(Class actionClass) {
        try {
            // TODO: no pdf do exemplo, o controller é instanciado em uma variavel e depois é passado
            //       no return como uma instanciacao novamente,o que nao faz sentido;
            return (Controller) actionClass.newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static final Controller getControllerByClassName(String className) {
        try {
            String name = "mack.controllers.impl." + className + "Controller";
            Class actionClass = Class.forName(name);
            
            return getControllerByClass(actionClass);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
