package com.callcenter;

import javax.swing.UIManager;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.callcenter.utilidad.UtilidadMensaje;

public class CallCenterMain {

    public static void main(String[] args) {
    	
     	final Logger logger = Logger.getLogger(CallCenterMain.class);

        try {
            BasicConfigurator.configure();
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            CallCenterFrame principal = new CallCenterFrame();
            principal.show();
        } catch (Exception ex) {
        	logger.error(UtilidadMensaje.ERROR_FRAME+ex);
        }

    }

}
