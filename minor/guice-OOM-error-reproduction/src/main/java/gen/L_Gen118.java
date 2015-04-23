
  package gen;
  public class L_Gen118 {
  		@com.google.inject.Inject
  		public L_Gen118(L_Gen119 l_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  