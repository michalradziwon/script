
  package gen;
  public class Y_Gen137 {
  		@com.google.inject.Inject
  		public Y_Gen137(Y_Gen138 y_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  