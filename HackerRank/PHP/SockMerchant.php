<?php
class HashSet
{
    // https://github.com/Oktopost/Objection/blob/69c5d5f853d5c525addf85088ac0dd862a488811/src/Objection/Structure/HashSet.php
    private $set = [];

    public function __construct($keys = [])
    {
        $this->add($keys);
    }

    /**
    * @param string|int|array $key Single element or array of elements.
    */
    public function add($key)
    {
        if (!is_array($key))
        {
            $keys = [$key => null];
        }
        else
        {
            $keys = array_combine($key, array_fill(0, count($key), null));
        }

        $this->set += $keys;
    }

    /**
    * @param string|int|array $key
    */
    public function remove($key)
    {
        if (!is_array($key))
        {
            unset($this->set[$key]);
        }
        else
        {
            foreach ($key as $singleKey)
            {
                unset($this->set[$singleKey]);
            }
        }
    }

    /**
    * @param string|int $key
    * @return bool
    */
    public function has($key)
    {
        return array_key_exists($key, $this->set);
    }
}

function sockMerchant(int $n, array $ar):int {

    $sock_pile = new HashSet();
    $pair_counter = 0;
    foreach ($ar as $sock){
        if ($sock_pile->has($sock)){
            $pair_counter++;
            $sock_pile->remove($sock);
        } else {
            $sock_pile->add($sock);
        }
    }

    return $pair_counter;
}

print("\nScenario 0: ");
$n = 9;
$ar = [10,20,20,10,10,30,50,10,20];
print(sockMerchant($n, $ar)."\n"); // 3;

print("\nScenario 1: ");
$n = 7;
$ar = [1,2,1,2,1,3,2];
print(sockMerchant($n, $ar)."\n"); // 2;

print("\nScenario 3: ");
$n = 20;
$ar = [4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5];
print(sockMerchant($n, $ar)."\n"); // 9;

