
  package gen;
  public class N_Gen82 {
  		@com.google.inject.Inject
  		public N_Gen82(N_Gen83 n_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  