
  package gen;
  public class W_Gen166 {
  		@com.google.inject.Inject
  		public W_Gen166(W_Gen167 w_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  