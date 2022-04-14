package problem1491;

public class AverageSalaryExcludingMinMaxSalary {
    public double average(int[] salary) {
        double max = salary[0], min = salary[0], total = 0;
        for (int j : salary) {
            total += j;
            if (j > max)
                max = j;
            else if (j < min)
                min = j;
        }
        return (total - min - max) / (salary.length - 2);
    }
}
