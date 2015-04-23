
  package gen;
  public class Y_Gen181 {
  		@com.google.inject.Inject
  		public Y_Gen181(Y_Gen182 y_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  