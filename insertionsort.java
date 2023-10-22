    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++)
        {
            int tempVal = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > tempVal)
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = tempVal;
        }
    }
