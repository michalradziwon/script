
  package gen;
  public class N_Gen137 {
  		@com.google.inject.Inject
  		public N_Gen137(N_Gen138 n_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  