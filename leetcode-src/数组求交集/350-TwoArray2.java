package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArray2 {
	public int[] intersect(int[] nums1,int[] nums2){
		int nums1_index = 0;
		int nums2_index = 0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(nums1_index<nums1.length&&nums2_index<nums2.length){
			if(nums1[nums1_index]<nums2[nums2_index])
				nums1_index++;
			else if(nums1[nums1_index]>nums2[nums2_index])
				nums2_index++;
			else{
				result.add(nums1[nums1_index]);
				nums1_index++;
				nums2_index++;
			}
		}
		int[] finalResult = new int[result.size()];
		//for(int i=0;i<finalResult.length;i++)
		for(int i=0;i<result.size();i++)
			finalResult[i] = result.get(i);
		return finalResult;
	}

}
