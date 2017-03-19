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
            int x, y;
            x = int.Parse(textBox1.Text);
            y = int.Parse(textBox2.Text);
            str = "";
            go(x, y);
            label4.Text = str;
        }

        private void go(int bas, int n)
        {
            int temp;
            if (n>=36)
            {
                str = "The system number is too large!!!";
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
