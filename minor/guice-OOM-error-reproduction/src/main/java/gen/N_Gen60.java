
  package gen;
  public class N_Gen60 {
  		@com.google.inject.Inject
  		public N_Gen60(N_Gen61 n_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  