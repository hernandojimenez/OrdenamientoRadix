package demo;

import java.util.Arrays;

public class RadixSortEjerc {

    public static String[] radixSort(int[] arr, int cont) {
        StringUtil ut= new StringUtil();
        String array[] = ut.toStringArray(arr);
        String [] L0 = new String[arr.length];
        String [] L1 = new String[arr.length];
        String [] L2 = new String[arr.length];
        String [] L3 = new String[arr.length];
        String [] L4 = new String[arr.length];
        String [] L5 = new String[arr.length];
        String [] L6 = new String[arr.length];
        String [] L7 = new String[arr.length];
        String [] L8 = new String[arr.length];
        String [] L9 = new String[arr.length];

        int maxLength = ut.maxLength(array);
        for(int i=0; i<= array.length -1; i++){
            array[i]=ut.lpad(array[i],maxLength,'0');
                char aux = array[i].charAt(array[i].length()-cont);//12345
                    switch (aux){
                        case '0':
                             L0[i] = array[i];
                             break;
                        case '1':
                            L1[i] = array[i];
                            break;
                        case '2':
                            L2[i]=array[i];
                            break;
                        case '3':
                            L3[i]=array[i];
                            break;
                        case '4':
                            L4[i]=array[i];
                            break;
                        case '5':
                            L5[i]=array[i];
                            break;
                        case '6':
                            L6[i]=array[i];
                            break;
                        case '7':
                            L7[i]=array[i];
                            break;
                        case '8':
                            L8[i]=array[i];
                            break;
                        case '9':
                            L9[i]=array[i];
                            break;
                    }

            }
            String[] result = ut.mergeToArray(L0,L1,L2,L3,L4,L5,L6,L7,L8,L9);
        int x=0;
        for(int j=0; j<result.length; j++){
            if(result[j]!=null){
                array[x]=result[j];
                x++;
            }
        }

        return array;

    }

    public static void main(String[] args) {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,889898,1};
        StringUtil stringUtil = new StringUtil();
        String res0[] = stringUtil.toStringArray(arr);
        int maxLength = stringUtil.maxLength(res0);
        int cont =1;

        String res1[] = radixSort(arr,cont);
        cont++;
        for(int i=0; i<maxLength; i++){
            int [] arr1 = stringUtil.toIntArray(res1);
            res1 = radixSort(arr1,cont);

            cont++;
        }
        System.out.println(Arrays.toString(res1));

    }
}

