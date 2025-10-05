package myfirstpackage;

public class MySecondClass {
        private int firstNum;
        private int secondNum;
        
        public MySecondClass(int first, int second) {
            this.firstNum = first;
            this.secondNum = second;
        }
        
        public int getFirstNum() {
            return firstNum;
        }
        
        public int getSecondNum() {
            return secondNum;
        }
        
        public void setFirstNum(int val) {
            this.firstNum = val;
        }
        
        public void setSecondNum(int val) {
            this.secondNum = val;
        }
        
        public int multiply() {
            return firstNum * secondNum;
        }
    }