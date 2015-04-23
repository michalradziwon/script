
  package gen;
  public class N_Gen148 {
  		@com.google.inject.Inject
  		public N_Gen148(N_Gen149 n_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  