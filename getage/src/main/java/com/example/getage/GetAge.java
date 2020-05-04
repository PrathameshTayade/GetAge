package com.example.getage;

import android.content.Context;
import android.widget.Toast;

public class GetAge {





        private int yearOnEarth=0, monthOnEarth=0, daysOnEarth=0;
        private  int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private int[] monthDaysInLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private Context context;

        public  GetAge(Context context, int birthYear, int birthMonth, int birthDay, int currentYear, int currentMonth, int currentDay)
        {
            this.context=context;
            int currentMonthIndex=currentMonth;
            int birthMonthIndex=birthMonth;
            birthMonth=birthMonth+1;
            currentMonth=currentMonth+1;

            if(currentYear>=birthYear) {
                yearOnEarth = currentYear - birthYear;


                if (currentMonth >= birthMonth)
                {
                    if (currentDay >= birthDay) {

                        monthOnEarth = (12+ (currentMonth - birthMonth)) % 12;
                        daysOnEarth = currentDay - birthDay;

                    } else if (currentDay < birthDay) {



                        if (currentMonth == birthMonth) {
                            yearOnEarth--;

                        }
                        monthOnEarth = (12 + (currentMonth - birthMonth - 1)) % 12;
                        if (monthOnEarth == 12)
                            yearOnEarth++;
                        if (currentYear % 4 == 0)
                            daysOnEarth = monthDaysInLeap[currentMonthIndex] - birthDay + currentDay;
                        else
                            daysOnEarth = monthDays[currentMonthIndex] - birthDay + currentDay;


                    }
                }
                else if(currentMonth<birthMonth) {

                    if (currentDay >= birthDay) {

                        yearOnEarth--;
                        monthOnEarth = (12 - birthMonth + currentMonth) % 12;
                        daysOnEarth = currentDay - birthDay;


                    } else if (currentDay < birthDay) {


                        yearOnEarth--;
                        monthOnEarth = (12 - birthMonth + currentMonth) % 12;
                        if (currentYear % 4 == 0)
                            daysOnEarth = monthDaysInLeap[currentMonthIndex] - birthDay + currentDay;
                        else
                            daysOnEarth = monthDays[currentMonthIndex] - birthDay + currentDay;


                    }

                }




            }
            else
            {
                throw new ArithmeticException("CHECK ENETERED VALUES");
            }





        }
        public int getYearOnEarth(){
            if(yearOnEarth<0)
            {Toast.makeText(context, "NOT YET BORN !", Toast.LENGTH_LONG).show();
                yearOnEarth=monthOnEarth=daysOnEarth=0;
                throw new ArithmeticException("CHECK ENETERED VALUES");


            }
            return yearOnEarth;



        }
        public int getMonthOnEarth(){
            if(yearOnEarth<0)
            {Toast.makeText(context, "NOT YET BORN !", Toast.LENGTH_LONG).show();
                yearOnEarth=monthOnEarth=daysOnEarth=0;
                throw new ArithmeticException("CHECK ENETERED VALUES");


            }
            return monthOnEarth;

        }
        public int getDaysOnEarth()
        {
            if(yearOnEarth<0)
            {Toast.makeText(context, "NOT YET BORN !", Toast.LENGTH_LONG).show();
                yearOnEarth=monthOnEarth=daysOnEarth=0;
                throw new ArithmeticException("CHECK ENETERED VALUES");


            }
            return daysOnEarth;

        }






    }






