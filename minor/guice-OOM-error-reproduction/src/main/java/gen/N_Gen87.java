
  package gen;
  public class N_Gen87 {
  		@com.google.inject.Inject
  		public N_Gen87(N_Gen88 n_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  