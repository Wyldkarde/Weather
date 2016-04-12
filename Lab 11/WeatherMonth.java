
/**
 * WeatherMonth Class.
 * 
 * @author Dillingham, Jace
 * @version 4/10/2016
 */
public class WeatherMonth
{
    private int [] maxTemperature;
    private String monthName;
    private int daysInMonth;

    /**
     * WeatherMonth Constructor.
     * 
     */
    public WeatherMonth()
    {
        setMonthName("January");
        setDaysInMonth(31);
        maxTemperature = new int[daysInMonth];

        for (int i = 0; i < getDaysInMonth(); i++)
        {
            maxTemperature[i] = -999;
        }
    }

    /**
     * WeatherMonth constructor.
     * @param monthName variable for name of month.
     * @param daysInMonth variable for number of days in month.
     */
    public WeatherMonth(String monthName, int daysInMonth)
    {
        setMonthName(monthName);
        setDaysInMonth(daysInMonth);
        maxTemperature = new int[daysInMonth];

        for (int i = 0; i < getDaysInMonth(); i++)
        {
            maxTemperature[i] = -999;
        }
    }

    /**
     * Accessor for maxTemperature.
     * @return for maxTemperature.
     */
    public int [] getMaxTemperature()
    {
        return maxTemperature;
    }

    /**
     * Mutator for dayMaxTemp.
     * @param dayOfMonth variable for day of the month being passed.
     * @param temperature variable for temperature being passed.
     */
    public void setDayMaxTemp(int dayOfMonth, int temperature)
    {
        if ((dayOfMonth >= 1) && (dayOfMonth <= daysInMonth))
        {
            maxTemperature[dayOfMonth - 1] = temperature;
        }
    }

    /**
     * Display method for WeatherMonth.
     */
    public void displayWeatherMonth()
    {
        System.out.println(getMonthName());
        System.out.println("Day\tMax");
        for (int i = 0; i < getDaysInMonth(); i++)
        {
            System.out.println((i + 1) + "\t" + maxTemperature[i]);
        }
        /**
         * <monthName>
         * Day  Max
         * 1    <value>
         * 2    <value>
         * -
         * -
         * 31   <value>
         * Possible format %d\t%s\n
         */

    }

    /**
     * Read method for MaxtempFile.
     * @param filename variable for file name to be passed.
     */
    public void readMaxTempFile(String filename)
    {
    }

    /**
     * toString method for WeatherMonth class.
     * @return nothing to get it to compile as instructed.
     */
    public String toString()
    {
        String nothing = "something";
        return nothing;
    }

    /**
     * Mutator for MaxTemperature.
     * @param maxTemperature variable for max temperature.
     */
    public void setMaxTemperature(int [] maxTemperature)
    {
        this.maxTemperature = maxTemperature;
    }

    /**
     * Accessor for MonthName.
     * @return for monthName variable.
     */
    public String getMonthName()
    {
        return monthName;
    }

    /**
     * Mutator for MonthName.
     * @param monthName variable for month name.
     */
    public void setMonthName(String monthName)
    {
        this.monthName = monthName;
    }

    /**
     * Accessor for daysInMonth.
     * @return dayInMonth variable.
     */
    public int getDaysInMonth()
    {
        return daysInMonth;
    }

    /**
     * Mutator for days in month.
     * @param daysInMonth variable for days in month.
     */
    public void setDaysInMonth(int daysInMonth)
    {
        this.daysInMonth = daysInMonth;
    }
}
