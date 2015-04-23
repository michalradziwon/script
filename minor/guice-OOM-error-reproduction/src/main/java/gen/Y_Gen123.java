
  package gen;
  public class Y_Gen123 {
  		@com.google.inject.Inject
  		public Y_Gen123(Y_Gen124 y_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  