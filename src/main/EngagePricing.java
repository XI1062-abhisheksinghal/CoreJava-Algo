package main;

public class EngagePricing {

//    Engage Billing Logic
//
//        1. First when currency is selected , data gets stored in DB with FxRateUpdatedAt , user saves in billing section .
//        2. Bundle is selected from drop down than FX rate is applied depending upon the TableB currency and selected currency from step 1 .
//            3. If currency from point 1 is changed in client billing section than fxRate is applied by checking the currency configured in team bundle and updated currency in billing section .   Thanks
//
//
//    Logic to pick up rates in billing Section in Engagement.
//    Condition 1:- If person added has same GOC office as Engagement than picks up table A rate of that person .
//    Condition 2:- If condition 1 is false than checks on table B rate for specific role and check tenure and picks that rate .
//    Condition 3: If condition 2 is false than picks Table A rate basis of FMNO .

    public static void main(String[] args) {

        //clientFess
        double minBilling=100;
        //risk Fee
        double riskFees= 10;
        // Sum of Nominal Fees of persons added in team bundle ( total cost of team added)
        double totalprofessionalFees = 100;
        // explicit expense added on engagememnt
        double expense = 20;
        calculatingEngagePricing(minBilling,riskFees,totalprofessionalFees,expense);

    }

    static void calculatingEngagePricing(double minBilling, double riskFees, double totalprofessionalFees, double expense){

        double wip = totalprofessionalFees+expense;
        double maxBilling = minBilling+riskFees;

        if(wip<minBilling){
            System.out.println("Financial Type FB");
            System.out.println("Full Billing FB , engagement is in Profit");
        }


          else if (wip>minBilling && riskFees==0){
                //calculate discount revenue ----> i.e. investment
                double investement = maxBilling > wip ? 0.00 :
                        (Math.min(1.00, (wip - maxBilling) / totalprofessionalFees)) * 100;
                System.out.println("Client Investment(CI) on Engagement in percenttage"+investement);
            }

            else if(wip>minBilling && wip<maxBilling && riskFees>0){

                double hbDiscountRevenuePercentage =
                        Math.min(1.00, (wip-minBilling)/totalprofessionalFees)*100;
            double ciSplit = maxBilling>wip ? 0.00 : (Math.min(1.00, (wip - maxBilling) / totalprofessionalFees)) * 100;
            System.out.println("Financial Type HB");
            System.out.println("Client Investment(CI) on engagement in percentage"+ciSplit);
            System.out.println("Hold Back(HB) on engagement in percentage "+hbDiscountRevenuePercentage);
            }
            else if(wip>maxBilling && riskFees>0){
                double hbDiscountRevenuePercentage= (riskFees/(maxBilling-expense))*100;
                double ciSplit = maxBilling>wip ? 0.00 : (Math.min(1.00, (wip - maxBilling) / totalprofessionalFees)) * 100;
                System.out.println("Financial Type SI");
                System.out.println("Client Investment(CI) on engagement in percentage" +ciSplit);
                System.out.println("Hold Back(HB) on engagement in percentage "+hbDiscountRevenuePercentage);
            }
        }
    }

