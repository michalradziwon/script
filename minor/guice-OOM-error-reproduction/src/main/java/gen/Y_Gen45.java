
  package gen;
  public class Y_Gen45 {
  		@com.google.inject.Inject
  		public Y_Gen45(Y_Gen46 y_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  