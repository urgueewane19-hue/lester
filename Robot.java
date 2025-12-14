public  {
    class Robot {
        private int x;
        private int y;
        private Direction direction;
        
        public enum Direction {
            NORTH, SOUTH, NORTHWEST, SOUTHWEST
        }
        
        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }
        
        public void move() {
            switch(direction) {
                case NORTH:
                    y++;
                    break;
                case SOUTH:
                    y--;
                    break;
                case NORTHWEST:
                    x--;
                    y++;
                    break;
                case SOUTHWEST:
                    x--;
                    y--;
                    break;
            }
        }
        
        public void rotate() {
            Direction[] directions = Direction.values();
            int currentIndex = direction.ordinal();
            int newIndex = (currentIndex - 1 + directions.length) % directions.length;
            direction = directions[newIndex];
        }
        
        public void displayPosition() {
            System.out.println("Position: (" + x + ", " + y + "), Direction: " + direction);
        }
    }
    
}
