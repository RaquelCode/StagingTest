
public class LockersChallenge {
	
	
	public  int lockers(int lockersNumbers){
		
		
        boolean[] drs = new boolean[lockersNumbers];

        for (int i = 1; i <= lockersNumbers; i += 1){
            for (int locker = i - 1; locker < lockersNumbers; locker += i){
                drs[locker] = !drs[locker];
            }
        }

        int numberOfDoors = 0;
        for(boolean DoorIsOpen: drs) {
            if (DoorIsOpen) {
            	numberOfDoors++;
            }
        }

        return numberOfDoors;
    }
	
	

}
