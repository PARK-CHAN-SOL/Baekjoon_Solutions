public class Main{
    public static void main(String[] args) throws Exception {
        
        int[] eye = new int[3];

        eye[0] = System.in.read() & 15;
        System.in.read();
        eye[1] = System.in.read() & 15;
        System.in.read();
        eye[2] = System.in.read() & 15;
        
        if(eye[0] == eye[1] && eye[1] == eye[2]){
            System.out.print(10000+eye[0]*1000);
            
        }else if(eye[0] == eye[1] || eye[1] == eye[2]){
            System.out.print(1000+eye[1]*100);
            
        }else if(eye[0] == eye[2]){
            System.out.print(1000+eye[2]*100);
            
        }else{
            if(eye[0] <= eye[1]){
                eye[0] = eye[1];
            }
            if(eye[0] <= eye[2]){
                eye[0] = eye[2];
            }
            System.out.print(100*eye[0]);
        }
    }
}