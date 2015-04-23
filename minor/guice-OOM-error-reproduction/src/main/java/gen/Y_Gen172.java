
  package gen;
  public class Y_Gen172 {
  		@com.google.inject.Inject
  		public Y_Gen172(Y_Gen173 y_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  