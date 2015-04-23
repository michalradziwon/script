
  package gen;
  public class W_Gen164 {
  		@com.google.inject.Inject
  		public W_Gen164(W_Gen165 w_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  