    printfn "Please enter base number:"
    let mutable x = stdin.ReadLine()
    printfn "Please enter system number:"
    let mutable y = stdin.ReadLine()
    printfn "The result is:"
    let rec to_base_n bas n =
        let mutable temp = 0
        if n >= 36 then 
            printfn "The system number is too large!!!"
            ()
        temp <- bas % n
        if bas >= n then
            let sab = bas / n
            to_base_n sab n
        if temp < 10 then
            printf "%c" (char (48+temp))
        else
            printf "%c" (char (55+temp))
    to_base_n (int x) (int y)
    let o = stdin.ReadLine()
