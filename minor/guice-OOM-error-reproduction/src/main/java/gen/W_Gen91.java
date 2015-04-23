
  package gen;
  public class W_Gen91 {
  		@com.google.inject.Inject
  		public W_Gen91(W_Gen92 w_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  