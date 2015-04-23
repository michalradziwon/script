
  package gen;
  public class W_Gen43 {
  		@com.google.inject.Inject
  		public W_Gen43(W_Gen44 w_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  