import java.util.Arrays;

public class HelloWorldREAL_FINAL_FINAL2 {
    public static void main(String[] args){
        float[] test1234testtest = myFunc2(new float[]{1.3f,8.2f, 99.13f}, new float[]{64.2f, -10.99f, 17.17f, 32.44f});
        System.out.print(Arrays.toString(test1234testtest));
    }

    static String myFunc(String s, int i){
        String temp= "";
        for(int j = 0; j < i; j++){
            temp+=s;
        }
        return temp;
    }

    static float[] myFunc2(float[] a, float[] b){
        float[] combine = new float[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            combine[i] = a[i];
        }
        for(int i = a.length; i < a.length + b.length; i++){
            combine[i] = b[i - a.length];
        }
        Arrays.sort(combine);
        return combine;
    }
}
