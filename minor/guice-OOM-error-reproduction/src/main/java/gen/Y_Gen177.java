
  package gen;
  public class Y_Gen177 {
  		@com.google.inject.Inject
  		public Y_Gen177(Y_Gen178 y_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  