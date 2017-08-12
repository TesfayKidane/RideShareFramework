package rideshare.framework.validation.factory;

public interface FormValidationFactory {
    public FormValidation getValidator(FormValidationType type);
}
