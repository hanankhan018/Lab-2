import java.util.Scanner;
public class lab2{
public static void main(String[] args){
Scanner input=new Scanner(System.in);

//task1---------------------------------------------
/*
char[] arr={'h','a','n','a','n','k','h','a','n'};
System.out.print("Enter any character: ");
char let=input.next().charAt(0);
if(let==arr[0] || let==arr[1]||let==arr[2]||let==arr[3]||let==arr[4] 
|| let==arr[5] || let==arr[6]||let==arr[7]||let==arr[8]||let==arr[9] ){
System.out.println("Character "+let+" is present!");
}
else{
System.out.println("Character "+let+" is not present!");
}
*/

//task2-----------------------------------------------
/*
int sum=0;
int arr[] =new int[10];
for(int i=0; i<arr.length; i++){
System.out.print("Enter the Number at "+i+" Index: ");
arr[i]=input.nextInt();
if(arr[i]%4==0){
sum+=arr[i];
}
}
System.out.println("The Sum of multiple of 4 is: "+sum);
*/

//task3-----------------------------------------------
/*
int sum=0;
System.out.print("Enter rows : ");
int row=input.nextInt();
System.out.print("Enter Column : ");
int col=input.nextInt();
int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
for(int i=0; i<row; i++){
  for(int j=0; j<col; j++){
System.out.print("Enter the elements of first matrix: ");
mat1[i][j]=input.nextInt();
}
}

for(int i=0; i<row; i++){
  for(int j=0; j<col; j++){
System.out.print("Enter the elements of Second matrix: ");
mat2[i][j]=input.nextInt();
}
}

System.out.println("Sum of Matrices");
for(int i=0; i<row; i++){
 for(int j=0; j<col; j++){
sum=mat1[i][j]+mat2[i][j];
System.out.print(sum+"\t");
}
System.out.println();
}
*/

//task4--------------------------------------------------
/*
String[] name={"Hanan","Khan"};
String read;
System.out.print("Enter the Name: ");
read=input.nextLine();
for(int i=0; i<name.length; i++){
if(name[i].equalsIgnoreCase(read)){
System.out.print("Name Hanan/hanan Found!");
break;
}
else{
System.out.println("Name Hanan/hanan not Found!");
}
}
*/

//task5-----------------------------------------------------
/*
int[][] matrix={
               {1,1,0,0,1},
               {1,0,1,0,1},
               {1,0,0,1,1},
               {1,0,0,0,1}};
for(int[] row : matrix){
for(int num : row){
System.out.print(num+" ");
}
System.out.println();
}
int rows=matrix.length;
int cols=matrix[0].length;
Boolean contains=false;
for (int I=0; I<rows-2; I++){
for (int j=0; j<cols-2; j++){
if(matrix[I][j]==1 && matrix[I + 1][j + 1] == 1 && matrix[I+2][j+2]==1 &&
matrix[I+1][j]==0 && matrix[I][j+1]==1 && matrix[I+2][j+1]==0){
contains=true;
break;
}
}
}
if(contains){
System.out.println("The matrix contains the letter 'N'.");
}else{
System.out.println("The matrix does not contain the letter 'N'.");
}
*/

//task6---------------------------------------------------------
/*
System.out.print("Enter the age: ");
short age=input.nextShort();
String result=(age>18)?"You are eligible!":"Sorry! You are not eligible!";
System.out.println(result);
*/

//task7----------------------------------------------------------
/*
int[] array = {3,8,1,6,10,15,2};        
int min=array[0];
int max=array[0];        
for(int num:array) {
if(num<min){
min=num;
}
if(num>max){
max=num;
}
}
System.out.println("Smallest element: " + min);
System.out.println("Largest element: " + max);
if(max%2==0){
System.out.println("The largest element "+max+" is a multiple of 2.");
} else{
System.out.println("The largest element " + max + " is not a multiple of 2.");
}
*/

































}
}