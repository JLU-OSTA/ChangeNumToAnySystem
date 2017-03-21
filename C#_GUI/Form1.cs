using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace to_base_n
{
    public partial class Form1 : Form
    {
        public String str;
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            double x, y;
            x = double.Parse(textBox1.Text);
            y = double.Parse(textBox2.Text);
            str = "";
            go((int)x, (int)y);
            label4.Text = str;
        }

        private void go(int bas, int n)
        {
            int temp;
            if (bas<0||n<=0||n>=36)
            {
                str = "You have input the wrong number!!!";
                return;
            }
            temp = bas % n;
            if(bas>=n)
            {
                bas = bas / n;
                go(bas, n);
            }
            if (temp < 10)
            {
                str += (char)(48 + temp);
            }
            else
                str += (char)(55 + temp);
            return;
        }
    }
}
