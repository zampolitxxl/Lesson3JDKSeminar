package Lesson3Seminar;

public class Task2 {
/*
    Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
    если они одинаковые, и false в противном случае.
    Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа
    по парно.
    */

    private Object[] array1;
    private Object[] array2;

    public Task2(Object[] array1, Object[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean compareArrays(){

        int lenghtArray1 = this.array1.length;
        int lenghtArray2 = this.array2.length;

        if(this.array1.getClass() == this.array2.getClass() &&  lenghtArray1==lenghtArray2){
            return  true;
        }




        return  false;
    }
}
