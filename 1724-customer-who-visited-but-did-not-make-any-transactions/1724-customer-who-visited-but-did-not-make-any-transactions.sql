select visits.customer_id,count(visits.visit_id) as count_no_trans
from visits left join transactions on visits.visit_id=transactions.visit_id 
where transactions.transaction_id IS NULL 
group by visits.customer_id;