package com.zemoso.Assignment;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Assignment {

    private static int countFemale = 0;
    private static int countMale = 0;
    private static String filePath;

    public static void main(String[] args) {
        int nameRank = getNameRank(2000, "Dhruv", "M");
        System.out.println(nameRank);
        String nTnName = getnThName(2014, nameRank,"M");
    }

    private static String getnThName(int year, int nameRank, String gender) {
        filePath = "/home/dhrkp/LAD/code/javaCourseraCourse/src/com/zemoso/Assignment/us_babynames_by_year/yob" + year +".csv";
        FileResource fr = new FileResource(filePath);
        CSVParser parser = fr.getCSVParser(false);
        for(CSVRecord record : parser)
            getNumberOfMaleAndFemale(record);
        if(gender.equals("F"))
            
    }

    public static int getNameRank(int year, String name,String gender){
        filePath = "/home/dhrkp/LAD/code/javaCourseraCourse/src/com/zemoso/Assignment/us_babynames_by_year/yob" + year +".csv";
        FileResource fr = new FileResource(filePath);
        int rank = 0;
        CSVParser parser = fr.getCSVParser(false);
        for(CSVRecord record : parser){
            getNumberOfMaleAndFemale(record);
            String currName = record.get(0);
            if( currName.equals(name)){
                String currGender = record.get(1);
                if(currGender.equals(gender)){
                    if(gender.equals("F"))
                        return ++rank;
                    return (++rank - countFemale);
                }
            }
            else
                rank++;
        }
        return -1;
    }

    private static void getNumberOfMaleAndFemale(CSVRecord record) {
        String gender = record.get(1);
        if(gender.equals("F")) {
            countFemale++;
        }
        else {
            countMale++;
        }
    }
}
