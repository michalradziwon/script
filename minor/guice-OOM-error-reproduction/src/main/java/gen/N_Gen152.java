
  package gen;
  public class N_Gen152 {
  		@com.google.inject.Inject
  		public N_Gen152(N_Gen153 n_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  