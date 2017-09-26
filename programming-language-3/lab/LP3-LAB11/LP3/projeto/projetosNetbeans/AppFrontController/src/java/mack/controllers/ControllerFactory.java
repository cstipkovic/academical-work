package mack.controllers;

public class ControllerFactory {

    public static final Controller getControllerByClass(Class actionClass) {
        try {
            
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
            String name = "mack.controllers.impl." + className + "Controller";
            Class actionClass = Class.forName(name);
            return getControllerByClass(actionClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
