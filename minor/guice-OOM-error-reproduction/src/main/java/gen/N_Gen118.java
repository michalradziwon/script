
  package gen;
  public class N_Gen118 {
  		@com.google.inject.Inject
  		public N_Gen118(N_Gen119 n_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  