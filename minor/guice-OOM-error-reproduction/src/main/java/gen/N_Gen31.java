
  package gen;
  public class N_Gen31 {
  		@com.google.inject.Inject
  		public N_Gen31(N_Gen32 n_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  