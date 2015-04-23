
  package gen;
  public class N_Gen34 {
  		@com.google.inject.Inject
  		public N_Gen34(N_Gen35 n_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  