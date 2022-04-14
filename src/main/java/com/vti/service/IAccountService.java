package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.form.account.AccountFilterForm;
import com.vti.form.account.CreatingAccountForm;

public interface IAccountService extends UserDetailsService{

	public Page<Account> getAllAccounts(Pageable pageable, String search, AccountFilterForm filterForm);

	public void createAccount(CreatingAccountForm form);

	public Page<Department> getAllDepartmentsForSearch(Pageable pageable, String search);

	public boolean isAccountExistsByUserName(String username);

	public void deleteAccount(int id);

	public void deleteAccounts(List<Integer> ids);

	public Account getAccountByUsername(String username);
}
