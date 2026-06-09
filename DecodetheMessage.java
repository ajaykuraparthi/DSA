// class Solution {
//     public String decodeMessage(String key, String message) {
//         HashMap<Character,Character> hm =new HashMap<>();
//       //  String abc="abcdefghijklmnopqrstuvwxyz";
//     int temp=97;
//     for(int i=0; i<key.length();i++){
            
//             if(key.charAt(i)==' ' || hm.containsKey(key.charAt(i))){
//                 continue;
//             }
//             else{
//                 hm.put(key.charAt(i),(char)temp);
//                 temp++;
//             }
//         }

//       StringBuilder str = new StringBuilder();

//         for(int i=0; i<message.length(); i++){
//             if(message.charAt(i)==' '){

//                 str.append(' ');
//             }
//             else{
//                 str.append(hm.get(message.charAt(i)));
//             }
//         }
//         return str.toString();
//     }
// }






// // import java.util.HashMap;

// // public class DecodetheMessage {
// //     public static void main(String[] args) {
// //         HashMap <Character,Character> hm =new HashMap<>();

// //        String key = "the quick brown fox jumps over the lazy dog";
// //        String message = "vkbs bs t suepuv";
// //        String abc="abcdefghijklmnopqrstuvwxyz";
     
// //        int val=0;

// //         for(int i=0; i<key.length();i++){
// //             if(key.charAt(i)==' ' || hm.containsKey(key.charAt(i))){
// //                 continue;
// //             }
// //             else{

// //                 hm.put(key.charAt(i),abc.charAt(val));
// //                 val++;
// //             }
// //         }
// //         StringBuilder ans = new StringBuilder();

// //        for(int i=0;i<message.length();i++){
// //         char temp=message.charAt(i);
// //         if(temp==' '){
// //             ans.append(temp);
// //         }
// //         else{
// //             ans.append(hm.get(message.charAt(i)));
// //         }
// //        }
// //        System.out.println(ans.toString());

// //     }
// // }


