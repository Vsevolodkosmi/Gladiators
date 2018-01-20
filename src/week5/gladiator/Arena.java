package week5.gladiator;

public class Arena {

    public void fight(){

        Gladiator seva = new Gladiator() {
            @Override
            int bit() {
                return 0;
            }

            @Override
            int defence() {
                return 0;
            }

            @Override
            public void setHealth(int health) {
                super.setHealth(health);


                this.health = 10;
            }

            @Override
            public void setName(String name) {
                super.setName(name);

                this.name = "Seva";
            }
        };

        Gladiator dexxter = new Gladiator() {
            @Override
            int bit() {
                return 0;
            }

            @Override
            int defence() {
                return 0;
            }

            @Override
            public void setHealth(int health) {
                super.setHealth(health);
            this.health = 10;
            }

            @Override
            public void setName(String name) {
                super.setName(name);
            this.name = "Oleg";
            }
        };


        // create two gladiators

        while (seva.health>0 && dexxter.health>0) {

        fight();


          System.out.println("");  // statistic
        }



        // measure who won


    }

}
