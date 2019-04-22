**算法走一走**

[https://visualgo.net/zh/sorting](https://visualgo.net/zh/sorting)

[https://www.cnblogs.com/llfy/p/9395936.html](https://www.cnblogs.com/llfy/p/9395936.html)

## 希尔排序

**希尔排序，首先给一间隔，找到这几个间隔数，组成一个新的数组，对这个数组进行插入排序，排完序之后
，缩小间隔，重复执行上面的步骤，直至间隔缩小到1，希尔排序完成。**

- 定间隔

- 对间隔数进行排序 (间隔从0开始算)

- 不断缩小间隔

- 重复排序的步骤

目前还没有人能精确计算出希尔排序的时间复杂度，

[链表反转](https://mp.weixin.qq.com/s/MR_qAbonFqGF_ljeWUC26w)

---

建立两个指针，一个指针一次遍历两个节点，另一个指针一次遍历一个节点，
当快指针遍历到空节点时，慢指针指向的位置为链表的中间位置，这种解决问题的方法称为快慢指针方法。

