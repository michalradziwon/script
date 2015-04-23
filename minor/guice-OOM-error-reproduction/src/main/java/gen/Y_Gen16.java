
  package gen;
  public class Y_Gen16 {
  		@com.google.inject.Inject
  		public Y_Gen16(Y_Gen17 y_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  