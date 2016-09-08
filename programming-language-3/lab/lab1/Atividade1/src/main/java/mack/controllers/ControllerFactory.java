package mack.controllers;

public class ControllerFactory {
    
    public static final Controller getControllerByClass(Class actionClass) {
        try {
            Controller controller;
            controller = (Controller) actionClass.newInstance();
            
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
    
    public static final Controller getControllerByFullClassName(String className) {
        try {
            String name = "mack.controllers.impl" + className + "Controller";
            Class actionsClass = Class.forName(name);
            
            return getControllerByClass(actionsClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
