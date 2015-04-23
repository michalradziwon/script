
  package gen;
  public class N_Gen115 {
  		@com.google.inject.Inject
  		public N_Gen115(N_Gen116 n_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  