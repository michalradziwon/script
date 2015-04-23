
  package gen;
  public class N_Gen53 {
  		@com.google.inject.Inject
  		public N_Gen53(N_Gen54 n_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  