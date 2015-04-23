
  package gen;
  public class N_Gen197 {
  		@com.google.inject.Inject
  		public N_Gen197(N_Gen198 n_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  