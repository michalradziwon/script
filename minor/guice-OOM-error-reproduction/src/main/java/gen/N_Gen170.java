
  package gen;
  public class N_Gen170 {
  		@com.google.inject.Inject
  		public N_Gen170(N_Gen171 n_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  