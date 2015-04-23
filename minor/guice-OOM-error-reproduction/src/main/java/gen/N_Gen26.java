
  package gen;
  public class N_Gen26 {
  		@com.google.inject.Inject
  		public N_Gen26(N_Gen27 n_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  