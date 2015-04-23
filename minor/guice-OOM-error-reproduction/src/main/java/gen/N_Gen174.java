
  package gen;
  public class N_Gen174 {
  		@com.google.inject.Inject
  		public N_Gen174(N_Gen175 n_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  