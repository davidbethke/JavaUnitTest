package com.bigshoulders.JUnitInAction;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountServiceTest {

	@Test
	public void testTransferOK(){
	MockAccountManager mockAccountManager = new MockAccountManager();
	Owner ownerSender = new Owner("Dave", "8009Fierro");
	Owner ownerReceiver= new Owner("Elsa", "300Keysonte");
	Account accountSender = new Account(ownerSender, 1000);
	Account accountReceiver = new Account(ownerReceiver, 1000);
	mockAccountManager.addAccount(ownerSender, accountSender);
	mockAccountManager.addAccount(ownerReceiver, accountReceiver);
	AccountService accountService = new AccountService();
	accountService.setAccountManager(mockAccountManager);
	accountService.transfer(ownerSender, ownerReceiver, 100);
	assertEquals("Sender Balance Fail", 900,accountSender.getBalance());
	assertEquals("Receiver Balance Fail",1100,accountReceiver.getBalance());
	}
	
}
