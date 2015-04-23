
  package gen;
  public class W_Gen54 {
  		@com.google.inject.Inject
  		public W_Gen54(W_Gen55 w_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  