package rideshare.framework.validation.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chanpiseth
 */
public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        
        FormValidationFactory validatorFactory = FormValidationFactoryImp.getInstance();
        FormValidation validator = validatorFactory.getValidator(FormValidationType.IS_NUMBER);
        
        Boolean test = validator.validate("12434", null);
        System.out.println(test);
        
        validator = validatorFactory.getValidator(FormValidationType.IS_AGE);
        
        FormCriteria c = new FormCriteriaImp();
        c.setIntFrom(0);
        c.setIntTo(100);
        
        test = validator.validate("01/01/2018", c);
        
        System.out.println(test);
        
        
        
        FormCriteria cc = new FormCriteriaImp();
        validator = validatorFactory.getValidator(FormValidationType.IS_GENDER);
        
        List<String> genders = new ArrayList<>();
        genders.add("Male");
        genders.add("Female");
        
        cc.setStringList(genders);
        test = validator.validate("Male", cc);
        System.out.println(test);
    }
    
}
