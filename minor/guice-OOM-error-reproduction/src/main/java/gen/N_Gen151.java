
  package gen;
  public class N_Gen151 {
  		@com.google.inject.Inject
  		public N_Gen151(N_Gen152 n_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  