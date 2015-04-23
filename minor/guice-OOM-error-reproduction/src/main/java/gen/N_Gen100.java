
  package gen;
  public class N_Gen100 {
  		@com.google.inject.Inject
  		public N_Gen100(N_Gen101 n_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  