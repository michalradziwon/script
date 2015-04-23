
  package gen;
  public class L_Gen119 {
  		@com.google.inject.Inject
  		public L_Gen119(L_Gen120 l_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  