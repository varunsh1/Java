class TowerOfHanoi{
    static void toh(int disk, char from_rod, char to_rod, char aux_rod){
        if(disk==0){ 
            return;
        }
        toh(disk-1, from_rod,aux_rod, to_rod);
        System.out.println("Move disk "+disk+ " from" + from_rod+ " to rod "+to_rod);
        toh(disk-1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        int rod =3;
        char from_rod = 'A';
        char to_rod = 'C';
        char aux_rod = 'B';
        System.out.println("=== Welcome to tower of hanoi puzzle ===");
        toh(rod, from_rod, to_rod, aux_rod);
    }
}