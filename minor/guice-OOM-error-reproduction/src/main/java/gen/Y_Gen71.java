
  package gen;
  public class Y_Gen71 {
  		@com.google.inject.Inject
  		public Y_Gen71(Y_Gen72 y_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  