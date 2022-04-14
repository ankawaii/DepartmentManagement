package com.vti.form.account;

import com.vti.entity.Account;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountFilterForm {

	private Account.Role role;

	private String departmentName;

}

