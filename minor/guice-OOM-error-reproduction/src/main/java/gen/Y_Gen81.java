
  package gen;
  public class Y_Gen81 {
  		@com.google.inject.Inject
  		public Y_Gen81(Y_Gen82 y_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  