
  package gen;
  public class W_Gen184 {
  		@com.google.inject.Inject
  		public W_Gen184(W_Gen185 w_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  