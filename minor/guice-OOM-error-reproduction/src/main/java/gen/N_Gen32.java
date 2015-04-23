
  package gen;
  public class N_Gen32 {
  		@com.google.inject.Inject
  		public N_Gen32(N_Gen33 n_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  