
  package gen;
  public class Y_Gen54 {
  		@com.google.inject.Inject
  		public Y_Gen54(Y_Gen55 y_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  