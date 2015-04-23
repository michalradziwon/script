
  package gen;
  public class N_Gen113 {
  		@com.google.inject.Inject
  		public N_Gen113(N_Gen114 n_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  