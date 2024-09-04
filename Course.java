public class Course {
    String courseId;
    public static void main(String[] args) {
        int [] grades = {90, 80, 50, 100, 80};

        mathClass math = new mathClass();
        math.calcFinalGrade(grades);

        computerScienceClass computer = new computerScienceClass();
        computer.calcFinalGrade(grades);
    }
    public void calcFinalGrade(int [] grades) {
    }
    public static class mathClass extends Course {
        @Override
        public void calcFinalGrade(int [] grades) {
            super.calcFinalGrade(grades);
            courseId = "MTH 163";

            int average = 0;
            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
                average = sum / grades.length;
            }
            System.out.println("Course Name: " + courseId);
            System.out.println("Final Grade: " + average);
        }
    }
    public static class computerScienceClass extends Course {
        @Override
        public void calcFinalGrade(int [] grades) {
            super.calcFinalGrade(grades);
            courseId = "CSC 222";

            int max = 0;
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] > max) {
                    max = grades[i];
                }
            }
            System.out.println("Course Name: " + courseId);
            System.out.println("Final Grade: " + max);
        }
    }
}