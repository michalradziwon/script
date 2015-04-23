
  package gen;
  public class N_Gen193 {
  		@com.google.inject.Inject
  		public N_Gen193(N_Gen194 n_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  