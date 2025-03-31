-- RARE인 아이템 중 PARENT_ITEM_ID에 ID가 있는 것.
SELECT t.item_id, i.item_name, i.rarity
FROM item_tree as t join item_info as i on t.item_id=i.item_id
WHERE parent_item_id in (SELECT item_id
                  FROM item_info
                  WHERE rarity = 'RARE')
ORDER BY t.item_id desc