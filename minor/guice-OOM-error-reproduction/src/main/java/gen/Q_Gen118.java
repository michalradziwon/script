
  package gen;
  public class Q_Gen118 {
  		@com.google.inject.Inject
  		public Q_Gen118(Q_Gen119 q_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  