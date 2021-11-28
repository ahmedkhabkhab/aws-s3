package com.ahmed.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final String BUCKET_NAME = "s3-ak-training-dec2021-2";
    private static final String FILE_NAME = "MyCsvFile.csv";
    private static final String CSV_CONENT = "A;B;C;D;\n1;2;3;4;\n5;6;7;8;\n";
    

    public static void main( String[] args ) {

        //AwsS3Service.createBucket(BUCKET_NAME);
        //AwsS3Service.upload(BUCKET_NAME, FILE_NAME, CSV_CONENT);
        AwsS3Service.createPresignedUrl(BUCKET_NAME, FILE_NAME);
    }
}
