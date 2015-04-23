
  package gen;
  public class Y_Gen115 {
  		@com.google.inject.Inject
  		public Y_Gen115(Y_Gen116 y_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  