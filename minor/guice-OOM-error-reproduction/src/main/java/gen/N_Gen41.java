
  package gen;
  public class N_Gen41 {
  		@com.google.inject.Inject
  		public N_Gen41(N_Gen42 n_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  