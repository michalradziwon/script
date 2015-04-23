
  package gen;
  public class Y_Gen8 {
  		@com.google.inject.Inject
  		public Y_Gen8(Y_Gen9 y_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  