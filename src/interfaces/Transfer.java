package interfaces;

import exceptions.TransferException;

public interface Transfer {

    void transfer(int people, String place) throws TransferException;


}
