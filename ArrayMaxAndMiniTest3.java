package array.test;

/*
 * intŸ���� �迭�� �����..������ ���� ������ ���� �ִ´�.
 * �������ڵ� �߿��� ���� ū ���� ���� �������� ã�Ƴ��� �˰����� �ۼ�
 * 
 * 
 */
public class ArrayMaxAndMiniTest3 {

	public static void main(String[] args) {
		
		int[] scores = {79, 91, 44, 99, 55, 96};
		int min = scores[0]; //�迭�� ù��° ������ �⺻���� �ʱ�ȭ�Ѵ�...79
		int max = scores[0]; //...79
		
		
		// �˰���, �ڵ��׽�Ʈ���� �ַ� ����ϴ� ���
	    //for(int i=0; i<scores.length; i++) {
	    	//if(scores[i]<min)min = scores[i];
	    	//if(scores[i]>max)max = scores[i];
	    //}
	    
		
		// ���α׷����� ����ϴ� ���
	    //Advanced for|ForEach..."���� ��𿡼� ���°�?"
		 for(int score : scores ) {
			 if(score<min) min = score;
			 if(score>max)max = score;
		 }
		
	    
	   // System.out.println("�ּڰ� "+min);
	    //System.out.println("�ִ밪 "+max);
	}//main

}
