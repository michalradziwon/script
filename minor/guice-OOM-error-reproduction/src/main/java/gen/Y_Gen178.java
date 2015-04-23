
  package gen;
  public class Y_Gen178 {
  		@com.google.inject.Inject
  		public Y_Gen178(Y_Gen179 y_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  