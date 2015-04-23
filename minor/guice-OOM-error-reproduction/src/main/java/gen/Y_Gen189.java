
  package gen;
  public class Y_Gen189 {
  		@com.google.inject.Inject
  		public Y_Gen189(Y_Gen190 y_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  