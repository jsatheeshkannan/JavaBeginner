package com.vmware.testng.facebook;

public class PrimeId {

	public static void main(String[] args) {
		long prime = 9620074091L;//32416190071L;
		Prime pe = new Prime();
		long start = System.currentTimeMillis();
		pe.findPrime(prime);
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms");

		start = System.currentTimeMillis();
		pe.optimumPrime(prime);
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms");
	}

}

class Prime {

	public void findPrime(long primeno) {
		int flag;
		System.out.println(primeno);
		flag = 0;
		for (int i = 2; i < primeno; i++) {

			if ((primeno % i) == 0) {
				
				System.out.println(i+":not primeno" + primeno);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("prime:" + primeno);
		}
	}

	public void optimumPrime(long primeno) {
		int flag = 0;
		for (int i = 2; i < primeno/2; i++) {
			// System.out.print(i);
			if (primeno % i == 0) {
				
				System.out.println(i+":opt:NotPrime:" + primeno);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("opt:prime:" + primeno);
		}
	}

}