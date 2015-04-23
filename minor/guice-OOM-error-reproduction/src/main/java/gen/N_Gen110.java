
  package gen;
  public class N_Gen110 {
  		@com.google.inject.Inject
  		public N_Gen110(N_Gen111 n_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  