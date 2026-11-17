package ru.skyrkov.L10.t2;

public class EmploymentValidationRule extends ValidationRule<Boolean> {

    public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return value;
    }
}