
  package gen;
  public class N_Gen29 {
  		@com.google.inject.Inject
  		public N_Gen29(N_Gen30 n_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  