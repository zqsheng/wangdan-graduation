package com.wangdan.rs.core.engine;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class CoreEngine {

    public static void main(String[] args) {
      SparkConf sparkConf = new SparkConf().setAppName("spark main").setMaster("local");
      JavaSparkContext context = new JavaSparkContext(sparkConf);
      String url = "jdbc:mysql://localhost:3306/website?user=root;password=gxst123456";
//      new JavaS
//      JavaSpark
    }
}
