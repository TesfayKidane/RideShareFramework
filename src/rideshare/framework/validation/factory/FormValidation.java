package rideshare.framework.validation.factory;

public interface FormValidation {
    boolean validate(String input, FormCriteria crit);
}
