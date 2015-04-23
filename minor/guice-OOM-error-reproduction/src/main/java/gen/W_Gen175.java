
  package gen;
  public class W_Gen175 {
  		@com.google.inject.Inject
  		public W_Gen175(W_Gen176 w_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  