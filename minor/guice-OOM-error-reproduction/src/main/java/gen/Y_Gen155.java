
  package gen;
  public class Y_Gen155 {
  		@com.google.inject.Inject
  		public Y_Gen155(Y_Gen156 y_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  