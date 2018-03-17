package com.callcenter;

import javax.swing.UIManager;
import org.apache.log4j.BasicConfigurator;

public class CallCenterMain {

    public static void main(String[] args) {
        
        try {
            BasicConfigurator.configure();
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            CallCenterFrame principal = new CallCenterFrame();
            principal.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
