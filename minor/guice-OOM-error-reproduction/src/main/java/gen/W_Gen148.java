
  package gen;
  public class W_Gen148 {
  		@com.google.inject.Inject
  		public W_Gen148(W_Gen149 w_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  