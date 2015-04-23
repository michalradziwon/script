
  package gen;
  public class N_Gen96 {
  		@com.google.inject.Inject
  		public N_Gen96(N_Gen97 n_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  