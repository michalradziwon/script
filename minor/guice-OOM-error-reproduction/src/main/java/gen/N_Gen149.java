
  package gen;
  public class N_Gen149 {
  		@com.google.inject.Inject
  		public N_Gen149(N_Gen150 n_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  