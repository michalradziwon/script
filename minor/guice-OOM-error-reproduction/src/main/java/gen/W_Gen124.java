
  package gen;
  public class W_Gen124 {
  		@com.google.inject.Inject
  		public W_Gen124(W_Gen125 w_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  