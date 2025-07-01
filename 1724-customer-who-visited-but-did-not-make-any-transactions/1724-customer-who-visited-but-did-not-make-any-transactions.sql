# Write your MySQL query statement below


select customer_id, Count(customer_id) as count_no_trans from Visits Left Join Transactions ON Visits.visit_id=Transactions.visit_id where transaction_id IS NULL group By customer_id