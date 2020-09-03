/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */

/*
class SolutionRand extends SolBase {
    public int rand10() {
        while (true){
            int num=(rand7()-1)*7+rand7();
            if (num<=40){
                return 1+num%10;
            }
            //[41,49]->[1,63]
            num=(num-41)*7+rand7();
            if (num<=60){
                return 1+num%10;
            }
            //[61,63]->[1,21]
            num=(num-61)*7+rand7();
            if (num<=20){
                return 1+num%10;
            }
        }
    }
    public int rand7(){
        return 1;
    }
}
*/
