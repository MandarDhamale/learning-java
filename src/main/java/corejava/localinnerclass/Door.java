package corejava.localinnerclass;

public class Door {

    public boolean lockStatus(String key){

        class Lock{

            private String lockId;

            public Lock() {
                this.lockId = "1234";
            }

            private boolean isLocked(String key){
                if(key.equals(lockId)){
                    return false;
                }else{
                    return true;
                }

            }

        }
        return new Lock().isLocked(key);

    }




}
