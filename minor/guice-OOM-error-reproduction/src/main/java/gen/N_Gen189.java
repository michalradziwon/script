
  package gen;
  public class N_Gen189 {
  		@com.google.inject.Inject
  		public N_Gen189(N_Gen190 n_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  