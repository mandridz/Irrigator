package ru.msk.ehome.Irrigator;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("mytheme")
public class IrrigatorUI extends UI {

	@Override
    protected void init(VaadinRequest vaadinRequest) {
        
		
		
		final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);
    }

	@WebServlet(urlPatterns = "/*", name = "IrrigatorUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = IrrigatorUI.class, productionMode = false)
    public static class IrrigatorUIServlet extends VaadinServlet {
    }
}
