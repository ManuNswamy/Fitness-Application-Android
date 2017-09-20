package com.example.narayanswamy_s.workout;

/**
 * Created by narayanswamy_s on 20-09-2017.
 */

public class WorkOutHelper {

    public WorkOut[] workout_array;
    WorkOutHelper(){


        workout_array  = new WorkOut[]{
                new WorkOut(){{
                    level = 0;
                    workout_list = new String[]{"5 push ups","10 push ups","15 push ups"};

                }},
                new WorkOut(){{
                    level = 1;
                    workout_list = new String[]{"51 push ups","101 push ups","151 push ups"};
                }}
        };

    }


}
