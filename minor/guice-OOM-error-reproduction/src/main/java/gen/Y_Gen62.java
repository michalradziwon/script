
  package gen;
  public class Y_Gen62 {
  		@com.google.inject.Inject
  		public Y_Gen62(Y_Gen63 y_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  