
  package gen;
  public class N_Gen48 {
  		@com.google.inject.Inject
  		public N_Gen48(N_Gen49 n_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  