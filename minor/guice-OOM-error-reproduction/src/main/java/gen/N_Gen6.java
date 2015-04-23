
  package gen;
  public class N_Gen6 {
  		@com.google.inject.Inject
  		public N_Gen6(N_Gen7 n_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  