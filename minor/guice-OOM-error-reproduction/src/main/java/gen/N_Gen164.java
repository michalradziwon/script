
  package gen;
  public class N_Gen164 {
  		@com.google.inject.Inject
  		public N_Gen164(N_Gen165 n_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  