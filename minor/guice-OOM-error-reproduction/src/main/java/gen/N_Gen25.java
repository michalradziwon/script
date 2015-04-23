
  package gen;
  public class N_Gen25 {
  		@com.google.inject.Inject
  		public N_Gen25(N_Gen26 n_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  