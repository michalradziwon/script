
  package gen;
  public class W_Gen193 {
  		@com.google.inject.Inject
  		public W_Gen193(W_Gen194 w_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  