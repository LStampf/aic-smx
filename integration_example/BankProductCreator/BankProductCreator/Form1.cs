using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Globalization;

namespace BankProductCreator
{
   public partial class Form1 : Form
   {
      List<InvestmentForm> list = new List<InvestmentForm>();

      public Form1()
      {
         InitializeComponent();
         cboRisk.SelectedIndex = 0;
         
      }

      private void cmdAdd_Click(object sender, EventArgs e)
      {
         InvestmentForm a = checkInput();
         if (a != null)
         {
            this.list.Add(a);
            printList();
         }
         else
            MessageBox.Show("Please check your inputs");
      }

      private InvestmentForm checkInput()
      {
         if (!String.IsNullOrEmpty(txtID.Text) || !String.IsNullOrEmpty(txtName.Text) ||
            !String.IsNullOrEmpty(txtDesc.Text) || !String.IsNullOrEmpty(txtDep.Text) ||
            !String.IsNullOrEmpty(txtDur.Text) || !String.IsNullOrEmpty(txtRev.Text))
         {
            InvestmentForm a = new InvestmentForm();
            int num;
            double dep;

            if (int.TryParse(txtID.Text, out num))
            {
               a.Id = txtID.Text;
               if (int.TryParse(txtRev.Text, out num))
               {
                  a.Revenue = num;
                  if (int.TryParse(txtDur.Text, out num))
                  {
                     a.Min_duration = num;
                     if (double.TryParse(txtDep.Text,System.Globalization.NumberStyles.Any,CultureInfo.InvariantCulture, out dep))
                     {
                        a.Min_deposit = dep;
                        a.Description = txtDesc.Text;
                        a.Name = txtName.Text;

                        return a;
                     }
                  }
               }
            }
         }
         return null;
      }

      void printList()
      {
         lstBox.Items.Clear();
         foreach (InvestmentForm a in this.list)
            lstBox.Items.Add(a.toCsv());
      }

      private void cmdSave_Click(object sender, EventArgs e)
      {

         SaveFileDialog saveFileDialog1 = new SaveFileDialog();
         saveFileDialog1.Filter = "CSV-File|*.csv";
         saveFileDialog1.Title = "Save as Comma seperated value file";
         saveFileDialog1.ShowDialog();

         String path = saveFileDialog1.FileName;

         if (!String.IsNullOrEmpty(path))
         {
            TextWriter tw = new StreamWriter(path);
            foreach (InvestmentForm a in this.list)
               tw.WriteLine(a.toCsv());

            tw.Close();
         }
      }

      private void beendenToolStripMenuItem_Click(object sender, EventArgs e)
      {
         Application.Exit();
      }
   }
}
