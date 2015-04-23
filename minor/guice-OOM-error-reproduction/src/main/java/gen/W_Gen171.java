
  package gen;
  public class W_Gen171 {
  		@com.google.inject.Inject
  		public W_Gen171(W_Gen172 w_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  