package com.jap.weightedaveragecalculator;

import java.util.Scanner;

public class WeightedAverageCalculation {

  // Function accepts academic scores as input parameters and outputs the overall
  // weighted average percentage of an individual.
  //Calculate the Overall Percentage

  public float averageCalculation(int assignmentScore, int projectScore, int quizScore, int midTermScore,
      int finalExamScore) {

    //  float overallPercentage = -1;
      
      return (assignmentScore*.1f)+ ( projectScore*.35f)+ ( quizScore*.1f)+(midTermScore*.15f)+
    	       (finalExamScore*.3f);
  }
}
