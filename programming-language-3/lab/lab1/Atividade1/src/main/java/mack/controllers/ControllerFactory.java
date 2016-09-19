package mack.controllers;

public class ControllerFactory {
    
    public static final Controller getControllerByClass(Class actionClass) {
        try {
            Controller controller = (Controller) actionClass.newInstance();
            
            return controller;
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
            System.out.println(className);
            String name = "mack.controllers.impl." + className + "Controller";
            Class actionsClass = Class.forName(name);
            
            return getControllerByClass(actionsClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
