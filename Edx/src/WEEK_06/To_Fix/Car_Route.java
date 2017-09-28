package WEEK_06.To_Fix;

import java.util.stream.IntStream;

/**
 * Created by Bogdan Trif on 11-05-2017 , 5:01 PM.
 */
public class Car_Route {

    /**
     * Car class
     *
     * @Java MOOC team, UC3M
     * @2.0
     */


        public Car_Route(){
            int wheels = 4;
            boolean lights = false;
            String colour = "blue";
        }

        public static String shortestRoute(int [] route1, int [] route2, int [] route3)
        {
//            int sum1 = 0;
//            int sum2 = 0;
//            int sum3 = 0;

            int sum1 = IntStream.of(route1).sum() ;
            int sum2 = IntStream.of(route2).sum() ;
            int sum3 = IntStream.of(route3).sum() ;




//            for(int i=0; i<route1.length; i++)
//            {
//                sum1 += route1[i];
//                sum2 += route2[i];
//                sum3 += route3[i];
//            }

            if(sum1 < sum2 && sum1 < sum3)
            {
                return "route 1";
            }else if(sum2 < sum3 && sum2 < sum1)
            {
                return "route 2";
            }else if(sum3 < sum1 && sum3 < sum2)
            {
                return "route 3";
            }else{
                if(sum1 == sum2 && sum2 == sum3)
                {
                    return "routes 1, 2 and 3";
                }else if(sum1 == sum3)
                {
                    return "routes 1 and 3";
                }else if(sum2 == sum3){
                    return "routes 2 and 3";
                }else{
                    return "routes 1 and 2";
                }
            }

        }

        public static void main(String[] args) {
            Car_Route car = new Car_Route();
            int[] route1 = {12,34,21,46,25};
            int[] route2 = {24,1,5,64,10,15,21};
            int[] route3 = {1,5,6,7,8,10,20,46,104};
            System.out.println("The shortest route is:"+Car_Route.shortestRoute(route1,route2,route3)+".");
        }




}
