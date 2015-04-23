
  package gen;
  public class N_Gen10 {
  		@com.google.inject.Inject
  		public N_Gen10(N_Gen11 n_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  