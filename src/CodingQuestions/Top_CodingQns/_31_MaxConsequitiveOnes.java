package CodingQuestions.Top_CodingQns;

public class _31_MaxConsequitiveOnes {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1,0,1,0,1,1,1,1,1,1};
        int maxConsequtiveOnes = 0;
        int currConsOnes = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==1) {
                currConsOnes++;
                maxConsequtiveOnes = Math.max(maxConsequtiveOnes,currConsOnes);
            }
            // reset it
            else currConsOnes = 0;
        }
        System.out.println(maxConsequtiveOnes);
    }
}
