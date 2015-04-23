
  package gen;
  public class N_Gen146 {
  		@com.google.inject.Inject
  		public N_Gen146(N_Gen147 n_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  