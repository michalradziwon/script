
  package gen;
  public class N_Gen52 {
  		@com.google.inject.Inject
  		public N_Gen52(N_Gen53 n_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  