
  package gen;
  public class N_Gen93 {
  		@com.google.inject.Inject
  		public N_Gen93(N_Gen94 n_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  