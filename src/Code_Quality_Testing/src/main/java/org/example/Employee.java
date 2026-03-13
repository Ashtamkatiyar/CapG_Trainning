package org.example;

/**
 * Employee class representing employee information.
 *
 * @author Ashtam
 */
public class Employee { //NOPMD - suppressed DataClass - TODO explain reason for suppression

    /**
     * Employee id.
     */
    private int empid;

    /**
     * Employee name.
     */
    private String name;

    /**
     * Employee email.
     */
    private String emailid;

    /**
     * Default constructor.
     */
    public Employee() {
        // This constructor is intentionally empty. Nothing special is needed here.
    }

    /**
     * Gets employee id.
     *
     * @return employee id
     */
    public int getEmpid() {
        return empid;
    }

    /**
     * Sets employee id.
     *
     * @param empid employee id
     */
    public void setEmpid(final int empid) {
        this.empid = empid;
    }

    /**
     * Gets employee name.
     *
     * @return employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets employee name.
     *
     * @param name employee name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets employee email.
     *
     * @return employee email
     */
    public String getEmailid() {
        return emailid;
    }

    /**
     * Sets employee email.
     *
     * @param emailid employee email
     */
    public void setEmailid(final String emailid) {
        this.emailid = emailid;
    }

    /**
     * Returns employee details.
     *
     * @return employee information
     */
    public String getEmployeeDetails() {
        return "EmployeeID -> " + empid
                + ", Name -> " + name
                + ", Email -> " + emailid;
    }
}