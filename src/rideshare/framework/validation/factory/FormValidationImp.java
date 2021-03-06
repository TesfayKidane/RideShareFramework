package rideshare.framework.validation.factory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public enum FormValidationImp implements FormValidation {

    IS_EMPTY() {
        @Override
        public boolean validate(String input, FormCriteria crit) {
            return input == null || input.isEmpty();
        }
    },

    IS_MATCH() {
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(crit == null) return false;
            return input.matches(crit.getStringValue());
        }
    },

    IS_DATE() {
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(IS_EMPTY.validate(input, crit)) return false;
            if(!input.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}")) return false;

            String[] fragment = input.split("/");

            int m = Integer.valueOf(fragment[0]);
            int d = Integer.valueOf(fragment[1]);
            int y = Integer.valueOf(fragment[2]);

            if(m < 1 || m > 12) return false;
            if(d < 1 || d > 31) return false;
            if(y < 1900 || y > 2030) return false;

            return true;
        }
    },


    IS_RANGE() {
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(crit == null || !IS_NUMBER.validate(input, crit)) return false;
            Double value = Double.valueOf(input);

            if(crit.getFlag()) return value >= crit.getIntFrom() && value <= crit.getIntTo();
            return value > crit.getIntFrom() && value < crit.getIntTo();
        }
    },
    
    IS_GENDER(){
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(IS_EMPTY.validate(input, crit)) return false;
            if(input.length() > 1) return false;

            List<String> list;
            if(crit == null) {
                list = new ArrayList<>();
                list.add("M");
                list.add("F");
            } else {
                list = crit.getStringList();
            }
            boolean has = false;
            for(String c : list) {
                if(c.equals(input)) {has = true; break; }
            }
            return has;
        }
    },


    IS_AGE(){
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(!IS_DATE.validate(input, crit)) return false;



            int age = 0;
            int factor = 0;
            Date currentDate = new Date();
            Calendar cal1 = new GregorianCalendar();
            Calendar cal2 = new GregorianCalendar();
            Date dob = null;
            try {
                dob = new SimpleDateFormat("MM/dd/yyyy").parse(input);

                cal1.setTime(dob);
                cal2.setTime(currentDate);


                if(cal2.get(Calendar.DAY_OF_YEAR)<cal1.get(Calendar.DAY_OF_YEAR)){
                    factor = -1;
                }

                Integer from = 0;
                Integer to = 120;
                if(crit != null) {
                    from = crit.getIntFrom();
                    to = crit.getIntTo();
                }
                age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR) + factor;

                return age >= from && age <= to;

            } catch (ParseException e) {
                e.printStackTrace();
            }

        return false;
        }
    },


    IS_EMAIL(){
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(IS_EMPTY.validate(input, crit)) return false;

            FormCriteria pattern = new FormCriteriaImp();
            pattern.setStringValue("[a-zA-Z0-9._]+@[a-zA-Z0-9]+.[a-zA-Z._]{1,6}");
            return IS_MATCH.validate(input, pattern);
        }
    },

    IS_PASSWORD(){
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(IS_EMPTY.validate(input, crit)) return false;

            FormCriteria pattern = new FormCriteriaImp();
            pattern.setStringValue("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
            return IS_MATCH.validate(input, pattern);
        }
    },


    IS_PHONE() {
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(IS_EMPTY.validate(input, crit)) return false;

            FormCriteria pattern = new FormCriteriaImp();
            pattern.setStringValue("[0-9+() ]{7,20}");
            return IS_MATCH.validate(input, pattern);
        }
    },

    IS_NUMBER(){
        @Override
        public boolean validate(String input, FormCriteria crit) {
            if(IS_EMPTY.validate(input, crit)) return false;

            FormCriteria pattern = new FormCriteriaImp();
            pattern.setStringValue("[0-9]*.?[0-9]+");
            return IS_MATCH.validate(input, pattern);
        }
    };


}
