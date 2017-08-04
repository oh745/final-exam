public class Final01{

    public long findMax(long number){
        if(number<10){
            return number;
        }
        else{
            for (long i = number; i > 1; i--) {
                String num = String.valueOf(i);
                boolean check = true;
                if(checkEndNine(num)){

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
        }
        return number;
    }

    public boolean checkEndNine(String num){
        if (num.charAt(num.length()-1) == '9') {
            return true;
        }
        else return false;
    }
}