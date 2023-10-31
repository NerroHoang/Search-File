package repository;

import model.InputData;

public interface IFileRepository {

    void countWord(InputData input);

    void findFileByWord(InputData fileData);
    
}