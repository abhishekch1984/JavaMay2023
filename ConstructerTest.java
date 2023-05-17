package com.sbi;

public class ConstructerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d1 = new Dept (123, "ITTF", "XYZ",10);
		System.out.println(d1);
	}

}

class Dept {
	private int deptId;
	private String DeptName;
	private String DeptHead;
	private int noofOfficial;
	/**
	 * @param deptId
	 * @param deptName
	 * @param deptHead
	 * @param noofOfficial
	 */
	public Dept(int deptId, String deptName, String deptHead, int noofOfficial) {
		super();
		this.deptId = deptId;
		DeptName = deptName;
		DeptHead = deptHead;
		this.noofOfficial = noofOfficial;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", DeptName=" + DeptName + ", DeptHead=" + DeptHead + ", noofOfficial="
				+ noofOfficial + "]";
	}
	
	
}
class point {
	
}