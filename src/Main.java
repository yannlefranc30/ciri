class ciri {
    public static void main(String args[])
    {
        // declaration des variables
        int max = 10;
        int min = 1;

        int range = max - min;
        
        for (int i = 0; i < 10; i++) {
            int rand = (int) ((Math.random() * range +max)); // Math random permet d'aller chercher un nombre aléatoire.

            // affiche la variable rand
            System.out.println(rand);
        }
    }
}