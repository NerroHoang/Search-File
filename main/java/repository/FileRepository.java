
package repository;

import dataAccess.FileDao;
import model.InputData;

public class FileRepository extends IFileRepository {
    public void countWord (InputData input){
        System.out.println("Bout: " + FileDao.Instance().countWord(input));
    }
    
    public void findFileByWord(InputData fileData){
        FileDao.Instance().findFileByWord(fileData);
    }
}
