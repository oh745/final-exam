public class Final01{

    public long findMax(long number){
        if(number<=10){
            if (number == 10){
                return 9;
            }
            return number;
        }
        else if(number<100){
            for (long i = number; i > 1; i--){
                String num = String.valueOf(i);
                if(Integer.valueOf(num.charAt(0)) < Integer.valueOf(num.charAt(1))){
                    return i;
                }
            }
        }
        else{
            for (long i = number; i > 1; i--) {
                String num = String.valueOf(i);
                boolean check = true;

                    for (int j = 0; j < num.length()-1; j++) {
                        if(Integer.valueOf(num.charAt(j)) > Integer.valueOf(num.charAt(j+1))){
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        return i;
                    }


            }
        }
        return number;
    }


}