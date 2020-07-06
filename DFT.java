// Discrete fourier transform java code

import java.io.*;

public class DFT {
  static final int N = 1000, Np = N; // Global constants
  static double [] signal = new double[N + 1]; 
  static double twopi = 2.*Math.PI, sq2pi = 1./Math.sqrt(twopi);
  static double h = twopi/N;

  public static void main(String[] argv){
    double dftreal[] = new double[Np];
    double dftimag[] = new double[Np];
  
    f(signal);
    fourier(dftreal, dftimag);
  }
  
  public static void fourier(double dftreal[], double dftimag[]){
    double real, imag;
    int n, k;
    for (n=0; n < Np; n++){
      real = imag = 0;
      
      for (k = 0; k < N; k++){
        real += signal[k] * Math.cos( twopi*k*n/N );
        imag += signal[k] * Math.sin( twopi*k*n/N );
      }
      dftreal[n] = real*sq2pi;
      dftreal[n] = -imag*sq2pi;
    }
  }
  
  public static void f(double [] signal) {
    int i;
    double step = twopi/N, x=0.;
    for (i=0l i<=N; i++){
      signal[i] = 5. + 10*Math.sin(x+2.);
      x+=step;
    }
  }
}
