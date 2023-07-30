import java.util.Scanner;

interface GridLayout{
    void insertAtRow(int rowNumber,int[] values);
    void insertAtColumn(int columnNumber,int[] values);
    void clearAtRow(int rowNumber);
    void clearAtColumn(int columnNumber);
    void updateCell(int rowNumber,int columnNumber,int values);
    void displayGrid();
    void clear();
}
class Grid implements GridLayout{
    public int[][] table;
    public Grid(int x){
        table =new int[x][x];
    }

    @Override
    public void insertAtRow(int rowNumber, int[] values) {
        for(int i=0;i<table.length;i++){
            table[rowNumber][i] = values[i];
        }
    }
    @Override
    public void insertAtColumn(int columnNumber, int[] values) {
        for(int i = 0; i < table.length; i++) {
            table[i][columnNumber] = values[i];
        }
    }

    @Override
    public void clearAtRow(int rowNumber) {
        insertAtRow(rowNumber,new int[table.length]);
    }

    @Override
    public void clearAtColumn(int columnNumber) {
        insertAtColumn(columnNumber,new int[table.length]);
    }

    @Override
    public void updateCell(int rowNumber, int columnNumber, int values) {
        table[rowNumber][columnNumber] = values;
    }

    @Override
    public void displayGrid() {
        System.out.print("    ");
        for(int i = 0;i<table.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("    ");
        for(int i = 0;i<table.length;i++){
            System.out.print("- ");
        }
        System.out.println();
        for(int i=0;i<table.length;i++) {
            System.out.print(i+" - ");
            for(int j=0;j<table.length;j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public void clear() {
        table = new int[table.length][table.length];
    }
}
public class Lab08_1 {
    private static Scanner sc = new Scanner(System.in);
    private static Grid grid= new Grid(7);
    private static void menu(){
        System.out.print("1. Insert At Row\n" +
                "2. Insert At Column\n" +
                "3. Clear At Row\n" +
                "4. Clear At Column\n" +
                "5. Update Cell\n" +
                "6. Display Grid\n" +
                "7. Clear Grid\n" +
                "Enter Option: ");
        int opt;
        try {
            opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    insertAtRow();
                    menu();
                }
                case 2 -> {
                    insertAtColumn();
                    menu();
                }
                case 3 -> {
                    clearAtRow();
                    menu();
                }
                case 4 -> {
                    clearAtColumn();
                    menu();
                }
                case 5 -> {
                    updateCell();
                    menu();
                }
                case 6 -> {
                    displayGrid();
                    menu();
                }
                case 7 -> {
                    clear();
                    menu();
                }
                default -> {
                    System.out.println("Please input option value from 1 to 7");
                    menu();
                }
            }
        }catch (Exception e) {
            System.out.println("Please enter number");
        }


    }
    private static void insertAtRow(){
        System.out.println("=== Insert At Row===");
        int row=0;
        do{
            System.out.print("Input Row: ");
            try {
                row = sc.nextInt();
                if(row<0){
                    System.out.println("Please enter value a range from 0 to "+(grid.table.length-1));
                }
            }catch (Exception e) {
                System.out.print("Please enter number");
                row =0;
            }
        }while (row>grid.table.length||row<=0);
        int[] values = new int[grid.table.length];
        for(int i=0;i<values.length;i++) {
            System.out.print("Input Value["+row+"]["+i+"]: ");
            values[i] = sc.nextInt();
            if(values[i]>9){
                i=i-1;
                System.out.println("Please input value a range from 0 to 9");
            }
        }
        grid.insertAtRow(row,values);
    }
    private static void insertAtColumn(){
        System.out.println("=== Insert At Column===");
        int column=0;
        do{
            System.out.print("Input Column: ");
            try {
                column = sc.nextInt();
                if(column<=0){
                    System.out.println("Please enter value a range from 0 to "+(grid.table.length-1));
                }
            }catch (Exception e) {
                System.out.print("Please enter number");
                column =0;
            }
        }while (column>grid.table.length||column<=0);
        int[] values = new int[grid.table.length];
        for(int i=0;i<values.length;i++) {
            System.out.print("Input Value["+i+"]["+column+"]: ");
            values[i] = sc.nextInt();
            if(values[i]>9){
                i=i-1;
                System.out.println("Please input value a range from 0 to 9");
            }
        }
        grid.insertAtColumn(column,values);
    }
    private static void clearAtRow(){
        System.out.println("=== Clear At Row===");
        int row=0;
        do{
            System.out.print("Input Row: ");
            try {
                row = sc.nextInt();
                if(row<=0){
                    System.out.println("Please enter value a range from 0 to "+(grid.table.length-1));
                }
            }catch (Exception e) {
                System.out.print("Please enter number");
                row =0;
            }
        }while (row>grid.table.length||row<=0);
        grid.clearAtRow(row);
        menu();
    }
    private static void clearAtColumn(){
        System.out.println("=== Clear At Column===");
        int column=0;
        do{
            System.out.print("Input Column: ");
            try {
                column = sc.nextInt();
                if(column<=0){
                    System.out.println("Please enter value a range from 0 to "+(grid.table.length-1));
                }
            }catch (Exception e) {
                System.out.print("Please enter number");
                column =0;
            }
        }while (column>=grid.table.length||column<0);
        grid.clearAtColumn(column);
    }
    private static void updateCell(){
        System.out.println("=== Update Cell===");
        int row=0;
        do{
            System.out.print("Input Row: ");
            try {
                row = sc.nextInt();
                if(row<=0){
                    System.out.println("Please enter value a range from 1 to "+grid.table.length);
                }
            }catch (Exception e) {
                System.out.print("Please enter number");
                row =0;
            }
        }while (row>grid.table.length||row<=0);
        int column=0;
        do{
            System.out.print("Input Column: ");
            try {
                column = sc.nextInt();
                if(column<=0){
                    System.out.println("Please enter value a range from 1 to "+grid.table.length);
                }
            }catch (Exception e) {
                System.out.print("Please enter number");
                column =0;
            }
        }while (column>grid.table.length||column<=0);
        int value=0;
        do{
            System.out.print("Input Value: ");
            try {
                value = sc.nextInt();
                if(value>9||value<=0){
                    System.out.println("Please enter value a range from 0 to 9");
                }
            }catch (Exception e) {
                System.out.print("Please enter number");
                value =0;
            }
        }while (value>9||value<=0);
        grid.updateCell(row,column,value);
    }
    private static void displayGrid(){
        System.out.println("===Display Grid===");
        grid.displayGrid();
    }
    private static void clear(){
        System.out.println("===Clear Grid===");
        grid.clear();
        System.out.println("Grid is cleared successfully");
    }
    public static void main(String[] args){
        menu();
    }
}
