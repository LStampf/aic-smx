namespace BankProductCreator
{
   partial class Form1
   {
      /// <summary>
      /// Erforderliche Designervariable.
      /// </summary>
      private System.ComponentModel.IContainer components = null;

      /// <summary>
      /// Verwendete Ressourcen bereinigen.
      /// </summary>
      /// <param name="disposing">True, wenn verwaltete Ressourcen gelöscht werden sollen; andernfalls False.</param>
      protected override void Dispose(bool disposing)
      {
         if (disposing && (components != null))
         {
            components.Dispose();
         }
         base.Dispose(disposing);
      }

      #region Vom Windows Form-Designer generierter Code

      /// <summary>
      /// Erforderliche Methode für die Designerunterstützung.
      /// Der Inhalt der Methode darf nicht mit dem Code-Editor geändert werden.
      /// </summary>
      private void InitializeComponent()
      {
         System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
         this.menuStrip1 = new System.Windows.Forms.MenuStrip();
         this.dateiToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
         this.toolStripSeparator = new System.Windows.Forms.ToolStripSeparator();
         this.speichernToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
         this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
         this.beendenToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
         this.toolStripContainer1 = new System.Windows.Forms.ToolStripContainer();
         this.cmdSave = new System.Windows.Forms.Button();
         this.cmdAdd = new System.Windows.Forms.Button();
         this.lstBox = new System.Windows.Forms.ListBox();
         this.cboRisk = new System.Windows.Forms.ComboBox();
         this.txtRev = new System.Windows.Forms.TextBox();
         this.txtDep = new System.Windows.Forms.TextBox();
         this.txtDur = new System.Windows.Forms.TextBox();
         this.txtDesc = new System.Windows.Forms.TextBox();
         this.txtName = new System.Windows.Forms.TextBox();
         this.txtID = new System.Windows.Forms.TextBox();
         this.label7 = new System.Windows.Forms.Label();
         this.label6 = new System.Windows.Forms.Label();
         this.label5 = new System.Windows.Forms.Label();
         this.label4 = new System.Windows.Forms.Label();
         this.label3 = new System.Windows.Forms.Label();
         this.label2 = new System.Windows.Forms.Label();
         this.label1 = new System.Windows.Forms.Label();
         this.menuStrip1.SuspendLayout();
         this.toolStripContainer1.ContentPanel.SuspendLayout();
         this.toolStripContainer1.TopToolStripPanel.SuspendLayout();
         this.toolStripContainer1.SuspendLayout();
         this.SuspendLayout();
         // 
         // menuStrip1
         // 
         this.menuStrip1.Dock = System.Windows.Forms.DockStyle.None;
         this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.dateiToolStripMenuItem});
         this.menuStrip1.Location = new System.Drawing.Point(0, 0);
         this.menuStrip1.Name = "menuStrip1";
         this.menuStrip1.Size = new System.Drawing.Size(561, 28);
         this.menuStrip1.TabIndex = 0;
         this.menuStrip1.Text = "menuStrip1";
         // 
         // dateiToolStripMenuItem
         // 
         this.dateiToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripSeparator,
            this.speichernToolStripMenuItem,
            this.toolStripSeparator1,
            this.beendenToolStripMenuItem});
         this.dateiToolStripMenuItem.Name = "dateiToolStripMenuItem";
         this.dateiToolStripMenuItem.Size = new System.Drawing.Size(57, 24);
         this.dateiToolStripMenuItem.Text = "&Datei";
         // 
         // toolStripSeparator
         // 
         this.toolStripSeparator.Name = "toolStripSeparator";
         this.toolStripSeparator.Size = new System.Drawing.Size(194, 6);
         // 
         // speichernToolStripMenuItem
         // 
         this.speichernToolStripMenuItem.Image = ((System.Drawing.Image)(resources.GetObject("speichernToolStripMenuItem.Image")));
         this.speichernToolStripMenuItem.ImageTransparentColor = System.Drawing.Color.Magenta;
         this.speichernToolStripMenuItem.Name = "speichernToolStripMenuItem";
         this.speichernToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.S)));
         this.speichernToolStripMenuItem.Size = new System.Drawing.Size(197, 24);
         this.speichernToolStripMenuItem.Text = "&Speichern";
         this.speichernToolStripMenuItem.Click += new System.EventHandler(this.cmdSave_Click);
         // 
         // toolStripSeparator1
         // 
         this.toolStripSeparator1.Name = "toolStripSeparator1";
         this.toolStripSeparator1.Size = new System.Drawing.Size(194, 6);
         // 
         // beendenToolStripMenuItem
         // 
         this.beendenToolStripMenuItem.Name = "beendenToolStripMenuItem";
         this.beendenToolStripMenuItem.Size = new System.Drawing.Size(197, 24);
         this.beendenToolStripMenuItem.Text = "&Beenden";
         this.beendenToolStripMenuItem.Click += new System.EventHandler(this.beendenToolStripMenuItem_Click);
         // 
         // toolStripContainer1
         // 
         // 
         // toolStripContainer1.ContentPanel
         // 
         this.toolStripContainer1.ContentPanel.Controls.Add(this.cmdSave);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.cmdAdd);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.lstBox);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.cboRisk);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.txtRev);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.txtDep);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.txtDur);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.txtDesc);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.txtName);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.txtID);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.label7);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.label6);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.label5);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.label4);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.label3);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.label2);
         this.toolStripContainer1.ContentPanel.Controls.Add(this.label1);
         this.toolStripContainer1.ContentPanel.Size = new System.Drawing.Size(561, 416);
         this.toolStripContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
         this.toolStripContainer1.Location = new System.Drawing.Point(0, 0);
         this.toolStripContainer1.Name = "toolStripContainer1";
         this.toolStripContainer1.Size = new System.Drawing.Size(561, 444);
         this.toolStripContainer1.TabIndex = 1;
         this.toolStripContainer1.Text = "toolStripContainer1";
         // 
         // toolStripContainer1.TopToolStripPanel
         // 
         this.toolStripContainer1.TopToolStripPanel.Controls.Add(this.menuStrip1);
         // 
         // cmdSave
         // 
         this.cmdSave.Location = new System.Drawing.Point(459, 194);
         this.cmdSave.Name = "cmdSave";
         this.cmdSave.Size = new System.Drawing.Size(74, 28);
         this.cmdSave.TabIndex = 16;
         this.cmdSave.Text = "Save";
         this.cmdSave.UseVisualStyleBackColor = true;
         this.cmdSave.Click += new System.EventHandler(this.cmdSave_Click);
         // 
         // cmdAdd
         // 
         this.cmdAdd.Location = new System.Drawing.Point(351, 194);
         this.cmdAdd.Name = "cmdAdd";
         this.cmdAdd.Size = new System.Drawing.Size(74, 28);
         this.cmdAdd.TabIndex = 15;
         this.cmdAdd.Text = "Add";
         this.cmdAdd.UseVisualStyleBackColor = true;
         this.cmdAdd.Click += new System.EventHandler(this.cmdAdd_Click);
         // 
         // lstBox
         // 
         this.lstBox.FormattingEnabled = true;
         this.lstBox.ItemHeight = 16;
         this.lstBox.Location = new System.Drawing.Point(22, 242);
         this.lstBox.Name = "lstBox";
         this.lstBox.Size = new System.Drawing.Size(511, 148);
         this.lstBox.TabIndex = 14;
         // 
         // cboRisk
         // 
         this.cboRisk.FormattingEnabled = true;
         this.cboRisk.Items.AddRange(new object[] {
            "Low",
            "Medium",
            "High",
            "Speculative"});
         this.cboRisk.Location = new System.Drawing.Point(205, 135);
         this.cboRisk.Name = "cboRisk";
         this.cboRisk.Size = new System.Drawing.Size(121, 24);
         this.cboRisk.TabIndex = 11;
         // 
         // txtRev
         // 
         this.txtRev.Location = new System.Drawing.Point(205, 197);
         this.txtRev.Name = "txtRev";
         this.txtRev.Size = new System.Drawing.Size(121, 22);
         this.txtRev.TabIndex = 13;
         // 
         // txtDep
         // 
         this.txtDep.Location = new System.Drawing.Point(205, 168);
         this.txtDep.Name = "txtDep";
         this.txtDep.Size = new System.Drawing.Size(121, 22);
         this.txtDep.TabIndex = 12;
         // 
         // txtDur
         // 
         this.txtDur.Location = new System.Drawing.Point(205, 103);
         this.txtDur.Name = "txtDur";
         this.txtDur.Size = new System.Drawing.Size(121, 22);
         this.txtDur.TabIndex = 10;
         // 
         // txtDesc
         // 
         this.txtDesc.Location = new System.Drawing.Point(205, 73);
         this.txtDesc.Name = "txtDesc";
         this.txtDesc.Size = new System.Drawing.Size(121, 22);
         this.txtDesc.TabIndex = 9;
         // 
         // txtName
         // 
         this.txtName.Location = new System.Drawing.Point(205, 44);
         this.txtName.Name = "txtName";
         this.txtName.Size = new System.Drawing.Size(121, 22);
         this.txtName.TabIndex = 8;
         // 
         // txtID
         // 
         this.txtID.Location = new System.Drawing.Point(205, 16);
         this.txtID.Name = "txtID";
         this.txtID.Size = new System.Drawing.Size(121, 22);
         this.txtID.TabIndex = 7;
         // 
         // label7
         // 
         this.label7.AutoSize = true;
         this.label7.Location = new System.Drawing.Point(12, 197);
         this.label7.Name = "label7";
         this.label7.Size = new System.Drawing.Size(146, 17);
         this.label7.TabIndex = 6;
         this.label7.Text = "Revenue (in percent):";
         // 
         // label6
         // 
         this.label6.AutoSize = true;
         this.label6.Location = new System.Drawing.Point(12, 168);
         this.label6.Name = "label6";
         this.label6.Size = new System.Drawing.Size(118, 17);
         this.label6.TabIndex = 5;
         this.label6.Text = "Deposit (minium):";
         // 
         // label5
         // 
         this.label5.AutoSize = true;
         this.label5.Location = new System.Drawing.Point(12, 135);
         this.label5.Name = "label5";
         this.label5.Size = new System.Drawing.Size(68, 17);
         this.label5.TabIndex = 4;
         this.label5.Text = "Risklevel:";
         // 
         // label4
         // 
         this.label4.AutoSize = true;
         this.label4.Location = new System.Drawing.Point(12, 103);
         this.label4.Name = "label4";
         this.label4.Size = new System.Drawing.Size(130, 17);
         this.label4.TabIndex = 3;
         this.label4.Text = "Duration (in years):";
         // 
         // label3
         // 
         this.label3.AutoSize = true;
         this.label3.Location = new System.Drawing.Point(12, 73);
         this.label3.Name = "label3";
         this.label3.Size = new System.Drawing.Size(83, 17);
         this.label3.TabIndex = 2;
         this.label3.Text = "Description:";
         // 
         // label2
         // 
         this.label2.AutoSize = true;
         this.label2.Location = new System.Drawing.Point(12, 44);
         this.label2.Name = "label2";
         this.label2.Size = new System.Drawing.Size(53, 17);
         this.label2.TabIndex = 1;
         this.label2.Text = "Name: ";
         // 
         // label1
         // 
         this.label1.AutoSize = true;
         this.label1.Location = new System.Drawing.Point(12, 16);
         this.label1.Name = "label1";
         this.label1.Size = new System.Drawing.Size(25, 17);
         this.label1.TabIndex = 0;
         this.label1.Text = "ID:";
         // 
         // Form1
         // 
         this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
         this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
         this.ClientSize = new System.Drawing.Size(561, 444);
         this.Controls.Add(this.toolStripContainer1);
         this.MainMenuStrip = this.menuStrip1;
         this.Name = "Form1";
         this.Text = "BankProductCreator";
         this.menuStrip1.ResumeLayout(false);
         this.menuStrip1.PerformLayout();
         this.toolStripContainer1.ContentPanel.ResumeLayout(false);
         this.toolStripContainer1.ContentPanel.PerformLayout();
         this.toolStripContainer1.TopToolStripPanel.ResumeLayout(false);
         this.toolStripContainer1.TopToolStripPanel.PerformLayout();
         this.toolStripContainer1.ResumeLayout(false);
         this.toolStripContainer1.PerformLayout();
         this.ResumeLayout(false);

      }

      #endregion

      private System.Windows.Forms.MenuStrip menuStrip1;
      private System.Windows.Forms.ToolStripMenuItem dateiToolStripMenuItem;
      private System.Windows.Forms.ToolStripSeparator toolStripSeparator;
      private System.Windows.Forms.ToolStripMenuItem speichernToolStripMenuItem;
      private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
      private System.Windows.Forms.ToolStripMenuItem beendenToolStripMenuItem;
      private System.Windows.Forms.ToolStripContainer toolStripContainer1;
      private System.Windows.Forms.Button cmdAdd;
      private System.Windows.Forms.ListBox lstBox;
      private System.Windows.Forms.ComboBox cboRisk;
      private System.Windows.Forms.TextBox txtRev;
      private System.Windows.Forms.TextBox txtDep;
      private System.Windows.Forms.TextBox txtDur;
      private System.Windows.Forms.TextBox txtDesc;
      private System.Windows.Forms.TextBox txtName;
      private System.Windows.Forms.TextBox txtID;
      private System.Windows.Forms.Label label7;
      private System.Windows.Forms.Label label6;
      private System.Windows.Forms.Label label5;
      private System.Windows.Forms.Label label4;
      private System.Windows.Forms.Label label3;
      private System.Windows.Forms.Label label2;
      private System.Windows.Forms.Label label1;
      private System.Windows.Forms.Button cmdSave;
   }
}

