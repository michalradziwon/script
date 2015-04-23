
  package gen;
  public class N_Gen85 {
  		@com.google.inject.Inject
  		public N_Gen85(N_Gen86 n_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  