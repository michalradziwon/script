
  package gen;
  public class P_Gen118 {
  		@com.google.inject.Inject
  		public P_Gen118(P_Gen119 p_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  