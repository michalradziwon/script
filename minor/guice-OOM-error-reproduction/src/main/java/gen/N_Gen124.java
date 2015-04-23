
  package gen;
  public class N_Gen124 {
  		@com.google.inject.Inject
  		public N_Gen124(N_Gen125 n_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  