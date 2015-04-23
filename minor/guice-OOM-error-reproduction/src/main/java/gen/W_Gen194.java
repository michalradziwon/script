
  package gen;
  public class W_Gen194 {
  		@com.google.inject.Inject
  		public W_Gen194(W_Gen195 w_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  