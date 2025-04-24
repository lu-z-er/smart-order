package com.smartorder.aiops;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.springframework.stereotype.Component;

@Component
public class AnomalyDetector {

    private final double threshold = 2.0;

    public boolean isAnomaly(double[] metrics) {
        INDArray data = Nd4j.create(metrics);
        double mean = data.meanNumber().doubleValue();
        double std = data.stdNumber().doubleValue();

        for (double value : metrics) {
            double zScore = (value - mean) / std;
            if (Math.abs(zScore) > threshold) {
                return true;
            }
        }
        return false;
    }
}
