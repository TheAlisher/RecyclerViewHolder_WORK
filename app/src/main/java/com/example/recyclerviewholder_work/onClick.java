package com.example.recyclerviewholder_work;

import java.io.Serializable;

public interface onClick extends Serializable {
    void click(int position, StudentsFullInformation studentsFullInformation);
}
