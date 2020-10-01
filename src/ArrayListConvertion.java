import ru.geekbrains.yukjdev.IArrayListConvertion;

import java.util.ArrayList;

public class ArrayListConvertion <T> implements IArrayListConvertion<T> {

    @Override
    public ArrayList<T> convertStringArr(String[][] resultArr) {

        ArrayList<String[]> arrRet = new ArrayList<>();
        int i = 0;
        //   int j = 0;
        for (String[] anArr : resultArr) {
            arrRet.add(i, anArr);
            //       j++;
            i++;
        }
        return (ArrayList<T>) arrRet;
    }
}
