
  package gen;
  public class W_Gen98 {
  		@com.google.inject.Inject
  		public W_Gen98(W_Gen99 w_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  