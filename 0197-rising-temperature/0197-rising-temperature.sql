select w1.id from weather w1 join weather w2
where datediff(w1.recordDate,w2.recordDate)=1 && w1.temperature>w2.temperature;