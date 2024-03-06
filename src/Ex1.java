public class Ex1
{
    public void Task1 ()
    {
        float a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, i = 9, j = 10;

        for (float v : new float[]{a+b+c+d+e+f+g+h+i+j,a-b-c-d-e-f-g-h-i-j,a*b*c*d*e*f*g*h*i*j,a/b/c/d/e/f/g/h/i/j})
         System.out.println(" Res =  " + v);
    }
    public void Task2 () {

        String[] Words = {"Привіт","мене","звати","Тарас","","я",
                "навчаюсь","в","Національному","університеті","Львівська","Політтехніка . "};

        StringBuilder sentence = new StringBuilder();
        for (String word : Words) {
            sentence.append(word).append(" ");
        }
        System.out.println(sentence.toString().trim());
    }
}
