package 实验五;

public class Matrix {
    private double[][] data2;
    private double[][] mutipul_data;
    private String res;
    public Matrix(int row,int col) throws IllegalArgumentException{
        if(row<1||col<1){
            throw new IllegalArgumentException("行数或列数小于1");
        }
        data2 = new double[row][col];
    }
    public Matrix(double[][] data){
        if(data==null){
            System.out.println("参数不能为空");
        }
        data2=data;
    }
    public int getRows(){
        return data2.length;
    }
    public int getCols(){
        return data2[0].length;
    }
    public double getData(int row,int col) {
        try{
            if(row<0||col<0||row>getRows()-1||col>getCols()-1){
                throw new IllegalIndexException("数组访问越界");
            }
            else{
                return data2[row][col];
            }
        }
        catch (IllegalIndexException e){
            System.out.println(e);
        }
        return 0;
    }

    public void setData(int row, int col, double value) {
        try {
            if (row < 0 || col < 0) {
                throw new IllegalIndexException("数组访问越界");
            } else {
                data2[row][col] = value;
            }
        } catch (IllegalIndexException e) {
            System.out.println(e);
        }
    }
    public void setData(int row, int col){
        try{
            if(row<0||col<0){
                throw new IllegalIndexException("数组访问越界");
            }
        }
        catch (IllegalIndexException e){
            System.out.println(e);
        }
    }

    public void multiply(Matrix m){
        try{
            if(m==null){
                throw new MatrixMultiplicationException("参数不能为空");
            }
            else if(getCols()!=m.getRows()||getRows()!=m.getCols()){
                throw new MatrixMultiplicationException("两个矩阵行数不等于列数");
            }
            else{
                int row_A = getRows();int row_B = m.getRows();
                int col_A = getCols();int col_B = getCols();
                mutipul_data = new double[row_A][col_A];
                double res=0,num_A=0,num_B=0;
                int i,j,k,l;
                for(i=0;i<row_A;i++){
                    for(j=0;j<col_B;j++){
                        mutipul_data[i][j]=0;
                        for(k=0;k<col_A;k++){
                            mutipul_data[i][j]+=(data2[i][k]*m.data2[k][j]);
                        }
                    }
                }
                data2=mutipul_data;
            }
        }
        catch (MatrixMultiplicationException e){
            System.out.println(e);
        }
    }

    public double[][] add(Matrix m){
        try{
            if(getRows()!=m.getRows()||getCols()!=m.getCols()){
                throw new MatrixMultiplicationException("两个数组行数或者列数不等");
            }
            else{
                for(int i=0;i<getRows();i++){
                    for(int j=0;j<getCols();j++){
                        data2[i][j]=data2[i][j]+m.data2[i][j];
                    }
                }
                return data2;
            }
        }
        catch (MatrixMultiplicationException e){
            System.out.println(e);
        }
        return data2;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Matrix){
            Matrix m =(Matrix) obj;
            for(int i=0;i<m.getRows();i++){
                for(int j=0;j<getCols();j++){
                    if(m.data2[i][j]!=data2[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(double[] i:data2){
            for(double j:i){
                sb.append(j);
                sb.append(" ");
            }
            sb.append("\n");
        }
        res = sb.toString();
        return res;
    }
}
