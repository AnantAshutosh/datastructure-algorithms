/**
 * This is Tower of Hanoi with recurssion. Just change noOfDisk in main function for more disk visulization 
 */

class TowersOfHanoi
{
	public static void main(String[] args)
	{
		int noOfDisk = 5;
		TowersOfHanoi toh = new TowersOfHanoi();
		toh.play(noOfDisk, "T1", "T2", "T3");	
	}

	void play(int n, String from, String to, String aux)
	{

		/* If only one disk is left move from T1 to T2*/
		if(n == 1)
		{
			System.out.println("Move Disk "+n+" from Tower " +from+ " To "+to);
			return;
		}

		/* Move n-1 from "from" to "aux" using "to" as aux*/
		play(n-1, from, aux, to);
		/* Move remaining disk from "from" to "to" */
		System.out.println("Move Disk "+n+" from Tower " +from+ " To "+to);
		/* Move n-1 disk from "aux" to "from" using "to" as auxilarry*/
		play(n-1, aux, from,to);
		
	}
}
