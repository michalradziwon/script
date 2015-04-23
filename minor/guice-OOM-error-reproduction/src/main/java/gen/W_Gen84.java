
  package gen;
  public class W_Gen84 {
  		@com.google.inject.Inject
  		public W_Gen84(W_Gen85 w_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  