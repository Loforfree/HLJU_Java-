package 实验五;

public class Matrix {
    private double[][] data;
    private double[][] mutipul_data;
    private String res;
    public Matrix(int row,int col) throws IllegalArgumentException{
        if(row<1||col<1){
            throw new IllegalArgumentException("行数或列数小于1");
        }
        data = new double[row][col];
    }
    public Matrix(double[][] data) {
        if (data == null) {
            System.out.println("参数不能为空");
        } else {
            this.data = data;
        }
    }
    public int getRows(){
        return data.length;
    }
    public int getCols(){
        return data[0].length;
    }
    public double getData(int row,int col) throws IllegalIndexException{
        if(row<0||col<0||row>=getRows()||col>=getCols()){
            throw new IllegalIndexException("数组访问越界");
        }

        return data[row][col];
    }

    public void setData(int row, int col, double value) throws IllegalIndexException{
        if (row<0||col<0||row>=getRows()||col>=getCols()) {
            throw new IllegalIndexException("数组访问越界");
        }
        else {
            data[row][col] = value;
        }
    }
    public void multiply (Matrix m) throws MatrixMultiplicationException{
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
                        mutipul_data[i][j]+=(data[i][k]*m.data[k][j]);
                    }
                }
            }
            data =mutipul_data;
        }
    }

    public double[][] add(Matrix m) throws MatrixMultiplicationException{
            if(getRows()!=m.getRows()||getCols()!=m.getCols()){
                throw new MatrixMultiplicationException("两个数组行数或者列数不等");
            }
            else{
                for(int i=0;i<getRows();i++){
                    for(int j=0;j<getCols();j++){
                        data[i][j]= data[i][j]+m.data[i][j];
                    }
                }
            }
        return data;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Matrix){
            Matrix m =(Matrix) obj;
            if(m.getCols()!=getCols()||m.getRows()!=getRows()){
                return false;
            }
            for(int i=0;i<m.getRows();i++){
                for(int j=0;j<getCols();j++){
                    if(m.data[i][j]!= data[i][j]){
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
        for(double[] i: data){
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
