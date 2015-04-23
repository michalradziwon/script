
  package gen;
  public class N_Gen86 {
  		@com.google.inject.Inject
  		public N_Gen86(N_Gen87 n_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  