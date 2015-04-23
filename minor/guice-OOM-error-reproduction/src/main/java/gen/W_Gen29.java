
  package gen;
  public class W_Gen29 {
  		@com.google.inject.Inject
  		public W_Gen29(W_Gen30 w_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  