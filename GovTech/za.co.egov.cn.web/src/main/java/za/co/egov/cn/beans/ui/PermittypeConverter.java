/**
 * 
 */
package za.co.egov.cn.beans.ui;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import org.springframework.stereotype.Component;

import za.co.egov.cn.PermitType;
import za.co.egov.cn.service.PermitTypeService;

/**
 * @author suresh
 *
 */
@Component("PermittypeConverter")
public class PermittypeConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
            try {
                PermitTypeService service = (PermitTypeService) fc.getExternalContext().getApplicationMap().get("PermitTypeService");
                return service.getEntities().get(Integer.parseInt(value));
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "SPConversion Error", "Not a valid Permittype."));
            }
        }
        else {
            return null;
        }
	}
	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		if(object != null) {
            return String.valueOf(((PermitType) object).getId());
        }
        else {
            return null;
        }
	}

}
