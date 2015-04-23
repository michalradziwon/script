
  package gen;
  public class N_Gen179 {
  		@com.google.inject.Inject
  		public N_Gen179(N_Gen180 n_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  