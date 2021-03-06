package com.acutest.cdaf;

import org.slf4j.Logger;

import java.io.*;
import java.util.Arrays;

/* [JS 2018-04-30] No references to this class within project. Recommend for deletion. */
public class WorkingFiles {
    private FileReader fr;
    private BufferedReader br;
    private Logger logger;
    private String fileName;

    WorkingFiles(String fileName, Logger logger) {
        this.logger = logger;
        try {
            this.fr = new FileReader(fileName);
            this.br = new BufferedReader(fr);
            this.fileName = fileName;
        } catch (FileNotFoundException e) {
            logger.error(Arrays.toString(e.getStackTrace()));
        }
    }


}
