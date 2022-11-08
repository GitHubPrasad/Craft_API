package src.test.java.POJOClasses;

import java.util.ArrayList;
import java.util.List;

public class Validation
{
    private String validationStatus;
    private String processDate;
    private List<Object> rules = new ArrayList<Object>();

    public String getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public List<Object> getRules() {
        return rules;
    }

    public void setRules(List<Object> rules) {
        this.rules = rules;
    }
}
