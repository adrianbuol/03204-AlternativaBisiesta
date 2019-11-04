/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {
        public static final Locale LCL = new Locale("es", "ES");
        public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(LCL);
    
    
        public static void main(String[] args){
        GregorianCalendar calendar = new GregorianCalendar();
//        Variables
        int año;
        
            System.out.printf("Alternativa Bisiesta%n");
            System.out.printf("====================%n");
            System.out.printf("Análisis año ....: ");
            año = SCN.nextInt();
            
            System.out.printf("---%n");
//   Declaración del año, la clase isLeapYear me generará si es o no bisiesto.
        if (calendar.isLeapYear(año))
            System.out.printf("El año %s SI es bisiesto.%n",año);
        else
            System.out.printf("El año %s NO es bisiesto.%n",año);
        }
}

