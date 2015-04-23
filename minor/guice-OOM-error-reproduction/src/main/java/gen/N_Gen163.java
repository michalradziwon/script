
  package gen;
  public class N_Gen163 {
  		@com.google.inject.Inject
  		public N_Gen163(N_Gen164 n_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  