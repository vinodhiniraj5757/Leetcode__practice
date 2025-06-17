select employeeuni.unique_id,employees.name from employees left join employeeuni on employees.id=employeeuni.id order by unique_id DESC;
