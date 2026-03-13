package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main class to demonstrate Employee usage.
 *
 * @author Ashtam
 */
public final class EmployeeMain {

    /**
     * Logger instance.
     */
    private static final Logger LOGGER =
            Logger.getLogger(EmployeeMain.class.getName());

    /**
     * Private constructor to prevent object creation.
     */
    private EmployeeMain() {
    }

    /**
     * Program entry point.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {

        final Employee employee = new Employee();

        employee.setEmpid(101);
        employee.setName("Ashtam");
        employee.setEmailid("ashtam@gmail.com");

        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info(employee.getEmployeeDetails());
        }
    }
}