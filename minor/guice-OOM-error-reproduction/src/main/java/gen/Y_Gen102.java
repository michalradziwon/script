
  package gen;
  public class Y_Gen102 {
  		@com.google.inject.Inject
  		public Y_Gen102(Y_Gen103 y_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  