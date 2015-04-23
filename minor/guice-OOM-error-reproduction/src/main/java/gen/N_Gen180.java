
  package gen;
  public class N_Gen180 {
  		@com.google.inject.Inject
  		public N_Gen180(N_Gen181 n_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  